
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class main {

    static final String FILE_NAME = "/Users/jason/sample.java"; // File name goes here


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

        lexer = new mjgrammarLexer(inStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        mjgrammarParser parser = new mjgrammarParser(tokens);
        ParseTree tree = parser.goal();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new mjWalker(), tree);





    }

}
