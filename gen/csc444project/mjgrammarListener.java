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
	 * Enter a parse tree produced by {@link mjgrammarParser#field_dec}.
	 * @param ctx the parse tree
	 */
	void enterField_dec(mjgrammarParser.Field_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#field_dec}.
	 * @param ctx the parse tree
	 */
	void exitField_dec(mjgrammarParser.Field_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#local_dec}.
	 * @param ctx the parse tree
	 */
	void enterLocal_dec(mjgrammarParser.Local_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#local_dec}.
	 * @param ctx the parse tree
	 */
	void exitLocal_dec(mjgrammarParser.Local_decContext ctx);
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
	 * Enter a parse tree produced by {@link mjgrammarParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(mjgrammarParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(mjgrammarParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(mjgrammarParser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(mjgrammarParser.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(mjgrammarParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(mjgrammarParser.Return_statementContext ctx);
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
	 * Enter a parse tree produced by {@link mjgrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(mjgrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(mjgrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(mjgrammarParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(mjgrammarParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#println_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintln_statement(mjgrammarParser.Println_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#println_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintln_statement(mjgrammarParser.Println_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#var_eval}.
	 * @param ctx the parse tree
	 */
	void enterVar_eval(mjgrammarParser.Var_evalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#var_eval}.
	 * @param ctx the parse tree
	 */
	void exitVar_eval(mjgrammarParser.Var_evalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#array_eval}.
	 * @param ctx the parse tree
	 */
	void enterArray_eval(mjgrammarParser.Array_evalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#array_eval}.
	 * @param ctx the parse tree
	 */
	void exitArray_eval(mjgrammarParser.Array_evalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(mjgrammarParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(mjgrammarParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(mjgrammarParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(mjgrammarParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#while_block}.
	 * @param ctx the parse tree
	 */
	void enterWhile_block(mjgrammarParser.While_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#while_block}.
	 * @param ctx the parse tree
	 */
	void exitWhile_block(mjgrammarParser.While_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#tuple_var_expr}.
	 * @param ctx the parse tree
	 */
	void enterTuple_var_expr(mjgrammarParser.Tuple_var_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#tuple_var_expr}.
	 * @param ctx the parse tree
	 */
	void exitTuple_var_expr(mjgrammarParser.Tuple_var_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new_object_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNew_object_expr(mjgrammarParser.New_object_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new_object_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNew_object_expr(mjgrammarParser.New_object_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses_expr(mjgrammarParser.Parentheses_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses_expr(mjgrammarParser.Parentheses_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId_expr(mjgrammarParser.Id_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId_expr(mjgrammarParser.Id_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code this_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThis_expr(mjgrammarParser.This_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code this_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThis_expr(mjgrammarParser.This_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus_expr(mjgrammarParser.Plus_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus_expr(mjgrammarParser.Plus_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMult_expr(mjgrammarParser.Mult_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMult_expr(mjgrammarParser.Mult_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot_expr(mjgrammarParser.Not_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot_expr(mjgrammarParser.Not_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool_lit_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_lit_expr(mjgrammarParser.Bool_lit_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool_lit_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_lit_expr(mjgrammarParser.Bool_lit_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLt_expr(mjgrammarParser.Lt_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLt_expr(mjgrammarParser.Lt_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(mjgrammarParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(mjgrammarParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_size_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_size_expr(mjgrammarParser.Array_size_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_size_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_size_expr(mjgrammarParser.Array_size_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_instantiation_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_instantiation_expr(mjgrammarParser.Array_instantiation_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_instantiation_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_instantiation_expr(mjgrammarParser.Array_instantiation_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_lit_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt_lit_expr(mjgrammarParser.Int_lit_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_lit_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt_lit_expr(mjgrammarParser.Int_lit_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method_call_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_expr(mjgrammarParser.Method_call_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method_call_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_expr(mjgrammarParser.Method_call_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus_expr(mjgrammarParser.Minus_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus_expr(mjgrammarParser.Minus_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tuple_return_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTuple_return_expr(mjgrammarParser.Tuple_return_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tuple_return_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTuple_return_expr(mjgrammarParser.Tuple_return_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_acces_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_acces_expr(mjgrammarParser.Array_acces_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_acces_expr}
	 * labeled alternative in {@link mjgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_acces_expr(mjgrammarParser.Array_acces_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mjgrammarParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(mjgrammarParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mjgrammarParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(mjgrammarParser.Boolean_literalContext ctx);
}