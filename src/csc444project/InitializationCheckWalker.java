package csc444project;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.Map;
import java.util.Set;


public class InitializationCheckWalker extends mjgrammarBaseVisitor<Set<MJSymbol>>
{
    private mjgrammarParser parser;
    private final Map<String, MJClass> classes;
    ParseTreeProperty<Scope> scopes;
    Scope currentScope = null;

    public InitializationCheckWalker(mjgrammarParser parser, Map<String, MJClass> classes, ParseTreeProperty<Scope> scopes)
    {
        this.parser = parser;
        this.classes = classes;
        this.scopes = scopes;
    }

    @Override
    public Set<MJSymbol> visitClass_dec(mjgrammarParser.Class_decContext ctx)
    {
        enterScope(ctx);
        visitChildren(ctx);
        exitScope();
        return null;
    }

    @Override
    public Set<MJSymbol> visitMethod_dec(mjgrammarParser.Method_decContext ctx)
    {
        enterScope(ctx);
        visitChildren(ctx);
        exitScope();
        return null;
    }

    @Override
    public Set<MJSymbol> visitIf_statement(mjgrammarParser.If_statementContext ctx)
    {
        visit(ctx.expression());
        Set<MJSymbol> initializedVars = visit(ctx.if_block());
        initializedVars.retainAll(visit(ctx.else_block()));
        for (MJSymbol workingSymbol : initializedVars)
        {
            currentScope.initializeSymbol(workingSymbol);
        }
        return initializedVars;
    }

    @Override
    public Set<MJSymbol> visitIf_block(mjgrammarParser.If_blockContext ctx)
    {
        enterScope(ctx);
        visitChildren(ctx);
        Set<MJSymbol> ifInit = currentScope.getInitializedVariables();
        exitScope();
        return ifInit;
    }

    @Override
    public Set<MJSymbol> visitElse_block(mjgrammarParser.Else_blockContext ctx)
    {
        enterScope(ctx);
        visitChildren(ctx);
        Set<MJSymbol> elseInit = currentScope.getInitializedVariables();
        exitScope();
        return elseInit;
    }

    @Override
    public Set<MJSymbol> visitWhile_loop(mjgrammarParser.While_loopContext ctx)
    {
        enterScope(ctx);
        visitChildren(ctx);
        exitScope();
        return null;
    }

    @Override
    public Set<MJSymbol> visitVar_dec(mjgrammarParser.Var_decContext ctx)
    {
        Set<MJSymbol> sym = visitChildren(ctx);
        currentScope.initializeSymbol(currentScope.lookupSymbol(ctx.var_name().ID().getText()));
        return sym;
    }

    @Override
    public Set<MJSymbol> visitId_expr(mjgrammarParser.Id_exprContext ctx)
    {
        String id = ctx.ID().getText();
        if (!currentScope.hasBeenInitialized(id)) {
            ErrorReporter.printVariablePossiblyNotInitializedError(parser, ctx.ID().getSymbol(), id);
        }

        return visitChildren(ctx);
    }




    // Custom methods

    void enterScope(ParserRuleContext ctx)
    {
        currentScope = scopes.get(ctx);
    }

    void exitScope()
    {
        currentScope = currentScope.getEnclosingScope();
    }
}
