package csc444project;


import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class UnderlineErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
        ErrorReporter.printFileNameAndLineNumber((Token) offendingSymbol);
        System.err.println("Line " + line + ":" + charPositionInLine + " " + msg);
        ErrorReporter.underlineError(recognizer, (Token) offendingSymbol);
    }
}
