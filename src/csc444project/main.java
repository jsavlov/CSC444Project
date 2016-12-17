package csc444project;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


final public class main
{

    static String FILE_NAME;

    static final String FILE_DIR = "/Users/jason/minijava_samples/";

    static String[] FILE_NAMES = {
            "Factorial.java",
            "BinarySearch.java",
            "TreeVisitor.java",
            "QuickSort.java",
            "LinearSearch.java",
            "LinkedList.java",
            "BinaryTree.java",
            "BubbleSort.java"
    };


    static
    {
        for (int i = 0; i < FILE_NAMES.length; i++)
        {
            FILE_NAMES[i] = FILE_DIR + FILE_NAMES[i];
            System.out.println(FILE_NAMES[i]);
        }
    }

    /*
        Main method
     */


    public static void main(String[] args)
    {
        String[] fileNames;

        if (args.length != 0)
        {
            System.out.println("File names given as a runtime argument...");
            fileNames = args;
        }
        else
        {
            System.out.println("Using hardcoded filenames...");
            fileNames = FILE_NAMES;
        }


        for (String workingFileName : fileNames)
        {
            FILE_NAME = workingFileName;
            runForFileName(workingFileName);
        }

        System.out.println("Program complete...");

    }

    /*
        Does all of the dirty work...
     */

    private static void runForFileName(String fileName)
    {
        FileInputStream fis = null;
        ANTLRInputStream inStream = null;
        mjgrammarLexer lexer;

        try
        {
            System.out.println("Running File: " + fileName);
            fis = new FileInputStream(fileName);
            inStream = new ANTLRInputStream(fis);
        } catch (IOException ex)
        {
            System.out.println("IO Error: See stack trace");
            ex.printStackTrace();
        }

        ParseTreeProperty<Scope> masterScopeList = new ParseTreeProperty<>();
        ParseTreeProperty<MJClass> callerList = new ParseTreeProperty<>();
        Map<String, MJClass> classMap = new HashMap<>();

        lexer = new mjgrammarLexer(inStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        mjgrammarParser parser = new mjgrammarParser(tokens);

        parser.removeErrorListeners();

        parser.addErrorListener(new DiagnosticErrorListener());
        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);

        parser.addErrorListener(new UnderlineErrorListener());


        ParseTree tree = parser.goal();

        ErrorReporter.exitOnErrors();

        ClassNamingListener classNamer = new ClassNamingListener(classMap, parser);
        ParseTreeWalker.DEFAULT.walk(classNamer, tree);

        ErrorReporter.exitOnErrors();

        AssignmentWalker assignmentWalker = new AssignmentWalker(classMap, masterScopeList, parser);
        ParseTreeWalker.DEFAULT.walk(assignmentWalker, tree);

        ErrorReporter.exitOnErrors();

        TypeCheckWalker typeChecker = new TypeCheckWalker(classMap, masterScopeList, callerList, parser);
        typeChecker.visit(tree);

        ErrorReporter.exitOnErrors();

        InitializationCheckWalker initChecker = new InitializationCheckWalker(parser, classMap, masterScopeList);
        initChecker.visit(tree);

        ErrorReporter.exitOnErrors();

        CodeGenerator codeGen = new CodeGenerator(parser, classMap, masterScopeList, callerList);

        ParseTreeWalker.DEFAULT.walk(codeGen, tree);
    }

}
