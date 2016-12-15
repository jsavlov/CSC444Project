/**
 mjgrammar.g4
 */

grammar mjgrammar;


goal
	: main_class_dec ( class_dec )* EOF
	;

main_class_dec
	: 'class' main_class_name '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' main_class_param ')'  statement '}'
	;

main_class_name: ID ;

main_class_param: ID;

class_dec
    : 'class' class_name ( 'extends' superclass_name )? '{' ( field_dec )* ( method_dec )* '}'
    ;

class_name: ID;
superclass_name: ID;

field_dec: var_dec;

local_dec: var_dec;

var_dec
    : type_dec var_name ';'
    ;

var_name : ID ;

method_dec
    : 'public' type_dec method_name '(' ( param_list )? ')' '{' method_body '}'
    ;

param_list: method_param_dec ( ',' method_param_dec )* ;

method_body:
    ( local_dec )* ( statement )* RETURN return_statement ';' ;

return_statement:
    expression | tuple_var_expr;

method_type_dec : type method_name ;

method_name : ID ;

method_param_dec : type_dec method_param_name ;

method_param_name : ID ;

type
    : 'int' '[' ']'
    | 'boolean'
    | 'int'
    | ID
    ;

type_dec
    : tuple_type
    | type
    ;

tuple_type
    : '(' type ',' type (',' type )* ')' ;



statement
    : '{' (statement)* '}'
    | if_statement
    | while_loop
    | println_statement
    | var_eval
    | array_eval
    ;

if_statement: 'if' LP expression RP if_block 'else' else_block ;

while_loop: 'while' LP expression RP while_block ;

println_statement: 'System.out.println' LP expression RP ';' ;

var_eval: ID EQ expression ';' ;

array_eval: ID LSB expression RSB EQ expression ';' ;

if_block: statement ;
else_block: statement ;
while_block: statement ;

tuple_var_expr:
    '(' expression (',' expression)* ',' expression ')' ;

expression:
    expression PLUS expression
    # plus_expr
    | expression TIMES expression
    # mult_expr
    | expression LT expression
    # lt_expr
    | expression MINUS expression
    # minus_expr
    | expression AND expression
    # and_expr
    | expression DOTLENGTH
    # array_size_expr
    | ID
    # id_expr
    | expression '.' ID '(' ( expression ( ',' expression )* )? ')'
    # method_call_expr
    | expression LSB expression RSB
    # array_acces_expr
    | NOT expression
    # not_expr
    | 'new' 'int' LSB expression RSB
    # array_instantiation_expr
    | 'new' ID '(' ')'
    # new_object_expr
    | INT_LIT
    # int_lit_expr
    | boolean_literal
    # bool_lit_expr
    | 'this'
    # this_expr
    | tuple_var_expr
    # tuple_return_expr
    | '(' expression ')'
    # parentheses_expr
    ;

boolean_literal: 'true' | 'false' ;

AND:'&&';
LT:'<';
PLUS:'+';
MINUS:'-';
TIMES:'*';
NOT:'!';
LSB:'[';
RSB:']';
DOTLENGTH:'.length';
LP:'(';
RP:')';
RETURN: 'return';
EQ: '=';

WS
    : ( ' ' | '\t' |'\r' | '\n' ) -> skip
    ;

INT_LIT
	: ('0'..'9')+
	;

ID: [a-zA-Z_]+;




