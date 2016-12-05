// Generated from /Users/jason/Documents/CSC444Project/antlr/mjgrammar.g4 by ANTLR 4.5.3
package csc444project;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mjgrammarParser}.
 */
public interface mjgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(mjgrammarParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(mjgrammarParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#main_class_dec}.
	 * @param ctx the parse tree
	 */
	void enterMain_class_dec(mjgrammarParser.Main_class_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#main_class_dec}.
	 * @param ctx the parse tree
	 */
	void exitMain_class_dec(mjgrammarParser.Main_class_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#main_class_name}.
	 * @param ctx the parse tree
	 */
	void enterMain_class_name(mjgrammarParser.Main_class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#main_class_name}.
	 * @param ctx the parse tree
	 */
	void exitMain_class_name(mjgrammarParser.Main_class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#main_class_param}.
	 * @param ctx the parse tree
	 */
	void enterMain_class_param(mjgrammarParser.Main_class_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#main_class_param}.
	 * @param ctx the parse tree
	 */
	void exitMain_class_param(mjgrammarParser.Main_class_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#class_dec}.
	 * @param ctx the parse tree
	 */
	void enterClass_dec(mjgrammarParser.Class_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#class_dec}.
	 * @param ctx the parse tree
	 */
	void exitClass_dec(mjgrammarParser.Class_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(mjgrammarParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(mjgrammarParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#superclass_name}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_name(mjgrammarParser.Superclass_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#superclass_name}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_name(mjgrammarParser.Superclass_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void enterVar_dec(mjgrammarParser.Var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#var_dec}.
	 * @param ctx the parse tree
	 */
	void exitVar_dec(mjgrammarParser.Var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(mjgrammarParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(mjgrammarParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#method_dec}.
	 * @param ctx the parse tree
	 */
	void enterMethod_dec(mjgrammarParser.Method_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#method_dec}.
	 * @param ctx the parse tree
	 */
	void exitMethod_dec(mjgrammarParser.Method_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#method_type_dec}.
	 * @param ctx the parse tree
	 */
	void enterMethod_type_dec(mjgrammarParser.Method_type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#method_type_dec}.
	 * @param ctx the parse tree
	 */
	void exitMethod_type_dec(mjgrammarParser.Method_type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(mjgrammarParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(mjgrammarParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#method_param_dec}.
	 * @param ctx the parse tree
	 */
	void enterMethod_param_dec(mjgrammarParser.Method_param_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#method_param_dec}.
	 * @param ctx the parse tree
	 */
	void exitMethod_param_dec(mjgrammarParser.Method_param_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#method_param_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_param_name(mjgrammarParser.Method_param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#method_param_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_param_name(mjgrammarParser.Method_param_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(mjgrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(mjgrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#type_dec}.
	 * @param ctx the parse tree
	 */
	void enterType_dec(mjgrammarParser.Type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#type_dec}.
	 * @param ctx the parse tree
	 */
	void exitType_dec(mjgrammarParser.Type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void enterTuple_type(mjgrammarParser.Tuple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#tuple_type}.
	 * @param ctx the parse tree
	 */
	void exitTuple_type(mjgrammarParser.Tuple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#type_dec_a}.
	 * @param ctx the parse tree
	 */
	void enterType_dec_a(mjgrammarParser.Type_dec_aContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#type_dec_a}.
	 * @param ctx the parse tree
	 */
	void exitType_dec_a(mjgrammarParser.Type_dec_aContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(mjgrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(mjgrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#statement_1}.
	 * @param ctx the parse tree
	 */
	void enterStatement_1(mjgrammarParser.Statement_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#statement_1}.
	 * @param ctx the parse tree
	 */
	void exitStatement_1(mjgrammarParser.Statement_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation(mjgrammarParser.EvaluationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation(mjgrammarParser.EvaluationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#boolean_evaluation}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_evaluation(mjgrammarParser.Boolean_evaluationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#boolean_evaluation}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_evaluation(mjgrammarParser.Boolean_evaluationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_1}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_1(mjgrammarParser.Evaluation_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_1}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_1(mjgrammarParser.Evaluation_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_1a}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_1a(mjgrammarParser.Evaluation_1aContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_1a}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_1a(mjgrammarParser.Evaluation_1aContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_2}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_2(mjgrammarParser.Evaluation_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_2}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_2(mjgrammarParser.Evaluation_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_2a}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_2a(mjgrammarParser.Evaluation_2aContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_2a}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_2a(mjgrammarParser.Evaluation_2aContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_3}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_3(mjgrammarParser.Evaluation_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_3}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_3(mjgrammarParser.Evaluation_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_3a}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_3a(mjgrammarParser.Evaluation_3aContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_3a}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_3a(mjgrammarParser.Evaluation_3aContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_4}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_4(mjgrammarParser.Evaluation_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_4}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_4(mjgrammarParser.Evaluation_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_4a}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_4a(mjgrammarParser.Evaluation_4aContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_4a}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_4a(mjgrammarParser.Evaluation_4aContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_5}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_5(mjgrammarParser.Evaluation_5Context ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_5}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_5(mjgrammarParser.Evaluation_5Context ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_5a}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_5a(mjgrammarParser.Evaluation_5aContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_5a}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_5a(mjgrammarParser.Evaluation_5aContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_6}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_6(mjgrammarParser.Evaluation_6Context ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_6}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_6(mjgrammarParser.Evaluation_6Context ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_6a}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_6a(mjgrammarParser.Evaluation_6aContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_6a}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_6a(mjgrammarParser.Evaluation_6aContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_7}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_7(mjgrammarParser.Evaluation_7Context ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_7}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_7(mjgrammarParser.Evaluation_7Context ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_7a}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_7a(mjgrammarParser.Evaluation_7aContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_7a}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_7a(mjgrammarParser.Evaluation_7aContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_8}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_8(mjgrammarParser.Evaluation_8Context ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_8}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_8(mjgrammarParser.Evaluation_8Context ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_8a}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_8a(mjgrammarParser.Evaluation_8aContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_8a}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_8a(mjgrammarParser.Evaluation_8aContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#evaluation_9}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_9(mjgrammarParser.Evaluation_9Context ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#evaluation_9}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_9(mjgrammarParser.Evaluation_9Context ctx);
}