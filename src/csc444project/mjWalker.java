package csc444project;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class mjWalker extends mjgrammarBaseListener {

    private mjMainClass mainClass;

    private final Map<String, mjClass> classMap = new HashMap<String, mjClass>();

    private mjClass currentClass;
    private mjMethod currentMethod;
    private mjVar currentVar;

    @Override
    public void enterGoal(mjgrammarParser.GoalContext ctx) {
        super.enterGoal(ctx);

        System.out.println("Entering goal...");
    }

    @Override
    public void exitGoal(mjgrammarParser.GoalContext ctx) {
        super.exitGoal(ctx);

        System.out.println("Exiting goal...");
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);

        System.out.println("Hit an error node...");
    }

    @Override
    public void enterMain_class_dec(mjgrammarParser.Main_class_decContext ctx) {
        super.enterMain_class_dec(ctx);

        System.out.println("Entered main class...");
    }

    @Override
    public void enterClass_dec(mjgrammarParser.Class_decContext ctx) {
        super.enterClass_dec(ctx);
    }

    @Override
    public void enterMain_class_name(mjgrammarParser.Main_class_nameContext ctx) {
        super.enterMain_class_name(ctx);

        String mainClassName = ctx.ID().getText();
        mainClass = new mjMainClass(mainClassName);
        System.out.println("Created new main class with name " + mainClass.getName());
        currentClass = mainClass;
    }

    @Override
    public void exitMain_class_name(mjgrammarParser.Main_class_nameContext ctx) {
        super.exitMain_class_name(ctx);
    }

    @Override
    public void enterMain_class_param(mjgrammarParser.Main_class_paramContext ctx) {
        super.enterMain_class_param(ctx);
    }

    @Override
    public void exitMain_class_param(mjgrammarParser.Main_class_paramContext ctx) {
        super.exitMain_class_param(ctx);
    }

    @Override
    public void enterClass_name(mjgrammarParser.Class_nameContext ctx) {
        super.enterClass_name(ctx);

        String className = ctx.getText();
        mjClass newClass = new mjClass(className);
        System.out.println("Created new class with name " + newClass.getName());
        classMap.put(className, newClass);
        currentClass = newClass;
    }

    @Override
    public void exitClass_name(mjgrammarParser.Class_nameContext ctx) {
        super.exitClass_name(ctx);
    }

    @Override
    public void enterSuperclass_name(mjgrammarParser.Superclass_nameContext ctx) {
        super.enterSuperclass_name(ctx);
    }

    @Override
    public void exitSuperclass_name(mjgrammarParser.Superclass_nameContext ctx) {
        super.exitSuperclass_name(ctx);
    }

    @Override
    public void exitMain_class_dec(mjgrammarParser.Main_class_decContext ctx) {
        super.exitMain_class_dec(ctx);
        System.out.println("Exiting main_class dec w/ class name " + currentClass.getName());
        currentClass = null;
    }

    @Override
    public void exitClass_dec(mjgrammarParser.Class_decContext ctx) {
        super.exitClass_dec(ctx);
        System.out.println("Exiting class dec w/ class name " + currentClass.getName());
        currentClass = null;
    }

    @Override
    public void enterVar_dec(mjgrammarParser.Var_decContext ctx) {
        super.enterVar_dec(ctx);
        System.out.println("Declaring a variable...");
    }

    @Override
    public void exitVar_dec(mjgrammarParser.Var_decContext ctx) {
        super.exitVar_dec(ctx);
    }

    @Override
    public void enterVar_name(mjgrammarParser.Var_nameContext ctx) {
        super.enterVar_name(ctx);
    }

    @Override
    public void exitVar_name(mjgrammarParser.Var_nameContext ctx) {
        super.exitVar_name(ctx);
    }

    @Override
    public void enterMethod_dec(mjgrammarParser.Method_decContext ctx) {
        super.enterMethod_dec(ctx);
        System.out.println("Entering method dec...");

        String methodName, methodReturnType;
        if (ctx.method_type_dec() != null) {
            methodReturnType = ctx.method_type_dec().type_dec().type().getText();
            methodName = ctx.method_type_dec().method_name().getText();
            currentMethod = new mjMethod(methodName, methodReturnType, currentClass);
            System.out.println("Created new method " + currentMethod.getName() + " w/ return type " + currentMethod.getReturnType() + " belonging to class " + currentMethod.getMethodClass().getName());
        }

    }

    @Override
    public void exitMethod_dec(mjgrammarParser.Method_decContext ctx) {
        super.exitMethod_dec(ctx);
    }

    @Override
    public void enterMethod_type_dec(mjgrammarParser.Method_type_decContext ctx) {
        super.enterMethod_type_dec(ctx);
    }

    @Override
    public void exitMethod_type_dec(mjgrammarParser.Method_type_decContext ctx) {
        super.exitMethod_type_dec(ctx);
    }

    @Override
    public void enterMethod_param_dec(mjgrammarParser.Method_param_decContext ctx) {
        super.enterMethod_param_dec(ctx);
    }

    @Override
    public void exitMethod_param_dec(mjgrammarParser.Method_param_decContext ctx) {
        super.exitMethod_param_dec(ctx);
    }

    @Override
    public void enterMethod_name(mjgrammarParser.Method_nameContext ctx) {
        super.enterMethod_name(ctx);
        String method_name = ctx.getText();
        currentMethod.setName(method_name);
    }

    @Override
    public void exitMethod_name(mjgrammarParser.Method_nameContext ctx) {
        super.exitMethod_name(ctx);
    }

    @Override
    public void enterMethod_param_name(mjgrammarParser.Method_param_nameContext ctx) {
        super.enterMethod_param_name(ctx);
    }

    @Override
    public void exitMethod_param_name(mjgrammarParser.Method_param_nameContext ctx) {
        super.exitMethod_param_name(ctx);
    }

    @Override
    public void enterType(mjgrammarParser.TypeContext ctx) {
        super.enterType(ctx);

    }

    @Override
    public void exitType(mjgrammarParser.TypeContext ctx) {
        super.exitType(ctx);
    }

    @Override
    public void enterType_dec(mjgrammarParser.Type_decContext ctx) {
        super.enterType_dec(ctx);
    }

    @Override
    public void exitType_dec(mjgrammarParser.Type_decContext ctx) {
        super.exitType_dec(ctx);
    }

    @Override
    public void enterTuple_type(mjgrammarParser.Tuple_typeContext ctx) {
        super.enterTuple_type(ctx);
    }

    @Override
    public void exitTuple_type(mjgrammarParser.Tuple_typeContext ctx) {
        super.exitTuple_type(ctx);
    }

    @Override
    public void enterType_dec_a(mjgrammarParser.Type_dec_aContext ctx) {
        super.enterType_dec_a(ctx);
    }

    @Override
    public void exitType_dec_a(mjgrammarParser.Type_dec_aContext ctx) {
        super.exitType_dec_a(ctx);
    }

    @Override
    public void enterStatement(mjgrammarParser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(mjgrammarParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    @Override
    public void enterStatement_1(mjgrammarParser.Statement_1Context ctx) {
        super.enterStatement_1(ctx);
    }

    @Override
    public void exitStatement_1(mjgrammarParser.Statement_1Context ctx) {
        super.exitStatement_1(ctx);
    }

    @Override
    public void enterEvaluation(mjgrammarParser.EvaluationContext ctx) {
        super.enterEvaluation(ctx);
    }

    @Override
    public void exitEvaluation(mjgrammarParser.EvaluationContext ctx) {
        super.exitEvaluation(ctx);
    }

    @Override
    public void enterBoolean_evaluation(mjgrammarParser.Boolean_evaluationContext ctx) {
        super.enterBoolean_evaluation(ctx);
    }

    @Override
    public void exitBoolean_evaluation(mjgrammarParser.Boolean_evaluationContext ctx) {
        super.exitBoolean_evaluation(ctx);
    }

    @Override
    public void enterEvaluation_1(mjgrammarParser.Evaluation_1Context ctx) {
        super.enterEvaluation_1(ctx);
    }

    @Override
    public void exitEvaluation_1(mjgrammarParser.Evaluation_1Context ctx) {
        super.exitEvaluation_1(ctx);
    }

    @Override
    public void enterEvaluation_1a(mjgrammarParser.Evaluation_1aContext ctx) {
        super.enterEvaluation_1a(ctx);
    }

    @Override
    public void exitEvaluation_1a(mjgrammarParser.Evaluation_1aContext ctx) {
        super.exitEvaluation_1a(ctx);
    }

    @Override
    public void enterEvaluation_2(mjgrammarParser.Evaluation_2Context ctx) {
        super.enterEvaluation_2(ctx);
    }

    @Override
    public void exitEvaluation_2(mjgrammarParser.Evaluation_2Context ctx) {
        super.exitEvaluation_2(ctx);
    }

    @Override
    public void enterEvaluation_2a(mjgrammarParser.Evaluation_2aContext ctx) {
        super.enterEvaluation_2a(ctx);
    }

    @Override
    public void exitEvaluation_2a(mjgrammarParser.Evaluation_2aContext ctx) {
        super.exitEvaluation_2a(ctx);
    }

    @Override
    public void enterEvaluation_3(mjgrammarParser.Evaluation_3Context ctx) {
        super.enterEvaluation_3(ctx);
    }

    @Override
    public void exitEvaluation_3(mjgrammarParser.Evaluation_3Context ctx) {
        super.exitEvaluation_3(ctx);
    }

    @Override
    public void enterEvaluation_3a(mjgrammarParser.Evaluation_3aContext ctx) {
        super.enterEvaluation_3a(ctx);
    }

    @Override
    public void exitEvaluation_3a(mjgrammarParser.Evaluation_3aContext ctx) {
        super.exitEvaluation_3a(ctx);
    }

    @Override
    public void enterEvaluation_4(mjgrammarParser.Evaluation_4Context ctx) {
        super.enterEvaluation_4(ctx);
    }

    @Override
    public void exitEvaluation_4(mjgrammarParser.Evaluation_4Context ctx) {
        super.exitEvaluation_4(ctx);
    }

    @Override
    public void enterEvaluation_4a(mjgrammarParser.Evaluation_4aContext ctx) {
        super.enterEvaluation_4a(ctx);
    }

    @Override
    public void exitEvaluation_4a(mjgrammarParser.Evaluation_4aContext ctx) {
        super.exitEvaluation_4a(ctx);
    }

    @Override
    public void enterEvaluation_5(mjgrammarParser.Evaluation_5Context ctx) {
        super.enterEvaluation_5(ctx);
    }

    @Override
    public void exitEvaluation_5(mjgrammarParser.Evaluation_5Context ctx) {
        super.exitEvaluation_5(ctx);
    }

    @Override
    public void enterEvaluation_5a(mjgrammarParser.Evaluation_5aContext ctx) {
        super.enterEvaluation_5a(ctx);
    }

    @Override
    public void exitEvaluation_5a(mjgrammarParser.Evaluation_5aContext ctx) {
        super.exitEvaluation_5a(ctx);
    }

    @Override
    public void enterEvaluation_6(mjgrammarParser.Evaluation_6Context ctx) {
        super.enterEvaluation_6(ctx);
    }

    @Override
    public void exitEvaluation_6(mjgrammarParser.Evaluation_6Context ctx) {
        super.exitEvaluation_6(ctx);
    }

    @Override
    public void enterEvaluation_6a(mjgrammarParser.Evaluation_6aContext ctx) {
        super.enterEvaluation_6a(ctx);
    }

    @Override
    public void exitEvaluation_6a(mjgrammarParser.Evaluation_6aContext ctx) {
        super.exitEvaluation_6a(ctx);
    }

    @Override
    public void enterEvaluation_7(mjgrammarParser.Evaluation_7Context ctx) {
        super.enterEvaluation_7(ctx);
    }

    @Override
    public void exitEvaluation_7(mjgrammarParser.Evaluation_7Context ctx) {
        super.exitEvaluation_7(ctx);
    }

    @Override
    public void enterEvaluation_7a(mjgrammarParser.Evaluation_7aContext ctx) {
        super.enterEvaluation_7a(ctx);
    }

    @Override
    public void exitEvaluation_7a(mjgrammarParser.Evaluation_7aContext ctx) {
        super.exitEvaluation_7a(ctx);
    }

    @Override
    public void enterEvaluation_8(mjgrammarParser.Evaluation_8Context ctx) {
        super.enterEvaluation_8(ctx);
    }

    @Override
    public void exitEvaluation_8(mjgrammarParser.Evaluation_8Context ctx) {
        super.exitEvaluation_8(ctx);
    }

    @Override
    public void enterEvaluation_8a(mjgrammarParser.Evaluation_8aContext ctx) {
        super.enterEvaluation_8a(ctx);
    }

    @Override
    public void exitEvaluation_8a(mjgrammarParser.Evaluation_8aContext ctx) {
        super.exitEvaluation_8a(ctx);
    }

    @Override
    public void enterEvaluation_9(mjgrammarParser.Evaluation_9Context ctx) {
        super.enterEvaluation_9(ctx);
    }

    @Override
    public void exitEvaluation_9(mjgrammarParser.Evaluation_9Context ctx) {
        super.exitEvaluation_9(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }
}
