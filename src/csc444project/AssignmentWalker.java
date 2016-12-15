package csc444project;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMessages_pt_BR;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.Map;

public class AssignmentWalker extends  mjgrammarBaseListener {

    private final Map<String, MJClass> classes;
    private mjgrammarParser parser;
    private ParseTreeProperty<Scope> scopes;
    private Scope currentScope = null;

    private boolean isField, isArg;

    private void saveScope(ParserRuleContext ctx, Scope scope) {
        scopes.put(ctx, scope);
    }

    private void enterScope(ParserRuleContext context) {
        MJBlock newScope = new MJBlock(currentScope);

        currentScope = newScope;
        saveScope(context, currentScope);
    }

    private void exitScope() {
        currentScope = currentScope.getEnclosingScope();
    }

    public AssignmentWalker(Map<String, MJClass> classes, ParseTreeProperty<Scope> scopes, mjgrammarParser parser) {
        this.classes = classes;
        this.scopes = scopes;
        this.parser = parser;
    }


    @Override
    public void enterMain_class_dec(mjgrammarParser.Main_class_decContext ctx) {
        //super.enterMain_class_dec(ctx);

        MJClass mjclass = classes.get(ctx.main_class_name().getText());
        currentScope = mjclass;

        saveScope(ctx, currentScope);
    }

    @Override
    public void enterClass_dec(mjgrammarParser.Class_decContext ctx) {
       // super.enterClass_dec(ctx);
        MJClass mjclass = classes.get(ctx.class_name().getText());

        currentScope = mjclass;
        saveScope(ctx, currentScope);

        MJClass superclass;

        if (ctx.superclass_name() != null) {
            superclass = classes.get(ctx.superclass_name().getText());
            if (superclass == null) {
                // TODO: Implement error output
            }
        } else {
            superclass = null;
        }
        mjclass.superclass = superclass;
    }

    @Override
    public void exitClass_dec(mjgrammarParser.Class_decContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterField_dec(mjgrammarParser.Field_decContext ctx) {
        isField = true;
    }

    @Override
    public void exitField_dec(mjgrammarParser.Field_decContext ctx) {
        isField = false;
    }

    @Override
    public void enterVar_dec(mjgrammarParser.Var_decContext ctx) {
        String typeName = ctx.type_dec().getText();
        String varName = ctx.var_name().ID().getText();
        if (ctx.type_dec().tuple_type() != null) {
            // We have a tuple type



            if (currentScope.lookupSymbolLocally(varName) != null) {
                // TODO: handle error where symbol is already defined
                ErrorReporter.printSymbolAlreadyDefinedError(parser, ctx.var_name().ID().getSymbol(), "variable", varName, currentScope.getName());
            }

            currentScope.defineSymbol(new TupleSymbol(varName, isField, typeName, classes));

        } else if (ctx.type_dec().type() != null) {
            if (currentScope.lookupSymbolLocally(varName) != null) {
                // TODO: handle error where symbol is already defined
                ErrorReporter.printSymbolAlreadyDefinedError(parser, ctx.var_name().ID().getSymbol(), "variable", varName, currentScope.getName());
            }

            currentScope.defineSymbol(new MJSymbol(varName, classes.get(typeName), isField));
        }
    }

    @Override
    public void enterMethod_dec(mjgrammarParser.Method_decContext ctx) {
        String returnTypeStr = ctx.type_dec().getText();
        Returnable returnType;
        if (returnTypeStr.contains(",")) {
            // We have a tuple.
            returnType = new TupleHolder(returnTypeStr);
        } else {
            returnType = classes.get(returnTypeStr);
        }

        if (returnType == null) {
            // We don't have a valid return type
            // TODO: Implement error handling
            ErrorReporter.printCompleteError(parser, ctx.type_dec().type().ID().getSymbol(), "error: cannot find symbol.", "symbol: class " + ctx.type_dec().type().getText(), "location: class " + currentScope.getName());

        }

        String methodName = MJMethod.getMethodSignature(ctx);
        if (currentScope.lookupSymbolLocally(methodName) != null) {
            // Method already defined
            ErrorReporter.printSymbolAlreadyDefinedError(parser, ctx.method_name().ID().getSymbol(), "method", methodName, currentScope.getName());
        }

        Scope owner = currentScope; // Set the owner scope to current scope

        MJMethod meth = new MJMethod(methodName, returnType, owner);

        currentScope.defineSymbol(meth);

        currentScope = meth;
        saveScope(ctx, currentScope);
    }

    @Override
    public void exitMethod_dec(mjgrammarParser.Method_decContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterMethod_param_dec(mjgrammarParser.Method_param_decContext ctx) {

        if (ctx.type_dec().tuple_type() != null) {
            // we have a tuple type for a parameter
            // Unfortunately, we do not yet support tuples for parameters.
            // todo: report error

            ErrorReporter.printCompleteError(parser, ctx.method_param_name().ID().getSymbol(), "Cannot use tuples as method parameters.", ctx.method_param_name().getText(),currentScope.getName());

        } else if (ctx.type_dec().type() != null) {
            // We have a regular type

            MJClass paramType = classes.get(ctx.type_dec().type().getText());
            MJSymbol param = new MJSymbol(ctx.method_param_name().getText(), paramType, false);
            ( (MJMethod) currentScope).addParameter(param);

        }
    }

    @Override
    public void enterIf_block(mjgrammarParser.If_blockContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitIf_block(mjgrammarParser.If_blockContext ctx) {
        exitScope();
    }

    @Override
    public void enterElse_block(mjgrammarParser.Else_blockContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitElse_block(mjgrammarParser.Else_blockContext ctx) {
        exitScope();
    }

    @Override
    public void enterWhile_block(mjgrammarParser.While_blockContext ctx) {
        enterScope(ctx);
    }

    @Override
    public void exitWhile_block(mjgrammarParser.While_blockContext ctx) {
        exitScope();
    }
}
