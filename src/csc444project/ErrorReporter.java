package csc444project;

import org.antlr.v4.codegen.model.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.Recognizer;

public final class ErrorReporter {
    private static boolean hasError = false;
    private static int totalErrorCount = 0;


    public static boolean noErrorsPresent() {
        return !hasError;
    }

    public static void reportError() {
        hasError = true;
        ++totalErrorCount;
    }

    public static int getTotalErrorCount() {
        return totalErrorCount;
    }

    public static void exitOnErrors() {
        if (!ErrorReporter.noErrorsPresent()) {
            System.err.println(ErrorReporter.getTotalErrorCount() + " errors found.");
            System.exit(1);
        }
    }

    public static void printFileNameAndLineNumber(Token token) {
        reportError();
        System.err.print(main.FILE_NAME + ":" + token.getLine() + ": ");
    }

    public static void printCompleteError(Recognizer recognizer, Token token, String msg, String symbol, String loc) {
        ErrorReporter.printFileNameAndLineNumber(token);
        System.err.println(msg);
        ErrorReporter.underlineError(recognizer, token);
        System.err.println(" " + symbol);
        System.err.println(" " + loc);
    }

    public static void printSymbolAlreadyDefinedError(Recognizer recognizer, Token token, String symbolType, String symbol, String className) {
        ErrorReporter.printFileNameAndLineNumber(token);
        System.err.println("error: " + symbolType + " " + symbol + " is already defined in class " + className + ".");
        ErrorReporter.underlineError(recognizer, token);
    }

    public static void printIncompatibleReturnTypeError(Recognizer recognizer, Token token, Returnable originalClass, Returnable overwritingClass, MJMethod originalMethod, MJMethod overwritingMethod) {
        ErrorReporter.printFileNameAndLineNumber(token);
        System.err.println("Error: " + overwritingMethod + " in class " + overwritingClass + " cannot override " + originalMethod + " in class " + originalClass);
        ErrorReporter.underlineError(recognizer, token);
        System.err.println("Return type " + overwritingMethod.getType() + " is not compatible with type " + originalMethod.getType());
    }

    public static void printDuplicateClassError(Recognizer recognizer, Token token, String className) {
        ErrorReporter.printFileNameAndLineNumber(token);
        System.err.println("Error: duplicate class, " + className);
        ErrorReporter.underlineError(recognizer, token);
    }

    public static void printVariablePossiblyNotInitializedError(Recognizer recognizer, Token token, String symName) {
        ErrorReporter.printFileNameAndLineNumber(token);
        System.err.println("Error: " + symName + " may not have been initialized.");
        ErrorReporter.underlineError(recognizer, token);
    }

    public static void printRequiredFoundError(String msg, Recognizer recognizer, Token token, String req, String found) {
        ErrorReporter.printFileNameAndLineNumber(token);
        System.err.println(msg);
        ErrorReporter.underlineError(recognizer, token);
        System.err.println("\tRequired: " + req);
        System.err.println("\tFound: " + found);
    }

    public static void binaryOpTypeError(Recognizer recognizer, ParserRuleContext ctx, Token operator, Returnable foundLeft, Returnable foundRight, Returnable expectedLeft, Returnable expectedRight) {
        if (foundLeft != null && foundRight != null && !(foundLeft == expectedLeft && foundRight == expectedRight)) {
            ErrorReporter.printFileNameAndLineNumber(operator);
            System.err.println("Error: Bad operand types for binary operator \'" + operator.getText() + "\'");
            ErrorReporter.underlineError(recognizer, operator);
            System.err.println("\tFirst type: " + foundLeft);
            System.err.println("\tSecond type: " + foundRight);
        }
    }

    public static void printUnresolvedSymbolError(Recognizer recognizer, Token token, String symType, Returnable errorLocation) {
        ErrorReporter.printFileNameAndLineNumber(token);
        System.err.println("Error: cannot find symbol...");
        ErrorReporter.underlineError(recognizer, token);
        System.err.println("\tSymbol: " + symType + " " + token.getText());
        System.err.println("\tLocation: class " + errorLocation);
    }

    public static void underlineError(Recognizer recognizer, Token token) {
        int line = token.getLine();
        int charPosition = token.getCharPositionInLine();
        CommonTokenStream tokens = (CommonTokenStream) recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for (int i = 0; i < charPosition; i++)
        {
            if (errorLine.charAt(i) == '\t') {
                System.err.print("\t");
            } else {
                System.err.print(" ");
            }
        }
        int start = token.getStartIndex();
        int end = token.getStopIndex();
        if (start >= 0 && end >= 0) {
            for (int i = start; i <= end; i++)
                System.err.print("^");
        }
        System.err.println();
    }

    public static void reportCyclicInheritance(Recognizer recognizer, mjgrammarParser.Class_decContext ctx, MJClass mjClass) {
        MJClass original = (MJClass) mjClass;
        while (mjClass != null) {
            mjClass = mjClass.getSuperclass();
            if (mjClass == original) {
                ErrorReporter.printFileNameAndLineNumber(ctx.superclass_name().ID().getSymbol());
                System.err.println("Error: Cyclic inheritance found...");
                ErrorReporter.underlineError(recognizer, ctx.superclass_name().ID().getSymbol());
                System.exit(1);
            }
        }
    }
}
