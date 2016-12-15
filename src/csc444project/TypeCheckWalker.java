package csc444project;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TypeCheckWalker extends mjgrammarBaseVisitor<MJClass>
{

    private final Map<String, MJClass> classes;
    private final ParseTreeProperty<Scope> scopes;
    private Scope currentScope;
    private ParseTreeProperty<MJClass> callerTypes;
    private mjgrammarParser parser;
    private MJClass INT, INTARRAY, BOOLEAN;

    public TypeCheckWalker(Map<String, MJClass> classes, ParseTreeProperty<Scope> scopes, ParseTreeProperty<MJClass> callerTypes, mjgrammarParser parser)
    {
        this.INT = classes.get("int");
        this.INTARRAY = classes.get("int[]");
        this.BOOLEAN = classes.get("boolean");

        this.classes = classes;
        this.scopes = scopes;
        this.callerTypes = callerTypes;
        this.parser = parser;
    }

    @Override
    public MJClass visitMain_class_dec(mjgrammarParser.Main_class_decContext ctx)
    {
        return acquireCurrentScope(ctx);
    }

    @Override
    public MJClass visitClass_dec(mjgrammarParser.Class_decContext ctx)
    {
        return acquireCurrentScope(ctx);
    }

    @Override
    public MJClass visitMethod_dec(mjgrammarParser.Method_decContext ctx)
    {
        currentScope = scopes.get(ctx);

        MJClass class0 = ((MJClass) (currentScope.getEnclosingScope())).getSuperclass();

        MJMethod method0 = null;

        if (class0 == null) ;
        else
            method0 = (MJMethod) class0.lookupSymbol(currentScope.getEnclosingScope().getName());

        MJMethod method1 = (MJMethod) currentScope;
        MJClass class1 = (MJClass) method1.getEnclosingScope();

        if (method0 != null && method0.getReturnType() != method1.getReturnType()) {
            ErrorReporter.printIncompatibleReturnTypeError(parser, ctx.method_name().ID().getSymbol(), class0, class1, method0, method1);
        }

        visitChildren(ctx);
        currentScope = currentScope.getEnclosingScope();
        return null;

    }

    @Override
    public MJClass visitMethod_body(mjgrammarParser.Method_bodyContext ctx)
    {
        for (mjgrammarParser.Local_decContext _ctx : ctx.local_dec()) visit(_ctx);
        for (mjgrammarParser.StatementContext _ctx : ctx.statement()) visit(_ctx);

        Returnable formalRType = Scope.getEnclosingMethod(currentScope).getReturnType();
        MJClass actualRType;

        if (formalRType instanceof TupleHolder) {
            // We have a tuple
            if (ctx.return_statement().tuple_var_expr() != null) {
                List<MJClass> tupleTypes = ((TupleSymbol)formalRType).getTypeList();
                int i = 0;
                for (mjgrammarParser.ExpressionContext _ctx : ctx.return_statement().tuple_var_expr().expression()) {
                    MJClass tReturnType = visit(_ctx);
                    if (tReturnType != null && !tReturnType.isInstanceOf(tupleTypes.get(i))) {
                        // tuple type error
                    }
                    i++;
                }
            } else {
                // not a proper tuple return
            }
        } else {
            actualRType = visit(ctx.return_statement().expression());
            if (actualRType != null && !actualRType.isInstanceOf((MJClass)formalRType)) {
                ErrorReporter.printRequiredFoundError("Error: Incompatible types.", parser, ctx.RETURN().getSymbol(), formalRType.toString(), actualRType.toString());
            }
        }

        return null;
    }

    @Override
    public MJClass visitType(mjgrammarParser.TypeContext ctx)
    {
        if (ctx.ID() != null) {
            String name = ctx.ID().getSymbol().getText();
            MJClass variable = classes.get(name);
            if (variable == null) {
                ErrorReporter.printUnresolvedSymbolError(parser, ctx.ID().getSymbol(), "class", Scope.getEnclosingClass(currentScope));
            }
            return variable;
        }
        return null;
    }

    @Override
    public MJClass visitIf_statement(mjgrammarParser.If_statementContext ctx)
    {
        MJClass boolExpr = visit(ctx.expression());
        visit(ctx.if_block());
        visit(ctx.else_block());

        if (boolExpr != BOOLEAN) {
            ErrorReporter.printRequiredFoundError("Error: incompatible types.", parser, ctx.LP().getSymbol(), BOOLEAN.toString(), boolExpr.toString());
        }

        return null;
    }

    @Override
    public MJClass visitWhile_loop(mjgrammarParser.While_loopContext ctx)
    {
        MJClass boolExpr = visit(ctx.expression());
        visit(ctx.while_block());
        if (boolExpr != BOOLEAN) {
            ErrorReporter.printRequiredFoundError("Error: Incompatible types.", parser, ctx.LP().getSymbol(), BOOLEAN.toString(), boolExpr.toString());
        }
        return null;
    }

    @Override
    public MJClass visitPrintln_statement(mjgrammarParser.Println_statementContext ctx)
    {
        MJClass contentsToPrint = visit(ctx.expression());
        if (contentsToPrint != null && contentsToPrint != INT) {
            ErrorReporter.printRequiredFoundError("Error: Incompatible types.", parser, ctx.LP().getSymbol(), INT.toString(), contentsToPrint.toString());
        }
        return null;
    }

    @Override
    public MJClass visitTuple_return_expr(mjgrammarParser.Tuple_return_exprContext ctx)
    {
        List<MJSymbol> tupleElements = new ArrayList<>();
        int expressionCount = ctx.tuple_var_expr().expression().size();

        TupleClass tc = new TupleClass("generic tuple");

        for (int i = 0; i < expressionCount; i++) {
            MJClass typeToAdd = visit(ctx.tuple_var_expr().expression(i));
            assert typeToAdd != null;
            tc.addElementType(typeToAdd);
        }

        return tc;
    }

    @Override
    public MJClass visitVar_eval(mjgrammarParser.Var_evalContext ctx)
    {
        String varname = ctx.ID().getSymbol().getText();
        MJSymbol var = currentScope.lookupSymbol(varname);


        MJClass rightSide = visit(ctx.expression());
        if (rightSide == null) {
            //System.out.println("right side is tuple..");
        } else {
            if (rightSide instanceof TupleClass) {
                // we've found a tuple
                System.out.println("rs inst tc");

                List<MJClass> varTypes = ((TupleSymbol) var).getTypeList();
                for (int i = 0; i < varTypes.size(); i++) {
                    if (varTypes.get(i) != ((TupleClass) rightSide).getElementTypeAt(i)) {

                    }
                }

            } else {
                if (rightSide != null && !rightSide.isInstanceOf(var.getType())) {
                    ErrorReporter.printRequiredFoundError("Error: incompatible types.", parser, ctx.ID().getSymbol(), var.getType().toString(), rightSide.toString());
                }
            }
        }
        return null;
    }

    @Override
    public MJClass visitArray_eval(mjgrammarParser.Array_evalContext ctx)
    {
        String name = ctx.ID().getSymbol().getText();
        MJSymbol var = currentScope.lookupSymbol(name);
        MJClass index = visit(ctx.expression(0));
        MJClass rightside = visit(ctx.expression(1));

        if (var == null) {
            ErrorReporter.printUnresolvedSymbolError(parser, ctx.ID().getSymbol(), "variable", Scope.getEnclosingClass(currentScope));
        } else if (var.getType() != INTARRAY) {
            ErrorReporter.printRequiredFoundError("Error: incompatible types.", parser, ctx.LSB().getSymbol(), INTARRAY.toString(), var.getType().toString());
        } else if (rightside != null && INT != rightside) {
            ErrorReporter.printRequiredFoundError("Error: incompatible types.", parser, ctx.EQ().getSymbol(), INT.toString(), rightside.toString());
        } else if (index != INT) {
            ErrorReporter.printRequiredFoundError("Error: incompatible types.", parser, ctx.LSB().getSymbol(), INT.toString(), index.toString());
        }

        return null;

    }

    @Override
    public MJClass visitTuple_var_expr(mjgrammarParser.Tuple_var_exprContext ctx)
    {
        return null;
    }

    @Override
    public MJClass visitNew_object_expr(mjgrammarParser.New_object_exprContext ctx)
    {
        MJClass type = classes.get(ctx.ID().getText());
        if (type == null) {
            ErrorReporter.printUnresolvedSymbolError(parser, ctx.ID().getSymbol(), "class", Scope.getEnclosingClass(currentScope));
        }

        return type;
    }

    @Override
    public MJClass visitParentheses_expr(mjgrammarParser.Parentheses_exprContext ctx)
    {
        return visit(ctx.expression());
    }

    @Override
    public MJClass visitId_expr(mjgrammarParser.Id_exprContext ctx)
    {
        String name = ctx.ID().getSymbol().getText();
        MJSymbol var = currentScope.lookupSymbol(name);
        if (var == null) {
            ErrorReporter.printUnresolvedSymbolError(parser, ctx.ID().getSymbol(), "variable", Scope.getEnclosingClass(currentScope));
            return null;
        }

        return var.getType();
    }

    @Override
    public MJClass visitThis_expr(mjgrammarParser.This_exprContext ctx)
    {
        visitChildren(ctx);
        return Scope.getEnclosingClass(currentScope);
    }

    @Override
    public MJClass visitMult_expr(mjgrammarParser.Mult_exprContext ctx)
    {
        ErrorReporter.binaryOpTypeError(parser, ctx, ctx.TIMES().getSymbol(), visit(ctx.expression(0)), visit(ctx.expression(1)), INT, INT);
        return INT;
    }

    @Override
    public MJClass visitNot_expr(mjgrammarParser.Not_exprContext ctx)
    {
        MJClass boolClass = visit(ctx.expression());

        if (boolClass != BOOLEAN) {
            ErrorReporter.printFileNameAndLineNumber(ctx.NOT().getSymbol());
            System.err.println("Error: bad operand type " + boolClass + " for unary operator \'!\'");
            ErrorReporter.underlineError(parser, ctx.NOT().getSymbol());
        }
        return BOOLEAN;
    }

    @Override
    public MJClass visitBool_lit_expr(mjgrammarParser.Bool_lit_exprContext ctx)
    {
        return super.visitBool_lit_expr(ctx);
    }

    @Override
    public MJClass visitLt_expr(mjgrammarParser.Lt_exprContext ctx)
    {
        ErrorReporter.binaryOpTypeError(parser, ctx, ctx.LT().getSymbol(), visit(ctx.expression(0)), visit(ctx.expression(1)), INT, INT);
        return BOOLEAN;
    }

    @Override
    public MJClass visitPlus_expr(mjgrammarParser.Plus_exprContext ctx)
    {
        ErrorReporter.binaryOpTypeError(parser, ctx, ctx.PLUS().getSymbol(), visit(ctx.expression(0)), visit(ctx.expression(1)), INT, INT);
        return INT;
    }

    @Override
    public MJClass visitArray_size_expr(mjgrammarParser.Array_size_exprContext ctx)
    {
        MJClass intArray = visit(ctx.expression());
        if (intArray != INTARRAY) {
            ErrorReporter.printFileNameAndLineNumber(ctx.DOTLENGTH().getSymbol());
            System.err.println("Error: bad operand type " + intArray + " for unary operator \'.length\'");
            ErrorReporter.underlineError(parser, ctx.DOTLENGTH().getSymbol());
        }
        return INT;

    }

    @Override
    public MJClass visitAnd_expr(mjgrammarParser.And_exprContext ctx)
    {
        ErrorReporter.binaryOpTypeError(parser, ctx, ctx.AND().getSymbol(), visit(ctx.expression(0)), visit(ctx.expression(1)), BOOLEAN, BOOLEAN);
        return BOOLEAN;
    }

    @Override
    public MJClass visitArray_instantiation_expr(mjgrammarParser.Array_instantiation_exprContext ctx)
    {
        MJClass type = visit(ctx.expression());
        if (type != INT) {
            ErrorReporter.printRequiredFoundError("Error: Incompatible types...", parser, ctx.LSB().getSymbol(), INT.toString(), type.toString());
        }
        return INTARRAY;
    }

    @Override
    public MJClass visitInt_lit_expr(mjgrammarParser.Int_lit_exprContext ctx)
    {
        visitChildren(ctx);
        return INT;
    }

    @Override
    public MJClass visitMethod_call_expr(mjgrammarParser.Method_call_exprContext ctx)
    {
        MJClass type = visit(ctx.expression(0));
        callerTypes.put(ctx, type);
        if (type == null) {
            // tuple, anyone?
            System.out.println("Type is null");
            return null;
        }

        String methodName = ctx.ID().getText() + "()";
        MJMethod method = (MJMethod) (type.lookupSymbol(methodName));
        if (method == null) {
            ErrorReporter.printUnresolvedSymbolError(parser, ctx.ID().getSymbol(), "method", type);
            return null;
        } else {
            List<MJClass> paramList = new ArrayList<>();
            for (mjgrammarParser.ExpressionContext _ctx : ctx.expression().subList(1, ctx.expression().size())) {
                paramList.add(visit(_ctx));
            }

            List<MJClass> paramListDef = method.getParameterListDef();
            if (paramListDef.size() != paramList.size()) {
                ErrorReporter.printRequiredFoundError("Error: method parameters of method " + method.getName() + " do not match method definition.",
                        parser, ctx.ID().getSymbol(),   paramListDef.toString(), paramList.toString());

                System.err.println("Explanation: Actual and formal arguments differ in length.");
                return method.getType();
            }

            for (int i = 0; i < paramListDef.size(); i++)
            {
                if (!paramList.get(i).isInstanceOf(paramListDef.get(i))) {
                    ErrorReporter.printRequiredFoundError("Error: method call parameters of method " + method.getName() + " do not match method deinition.",
                            parser, ctx.ID().getSymbol(), paramListDef.toString(), paramList.toString());
                }
            }
            return method.getType();
        }

    }

    @Override
    public MJClass visitMinus_expr(mjgrammarParser.Minus_exprContext ctx)
    {
        ErrorReporter.binaryOpTypeError(parser, ctx, ctx.MINUS().getSymbol(), visit(ctx.expression(0)), visit(ctx.expression(1)), INT, INT);
        return INT;
    }

    @Override
    public MJClass visitArray_acces_expr(mjgrammarParser.Array_acces_exprContext ctx)
    {
        MJClass array = visit(ctx.expression(0));
        MJClass index = visit(ctx.expression(1));

        if (array != INTARRAY) {
            ErrorReporter.printFileNameAndLineNumber(ctx.LSB().getSymbol());
            System.err.println("Error: Array required, but " + array + " was found instead.");
            ErrorReporter.underlineError(parser, ctx.LSB().getSymbol());
        }

        if (index != INT) {
            ErrorReporter.printRequiredFoundError("Error: Incompatible type...", parser, ctx.LSB().getSymbol(), INT.toString(), index.toString());
        }

        return INT;
    }

    @Override
    public MJClass visitBoolean_literal(mjgrammarParser.Boolean_literalContext ctx)
    {
        visitChildren(ctx);
        return BOOLEAN;
    }

    // custom methods

    public MJClass acquireCurrentScope(ParserRuleContext ctx)
    {
        currentScope = scopes.get(ctx);
        MJClass result = visitChildren(ctx);
        currentScope = currentScope.getEnclosingScope();

        return null;
    }
}
