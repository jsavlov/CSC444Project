// Generated from /Users/jason/Documents/CSC444Project/antlr/mjgrammar.g4 by ANTLR 4.5.3
package csc444project;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mjgrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mjgrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(mjgrammarParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#main_class_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_class_dec(mjgrammarParser.Main_class_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#main_class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_class_name(mjgrammarParser.Main_class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#main_class_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_class_param(mjgrammarParser.Main_class_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#class_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_dec(mjgrammarParser.Class_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(mjgrammarParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#superclass_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_name(mjgrammarParser.Superclass_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_dec(mjgrammarParser.Var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(mjgrammarParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#method_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_dec(mjgrammarParser.Method_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#method_type_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_type_dec(mjgrammarParser.Method_type_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(mjgrammarParser.Method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#method_param_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_param_dec(mjgrammarParser.Method_param_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#method_param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_param_name(mjgrammarParser.Method_param_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(mjgrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#type_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_dec(mjgrammarParser.Type_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#tuple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type(mjgrammarParser.Tuple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#type_dec_a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_dec_a(mjgrammarParser.Type_dec_aContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(mjgrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#statement_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_1(mjgrammarParser.Statement_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation(mjgrammarParser.EvaluationContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#boolean_evaluation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_evaluation(mjgrammarParser.Boolean_evaluationContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_1(mjgrammarParser.Evaluation_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_1a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_1a(mjgrammarParser.Evaluation_1aContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_2(mjgrammarParser.Evaluation_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_2a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_2a(mjgrammarParser.Evaluation_2aContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_3(mjgrammarParser.Evaluation_3Context ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_3a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_3a(mjgrammarParser.Evaluation_3aContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_4(mjgrammarParser.Evaluation_4Context ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_4a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_4a(mjgrammarParser.Evaluation_4aContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_5(mjgrammarParser.Evaluation_5Context ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_5a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_5a(mjgrammarParser.Evaluation_5aContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_6(mjgrammarParser.Evaluation_6Context ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_6a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_6a(mjgrammarParser.Evaluation_6aContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_7(mjgrammarParser.Evaluation_7Context ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_7a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_7a(mjgrammarParser.Evaluation_7aContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_8(mjgrammarParser.Evaluation_8Context ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_8a}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_8a(mjgrammarParser.Evaluation_8aContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#evaluation_9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_9(mjgrammarParser.Evaluation_9Context ctx);
}