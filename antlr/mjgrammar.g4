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
    : 'class' class_name ( 'extends' superclass_name )? '{' ( var_dec )* ( method_dec )* '}'
    ;

class_name: ID;
superclass_name: ID;

var_dec
    : type_dec var_name ';'
    ;

var_name : ID ;

method_dec
    : 'public' method_type_dec '(' ( method_param_dec ( ',' method_param_dec )* )? ')' '{' ( var_dec )* ( statement )* 'return' evaluation ';' '}'
    ;

method_type_dec : type_dec method_name ;

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
    : '(' (tuple_type)? ')'
    | type
    ;

tuple_type
    : type_dec ',' type_dec_a
    | type_dec
    |
    ;

type_dec_a
    : tuple_type
    ;

statement
    : '{' ( statement_1 )* '}'
    | statement_1
    ;

statement_1
    : 'if' '(' evaluation ')' statement 'else' statement
    | 'while' '(' evaluation ')' statement
    | 'System.out.println' '(' evaluation ')' ';'
    | ID '=' evaluation ';'
    | ID '[' evaluation ']' '=' evaluation ';'
    ;

evaluation
    : boolean_evaluation
    | evaluation_1
    ;

boolean_evaluation:
    evaluation_1 ('&&' | '<' | '+' | '-' | '*') evaluation_1 ;

evaluation_1
    : evaluation_2 evaluation_1a
    ;

evaluation_1a
    : '[' evaluation ']'
    |
    ;

evaluation_2
    : evaluation_3 evaluation_2a
    ;

evaluation_2a
    : '.' 'length'
    |
    ;

evaluation_3
    : evaluation_4 evaluation_3a
    ;

evaluation_3a
    : '.' ID '(' ( evaluation ( ',' evaluation )* )? ')'
    |
    ;

evaluation_4
    : evaluation_5 evaluation_4a
    ;

evaluation_4a
    : INT_LIT
    |
    ;

evaluation_5
    : evaluation_6 evaluation_5a
    ;

evaluation_5a
    : 'true' | 'false' | ID | 'this'
    |
    ;

evaluation_6
    : evaluation_7 evaluation_6a
    ;

evaluation_6a
    : 'new' 'int' '[' INT_LIT ']'
    |
    ;

evaluation_7
    : evaluation_8 evaluation_7a
    ;

evaluation_7a
    : 'new' ID '(' ')'
    |
    ;

evaluation_8
    : evaluation_9 evaluation_8a
    ;

evaluation_8a
    : '!' evaluation
    |
    ;

evaluation_9
    : '(' evaluation ')'
    |
    ;

WS
    : ( ' ' | '\t' |'\r' | '\n' ) -> skip
    ;

INT_LIT
	: ('0'..'9')+
	;

ID: [a-zA-Z_]+;




