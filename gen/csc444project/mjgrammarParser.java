// Generated from /Users/jason/Documents/CSC444Project/antlr/mjgrammar.g4 by ANTLR 4.5.3
package csc444project;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mjgrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, AND=23, LT=24, PLUS=25, 
		MINUS=26, TIMES=27, NOT=28, LSB=29, RSB=30, DOTLENGTH=31, LP=32, RP=33, 
		RETURN=34, EQ=35, WS=36, INT_LIT=37, ID=38;
	public static final int
		RULE_goal = 0, RULE_main_class_dec = 1, RULE_main_class_name = 2, RULE_main_class_param = 3, 
		RULE_class_dec = 4, RULE_class_name = 5, RULE_superclass_name = 6, RULE_field_dec = 7, 
		RULE_local_dec = 8, RULE_var_dec = 9, RULE_var_name = 10, RULE_method_dec = 11, 
		RULE_param_list = 12, RULE_method_body = 13, RULE_return_statement = 14, 
		RULE_method_type_dec = 15, RULE_method_name = 16, RULE_method_param_dec = 17, 
		RULE_method_param_name = 18, RULE_type = 19, RULE_type_dec = 20, RULE_tuple_type = 21, 
		RULE_statement = 22, RULE_if_statement = 23, RULE_while_loop = 24, RULE_println_statement = 25, 
		RULE_var_eval = 26, RULE_array_eval = 27, RULE_if_block = 28, RULE_else_block = 29, 
		RULE_while_block = 30, RULE_tuple_var_expr = 31, RULE_expression = 32, 
		RULE_boolean_literal = 33;
	public static final String[] ruleNames = {
		"goal", "main_class_dec", "main_class_name", "main_class_param", "class_dec", 
		"class_name", "superclass_name", "field_dec", "local_dec", "var_dec", 
		"var_name", "method_dec", "param_list", "method_body", "return_statement", 
		"method_type_dec", "method_name", "method_param_dec", "method_param_name", 
		"type", "type_dec", "tuple_type", "statement", "if_statement", "while_loop", 
		"println_statement", "var_eval", "array_eval", "if_block", "else_block", 
		"while_block", "tuple_var_expr", "expression", "boolean_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'String'", 
		"'}'", "'extends'", "';'", "','", "'int'", "'boolean'", "'if'", "'else'", 
		"'while'", "'System.out.println'", "'.'", "'new'", "'this'", "'true'", 
		"'false'", "'&&'", "'<'", "'+'", "'-'", "'*'", "'!'", "'['", "']'", "'.length'", 
		"'('", "')'", "'return'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "AND", 
		"LT", "PLUS", "MINUS", "TIMES", "NOT", "LSB", "RSB", "DOTLENGTH", "LP", 
		"RP", "RETURN", "EQ", "WS", "INT_LIT", "ID"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mjgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mjgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public Main_class_decContext main_class_dec() {
			return getRuleContext(Main_class_decContext.class,0);
		}
		public TerminalNode EOF() { return getToken(mjgrammarParser.EOF, 0); }
		public List<Class_decContext> class_dec() {
			return getRuleContexts(Class_decContext.class);
		}
		public Class_decContext class_dec(int i) {
			return getRuleContext(Class_decContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			main_class_dec();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(69);
				class_dec();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_class_decContext extends ParserRuleContext {
		public Main_class_nameContext main_class_name() {
			return getRuleContext(Main_class_nameContext.class,0);
		}
		public Main_class_paramContext main_class_param() {
			return getRuleContext(Main_class_paramContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Main_class_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_class_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMain_class_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMain_class_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMain_class_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_class_decContext main_class_dec() throws RecognitionException {
		Main_class_decContext _localctx = new Main_class_decContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_class_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(78);
			main_class_name();
			setState(79);
			match(T__1);
			setState(80);
			match(T__2);
			setState(81);
			match(T__3);
			setState(82);
			match(T__4);
			setState(83);
			match(T__5);
			setState(84);
			match(LP);
			setState(85);
			match(T__6);
			setState(86);
			match(LSB);
			setState(87);
			match(RSB);
			setState(88);
			main_class_param();
			setState(89);
			match(RP);
			setState(90);
			statement();
			setState(91);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_class_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public Main_class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMain_class_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMain_class_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMain_class_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_class_nameContext main_class_name() throws RecognitionException {
		Main_class_nameContext _localctx = new Main_class_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_class_paramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public Main_class_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_class_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMain_class_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMain_class_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMain_class_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_class_paramContext main_class_param() throws RecognitionException {
		Main_class_paramContext _localctx = new Main_class_paramContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_main_class_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_decContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Superclass_nameContext superclass_name() {
			return getRuleContext(Superclass_nameContext.class,0);
		}
		public List<Field_decContext> field_dec() {
			return getRuleContexts(Field_decContext.class);
		}
		public Field_decContext field_dec(int i) {
			return getRuleContext(Field_decContext.class,i);
		}
		public List<Method_decContext> method_dec() {
			return getRuleContexts(Method_decContext.class);
		}
		public Method_decContext method_dec(int i) {
			return getRuleContext(Method_decContext.class,i);
		}
		public Class_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterClass_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitClass_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitClass_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_decContext class_dec() throws RecognitionException {
		Class_decContext _localctx = new Class_decContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__0);
			setState(98);
			class_name();
			setState(101);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(99);
				match(T__8);
				setState(100);
				superclass_name();
				}
			}

			setState(103);
			match(T__1);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << LP) | (1L << ID))) != 0)) {
				{
				{
				setState(104);
				field_dec();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(110);
				method_dec();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public Superclass_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterSuperclass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitSuperclass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitSuperclass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_nameContext superclass_name() throws RecognitionException {
		Superclass_nameContext _localctx = new Superclass_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_superclass_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_decContext extends ParserRuleContext {
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public Field_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterField_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitField_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitField_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_decContext field_dec() throws RecognitionException {
		Field_decContext _localctx = new Field_decContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			var_dec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_decContext extends ParserRuleContext {
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public Local_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterLocal_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitLocal_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitLocal_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_decContext local_dec() throws RecognitionException {
		Local_decContext _localctx = new Local_decContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_local_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			var_dec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decContext extends ParserRuleContext {
		public Type_decContext type_dec() {
			return getRuleContext(Type_decContext.class,0);
		}
		public Var_nameContext var_name() {
			return getRuleContext(Var_nameContext.class,0);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitVar_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitVar_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			type_dec();
			setState(127);
			var_name();
			setState(128);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public Var_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterVar_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitVar_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitVar_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_nameContext var_name() throws RecognitionException {
		Var_nameContext _localctx = new Var_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_decContext extends ParserRuleContext {
		public Type_decContext type_dec() {
			return getRuleContext(Type_decContext.class,0);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Method_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMethod_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMethod_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMethod_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_decContext method_dec() throws RecognitionException {
		Method_decContext _localctx = new Method_decContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_method_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__2);
			setState(133);
			type_dec();
			setState(134);
			method_name();
			setState(135);
			match(LP);
			setState(137);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << LP) | (1L << ID))) != 0)) {
				{
				setState(136);
				param_list();
				}
			}

			setState(139);
			match(RP);
			setState(140);
			match(T__1);
			setState(141);
			method_body();
			setState(142);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_listContext extends ParserRuleContext {
		public List<Method_param_decContext> method_param_dec() {
			return getRuleContexts(Method_param_decContext.class);
		}
		public Method_param_decContext method_param_dec(int i) {
			return getRuleContext(Method_param_decContext.class,i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			method_param_dec();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(145);
				match(T__10);
				setState(146);
				method_param_dec();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_bodyContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(mjgrammarParser.RETURN, 0); }
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public List<Local_decContext> local_dec() {
			return getRuleContexts(Local_decContext.class);
		}
		public Local_decContext local_dec(int i) {
			return getRuleContext(Local_decContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMethod_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMethod_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					local_dec();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				{
				setState(158);
				statement();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(RETURN);
			setState(165);
			return_statement();
			setState(166);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tuple_var_exprContext tuple_var_expr() {
			return getRuleContext(Tuple_var_exprContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_statement);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				tuple_var_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_type_decContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Method_type_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_type_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMethod_type_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMethod_type_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMethod_type_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_type_decContext method_type_dec() throws RecognitionException {
		Method_type_decContext _localctx = new Method_type_decContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_method_type_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			type();
			setState(173);
			method_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMethod_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_param_decContext extends ParserRuleContext {
		public Type_decContext type_dec() {
			return getRuleContext(Type_decContext.class,0);
		}
		public Method_param_nameContext method_param_name() {
			return getRuleContext(Method_param_nameContext.class,0);
		}
		public Method_param_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_param_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMethod_param_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMethod_param_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMethod_param_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_param_decContext method_param_dec() throws RecognitionException {
		Method_param_decContext _localctx = new Method_param_decContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_method_param_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			type_dec();
			setState(178);
			method_param_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_param_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public Method_param_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_param_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMethod_param_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMethod_param_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMethod_param_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_param_nameContext method_param_name() throws RecognitionException {
		Method_param_nameContext _localctx = new Method_param_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method_param_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__11);
				setState(183);
				match(LSB);
				setState(184);
				match(RSB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(T__11);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_decContext extends ParserRuleContext {
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterType_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitType_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitType_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_decContext type_dec() throws RecognitionException {
		Type_decContext _localctx = new Type_decContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type_dec);
		try {
			setState(192);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				tuple_type();
				}
				break;
			case T__11:
			case T__12:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_typeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitTuple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LP);
			setState(195);
			type();
			setState(196);
			match(T__10);
			setState(197);
			type();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(198);
				match(T__10);
				setState(199);
				type();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Println_statementContext println_statement() {
			return getRuleContext(Println_statementContext.class,0);
		}
		public Var_evalContext var_eval() {
			return getRuleContext(Var_evalContext.class,0);
		}
		public Array_evalContext array_eval() {
			return getRuleContext(Array_evalContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T__1);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
					{
					{
					setState(208);
					statement();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				println_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				var_eval();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				array_eval();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(mjgrammarParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(mjgrammarParser.RP, 0); }
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__13);
			setState(223);
			match(LP);
			setState(224);
			expression(0);
			setState(225);
			match(RP);
			setState(226);
			if_block();
			setState(227);
			match(T__14);
			setState(228);
			else_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(mjgrammarParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(mjgrammarParser.RP, 0); }
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__15);
			setState(231);
			match(LP);
			setState(232);
			expression(0);
			setState(233);
			match(RP);
			setState(234);
			while_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Println_statementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(mjgrammarParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(mjgrammarParser.RP, 0); }
		public Println_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterPrintln_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitPrintln_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitPrintln_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Println_statementContext println_statement() throws RecognitionException {
		Println_statementContext _localctx = new Println_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_println_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__16);
			setState(237);
			match(LP);
			setState(238);
			expression(0);
			setState(239);
			match(RP);
			setState(240);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_evalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public TerminalNode EQ() { return getToken(mjgrammarParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_evalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterVar_eval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitVar_eval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitVar_eval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_evalContext var_eval() throws RecognitionException {
		Var_evalContext _localctx = new Var_evalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_var_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(ID);
			setState(243);
			match(EQ);
			setState(244);
			expression(0);
			setState(245);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_evalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public TerminalNode LSB() { return getToken(mjgrammarParser.LSB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSB() { return getToken(mjgrammarParser.RSB, 0); }
		public TerminalNode EQ() { return getToken(mjgrammarParser.EQ, 0); }
		public Array_evalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterArray_eval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitArray_eval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitArray_eval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_evalContext array_eval() throws RecognitionException {
		Array_evalContext _localctx = new Array_evalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ID);
			setState(248);
			match(LSB);
			setState(249);
			expression(0);
			setState(250);
			match(RSB);
			setState(251);
			match(EQ);
			setState(252);
			expression(0);
			setState(253);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitIf_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterWhile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitWhile_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitWhile_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_var_exprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Tuple_var_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_var_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterTuple_var_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitTuple_var_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitTuple_var_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_var_exprContext tuple_var_expr() throws RecognitionException {
		Tuple_var_exprContext _localctx = new Tuple_var_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tuple_var_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(LP);
			setState(262);
			expression(0);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(263);
					match(T__10);
					setState(264);
					expression(0);
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(270);
			match(T__10);
			setState(271);
			expression(0);
			setState(272);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class New_object_exprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public New_object_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterNew_object_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitNew_object_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitNew_object_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Parentheses_exprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parentheses_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterParentheses_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitParentheses_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitParentheses_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Id_exprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public Id_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterId_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitId_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitId_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class This_exprContext extends ExpressionContext {
		public This_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterThis_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitThis_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitThis_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Plus_exprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(mjgrammarParser.PLUS, 0); }
		public Plus_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterPlus_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitPlus_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitPlus_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mult_exprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(mjgrammarParser.TIMES, 0); }
		public Mult_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMult_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMult_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMult_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Not_exprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(mjgrammarParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Not_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterNot_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitNot_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitNot_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_lit_exprContext extends ExpressionContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Bool_lit_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterBool_lit_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitBool_lit_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitBool_lit_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Lt_exprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(mjgrammarParser.LT, 0); }
		public Lt_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterLt_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitLt_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitLt_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class And_exprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(mjgrammarParser.AND, 0); }
		public And_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitAnd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array_size_exprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOTLENGTH() { return getToken(mjgrammarParser.DOTLENGTH, 0); }
		public Array_size_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterArray_size_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitArray_size_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitArray_size_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array_instantiation_exprContext extends ExpressionContext {
		public TerminalNode LSB() { return getToken(mjgrammarParser.LSB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSB() { return getToken(mjgrammarParser.RSB, 0); }
		public Array_instantiation_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterArray_instantiation_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitArray_instantiation_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitArray_instantiation_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int_lit_exprContext extends ExpressionContext {
		public TerminalNode INT_LIT() { return getToken(mjgrammarParser.INT_LIT, 0); }
		public Int_lit_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterInt_lit_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitInt_lit_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitInt_lit_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Method_call_exprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(mjgrammarParser.ID, 0); }
		public Method_call_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMethod_call_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMethod_call_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMethod_call_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Minus_exprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(mjgrammarParser.MINUS, 0); }
		public Minus_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterMinus_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitMinus_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitMinus_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tuple_return_exprContext extends ExpressionContext {
		public Tuple_var_exprContext tuple_var_expr() {
			return getRuleContext(Tuple_var_exprContext.class,0);
		}
		public Tuple_return_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterTuple_return_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitTuple_return_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitTuple_return_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array_acces_exprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LSB() { return getToken(mjgrammarParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(mjgrammarParser.RSB, 0); }
		public Array_acces_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterArray_acces_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitArray_acces_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitArray_acces_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new Id_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(275);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new Not_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				match(NOT);
				setState(277);
				expression(8);
				}
				break;
			case 3:
				{
				_localctx = new Array_instantiation_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				match(T__18);
				setState(279);
				match(T__11);
				setState(280);
				match(LSB);
				setState(281);
				expression(0);
				setState(282);
				match(RSB);
				}
				break;
			case 4:
				{
				_localctx = new New_object_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(T__18);
				setState(285);
				match(ID);
				setState(286);
				match(LP);
				setState(287);
				match(RP);
				}
				break;
			case 5:
				{
				_localctx = new Int_lit_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(INT_LIT);
				}
				break;
			case 6:
				{
				_localctx = new Bool_lit_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				boolean_literal();
				}
				break;
			case 7:
				{
				_localctx = new This_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(T__19);
				}
				break;
			case 8:
				{
				_localctx = new Tuple_return_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				tuple_var_expr();
				}
				break;
			case 9:
				{
				_localctx = new Parentheses_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				match(LP);
				setState(293);
				expression(0);
				setState(294);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(335);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new Plus_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(299);
						match(PLUS);
						setState(300);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new Mult_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(302);
						match(TIMES);
						setState(303);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new Lt_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(305);
						match(LT);
						setState(306);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new Minus_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(308);
						match(MINUS);
						setState(309);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new And_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(311);
						match(AND);
						setState(312);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new Array_size_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(314);
						match(DOTLENGTH);
						}
						break;
					case 7:
						{
						_localctx = new Method_call_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(316);
						match(T__17);
						setState(317);
						match(ID);
						setState(318);
						match(LP);
						setState(327);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << NOT) | (1L << LP) | (1L << INT_LIT) | (1L << ID))) != 0)) {
							{
							setState(319);
							expression(0);
							setState(324);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__10) {
								{
								{
								setState(320);
								match(T__10);
								setState(321);
								expression(0);
								}
								}
								setState(326);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(329);
						match(RP);
						}
						break;
					case 8:
						{
						_localctx = new Array_acces_exprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(330);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(331);
						match(LSB);
						setState(332);
						expression(0);
						setState(333);
						match(RSB);
						}
						break;
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mjgrammarListener ) ((mjgrammarListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mjgrammarVisitor ) return ((mjgrammarVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0159\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\5\6h\n\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\7\6r\n\6\f"+
		"\6\16\6u\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\7\16\u0096\n\16\f\16\16\16\u0099\13\16\3\17\7\17\u009c\n\17"+
		"\f\17\16\17\u009f\13\17\3\17\7\17\u00a2\n\17\f\17\16\17\u00a5\13\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\5\20\u00ad\n\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00bf\n\25"+
		"\3\26\3\26\5\26\u00c3\n\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00cb\n"+
		"\27\f\27\16\27\u00ce\13\27\3\27\3\27\3\30\3\30\7\30\u00d4\n\30\f\30\16"+
		"\30\u00d7\13\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00df\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\7!\u010c\n!\f!\16"+
		"!\u010f\13!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u012b\n\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\7\"\u0145\n\"\f\"\16\"\u0148\13\"\5\"\u014a\n\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\7\"\u0152\n\"\f\"\16\"\u0155\13\"\3#\3#\3#\2\3B$\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\3\2"+
		"\27\30\u015d\2F\3\2\2\2\4O\3\2\2\2\6_\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\f"+
		"x\3\2\2\2\16z\3\2\2\2\20|\3\2\2\2\22~\3\2\2\2\24\u0080\3\2\2\2\26\u0084"+
		"\3\2\2\2\30\u0086\3\2\2\2\32\u0092\3\2\2\2\34\u009d\3\2\2\2\36\u00ac\3"+
		"\2\2\2 \u00ae\3\2\2\2\"\u00b1\3\2\2\2$\u00b3\3\2\2\2&\u00b6\3\2\2\2(\u00be"+
		"\3\2\2\2*\u00c2\3\2\2\2,\u00c4\3\2\2\2.\u00de\3\2\2\2\60\u00e0\3\2\2\2"+
		"\62\u00e8\3\2\2\2\64\u00ee\3\2\2\2\66\u00f4\3\2\2\28\u00f9\3\2\2\2:\u0101"+
		"\3\2\2\2<\u0103\3\2\2\2>\u0105\3\2\2\2@\u0107\3\2\2\2B\u012a\3\2\2\2D"+
		"\u0156\3\2\2\2FJ\5\4\3\2GI\5\n\6\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2"+
		"\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\2\2\3N\3\3\2\2\2OP\7\3\2\2PQ\5\6\4\2QR\7"+
		"\4\2\2RS\7\5\2\2ST\7\6\2\2TU\7\7\2\2UV\7\b\2\2VW\7\"\2\2WX\7\t\2\2XY\7"+
		"\37\2\2YZ\7 \2\2Z[\5\b\5\2[\\\7#\2\2\\]\5.\30\2]^\7\n\2\2^\5\3\2\2\2_"+
		"`\7(\2\2`\7\3\2\2\2ab\7(\2\2b\t\3\2\2\2cd\7\3\2\2dg\5\f\7\2ef\7\13\2\2"+
		"fh\5\16\b\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2im\7\4\2\2jl\5\20\t\2kj\3\2\2"+
		"\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2ns\3\2\2\2om\3\2\2\2pr\5\30\r\2qp\3\2"+
		"\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\n\2\2w\13\3"+
		"\2\2\2xy\7(\2\2y\r\3\2\2\2z{\7(\2\2{\17\3\2\2\2|}\5\24\13\2}\21\3\2\2"+
		"\2~\177\5\24\13\2\177\23\3\2\2\2\u0080\u0081\5*\26\2\u0081\u0082\5\26"+
		"\f\2\u0082\u0083\7\f\2\2\u0083\25\3\2\2\2\u0084\u0085\7(\2\2\u0085\27"+
		"\3\2\2\2\u0086\u0087\7\5\2\2\u0087\u0088\5*\26\2\u0088\u0089\5\"\22\2"+
		"\u0089\u008b\7\"\2\2\u008a\u008c\5\32\16\2\u008b\u008a\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7#\2\2\u008e\u008f\7\4\2\2\u008f"+
		"\u0090\5\34\17\2\u0090\u0091\7\n\2\2\u0091\31\3\2\2\2\u0092\u0097\5$\23"+
		"\2\u0093\u0094\7\r\2\2\u0094\u0096\5$\23\2\u0095\u0093\3\2\2\2\u0096\u0099"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\33\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009c\5\22\n\2\u009b\u009a\3\2\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a3\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a2\5.\30\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7\u00a8\5\36\20\2\u00a8\u00a9\7"+
		"\f\2\2\u00a9\35\3\2\2\2\u00aa\u00ad\5B\"\2\u00ab\u00ad\5@!\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\37\3\2\2\2\u00ae\u00af\5(\25\2\u00af"+
		"\u00b0\5\"\22\2\u00b0!\3\2\2\2\u00b1\u00b2\7(\2\2\u00b2#\3\2\2\2\u00b3"+
		"\u00b4\5*\26\2\u00b4\u00b5\5&\24\2\u00b5%\3\2\2\2\u00b6\u00b7\7(\2\2\u00b7"+
		"\'\3\2\2\2\u00b8\u00b9\7\16\2\2\u00b9\u00ba\7\37\2\2\u00ba\u00bf\7 \2"+
		"\2\u00bb\u00bf\7\17\2\2\u00bc\u00bf\7\16\2\2\u00bd\u00bf\7(\2\2\u00be"+
		"\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2"+
		"\2\2\u00bf)\3\2\2\2\u00c0\u00c3\5,\27\2\u00c1\u00c3\5(\25\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3+\3\2\2\2\u00c4\u00c5\7\"\2\2\u00c5"+
		"\u00c6\5(\25\2\u00c6\u00c7\7\r\2\2\u00c7\u00cc\5(\25\2\u00c8\u00c9\7\r"+
		"\2\2\u00c9\u00cb\5(\25\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\7#\2\2\u00d0-\3\2\2\2\u00d1\u00d5\7\4\2\2\u00d2\u00d4"+
		"\5.\30\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00df\7\n"+
		"\2\2\u00d9\u00df\5\60\31\2\u00da\u00df\5\62\32\2\u00db\u00df\5\64\33\2"+
		"\u00dc\u00df\5\66\34\2\u00dd\u00df\58\35\2\u00de\u00d1\3\2\2\2\u00de\u00d9"+
		"\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df/\3\2\2\2\u00e0\u00e1\7\20\2\2\u00e1\u00e2\7\"\2\2"+
		"\u00e2\u00e3\5B\"\2\u00e3\u00e4\7#\2\2\u00e4\u00e5\5:\36\2\u00e5\u00e6"+
		"\7\21\2\2\u00e6\u00e7\5<\37\2\u00e7\61\3\2\2\2\u00e8\u00e9\7\22\2\2\u00e9"+
		"\u00ea\7\"\2\2\u00ea\u00eb\5B\"\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\5> \2"+
		"\u00ed\63\3\2\2\2\u00ee\u00ef\7\23\2\2\u00ef\u00f0\7\"\2\2\u00f0\u00f1"+
		"\5B\"\2\u00f1\u00f2\7#\2\2\u00f2\u00f3\7\f\2\2\u00f3\65\3\2\2\2\u00f4"+
		"\u00f5\7(\2\2\u00f5\u00f6\7%\2\2\u00f6\u00f7\5B\"\2\u00f7\u00f8\7\f\2"+
		"\2\u00f8\67\3\2\2\2\u00f9\u00fa\7(\2\2\u00fa\u00fb\7\37\2\2\u00fb\u00fc"+
		"\5B\"\2\u00fc\u00fd\7 \2\2\u00fd\u00fe\7%\2\2\u00fe\u00ff\5B\"\2\u00ff"+
		"\u0100\7\f\2\2\u01009\3\2\2\2\u0101\u0102\5.\30\2\u0102;\3\2\2\2\u0103"+
		"\u0104\5.\30\2\u0104=\3\2\2\2\u0105\u0106\5.\30\2\u0106?\3\2\2\2\u0107"+
		"\u0108\7\"\2\2\u0108\u010d\5B\"\2\u0109\u010a\7\r\2\2\u010a\u010c\5B\""+
		"\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\7\r\2\2\u0111"+
		"\u0112\5B\"\2\u0112\u0113\7#\2\2\u0113A\3\2\2\2\u0114\u0115\b\"\1\2\u0115"+
		"\u012b\7(\2\2\u0116\u0117\7\36\2\2\u0117\u012b\5B\"\n\u0118\u0119\7\25"+
		"\2\2\u0119\u011a\7\16\2\2\u011a\u011b\7\37\2\2\u011b\u011c\5B\"\2\u011c"+
		"\u011d\7 \2\2\u011d\u012b\3\2\2\2\u011e\u011f\7\25\2\2\u011f\u0120\7("+
		"\2\2\u0120\u0121\7\"\2\2\u0121\u012b\7#\2\2\u0122\u012b\7\'\2\2\u0123"+
		"\u012b\5D#\2\u0124\u012b\7\26\2\2\u0125\u012b\5@!\2\u0126\u0127\7\"\2"+
		"\2\u0127\u0128\5B\"\2\u0128\u0129\7#\2\2\u0129\u012b\3\2\2\2\u012a\u0114"+
		"\3\2\2\2\u012a\u0116\3\2\2\2\u012a\u0118\3\2\2\2\u012a\u011e\3\2\2\2\u012a"+
		"\u0122\3\2\2\2\u012a\u0123\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0125\3\2"+
		"\2\2\u012a\u0126\3\2\2\2\u012b\u0153\3\2\2\2\u012c\u012d\f\23\2\2\u012d"+
		"\u012e\7\33\2\2\u012e\u0152\5B\"\24\u012f\u0130\f\22\2\2\u0130\u0131\7"+
		"\35\2\2\u0131\u0152\5B\"\23\u0132\u0133\f\21\2\2\u0133\u0134\7\32\2\2"+
		"\u0134\u0152\5B\"\22\u0135\u0136\f\20\2\2\u0136\u0137\7\34\2\2\u0137\u0152"+
		"\5B\"\21\u0138\u0139\f\17\2\2\u0139\u013a\7\31\2\2\u013a\u0152\5B\"\20"+
		"\u013b\u013c\f\16\2\2\u013c\u0152\7!\2\2\u013d\u013e\f\f\2\2\u013e\u013f"+
		"\7\24\2\2\u013f\u0140\7(\2\2\u0140\u0149\7\"\2\2\u0141\u0146\5B\"\2\u0142"+
		"\u0143\7\r\2\2\u0143\u0145\5B\"\2\u0144\u0142\3\2\2\2\u0145\u0148\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u0141\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u0152\7#\2\2\u014c\u014d\f\13\2\2\u014d\u014e\7\37\2\2\u014e"+
		"\u014f\5B\"\2\u014f\u0150\7 \2\2\u0150\u0152\3\2\2\2\u0151\u012c\3\2\2"+
		"\2\u0151\u012f\3\2\2\2\u0151\u0132\3\2\2\2\u0151\u0135\3\2\2\2\u0151\u0138"+
		"\3\2\2\2\u0151\u013b\3\2\2\2\u0151\u013d\3\2\2\2\u0151\u014c\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154C\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0156\u0157\t\2\2\2\u0157E\3\2\2\2\26Jgms\u008b\u0097"+
		"\u009d\u00a3\u00ac\u00be\u00c2\u00cc\u00d5\u00de\u010d\u012a\u0146\u0149"+
		"\u0151\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}