package csc444project;


import org.antlr.v4.runtime.ParserRuleContext;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.*;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.GeneratorAdapter;

import java.io.*;

public class CodeGenerator extends mjgrammarBaseListener implements Opcodes
{

    public final org.objectweb.asm.commons.Method INIT()
    {
        return org.objectweb.asm.commons.Method.getMethod("void <init> ()");
    }

    mjgrammarParser parser;
    final Map<String, MJClass> classes;
    ParseTreeProperty<Scope> scopes;
    ParseTreeProperty<MJClass> callerTypes;

    Scope currentScope = null;
    ClassWriter cw = null;
    org.objectweb.asm.commons.Method currentMethod;
    GeneratorAdapter methodGenerator;
    FileOutputStream fos;
    Stack<Label> labelStack = new Stack<>();

    int argCount;

    public CodeGenerator(mjgrammarParser parser, Map<String, MJClass> classes, ParseTreeProperty<Scope> scopes, ParseTreeProperty<MJClass> callerTypes)
    {
        this.parser = parser;
        this.classes = classes;
        this.scopes = scopes;
        this.callerTypes = callerTypes;
    }

    @Override
    public void enterMain_class_dec(mjgrammarParser.Main_class_decContext ctx)
    {
        MJClass mainClass = classes.get(ctx.main_class_name().ID().getText());
        String mainClassName = mainClass.getName();
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(V1_1, ACC_PUBLIC, mainClassName, null, "java/lang/Object", null);

        methodGenerator = new GeneratorAdapter(ACC_PUBLIC, INIT(), null, null, cw);
        methodGenerator.loadThis();
        methodGenerator.invokeConstructor(Type.getType(Object.class), INIT());
        methodGenerator.returnValue();
        methodGenerator.endMethod();

        methodGenerator = new GeneratorAdapter(ACC_PUBLIC + ACC_STATIC, org.objectweb.asm.commons.Method.getMethod("void main (String[])"), null, null, cw);
    }

    @Override
    public void exitMain_class_dec(mjgrammarParser.Main_class_decContext ctx)
    {
        methodGenerator.returnValue();
        methodGenerator.endMethod();
        cw.visitEnd();
        MJClass mainClass = classes.get(ctx.main_class_name().ID().getText());
        String mainClassName = mainClass.getName();

        try {
            fos = new FileOutputStream(new File(mainClassName + ".class"));
            fos.write(cw.toByteArray());
            fos.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            System.exit(1);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public void enterClass_dec(mjgrammarParser.Class_decContext ctx)
    {
        enterScope(ctx);

        MJClass mjClass = classes.get(ctx.class_name().ID().getText());
        String className = mjClass.getName();
        String superClassName = mjClass.getSuperclass() != null ?
                mjClass.getSuperclass().getName() :
                "java/lang/Object";

        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(V1_1, ACC_PUBLIC, className, null, superClassName, null);

        methodGenerator = new GeneratorAdapter(ACC_PUBLIC, INIT(), null, null, cw);
        methodGenerator.loadThis();
        methodGenerator.invokeConstructor(Type.getObjectType(superClassName), INIT());
        methodGenerator.returnValue();
        methodGenerator.endMethod();

    }

    @Override
    public void exitClass_dec(mjgrammarParser.Class_decContext ctx)
    {
        cw.visitEnd();
        MJClass mjClass = classes.get(ctx.class_name().ID().getText());
        String className = mjClass.getName();

        try {
            fos = new FileOutputStream(new File(className + ".class"));
            fos.write(cw.toByteArray());
            fos.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            System.exit(1);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.exit(1);
        }
        exitScope();
    }

    /*
    @Override
    public void enterLocal_dec(mjgrammarParser.Local_decContext ctx)
    {
        MJSymbol var = currentScope.lookupSymbol(ctx.var_dec().var_name().getText());
        Type type = var.getType().getAsmType();
        if (!var.hasLocalId()) {
            var.setLocalId(methodGenerator.newLocal(type));
        } else {
            System.out.println("Error: variable was declared twice.");
        }
    }
    */

    @Override
    public void exitLocal_dec(mjgrammarParser.Local_decContext ctx)
    {
        MJSymbol var = currentScope.lookupSymbol(ctx.var_dec().var_name().getText());
        Type type = var.getType().getAsmType();
        if (!var.hasLocalId()) {
            var.setLocalId(methodGenerator.newLocal(type));
        } else {
            System.out.println("Error: variable was declared twice.");
        }
    }

    @Override
    public void exitVar_dec(mjgrammarParser.Var_decContext ctx)
    {
        MJSymbol var = currentScope.lookupSymbol(ctx.var_name().ID().getText());
        if (var.isField()) {
            cw.visitField(
                    ACC_PROTECTED,
                    var.getName(),
                    var.getType().getAsmType().getDescriptor(),
                    null,
                    null)
                    .visitEnd();
        }    }

    @Override
    public void enterMethod_dec(mjgrammarParser.Method_decContext ctx)
    {
        enterScope(ctx);
        MJMethod methodRepresentation = (MJMethod) currentScope;
        currentMethod = methodRepresentation.getAsmMethod();
        methodGenerator = new GeneratorAdapter(ACC_PUBLIC, currentMethod, null, null, cw);
    }

    @Override
    public void exitMethod_dec(mjgrammarParser.Method_decContext ctx)
    {
        methodGenerator.returnValue();
        methodGenerator.endMethod();
        exitScope();
    }

    @Override
    public void enterParam_list(mjgrammarParser.Param_listContext ctx)
    {
        argCount = 0;
    }

    @Override
    public void enterMethod_param_dec(mjgrammarParser.Method_param_decContext ctx)
    {
        currentScope.lookupSymbol(ctx.method_param_name().getText()).setParameterId(argCount);
        argCount++;
    }

    @Override
    public void enterPrintln_statement(mjgrammarParser.Println_statementContext ctx)
    {
        methodGenerator.getStatic(Type.getType(System.class), "out", Type.getType(PrintStream.class));
    }

    @Override
    public void exitPrintln_statement(mjgrammarParser.Println_statementContext ctx)
    {
        methodGenerator.invokeVirtual(Type.getType(PrintStream.class), org.objectweb.asm.commons.Method.getMethod("void println (int)"));
    }

    @Override
    public void enterVar_eval(mjgrammarParser.Var_evalContext ctx)
    {
        MJSymbol var = currentScope.lookupSymbol(ctx.ID().getText());
        if (var.isField()) {
            methodGenerator.loadThis();
        }
    }

    @Override
    public void exitVar_eval(mjgrammarParser.Var_evalContext ctx)
    {
        MJSymbol var = currentScope.lookupSymbol(ctx.ID().getText());
        Type type = var.getType().getAsmType();
        if (var.isField()) {
            //System.out.println("Variable " + var.getName() + " is a field");
            Type owner = ((MJClass) currentScope.getEnclosingScope()).getAsmType();
            //methodGenerator.loadThis();
            methodGenerator.putField(owner, var.getName(), type);
        } else if (var.isParameter()) {
            methodGenerator.storeArg(var.getParameterListId());
        } else {
            methodGenerator.storeLocal(var.getLocalId(), type);
        }
    }

    @Override
    public void enterArray_eval(mjgrammarParser.Array_evalContext ctx)
    {
        MJSymbol var = currentScope.lookupSymbol(ctx.ID().getText());
        Type type = var.getType().getAsmType();
        if (var.isField()) {
            Type owner = ((MJClass) currentScope.getEnclosingScope()).getAsmType();
            methodGenerator.loadThis();
            methodGenerator.getField(owner, var.getName(), type);
        } else if (var.isParameter()) {
            methodGenerator.loadArg(var.getParameterListId());
        } else {
            methodGenerator.loadLocal(var.getLocalId(), type);
        }
    }

    @Override
    public void exitArray_eval(mjgrammarParser.Array_evalContext ctx)
    {
        methodGenerator.arrayStore(Type.INT_TYPE);
    }

    @Override
    public void enterIf_statement(mjgrammarParser.If_statementContext ctx)
    {
        Label enterElse = methodGenerator.newLabel();
        Label exitElse = methodGenerator.newLabel();
        //methodGenerator.ifZCmp(GeneratorAdapter.EQ, enterElse);
        labelStack.push(exitElse);
        labelStack.push(enterElse);
        labelStack.push(exitElse);
        labelStack.push(enterElse);
    }

    @Override
    public void enterIf_block(mjgrammarParser.If_blockContext ctx)
    {
        methodGenerator.ifZCmp(GeneratorAdapter.EQ, labelStack.pop());
    }

    @Override
    public void exitIf_block(mjgrammarParser.If_blockContext ctx)
    {
        methodGenerator.goTo(labelStack.pop());
    }

    @Override
    public void enterElse_block(mjgrammarParser.Else_blockContext ctx)
    {
        methodGenerator.mark(labelStack.pop());
    }

    @Override
    public void exitElse_block(mjgrammarParser.Else_blockContext ctx)
    {
        methodGenerator.mark(labelStack.pop());
    }

    @Override
    public void enterWhile_loop(mjgrammarParser.While_loopContext ctx)
    {
        Label enterWhile = methodGenerator.mark();
        Label exitWhile = methodGenerator.newLabel();
        labelStack.push(exitWhile);
        labelStack.push(enterWhile);
        labelStack.push(exitWhile);
    }

    @Override
    public void enterWhile_block(mjgrammarParser.While_blockContext ctx)
    {
        methodGenerator.ifZCmp(GeneratorAdapter.EQ, labelStack.pop());
    }

    @Override
    public void exitWhile_loop(mjgrammarParser.While_loopContext ctx)
    {
        methodGenerator.goTo(labelStack.pop());
        methodGenerator.mark(labelStack.pop());
    }

    @Override
    public void exitAnd_expr(mjgrammarParser.And_exprContext ctx)
    {
        methodGenerator.math(GeneratorAdapter.AND, Type.BOOLEAN_TYPE);
    }

    @Override
    public void exitLt_expr(mjgrammarParser.Lt_exprContext ctx)
    {
        Label trueLabel = methodGenerator.newLabel();
        Label endLabel = methodGenerator.newLabel();
        methodGenerator.ifCmp(Type.INT_TYPE, GeneratorAdapter.LT, trueLabel);
        methodGenerator.push(false);
        methodGenerator.goTo(endLabel);
        methodGenerator.mark(trueLabel);
        methodGenerator.push(true);
        methodGenerator.mark(endLabel);
    }

    @Override
    public void exitPlus_expr(mjgrammarParser.Plus_exprContext ctx)
    {
        methodGenerator.math(GeneratorAdapter.ADD, Type.INT_TYPE);
    }

    @Override
    public void exitMinus_expr(mjgrammarParser.Minus_exprContext ctx)
    {
        methodGenerator.math(GeneratorAdapter.SUB, Type.INT_TYPE);
    }

    @Override
    public void exitMult_expr(mjgrammarParser.Mult_exprContext ctx)
    {
        methodGenerator.math(GeneratorAdapter.MUL, Type.INT_TYPE);
    }

    @Override
    public void exitArray_acces_expr(mjgrammarParser.Array_acces_exprContext ctx)
    {
        methodGenerator.arrayLoad(Type.INT_TYPE);
    }

    @Override
    public void exitArray_size_expr(mjgrammarParser.Array_size_exprContext ctx)
    {
        methodGenerator.arrayLength();
    }

    @Override
    public void exitMethod_call_expr(mjgrammarParser.Method_call_exprContext ctx)
    {
        MJClass mjClass = callerTypes.get(ctx);
        methodGenerator.invokeVirtual(mjClass.getAsmType(), ((MJMethod) mjClass.lookupSymbol(ctx.ID().getText() + "()")).getAsmMethod());
    }

    @Override
    public void enterInt_lit_expr(mjgrammarParser.Int_lit_exprContext ctx)
    {
        methodGenerator.push(Integer.parseInt(ctx.INT_LIT().getText()));
    }

    @Override
    public void enterBool_lit_expr(mjgrammarParser.Bool_lit_exprContext ctx)
    {
        boolean predicate = Boolean.parseBoolean(ctx.boolean_literal().getText());
        methodGenerator.push(predicate);
    }

    @Override
    public void exitId_expr(mjgrammarParser.Id_exprContext ctx)
    {
        MJSymbol var = currentScope.lookupSymbol(ctx.ID().getText());
        Type type = var.getType().getAsmType();
        if (var.isParameter()) {
            methodGenerator.loadArg(var.getParameterListId());
        } else if (var.isField()) {
            //System.out.println("Variable " + var.getName() + " is a field");
            Type owner = ((MJClass) currentScope.getEnclosingScope()).getAsmType();
            methodGenerator.loadThis();
            methodGenerator.getField(owner, var.getName(), type);
        } else {
            methodGenerator.loadLocal(var.getLocalId(), type);
        }
    }

    @Override
    public void exitThis_expr(mjgrammarParser.This_exprContext ctx)
    {
        methodGenerator.loadThis();
    }

    @Override
    public void exitArray_instantiation_expr(mjgrammarParser.Array_instantiation_exprContext ctx)
    {
        methodGenerator.newArray(Type.INT_TYPE);
    }

    @Override
    public void enterNew_object_expr(mjgrammarParser.New_object_exprContext ctx)
    {
        Type type = Type.getObjectType(ctx.ID().getText());
        methodGenerator.newInstance(type);
        methodGenerator.dup();
        methodGenerator.invokeConstructor(type, INIT());
    }

    @Override
    public void exitNot_expr(mjgrammarParser.Not_exprContext ctx)
    {
        methodGenerator.not();
    }

    // custom methods

    public void enterScope(ParserRuleContext ctx)
    {
        currentScope = scopes.get(ctx);
    }

    private void exitScope()
    {
        currentScope = currentScope.getEnclosingScope();
    }
}
