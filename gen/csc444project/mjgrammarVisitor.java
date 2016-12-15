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
	 * Visit a parse tree produced by {@link mjgrammarParser#field_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_dec(mjgrammarParser.Field_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#local_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_dec(mjgrammarParser.Local_decContext ctx);
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
	 * Visit a parse tree produced by {@link mjgrammarParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(mjgrammarParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#method_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_body(mjgrammarParser.Method_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(mjgrammarParser.Return_statementContext ctx);
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
	 * Visit a parse tree produced by {@link mjgrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(mjgrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(mjgrammarParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(mjgrammarParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#println_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln_statement(mjgrammarParser.Println_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#var_eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_eval(mjgrammarParser.Var_evalContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#array_eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_eval(mjgrammarParser.Array_evalContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(mjgrammarParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(mjgrammarParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#while_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_block(mjgrammarParser.While_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#tuple_var_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_var_expr(mjgrammarParser.Tuple_var_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new_object_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_object_expr(mjgrammarParser.New_object_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses_expr(mjgrammarParser.Parentheses_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_expr(mjgrammarParser.Id_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code this_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis_expr(mjgrammarParser.This_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus_expr(mjgrammarParser.Plus_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_expr(mjgrammarParser.Mult_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_expr(mjgrammarParser.Not_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool_lit_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_lit_expr(mjgrammarParser.Bool_lit_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt_expr(mjgrammarParser.Lt_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(mjgrammarParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_size_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_size_expr(mjgrammarParser.Array_size_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_instantiation_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_instantiation_expr(mjgrammarParser.Array_instantiation_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int_lit_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_lit_expr(mjgrammarParser.Int_lit_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code method_call_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call_expr(mjgrammarParser.Method_call_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_expr(mjgrammarParser.Minus_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tuple_return_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_return_expr(mjgrammarParser.Tuple_return_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_acces_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_acces_expr(mjgrammarParser.Array_acces_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mjgrammarParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(mjgrammarParser.Boolean_literalContext ctx);
}