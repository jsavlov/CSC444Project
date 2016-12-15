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


public class main {

    static final String FILE_NAME = "/Users/jason/newsample.java"; // File name goes here


    public static void main(String[] args) {

        FileInputStream fis = null;
        ANTLRInputStream inStream = null;
        mjgrammarLexer lexer;

        try {
            fis = new FileInputStream(FILE_NAME);
            inStream = new ANTLRInputStream(fis);
        } catch (IOException ex) {
            System.out.println("IO Error");
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

        /*
        ParseTreeWalker walker = new ParseTreeWalker();

        mjWalker mwalker = new mjWalker();

        walker.walk(mwalker, tree);
        */

        System.out.println("Program complete...");

    }

    public static String getFileName() {
        return FILE_NAME;
    }
}
