// Generated from c:\Users\u005Cusuario\Desktop\ProyectoLenguajes\grammar\Ruby.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RubyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITERAL=1, COMMA=2, SEMICOLON=3, CRLF=4, REQUIRE=5, END=6, DEF=7, RETURN=8, 
		PIR=9, IF=10, ELSE=11, ELSIF=12, UNLESS=13, WHILE=14, UNTIL=15, RETRY=16, 
		BREAK=17, FOR=18, TRUE=19, FALSE=20, PLUS=21, MINUS=22, MUL=23, DIV=24, 
		MOD=25, EXP=26, DOT=27, EQUAL=28, NOT_EQUAL=29, GREATER=30, LESS=31, LESS_EQUAL=32, 
		GREATER_EQUAL=33, ASSIGN=34, PLUS_ASSIGN=35, MINUS_ASSIGN=36, MUL_ASSIGN=37, 
		DIV_ASSIGN=38, MOD_ASSIGN=39, EXP_ASSIGN=40, BIT_AND=41, BIT_OR=42, BIT_XOR=43, 
		BIT_NOT=44, BIT_SHL=45, BIT_SHR=46, AND=47, OR=48, NOT=49, LEFT_RBRACKET=50, 
		RIGHT_RBRACKET=51, LEFT_SBRACKET=52, RIGHT_SBRACKET=53, NIL=54, SL_COMMENT=55, 
		ML_COMMENT=56, WS=57, INT=58, FLOAT=59, ID=60, ID_GLOBAL=61, ID_FUNCTION=62;
	public static final int
		RULE_prog = 0, RULE_expression_list = 1, RULE_expression = 2, RULE_function_chain = 3, 
		RULE_global_get = 4, RULE_global_set = 5, RULE_global_result = 6, RULE_function_inline_call = 7, 
		RULE_require_block = 8, RULE_pir_inline = 9, RULE_pir_expression_list = 10, 
		RULE_function_definition = 11, RULE_function_definition_body = 12, RULE_function_expression_list = 13, 
		RULE_function_expression = 14, RULE_function_definition_header = 15, RULE_function_name = 16, 
		RULE_function_definition_params = 17, RULE_function_definition_params_list = 18, 
		RULE_function_definition_param_id = 19, RULE_return_statement = 20, RULE_function_call = 21, 
		RULE_function_call_param_list = 22, RULE_function_call_params = 23, RULE_function_param = 24, 
		RULE_function_unnamed_param = 25, RULE_function_named_param = 26, RULE_function_call_assignment = 27, 
		RULE_all_result = 28, RULE_elsif_statement = 29, RULE_if_elsif_statement = 30, 
		RULE_if_statement = 31, RULE_unless_statement = 32, RULE_while_statement = 33, 
		RULE_for_statement = 34, RULE_function_elsif_statement = 35, RULE_function_if_elsif_statement = 36, 
		RULE_function_if_statement = 37, RULE_function_unless_statement = 38, 
		RULE_function_while_statement = 39, RULE_function_for_statement = 40, 
		RULE_init_expression = 41, RULE_all_assignment = 42, RULE_for_init_list = 43, 
		RULE_cond_expression = 44, RULE_loop_expression = 45, RULE_for_loop_list = 46, 
		RULE_statement_body = 47, RULE_statement_expression_list = 48, RULE_statement_expression = 49, 
		RULE_function_statement_body = 50, RULE_function_statement_expression_list = 51, 
		RULE_function_statement_expression = 52, RULE_assignment = 53, RULE_dynamic_assignment = 54, 
		RULE_int_assignment = 55, RULE_float_assignment = 56, RULE_string_assignment = 57, 
		RULE_initial_array_assignment = 58, RULE_array_assignment = 59, RULE_array_definition = 60, 
		RULE_array_definition_elements = 61, RULE_array_selector = 62, RULE_dynamic_result = 63, 
		RULE_dynamic = 64, RULE_int_result = 65, RULE_float_result = 66, RULE_string_result = 67, 
		RULE_comparison_list = 68, RULE_comparison = 69, RULE_comp_var = 70, RULE_lvalue = 71, 
		RULE_rvalue = 72, RULE_break_expression = 73, RULE_literal_t = 74, RULE_float_t = 75, 
		RULE_int_t = 76, RULE_bool_t = 77, RULE_nil_t = 78, RULE_id = 79, RULE_id_global = 80, 
		RULE_id_function = 81, RULE_terminator = 82, RULE_else_token = 83, RULE_crlf = 84;
	public static final String[] ruleNames = {
		"prog", "expression_list", "expression", "function_chain", "global_get", 
		"global_set", "global_result", "function_inline_call", "require_block", 
		"pir_inline", "pir_expression_list", "function_definition", "function_definition_body", 
		"function_expression_list", "function_expression", "function_definition_header", 
		"function_name", "function_definition_params", "function_definition_params_list", 
		"function_definition_param_id", "return_statement", "function_call", "function_call_param_list", 
		"function_call_params", "function_param", "function_unnamed_param", "function_named_param", 
		"function_call_assignment", "all_result", "elsif_statement", "if_elsif_statement", 
		"if_statement", "unless_statement", "while_statement", "for_statement", 
		"function_elsif_statement", "function_if_elsif_statement", "function_if_statement", 
		"function_unless_statement", "function_while_statement", "function_for_statement", 
		"init_expression", "all_assignment", "for_init_list", "cond_expression", 
		"loop_expression", "for_loop_list", "statement_body", "statement_expression_list", 
		"statement_expression", "function_statement_body", "function_statement_expression_list", 
		"function_statement_expression", "assignment", "dynamic_assignment", "int_assignment", 
		"float_assignment", "string_assignment", "initial_array_assignment", "array_assignment", 
		"array_definition", "array_definition_elements", "array_selector", "dynamic_result", 
		"dynamic", "int_result", "float_result", "string_result", "comparison_list", 
		"comparison", "comp_var", "lvalue", "rvalue", "break_expression", "literal_t", 
		"float_t", "int_t", "bool_t", "nil_t", "id", "id_global", "id_function", 
		"terminator", "else_token", "crlf"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", "';'", null, "'require'", "'end'", "'def'", "'return'", 
		"'pir'", "'if'", "'else'", "'elsif'", "'unless'", "'while'", "'until'", 
		"'retry'", "'break'", "'for'", "'true'", "'false'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'**'", "'.'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", 
		"'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'**='", "'&'", "'|'", 
		"'^'", "'~'", "'<<'", "'>>'", null, null, null, "'('", "')'", "'['", "']'", 
		"'nil'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", "DEF", 
		"RETURN", "PIR", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "UNTIL", "RETRY", 
		"BREAK", "FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
		"EXP", "DOT", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
		"ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "BIT_SHL", "BIT_SHR", 
		"AND", "OR", "NOT", "LEFT_RBRACKET", "RIGHT_RBRACKET", "LEFT_SBRACKET", 
		"RIGHT_SBRACKET", "NIL", "SL_COMMENT", "ML_COMMENT", "WS", "INT", "FLOAT", 
		"ID", "ID_GLOBAL", "ID_FUNCTION"
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
	public String getGrammarFileName() { return "Ruby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RubyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			expression_list(0);
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

	public static class Expression_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case DEF:
			case PIR:
			case IF:
			case UNLESS:
			case WHILE:
			case UNTIL:
			case FOR:
			case TRUE:
			case FALSE:
			case DOT:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				{
				setState(173);
				expression();
				setState(174);
				terminator(0);
				}
				break;
			case EOF:
			case SEMICOLON:
			case CRLF:
				{
				setState(176);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(179);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(180);
					expression();
					setState(181);
					terminator(0);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public Require_blockContext require_block() {
			return getRuleContext(Require_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Unless_statementContext unless_statement() {
			return getRuleContext(Unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Pir_inlineContext pir_inline() {
			return getRuleContext(Pir_inlineContext.class,0);
		}
		public Function_chainContext function_chain() {
			return getRuleContext(Function_chainContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				function_inline_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				require_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				unless_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				rvalue(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
				for_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(196);
				pir_inline();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(197);
				function_chain();
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

	public static class Function_chainContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public List<Function_chainContext> function_chain() {
			return getRuleContexts(Function_chainContext.class);
		}
		public Function_chainContext function_chain(int i) {
			return getRuleContext(Function_chainContext.class,i);
		}
		public TerminalNode DOT() { return getToken(RubyParser.DOT, 0); }
		public Function_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_chain; }
	}

	public final Function_chainContext function_chain() throws RecognitionException {
		Function_chainContext _localctx = new Function_chainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_chain);
		try {
			int _alt;
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(200);
					id();
					}
					break;
				case 2:
					{
					setState(201);
					function_inline_call();
					}
					break;
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(204);
						function_chain();
						}
						} 
					}
					setState(209);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(DOT);
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(211);
					id();
					}
					break;
				case 2:
					{
					setState(212);
					function_inline_call();
					}
					break;
				}
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

	public static class Global_getContext extends ParserRuleContext {
		public LvalueContext var_name;
		public Token op;
		public Id_globalContext global_name;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_get; }
	}

	public final Global_getContext global_get() throws RecognitionException {
		Global_getContext _localctx = new Global_getContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((Global_getContext)_localctx).var_name = lvalue();
			setState(218);
			((Global_getContext)_localctx).op = match(ASSIGN);
			setState(219);
			((Global_getContext)_localctx).global_name = id_global();
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

	public static class Global_setContext extends ParserRuleContext {
		public Id_globalContext global_name;
		public Token op;
		public All_resultContext result;
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Global_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_set; }
	}

	public final Global_setContext global_set() throws RecognitionException {
		Global_setContext _localctx = new Global_setContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_global_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			((Global_setContext)_localctx).global_name = id_global();
			setState(222);
			((Global_setContext)_localctx).op = match(ASSIGN);
			setState(223);
			((Global_setContext)_localctx).result = all_result();
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

	public static class Global_resultContext extends ParserRuleContext {
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Global_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_result; }
	}

	public final Global_resultContext global_result() throws RecognitionException {
		Global_resultContext _localctx = new Global_resultContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_global_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			id_global();
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

	public static class Function_inline_callContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_inline_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_inline_call; }
	}

	public final Function_inline_callContext function_inline_call() throws RecognitionException {
		Function_inline_callContext _localctx = new Function_inline_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_inline_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			function_call();
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

	public static class Require_blockContext extends ParserRuleContext {
		public TerminalNode REQUIRE() { return getToken(RubyParser.REQUIRE, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Require_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_require_block; }
	}

	public final Require_blockContext require_block() throws RecognitionException {
		Require_blockContext _localctx = new Require_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_require_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(REQUIRE);
			setState(230);
			literal_t();
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

	public static class Pir_inlineContext extends ParserRuleContext {
		public TerminalNode PIR() { return getToken(RubyParser.PIR, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Pir_expression_listContext pir_expression_list() {
			return getRuleContext(Pir_expression_listContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Pir_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_inline; }
	}

	public final Pir_inlineContext pir_inline() throws RecognitionException {
		Pir_inlineContext _localctx = new Pir_inlineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pir_inline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(PIR);
			setState(233);
			crlf();
			setState(234);
			pir_expression_list();
			setState(235);
			match(END);
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

	public static class Pir_expression_listContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Pir_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pir_expression_list; }
	}

	public final Pir_expression_listContext pir_expression_list() throws RecognitionException {
		Pir_expression_listContext _localctx = new Pir_expression_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pir_expression_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			expression_list(0);
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definition_headerContext function_definition_header() {
			return getRuleContext(Function_definition_headerContext.class,0);
		}
		public Function_definition_bodyContext function_definition_body() {
			return getRuleContext(Function_definition_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			function_definition_header();
			setState(240);
			function_definition_body();
			setState(241);
			match(END);
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

	public static class Function_definition_bodyContext extends ParserRuleContext {
		public Function_expression_listContext function_expression_list() {
			return getRuleContext(Function_expression_listContext.class,0);
		}
		public Function_definition_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_body; }
	}

	public final Function_definition_bodyContext function_definition_body() throws RecognitionException {
		Function_definition_bodyContext _localctx = new Function_definition_bodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_definition_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			function_expression_list(0);
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

	public static class Function_expression_listContext extends ParserRuleContext {
		public Function_expressionContext function_expression() {
			return getRuleContext(Function_expressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public Function_expression_listContext function_expression_list() {
			return getRuleContext(Function_expression_listContext.class,0);
		}
		public Function_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_expression_list; }
	}

	public final Function_expression_listContext function_expression_list() throws RecognitionException {
		return function_expression_list(0);
	}

	private Function_expression_listContext function_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_expression_listContext _localctx = new Function_expression_listContext(_ctx, _parentState);
		Function_expression_listContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_function_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case REQUIRE:
			case RETURN:
			case PIR:
			case IF:
			case UNLESS:
			case WHILE:
			case UNTIL:
			case FOR:
			case TRUE:
			case FALSE:
			case DOT:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				{
				setState(246);
				function_expression();
				setState(247);
				terminator(0);
				}
				break;
			case EOF:
			case SEMICOLON:
			case CRLF:
				{
				setState(249);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_expression_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_expression_list);
					setState(252);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(253);
					function_expression();
					setState(254);
					terminator(0);
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Function_expressionContext extends ParserRuleContext {
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public Require_blockContext require_block() {
			return getRuleContext(Require_blockContext.class,0);
		}
		public Function_if_statementContext function_if_statement() {
			return getRuleContext(Function_if_statementContext.class,0);
		}
		public Function_unless_statementContext function_unless_statement() {
			return getRuleContext(Function_unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Function_while_statementContext function_while_statement() {
			return getRuleContext(Function_while_statementContext.class,0);
		}
		public Function_for_statementContext function_for_statement() {
			return getRuleContext(Function_for_statementContext.class,0);
		}
		public Pir_inlineContext pir_inline() {
			return getRuleContext(Pir_inlineContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Function_chainContext function_chain() {
			return getRuleContext(Function_chainContext.class,0);
		}
		public Function_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_expression; }
	}

	public final Function_expressionContext function_expression() throws RecognitionException {
		Function_expressionContext _localctx = new Function_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_expression);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				function_inline_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				require_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				function_if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				function_unless_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				rvalue(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				function_while_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(267);
				function_for_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
				pir_inline();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(269);
				return_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(270);
				function_chain();
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

	public static class Function_definition_headerContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(RubyParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_definition_paramsContext function_definition_params() {
			return getRuleContext(Function_definition_paramsContext.class,0);
		}
		public Function_definition_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_header; }
	}

	public final Function_definition_headerContext function_definition_header() throws RecognitionException {
		Function_definition_headerContext _localctx = new Function_definition_headerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_definition_header);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(DEF);
				setState(274);
				function_name();
				setState(275);
				crlf();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(DEF);
				setState(278);
				function_name();
				setState(279);
				function_definition_params();
				setState(280);
				crlf();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Id_functionContext id_function() {
			return getRuleContext(Id_functionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_name);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				id_function();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				id();
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

	public static class Function_definition_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public Function_definition_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params; }
	}

	public final Function_definition_paramsContext function_definition_params() throws RecognitionException {
		Function_definition_paramsContext _localctx = new Function_definition_paramsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_definition_params);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(LEFT_RBRACKET);
				setState(289);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(LEFT_RBRACKET);
				setState(291);
				function_definition_params_list(0);
				setState(292);
				match(RIGHT_RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				function_definition_params_list(0);
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

	public static class Function_definition_params_listContext extends ParserRuleContext {
		public Function_definition_param_idContext function_definition_param_id() {
			return getRuleContext(Function_definition_param_idContext.class,0);
		}
		public Function_definition_params_listContext function_definition_params_list() {
			return getRuleContext(Function_definition_params_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyParser.COMMA, 0); }
		public Function_definition_params_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_params_list; }
	}

	public final Function_definition_params_listContext function_definition_params_list() throws RecognitionException {
		return function_definition_params_list(0);
	}

	private Function_definition_params_listContext function_definition_params_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_definition_params_listContext _localctx = new Function_definition_params_listContext(_ctx, _parentState);
		Function_definition_params_listContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_function_definition_params_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(298);
			function_definition_param_id();
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_definition_params_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_definition_params_list);
					setState(300);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(301);
					match(COMMA);
					setState(302);
					function_definition_param_id();
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Function_definition_param_idContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_definition_param_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition_param_id; }
	}

	public final Function_definition_param_idContext function_definition_param_id() throws RecognitionException {
		Function_definition_param_idContext _localctx = new Function_definition_param_idContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function_definition_param_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			id();
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
		public TerminalNode RETURN() { return getToken(RubyParser.RETURN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(RETURN);
			setState(311);
			all_result();
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_nameContext name;
		public Function_call_param_listContext params;
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_call_param_listContext function_call_param_list() {
			return getRuleContext(Function_call_param_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				((Function_callContext)_localctx).name = function_name();
				setState(314);
				match(LEFT_RBRACKET);
				setState(315);
				((Function_callContext)_localctx).params = function_call_param_list();
				setState(316);
				match(RIGHT_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				((Function_callContext)_localctx).name = function_name();
				setState(319);
				((Function_callContext)_localctx).params = function_call_param_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				((Function_callContext)_localctx).name = function_name();
				setState(322);
				match(LEFT_RBRACKET);
				setState(323);
				match(RIGHT_RBRACKET);
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

	public static class Function_call_param_listContext extends ParserRuleContext {
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public Function_call_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_param_list; }
	}

	public final Function_call_param_listContext function_call_param_list() throws RecognitionException {
		Function_call_param_listContext _localctx = new Function_call_param_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_call_param_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			function_call_params(0);
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

	public static class Function_call_paramsContext extends ParserRuleContext {
		public Function_paramContext function_param() {
			return getRuleContext(Function_paramContext.class,0);
		}
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyParser.COMMA, 0); }
		public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_params; }
	}

	public final Function_call_paramsContext function_call_params() throws RecognitionException {
		return function_call_params(0);
	}

	private Function_call_paramsContext function_call_params(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, _parentState);
		Function_call_paramsContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_function_call_params, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(330);
			function_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Function_call_paramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function_call_params);
					setState(332);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(333);
					match(COMMA);
					setState(334);
					function_param();
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Function_paramContext extends ParserRuleContext {
		public Function_unnamed_paramContext function_unnamed_param() {
			return getRuleContext(Function_unnamed_paramContext.class,0);
		}
		public Function_named_paramContext function_named_param() {
			return getRuleContext(Function_named_paramContext.class,0);
		}
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(340);
				function_unnamed_param();
				}
				break;
			case 2:
				{
				setState(341);
				function_named_param();
				}
				break;
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

	public static class Function_unnamed_paramContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_unnamed_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_unnamed_param; }
	}

	public final Function_unnamed_paramContext function_unnamed_param() throws RecognitionException {
		Function_unnamed_paramContext _localctx = new Function_unnamed_paramContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_unnamed_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(344);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(345);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(346);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(347);
				dynamic_result(0);
				}
				break;
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

	public static class Function_named_paramContext extends ParserRuleContext {
		public Token op;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Function_named_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_named_param; }
	}

	public final Function_named_paramContext function_named_param() throws RecognitionException {
		Function_named_paramContext _localctx = new Function_named_paramContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function_named_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			id();
			setState(351);
			((Function_named_paramContext)_localctx).op = match(ASSIGN);
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(352);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(353);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(354);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(355);
				dynamic_result(0);
				}
				break;
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

	public static class Function_call_assignmentContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Function_call_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_assignment; }
	}

	public final Function_call_assignmentContext function_call_assignment() throws RecognitionException {
		Function_call_assignmentContext _localctx = new Function_call_assignmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_function_call_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			function_call();
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

	public static class All_resultContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Global_resultContext global_result() {
			return getRuleContext(Global_resultContext.class,0);
		}
		public All_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_result; }
	}

	public final All_resultContext all_result() throws RecognitionException {
		All_resultContext _localctx = new All_resultContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_all_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(360);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(361);
				float_result(0);
				}
				break;
			case 3:
				{
				setState(362);
				string_result(0);
				}
				break;
			case 4:
				{
				setState(363);
				dynamic_result(0);
				}
				break;
			case 5:
				{
				setState(364);
				global_result();
				}
				break;
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

	public static class Elsif_statementContext extends ParserRuleContext {
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public Elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsif_statement; }
	}

	public final Elsif_statementContext elsif_statement() throws RecognitionException {
		Elsif_statementContext _localctx = new Elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_elsif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			if_elsif_statement();
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

	public static class If_elsif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(RubyParser.ELSIF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public If_elsif_statementContext if_elsif_statement() {
			return getRuleContext(If_elsif_statementContext.class,0);
		}
		public If_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_elsif_statement; }
	}

	public final If_elsif_statementContext if_elsif_statement() throws RecognitionException {
		If_elsif_statementContext _localctx = new If_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_elsif_statement);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(ELSIF);
				setState(370);
				cond_expression();
				setState(371);
				crlf();
				setState(372);
				statement_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(ELSIF);
				setState(375);
				cond_expression();
				setState(376);
				crlf();
				setState(377);
				statement_body();
				setState(378);
				else_token();
				setState(379);
				crlf();
				setState(380);
				statement_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				match(ELSIF);
				setState(383);
				cond_expression();
				setState(384);
				crlf();
				setState(385);
				statement_body();
				setState(386);
				if_elsif_statement();
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
		public TerminalNode IF() { return getToken(RubyParser.IF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_if_statement);
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(IF);
				setState(391);
				cond_expression();
				setState(392);
				crlf();
				setState(393);
				statement_body();
				setState(394);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(IF);
				setState(397);
				cond_expression();
				setState(398);
				crlf();
				setState(399);
				statement_body();
				setState(400);
				else_token();
				setState(401);
				crlf();
				setState(402);
				statement_body();
				setState(403);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(IF);
				setState(406);
				cond_expression();
				setState(407);
				crlf();
				setState(408);
				statement_body();
				setState(409);
				elsif_statement();
				setState(410);
				match(END);
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

	public static class Unless_statementContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(RubyParser.UNLESS, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Statement_bodyContext> statement_body() {
			return getRuleContexts(Statement_bodyContext.class);
		}
		public Statement_bodyContext statement_body(int i) {
			return getRuleContext(Statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
		}
		public Unless_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_statement; }
	}

	public final Unless_statementContext unless_statement() throws RecognitionException {
		Unless_statementContext _localctx = new Unless_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unless_statement);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(UNLESS);
				setState(415);
				cond_expression();
				setState(416);
				crlf();
				setState(417);
				statement_body();
				setState(418);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(UNLESS);
				setState(421);
				cond_expression();
				setState(422);
				crlf();
				setState(423);
				statement_body();
				setState(424);
				else_token();
				setState(425);
				crlf();
				setState(426);
				statement_body();
				setState(427);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				match(UNLESS);
				setState(430);
				cond_expression();
				setState(431);
				crlf();
				setState(432);
				statement_body();
				setState(433);
				elsif_statement();
				setState(434);
				match(END);
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

	public static class While_statementContext extends ParserRuleContext {
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public TerminalNode WHILE() { return getToken(RubyParser.WHILE, 0); }
		public TerminalNode UNTIL() { return getToken(RubyParser.UNTIL, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_la = _input.LA(1);
			if ( !(_la==WHILE || _la==UNTIL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(439);
			cond_expression();
			setState(440);
			crlf();
			setState(441);
			statement_body();
			setState(442);
			match(END);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RubyParser.FOR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public Init_expressionContext init_expression() {
			return getRuleContext(Init_expressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(RubyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RubyParser.SEMICOLON, i);
		}
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Statement_bodyContext statement_body() {
			return getRuleContext(Statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_for_statement);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(FOR);
				setState(445);
				match(LEFT_RBRACKET);
				setState(446);
				init_expression();
				setState(447);
				match(SEMICOLON);
				setState(448);
				cond_expression();
				setState(449);
				match(SEMICOLON);
				setState(450);
				loop_expression();
				setState(451);
				match(RIGHT_RBRACKET);
				setState(452);
				crlf();
				setState(453);
				statement_body();
				setState(454);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(FOR);
				setState(457);
				init_expression();
				setState(458);
				match(SEMICOLON);
				setState(459);
				cond_expression();
				setState(460);
				match(SEMICOLON);
				setState(461);
				loop_expression();
				setState(462);
				crlf();
				setState(463);
				statement_body();
				setState(464);
				match(END);
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

	public static class Function_elsif_statementContext extends ParserRuleContext {
		public Function_if_elsif_statementContext function_if_elsif_statement() {
			return getRuleContext(Function_if_elsif_statementContext.class,0);
		}
		public Function_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_elsif_statement; }
	}

	public final Function_elsif_statementContext function_elsif_statement() throws RecognitionException {
		Function_elsif_statementContext _localctx = new Function_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function_elsif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			function_if_elsif_statement();
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

	public static class Function_if_elsif_statementContext extends ParserRuleContext {
		public TerminalNode ELSIF() { return getToken(RubyParser.ELSIF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Function_statement_bodyContext> function_statement_body() {
			return getRuleContexts(Function_statement_bodyContext.class);
		}
		public Function_statement_bodyContext function_statement_body(int i) {
			return getRuleContext(Function_statement_bodyContext.class,i);
		}
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Function_if_elsif_statementContext function_if_elsif_statement() {
			return getRuleContext(Function_if_elsif_statementContext.class,0);
		}
		public Function_if_elsif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_if_elsif_statement; }
	}

	public final Function_if_elsif_statementContext function_if_elsif_statement() throws RecognitionException {
		Function_if_elsif_statementContext _localctx = new Function_if_elsif_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_function_if_elsif_statement);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(ELSIF);
				setState(471);
				cond_expression();
				setState(472);
				crlf();
				setState(473);
				function_statement_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(ELSIF);
				setState(476);
				cond_expression();
				setState(477);
				crlf();
				setState(478);
				function_statement_body();
				setState(479);
				else_token();
				setState(480);
				crlf();
				setState(481);
				function_statement_body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				match(ELSIF);
				setState(484);
				cond_expression();
				setState(485);
				crlf();
				setState(486);
				function_statement_body();
				setState(487);
				function_if_elsif_statement();
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

	public static class Function_if_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RubyParser.IF, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Function_statement_bodyContext> function_statement_body() {
			return getRuleContexts(Function_statement_bodyContext.class);
		}
		public Function_statement_bodyContext function_statement_body(int i) {
			return getRuleContext(Function_statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Function_elsif_statementContext function_elsif_statement() {
			return getRuleContext(Function_elsif_statementContext.class,0);
		}
		public Function_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_if_statement; }
	}

	public final Function_if_statementContext function_if_statement() throws RecognitionException {
		Function_if_statementContext _localctx = new Function_if_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_if_statement);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(IF);
				setState(492);
				cond_expression();
				setState(493);
				crlf();
				setState(494);
				function_statement_body();
				setState(495);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(IF);
				setState(498);
				cond_expression();
				setState(499);
				crlf();
				setState(500);
				function_statement_body();
				setState(501);
				else_token();
				setState(502);
				crlf();
				setState(503);
				function_statement_body();
				setState(504);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				match(IF);
				setState(507);
				cond_expression();
				setState(508);
				crlf();
				setState(509);
				function_statement_body();
				setState(510);
				function_elsif_statement();
				setState(511);
				match(END);
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

	public static class Function_unless_statementContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(RubyParser.UNLESS, 0); }
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public List<Function_statement_bodyContext> function_statement_body() {
			return getRuleContexts(Function_statement_bodyContext.class);
		}
		public Function_statement_bodyContext function_statement_body(int i) {
			return getRuleContext(Function_statement_bodyContext.class,i);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Else_tokenContext else_token() {
			return getRuleContext(Else_tokenContext.class,0);
		}
		public Function_elsif_statementContext function_elsif_statement() {
			return getRuleContext(Function_elsif_statementContext.class,0);
		}
		public Function_unless_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_unless_statement; }
	}

	public final Function_unless_statementContext function_unless_statement() throws RecognitionException {
		Function_unless_statementContext _localctx = new Function_unless_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function_unless_statement);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				match(UNLESS);
				setState(516);
				cond_expression();
				setState(517);
				crlf();
				setState(518);
				function_statement_body();
				setState(519);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				match(UNLESS);
				setState(522);
				cond_expression();
				setState(523);
				crlf();
				setState(524);
				function_statement_body();
				setState(525);
				else_token();
				setState(526);
				crlf();
				setState(527);
				function_statement_body();
				setState(528);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				match(UNLESS);
				setState(531);
				cond_expression();
				setState(532);
				crlf();
				setState(533);
				function_statement_body();
				setState(534);
				function_elsif_statement();
				setState(535);
				match(END);
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

	public static class Function_while_statementContext extends ParserRuleContext {
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_statement_bodyContext function_statement_body() {
			return getRuleContext(Function_statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public TerminalNode WHILE() { return getToken(RubyParser.WHILE, 0); }
		public TerminalNode UNTIL() { return getToken(RubyParser.UNTIL, 0); }
		public Function_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_while_statement; }
	}

	public final Function_while_statementContext function_while_statement() throws RecognitionException {
		Function_while_statementContext _localctx = new Function_while_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			_la = _input.LA(1);
			if ( !(_la==WHILE || _la==UNTIL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(540);
			cond_expression();
			setState(541);
			crlf();
			setState(542);
			function_statement_body();
			setState(543);
			match(END);
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

	public static class Function_for_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RubyParser.FOR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public Init_expressionContext init_expression() {
			return getRuleContext(Init_expressionContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(RubyParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(RubyParser.SEMICOLON, i);
		}
		public Cond_expressionContext cond_expression() {
			return getRuleContext(Cond_expressionContext.class,0);
		}
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
		}
		public Function_statement_bodyContext function_statement_body() {
			return getRuleContext(Function_statement_bodyContext.class,0);
		}
		public TerminalNode END() { return getToken(RubyParser.END, 0); }
		public Function_for_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_for_statement; }
	}

	public final Function_for_statementContext function_for_statement() throws RecognitionException {
		Function_for_statementContext _localctx = new Function_for_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_for_statement);
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(FOR);
				setState(546);
				match(LEFT_RBRACKET);
				setState(547);
				init_expression();
				setState(548);
				match(SEMICOLON);
				setState(549);
				cond_expression();
				setState(550);
				match(SEMICOLON);
				setState(551);
				loop_expression();
				setState(552);
				match(RIGHT_RBRACKET);
				setState(553);
				crlf();
				setState(554);
				function_statement_body();
				setState(555);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(FOR);
				setState(558);
				init_expression();
				setState(559);
				match(SEMICOLON);
				setState(560);
				cond_expression();
				setState(561);
				match(SEMICOLON);
				setState(562);
				loop_expression();
				setState(563);
				crlf();
				setState(564);
				function_statement_body();
				setState(565);
				match(END);
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

	public static class Init_expressionContext extends ParserRuleContext {
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public Init_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_expression; }
	}

	public final Init_expressionContext init_expression() throws RecognitionException {
		Init_expressionContext _localctx = new Init_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_init_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			for_init_list(0);
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

	public static class All_assignmentContext extends ParserRuleContext {
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public All_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_assignment; }
	}

	public final All_assignmentContext all_assignment() throws RecognitionException {
		All_assignmentContext _localctx = new All_assignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_all_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(571);
				int_assignment();
				}
				break;
			case 2:
				{
				setState(572);
				float_assignment();
				}
				break;
			case 3:
				{
				setState(573);
				string_assignment();
				}
				break;
			case 4:
				{
				setState(574);
				dynamic_assignment();
				}
				break;
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

	public static class For_init_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_init_listContext for_init_list() {
			return getRuleContext(For_init_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyParser.COMMA, 0); }
		public For_init_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_list; }
	}

	public final For_init_listContext for_init_list() throws RecognitionException {
		return for_init_list(0);
	}

	private For_init_listContext for_init_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_init_listContext _localctx = new For_init_listContext(_ctx, _parentState);
		For_init_listContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_for_init_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(578);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_init_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_init_list);
					setState(580);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(581);
					match(COMMA);
					setState(582);
					all_assignment();
					}
					} 
				}
				setState(587);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Cond_expressionContext extends ParserRuleContext {
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public Cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expression; }
	}

	public final Cond_expressionContext cond_expression() throws RecognitionException {
		Cond_expressionContext _localctx = new Cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_cond_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			comparison_list();
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

	public static class Loop_expressionContext extends ParserRuleContext {
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expression; }
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			for_loop_list(0);
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

	public static class For_loop_listContext extends ParserRuleContext {
		public All_assignmentContext all_assignment() {
			return getRuleContext(All_assignmentContext.class,0);
		}
		public For_loop_listContext for_loop_list() {
			return getRuleContext(For_loop_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyParser.COMMA, 0); }
		public For_loop_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_list; }
	}

	public final For_loop_listContext for_loop_list() throws RecognitionException {
		return for_loop_list(0);
	}

	private For_loop_listContext for_loop_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		For_loop_listContext _localctx = new For_loop_listContext(_ctx, _parentState);
		For_loop_listContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_for_loop_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(593);
			all_assignment();
			}
			_ctx.stop = _input.LT(-1);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new For_loop_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_for_loop_list);
					setState(595);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(596);
					match(COMMA);
					setState(597);
					all_assignment();
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class Statement_bodyContext extends ParserRuleContext {
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_body; }
	}

	public final Statement_bodyContext statement_body() throws RecognitionException {
		Statement_bodyContext _localctx = new Statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_statement_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			statement_expression_list(0);
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

	public static class Statement_expression_listContext extends ParserRuleContext {
		public Statement_expressionContext statement_expression() {
			return getRuleContext(Statement_expressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(RubyParser.RETRY, 0); }
		public Break_expressionContext break_expression() {
			return getRuleContext(Break_expressionContext.class,0);
		}
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Statement_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_expression_list; }
	}

	public final Statement_expression_listContext statement_expression_list() throws RecognitionException {
		return statement_expression_list(0);
	}

	private Statement_expression_listContext statement_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_expression_listContext _localctx = new Statement_expression_listContext(_ctx, _parentState);
		Statement_expression_listContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_statement_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case LITERAL:
			case SEMICOLON:
			case CRLF:
			case REQUIRE:
			case PIR:
			case IF:
			case UNLESS:
			case WHILE:
			case UNTIL:
			case FOR:
			case TRUE:
			case FALSE:
			case DOT:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				{
				setState(606);
				statement_expression();
				setState(607);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(609);
				match(RETRY);
				setState(610);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(611);
				break_expression();
				setState(612);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(629);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(627);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(616);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(617);
						statement_expression();
						setState(618);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(620);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(621);
						match(RETRY);
						setState(622);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new Statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_statement_expression_list);
						setState(623);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(624);
						break_expression();
						setState(625);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(631);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Statement_expressionContext extends ParserRuleContext {
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public Require_blockContext require_block() {
			return getRuleContext(Require_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Unless_statementContext unless_statement() {
			return getRuleContext(Unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Pir_inlineContext pir_inline() {
			return getRuleContext(Pir_inlineContext.class,0);
		}
		public Function_chainContext function_chain() {
			return getRuleContext(Function_chainContext.class,0);
		}
		public Statement_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_expression; }
	}

	public final Statement_expressionContext statement_expression() throws RecognitionException {
		Statement_expressionContext _localctx = new Statement_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_statement_expression);
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				function_inline_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(634);
				require_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(635);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(636);
				unless_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(637);
				rvalue(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(638);
				while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(639);
				for_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(640);
				pir_inline();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(641);
				function_chain();
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

	public static class Function_statement_bodyContext extends ParserRuleContext {
		public Function_statement_expression_listContext function_statement_expression_list() {
			return getRuleContext(Function_statement_expression_listContext.class,0);
		}
		public Function_statement_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement_body; }
	}

	public final Function_statement_bodyContext function_statement_body() throws RecognitionException {
		Function_statement_bodyContext _localctx = new Function_statement_bodyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_function_statement_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			function_statement_expression_list(0);
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

	public static class Function_statement_expression_listContext extends ParserRuleContext {
		public Function_statement_expressionContext function_statement_expression() {
			return getRuleContext(Function_statement_expressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode RETRY() { return getToken(RubyParser.RETRY, 0); }
		public Break_expressionContext break_expression() {
			return getRuleContext(Break_expressionContext.class,0);
		}
		public Function_statement_expression_listContext function_statement_expression_list() {
			return getRuleContext(Function_statement_expression_listContext.class,0);
		}
		public Function_statement_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement_expression_list; }
	}

	public final Function_statement_expression_listContext function_statement_expression_list() throws RecognitionException {
		return function_statement_expression_list(0);
	}

	private Function_statement_expression_listContext function_statement_expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Function_statement_expression_listContext _localctx = new Function_statement_expression_listContext(_ctx, _parentState);
		Function_statement_expression_listContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_function_statement_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case LITERAL:
			case SEMICOLON:
			case CRLF:
			case REQUIRE:
			case RETURN:
			case PIR:
			case IF:
			case UNLESS:
			case WHILE:
			case UNTIL:
			case FOR:
			case TRUE:
			case FALSE:
			case DOT:
			case BIT_NOT:
			case NOT:
			case LEFT_RBRACKET:
			case NIL:
			case INT:
			case FLOAT:
			case ID:
			case ID_GLOBAL:
			case ID_FUNCTION:
				{
				setState(647);
				function_statement_expression();
				setState(648);
				terminator(0);
				}
				break;
			case RETRY:
				{
				setState(650);
				match(RETRY);
				setState(651);
				terminator(0);
				}
				break;
			case BREAK:
				{
				setState(652);
				break_expression();
				setState(653);
				terminator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(668);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new Function_statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_function_statement_expression_list);
						setState(657);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(658);
						function_statement_expression();
						setState(659);
						terminator(0);
						}
						break;
					case 2:
						{
						_localctx = new Function_statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_function_statement_expression_list);
						setState(661);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(662);
						match(RETRY);
						setState(663);
						terminator(0);
						}
						break;
					case 3:
						{
						_localctx = new Function_statement_expression_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_function_statement_expression_list);
						setState(664);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(665);
						break_expression();
						setState(666);
						terminator(0);
						}
						break;
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class Function_statement_expressionContext extends ParserRuleContext {
		public Function_inline_callContext function_inline_call() {
			return getRuleContext(Function_inline_callContext.class,0);
		}
		public Require_blockContext require_block() {
			return getRuleContext(Require_blockContext.class,0);
		}
		public Function_if_statementContext function_if_statement() {
			return getRuleContext(Function_if_statementContext.class,0);
		}
		public Function_unless_statementContext function_unless_statement() {
			return getRuleContext(Function_unless_statementContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public Function_while_statementContext function_while_statement() {
			return getRuleContext(Function_while_statementContext.class,0);
		}
		public Function_for_statementContext function_for_statement() {
			return getRuleContext(Function_for_statementContext.class,0);
		}
		public Pir_inlineContext pir_inline() {
			return getRuleContext(Pir_inlineContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Function_chainContext function_chain() {
			return getRuleContext(Function_chainContext.class,0);
		}
		public Function_statement_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement_expression; }
	}

	public final Function_statement_expressionContext function_statement_expression() throws RecognitionException {
		Function_statement_expressionContext _localctx = new Function_statement_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_function_statement_expression);
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				function_inline_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(675);
				require_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(676);
				function_if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(677);
				function_unless_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(678);
				rvalue(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(679);
				function_while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(680);
				function_for_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(681);
				pir_inline();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(682);
				return_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(683);
				function_chain();
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

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyParser.EXP_ASSIGN, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_assignment);
		int _la;
		try {
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(687);
				((AssignmentContext)_localctx).op = match(ASSIGN);
				setState(688);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(691);
				((AssignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(692);
				rvalue(0);
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

	public static class Dynamic_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyParser.EXP_ASSIGN, 0); }
		public Dynamic_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_assignment; }
	}

	public final Dynamic_assignmentContext dynamic_assignment() throws RecognitionException {
		Dynamic_assignmentContext _localctx = new Dynamic_assignmentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_dynamic_assignment);
		int _la;
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(697);
				((Dynamic_assignmentContext)_localctx).op = match(ASSIGN);
				setState(698);
				dynamic_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(701);
				((Dynamic_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Dynamic_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(702);
				dynamic_result(0);
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

	public static class Int_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyParser.EXP_ASSIGN, 0); }
		public Int_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_assignment; }
	}

	public final Int_assignmentContext int_assignment() throws RecognitionException {
		Int_assignmentContext _localctx = new Int_assignmentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_int_assignment);
		int _la;
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(707);
				((Int_assignmentContext)_localctx).op = match(ASSIGN);
				setState(708);
				int_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(711);
				((Int_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Int_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(712);
				int_result(0);
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

	public static class Float_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(RubyParser.MINUS_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(RubyParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(RubyParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(RubyParser.MOD_ASSIGN, 0); }
		public TerminalNode EXP_ASSIGN() { return getToken(RubyParser.EXP_ASSIGN, 0); }
		public Float_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_assignment; }
	}

	public final Float_assignmentContext float_assignment() throws RecognitionException {
		Float_assignmentContext _localctx = new Float_assignmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_float_assignment);
		int _la;
		try {
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(717);
				((Float_assignmentContext)_localctx).op = match(ASSIGN);
				setState(718);
				float_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(721);
				((Float_assignmentContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_ASSIGN) | (1L << MINUS_ASSIGN) | (1L << MUL_ASSIGN) | (1L << DIV_ASSIGN) | (1L << MOD_ASSIGN) | (1L << EXP_ASSIGN))) != 0)) ) {
					((Float_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(722);
				float_result(0);
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

	public static class String_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(RubyParser.PLUS_ASSIGN, 0); }
		public String_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assignment; }
	}

	public final String_assignmentContext string_assignment() throws RecognitionException {
		String_assignmentContext _localctx = new String_assignmentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_string_assignment);
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(727);
				((String_assignmentContext)_localctx).op = match(ASSIGN);
				setState(728);
				string_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(731);
				((String_assignmentContext)_localctx).op = match(PLUS_ASSIGN);
				setState(732);
				string_result(0);
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

	public static class Initial_array_assignmentContext extends ParserRuleContext {
		public LvalueContext var_id;
		public Token op;
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyParser.RIGHT_SBRACKET, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public Initial_array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_array_assignment; }
	}

	public final Initial_array_assignmentContext initial_array_assignment() throws RecognitionException {
		Initial_array_assignmentContext _localctx = new Initial_array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_initial_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			((Initial_array_assignmentContext)_localctx).var_id = lvalue();
			setState(737);
			((Initial_array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(738);
			match(LEFT_SBRACKET);
			setState(739);
			match(RIGHT_SBRACKET);
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

	public static class Array_assignmentContext extends ParserRuleContext {
		public Array_selectorContext arr_def;
		public Token op;
		public All_resultContext arr_val;
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RubyParser.ASSIGN, 0); }
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assignment; }
	}

	public final Array_assignmentContext array_assignment() throws RecognitionException {
		Array_assignmentContext _localctx = new Array_assignmentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_array_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			((Array_assignmentContext)_localctx).arr_def = array_selector();
			setState(742);
			((Array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(743);
			((Array_assignmentContext)_localctx).arr_val = all_result();
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

	public static class Array_definitionContext extends ParserRuleContext {
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyParser.LEFT_SBRACKET, 0); }
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyParser.RIGHT_SBRACKET, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_array_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(LEFT_SBRACKET);
			setState(746);
			array_definition_elements(0);
			setState(747);
			match(RIGHT_SBRACKET);
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

	public static class Array_definition_elementsContext extends ParserRuleContext {
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Array_definition_elementsContext array_definition_elements() {
			return getRuleContext(Array_definition_elementsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RubyParser.COMMA, 0); }
		public Array_definition_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition_elements; }
	}

	public final Array_definition_elementsContext array_definition_elements() throws RecognitionException {
		return array_definition_elements(0);
	}

	private Array_definition_elementsContext array_definition_elements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Array_definition_elementsContext _localctx = new Array_definition_elementsContext(_ctx, _parentState);
		Array_definition_elementsContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_array_definition_elements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(750);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(751);
				dynamic_result(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
					setState(754);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(755);
					match(COMMA);
					setState(758);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(756);
						int_result(0);
						}
						break;
					case 2:
						{
						setState(757);
						dynamic_result(0);
						}
						break;
					}
					}
					} 
				}
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class Array_selectorContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LEFT_SBRACKET() { return getToken(RubyParser.LEFT_SBRACKET, 0); }
		public TerminalNode RIGHT_SBRACKET() { return getToken(RubyParser.RIGHT_SBRACKET, 0); }
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Dynamic_resultContext dynamic_result() {
			return getRuleContext(Dynamic_resultContext.class,0);
		}
		public Id_globalContext id_global() {
			return getRuleContext(Id_globalContext.class,0);
		}
		public Array_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_selector; }
	}

	public final Array_selectorContext array_selector() throws RecognitionException {
		Array_selectorContext _localctx = new Array_selectorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_array_selector);
		try {
			setState(781);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				id();
				setState(766);
				match(LEFT_SBRACKET);
				setState(769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(767);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(768);
					dynamic_result(0);
					}
					break;
				}
				setState(771);
				match(RIGHT_SBRACKET);
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				id_global();
				setState(774);
				match(LEFT_SBRACKET);
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(775);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(776);
					dynamic_result(0);
					}
					break;
				}
				setState(779);
				match(RIGHT_SBRACKET);
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

	public static class Dynamic_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Dynamic_resultContext> dynamic_result() {
			return getRuleContexts(Dynamic_resultContext.class);
		}
		public Dynamic_resultContext dynamic_result(int i) {
			return getRuleContext(Dynamic_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyParser.MOD, 0); }
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public DynamicContext dynamic() {
			return getRuleContext(DynamicContext.class,0);
		}
		public Dynamic_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_result; }
	}

	public final Dynamic_resultContext dynamic_result() throws RecognitionException {
		return dynamic_result(0);
	}

	private Dynamic_resultContext dynamic_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dynamic_resultContext _localctx = new Dynamic_resultContext(_ctx, _parentState);
		Dynamic_resultContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_dynamic_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(784);
				int_result(0);
				setState(785);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(786);
				dynamic_result(13);
				}
				break;
			case 2:
				{
				setState(788);
				float_result(0);
				setState(789);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(790);
				dynamic_result(11);
				}
				break;
			case 3:
				{
				setState(792);
				string_result(0);
				setState(793);
				((Dynamic_resultContext)_localctx).op = match(MUL);
				setState(794);
				dynamic_result(8);
				}
				break;
			case 4:
				{
				setState(796);
				int_result(0);
				setState(797);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(798);
				dynamic_result(6);
				}
				break;
			case 5:
				{
				setState(800);
				float_result(0);
				setState(801);
				((Dynamic_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(802);
				dynamic_result(4);
				}
				break;
			case 6:
				{
				setState(804);
				match(LEFT_RBRACKET);
				setState(805);
				dynamic_result(0);
				setState(806);
				match(RIGHT_RBRACKET);
				}
				break;
			case 7:
				{
				setState(808);
				dynamic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(832);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(811);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(812);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(813);
						dynamic_result(11);
						}
						break;
					case 2:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(814);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(815);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(816);
						dynamic_result(4);
						}
						break;
					case 3:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(817);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(818);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(819);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(820);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(821);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(822);
						float_result(0);
						}
						break;
					case 5:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(823);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(824);
						((Dynamic_resultContext)_localctx).op = match(MUL);
						setState(825);
						string_result(0);
						}
						break;
					case 6:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(826);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(827);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(828);
						int_result(0);
						}
						break;
					case 7:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(829);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(830);
						((Dynamic_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Dynamic_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(831);
						float_result(0);
						}
						break;
					}
					} 
				}
				setState(836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class DynamicContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_call_assignmentContext function_call_assignment() {
			return getRuleContext(Function_call_assignmentContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public DynamicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic; }
	}

	public final DynamicContext dynamic() throws RecognitionException {
		DynamicContext _localctx = new DynamicContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_dynamic);
		try {
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				function_call_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(839);
				array_selector();
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

	public static class Int_resultContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public List<Int_resultContext> int_result() {
			return getRuleContexts(Int_resultContext.class);
		}
		public Int_resultContext int_result(int i) {
			return getRuleContext(Int_resultContext.class,i);
		}
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyParser.MINUS, 0); }
		public Int_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_result; }
	}

	public final Int_resultContext int_result() throws RecognitionException {
		return int_result(0);
	}

	private Int_resultContext int_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_resultContext _localctx = new Int_resultContext(_ctx, _parentState);
		Int_resultContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_int_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				{
				setState(843);
				match(LEFT_RBRACKET);
				setState(844);
				int_result(0);
				setState(845);
				match(RIGHT_RBRACKET);
				}
				break;
			case INT:
				{
				setState(847);
				int_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(856);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(850);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(851);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(852);
						int_result(5);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(853);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(854);
						((Int_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Int_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(855);
						int_result(4);
						}
						break;
					}
					} 
				}
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class Float_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<Float_resultContext> float_result() {
			return getRuleContexts(Float_resultContext.class);
		}
		public Float_resultContext float_result(int i) {
			return getRuleContext(Float_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyParser.MINUS, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Float_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_result; }
	}

	public final Float_resultContext float_result() throws RecognitionException {
		return float_result(0);
	}

	private Float_resultContext float_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Float_resultContext _localctx = new Float_resultContext(_ctx, _parentState);
		Float_resultContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_float_result, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(862);
				int_result(0);
				setState(863);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(864);
				float_result(7);
				}
				break;
			case 2:
				{
				setState(866);
				int_result(0);
				setState(867);
				((Float_resultContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(868);
				float_result(4);
				}
				break;
			case 3:
				{
				setState(870);
				match(LEFT_RBRACKET);
				setState(871);
				float_result(0);
				setState(872);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				{
				setState(874);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(889);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(877);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(878);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(879);
						float_result(9);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(880);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(881);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(882);
						float_result(6);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(883);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(884);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(885);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(886);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(887);
						((Float_resultContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((Float_resultContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(888);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class String_resultContext extends ParserRuleContext {
		public Token op;
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public List<String_resultContext> string_result() {
			return getRuleContexts(String_resultContext.class);
		}
		public String_resultContext string_result(int i) {
			return getRuleContext(String_resultContext.class,i);
		}
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public String_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_result; }
	}

	public final String_resultContext string_result() throws RecognitionException {
		return string_result(0);
	}

	private String_resultContext string_result(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_resultContext _localctx = new String_resultContext(_ctx, _parentState);
		String_resultContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_string_result, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
			case INT:
				{
				setState(895);
				int_result(0);
				setState(896);
				((String_resultContext)_localctx).op = match(MUL);
				setState(897);
				string_result(3);
				}
				break;
			case LITERAL:
				{
				setState(899);
				literal_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(910);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(908);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(902);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(903);
						((String_resultContext)_localctx).op = match(PLUS);
						setState(904);
						string_result(3);
						}
						break;
					case 2:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(905);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(906);
						((String_resultContext)_localctx).op = match(MUL);
						setState(907);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(912);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class Comparison_listContext extends ParserRuleContext {
		public ComparisonContext left;
		public Token op;
		public Comparison_listContext right;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode BIT_AND() { return getToken(RubyParser.BIT_AND, 0); }
		public Comparison_listContext comparison_list() {
			return getRuleContext(Comparison_listContext.class,0);
		}
		public TerminalNode AND() { return getToken(RubyParser.AND, 0); }
		public TerminalNode BIT_OR() { return getToken(RubyParser.BIT_OR, 0); }
		public TerminalNode OR() { return getToken(RubyParser.OR, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public Comparison_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_list; }
	}

	public final Comparison_listContext comparison_list() throws RecognitionException {
		Comparison_listContext _localctx = new Comparison_listContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_comparison_list);
		try {
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(913);
				((Comparison_listContext)_localctx).left = comparison();
				setState(914);
				((Comparison_listContext)_localctx).op = match(BIT_AND);
				setState(915);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				((Comparison_listContext)_localctx).left = comparison();
				setState(918);
				((Comparison_listContext)_localctx).op = match(AND);
				setState(919);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(921);
				((Comparison_listContext)_localctx).left = comparison();
				setState(922);
				((Comparison_listContext)_localctx).op = match(BIT_OR);
				setState(923);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(925);
				((Comparison_listContext)_localctx).left = comparison();
				setState(926);
				((Comparison_listContext)_localctx).op = match(OR);
				setState(927);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(929);
				match(LEFT_RBRACKET);
				setState(930);
				comparison_list();
				setState(931);
				match(RIGHT_RBRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(933);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public Comp_varContext left;
		public Token op;
		public Comp_varContext right;
		public List<Comp_varContext> comp_var() {
			return getRuleContexts(Comp_varContext.class);
		}
		public Comp_varContext comp_var(int i) {
			return getRuleContext(Comp_varContext.class,i);
		}
		public TerminalNode LESS() { return getToken(RubyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RubyParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(RubyParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RubyParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(RubyParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(RubyParser.NOT_EQUAL, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_comparison);
		int _la;
		try {
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				((ComparisonContext)_localctx).left = comp_var();
				setState(937);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(938);
				((ComparisonContext)_localctx).right = comp_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				((ComparisonContext)_localctx).left = comp_var();
				setState(941);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(942);
				((ComparisonContext)_localctx).right = comp_var();
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

	public static class Comp_varContext extends ParserRuleContext {
		public All_resultContext all_result() {
			return getRuleContext(All_resultContext.class,0);
		}
		public Array_selectorContext array_selector() {
			return getRuleContext(Array_selectorContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Comp_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_var; }
	}

	public final Comp_varContext comp_var() throws RecognitionException {
		Comp_varContext _localctx = new Comp_varContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_comp_var);
		try {
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				all_result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				array_selector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(948);
				id();
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

	public static class LvalueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			id();
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

	public static class RvalueContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Initial_array_assignmentContext initial_array_assignment() {
			return getRuleContext(Initial_array_assignmentContext.class,0);
		}
		public Array_assignmentContext array_assignment() {
			return getRuleContext(Array_assignmentContext.class,0);
		}
		public Int_resultContext int_result() {
			return getRuleContext(Int_resultContext.class,0);
		}
		public Float_resultContext float_result() {
			return getRuleContext(Float_resultContext.class,0);
		}
		public String_resultContext string_result() {
			return getRuleContext(String_resultContext.class,0);
		}
		public Global_setContext global_set() {
			return getRuleContext(Global_setContext.class,0);
		}
		public Global_getContext global_get() {
			return getRuleContext(Global_getContext.class,0);
		}
		public Dynamic_assignmentContext dynamic_assignment() {
			return getRuleContext(Dynamic_assignmentContext.class,0);
		}
		public String_assignmentContext string_assignment() {
			return getRuleContext(String_assignmentContext.class,0);
		}
		public Float_assignmentContext float_assignment() {
			return getRuleContext(Float_assignmentContext.class,0);
		}
		public Int_assignmentContext int_assignment() {
			return getRuleContext(Int_assignmentContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Literal_tContext literal_t() {
			return getRuleContext(Literal_tContext.class,0);
		}
		public Bool_tContext bool_t() {
			return getRuleContext(Bool_tContext.class,0);
		}
		public Float_tContext float_t() {
			return getRuleContext(Float_tContext.class,0);
		}
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public Nil_tContext nil_t() {
			return getRuleContext(Nil_tContext.class,0);
		}
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public TerminalNode NOT() { return getToken(RubyParser.NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(RubyParser.BIT_NOT, 0); }
		public TerminalNode LEFT_RBRACKET() { return getToken(RubyParser.LEFT_RBRACKET, 0); }
		public TerminalNode RIGHT_RBRACKET() { return getToken(RubyParser.RIGHT_RBRACKET, 0); }
		public TerminalNode EXP() { return getToken(RubyParser.EXP, 0); }
		public TerminalNode MUL() { return getToken(RubyParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(RubyParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(RubyParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(RubyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RubyParser.MINUS, 0); }
		public TerminalNode BIT_SHL() { return getToken(RubyParser.BIT_SHL, 0); }
		public TerminalNode BIT_SHR() { return getToken(RubyParser.BIT_SHR, 0); }
		public TerminalNode BIT_AND() { return getToken(RubyParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(RubyParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(RubyParser.BIT_XOR, 0); }
		public TerminalNode LESS() { return getToken(RubyParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RubyParser.GREATER, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(RubyParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(RubyParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(RubyParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(RubyParser.NOT_EQUAL, 0); }
		public TerminalNode OR() { return getToken(RubyParser.OR, 0); }
		public TerminalNode AND() { return getToken(RubyParser.AND, 0); }
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_rvalue, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(954);
				lvalue();
				}
				break;
			case 2:
				{
				setState(955);
				initial_array_assignment();
				}
				break;
			case 3:
				{
				setState(956);
				array_assignment();
				}
				break;
			case 4:
				{
				setState(957);
				int_result(0);
				}
				break;
			case 5:
				{
				setState(958);
				float_result(0);
				}
				break;
			case 6:
				{
				setState(959);
				string_result(0);
				}
				break;
			case 7:
				{
				setState(960);
				global_set();
				}
				break;
			case 8:
				{
				setState(961);
				global_get();
				}
				break;
			case 9:
				{
				setState(962);
				dynamic_assignment();
				}
				break;
			case 10:
				{
				setState(963);
				string_assignment();
				}
				break;
			case 11:
				{
				setState(964);
				float_assignment();
				}
				break;
			case 12:
				{
				setState(965);
				int_assignment();
				}
				break;
			case 13:
				{
				setState(966);
				assignment();
				}
				break;
			case 14:
				{
				setState(967);
				function_call();
				}
				break;
			case 15:
				{
				setState(968);
				literal_t();
				}
				break;
			case 16:
				{
				setState(969);
				bool_t();
				}
				break;
			case 17:
				{
				setState(970);
				float_t();
				}
				break;
			case 18:
				{
				setState(971);
				int_t();
				}
				break;
			case 19:
				{
				setState(972);
				nil_t();
				}
				break;
			case 20:
				{
				setState(973);
				_la = _input.LA(1);
				if ( !(_la==BIT_NOT || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(974);
				rvalue(10);
				}
				break;
			case 21:
				{
				setState(975);
				match(LEFT_RBRACKET);
				setState(976);
				rvalue(0);
				setState(977);
				match(RIGHT_RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1010);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1008);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(981);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(982);
						match(EXP);
						setState(983);
						rvalue(12);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(984);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(985);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(986);
						rvalue(10);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(987);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(988);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(989);
						rvalue(9);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(990);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(991);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHL || _la==BIT_SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(992);
						rvalue(8);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(993);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(994);
						match(BIT_AND);
						setState(995);
						rvalue(7);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(996);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(997);
						_la = _input.LA(1);
						if ( !(_la==BIT_OR || _la==BIT_XOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(998);
						rvalue(6);
						}
						break;
					case 7:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(999);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1000);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1001);
						rvalue(5);
						}
						break;
					case 8:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(1002);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1003);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1004);
						rvalue(4);
						}
						break;
					case 9:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(1005);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1006);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1007);
						rvalue(3);
						}
						break;
					}
					} 
				}
				setState(1012);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class Break_expressionContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(RubyParser.BREAK, 0); }
		public Break_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_expression; }
	}

	public final Break_expressionContext break_expression() throws RecognitionException {
		Break_expressionContext _localctx = new Break_expressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_break_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			match(BREAK);
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

	public static class Literal_tContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(RubyParser.LITERAL, 0); }
		public Literal_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_t; }
	}

	public final Literal_tContext literal_t() throws RecognitionException {
		Literal_tContext _localctx = new Literal_tContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_literal_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(LITERAL);
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

	public static class Float_tContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(RubyParser.FLOAT, 0); }
		public Float_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_t; }
	}

	public final Float_tContext float_t() throws RecognitionException {
		Float_tContext _localctx = new Float_tContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_float_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(FLOAT);
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

	public static class Int_tContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RubyParser.INT, 0); }
		public Int_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_t; }
	}

	public final Int_tContext int_t() throws RecognitionException {
		Int_tContext _localctx = new Int_tContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(INT);
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

	public static class Bool_tContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(RubyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RubyParser.FALSE, 0); }
		public Bool_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_t; }
	}

	public final Bool_tContext bool_t() throws RecognitionException {
		Bool_tContext _localctx = new Bool_tContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_bool_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Nil_tContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(RubyParser.NIL, 0); }
		public Nil_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil_t; }
	}

	public final Nil_tContext nil_t() throws RecognitionException {
		Nil_tContext _localctx = new Nil_tContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_nil_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			match(NIL);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RubyParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
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

	public static class Id_globalContext extends ParserRuleContext {
		public TerminalNode ID_GLOBAL() { return getToken(RubyParser.ID_GLOBAL, 0); }
		public Id_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_global; }
	}

	public final Id_globalContext id_global() throws RecognitionException {
		Id_globalContext _localctx = new Id_globalContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_id_global);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(ID_GLOBAL);
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

	public static class Id_functionContext extends ParserRuleContext {
		public TerminalNode ID_FUNCTION() { return getToken(RubyParser.ID_FUNCTION, 0); }
		public Id_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_function; }
	}

	public final Id_functionContext id_function() throws RecognitionException {
		Id_functionContext _localctx = new Id_functionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_id_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			match(ID_FUNCTION);
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

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RubyParser.SEMICOLON, 0); }
		public List<CrlfContext> crlf() {
			return getRuleContexts(CrlfContext.class);
		}
		public CrlfContext crlf(int i) {
			return getRuleContext(CrlfContext.class,i);
		}
		public TerminalNode EOF() { return getToken(RubyParser.EOF, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
	}

	public final TerminatorContext terminator() throws RecognitionException {
		return terminator(0);
	}

	private TerminatorContext terminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminatorContext _localctx = new TerminatorContext(_ctx, _parentState);
		TerminatorContext _prevctx = _localctx;
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_terminator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(1032);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(1034); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1033);
						crlf();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1036); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				{
				setState(1038);
				match(EOF);
				}
				break;
			case 4:
				{
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CRLF) {
					{
					{
					setState(1039);
					crlf();
					}
					}
					setState(1044);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1045);
				match(EOF);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1052);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(1048);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1049);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(1050);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1051);
						crlf();
						}
						break;
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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

	public static class Else_tokenContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(RubyParser.ELSE, 0); }
		public Else_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_token; }
	}

	public final Else_tokenContext else_token() throws RecognitionException {
		Else_tokenContext _localctx = new Else_tokenContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_else_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			match(ELSE);
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

	public static class CrlfContext extends ParserRuleContext {
		public TerminalNode CRLF() { return getToken(RubyParser.CRLF, 0); }
		public CrlfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crlf; }
	}

	public final CrlfContext crlf() throws RecognitionException {
		CrlfContext _localctx = new CrlfContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_crlf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(CRLF);
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
		case 1:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 13:
			return function_expression_list_sempred((Function_expression_listContext)_localctx, predIndex);
		case 18:
			return function_definition_params_list_sempred((Function_definition_params_listContext)_localctx, predIndex);
		case 23:
			return function_call_params_sempred((Function_call_paramsContext)_localctx, predIndex);
		case 43:
			return for_init_list_sempred((For_init_listContext)_localctx, predIndex);
		case 46:
			return for_loop_list_sempred((For_loop_listContext)_localctx, predIndex);
		case 48:
			return statement_expression_list_sempred((Statement_expression_listContext)_localctx, predIndex);
		case 51:
			return function_statement_expression_list_sempred((Function_statement_expression_listContext)_localctx, predIndex);
		case 61:
			return array_definition_elements_sempred((Array_definition_elementsContext)_localctx, predIndex);
		case 63:
			return dynamic_result_sempred((Dynamic_resultContext)_localctx, predIndex);
		case 65:
			return int_result_sempred((Int_resultContext)_localctx, predIndex);
		case 66:
			return float_result_sempred((Float_resultContext)_localctx, predIndex);
		case 67:
			return string_result_sempred((String_resultContext)_localctx, predIndex);
		case 72:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 82:
			return terminator_sempred((TerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_expression_list_sempred(Function_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_definition_params_list_sempred(Function_definition_params_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_call_params_sempred(Function_call_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean for_init_list_sempred(For_init_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean for_loop_list_sempred(For_loop_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statement_expression_list_sempred(Statement_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean function_statement_expression_list_sempred(Function_statement_expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean array_definition_elements_sempred(Array_definition_elementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dynamic_result_sempred(Dynamic_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 14);
		case 16:
			return precpred(_ctx, 12);
		case 17:
			return precpred(_ctx, 9);
		case 18:
			return precpred(_ctx, 7);
		case 19:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 4);
		case 21:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 8);
		case 23:
			return precpred(_ctx, 5);
		case 24:
			return precpred(_ctx, 6);
		case 25:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 2);
		case 27:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 11);
		case 29:
			return precpred(_ctx, 9);
		case 30:
			return precpred(_ctx, 8);
		case 31:
			return precpred(_ctx, 7);
		case 32:
			return precpred(_ctx, 6);
		case 33:
			return precpred(_ctx, 5);
		case 34:
			return precpred(_ctx, 4);
		case 35:
			return precpred(_ctx, 3);
		case 36:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 6);
		case 38:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0428\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00b4\n\3\3\3\3\3\3\3\3\3"+
		"\7\3\u00ba\n\3\f\3\16\3\u00bd\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u00c9\n\4\3\5\3\5\5\5\u00cd\n\5\3\5\7\5\u00d0\n\5\f\5\16\5\u00d3"+
		"\13\5\3\5\3\5\3\5\5\5\u00d8\n\5\5\5\u00da\n\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00fd\n\17\3"+
		"\17\3\17\3\17\3\17\7\17\u0103\n\17\f\17\16\17\u0106\13\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0112\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011d\n\21\3\22\3\22\5\22\u0121\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012a\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u0132\n\24\f\24\16\24\u0135\13\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0148\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0152\n"+
		"\31\f\31\16\31\u0155\13\31\3\32\3\32\5\32\u0159\n\32\3\33\3\33\3\33\3"+
		"\33\5\33\u015f\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0167\n\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0170\n\36\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0187\n \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u019f\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u01b7\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01d5\n$\3%\3%\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01ec\n&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u0204\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\5(\u021c\n(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u023a\n*\3+\3+\3,\3,\3"+
		",\3,\5,\u0242\n,\3-\3-\3-\3-\3-\3-\7-\u024a\n-\f-\16-\u024d\13-\3.\3."+
		"\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0259\n\60\f\60\16\60\u025c"+
		"\13\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0269"+
		"\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0276"+
		"\n\62\f\62\16\62\u0279\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\5\63\u0285\n\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u0292\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\7\65\u029f\n\65\f\65\16\65\u02a2\13\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02af\n\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u02b9\n\67\38\38\38\38\38\38\38\38\58\u02c3"+
		"\n8\39\39\39\39\39\39\39\39\59\u02cd\n9\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02d7"+
		"\n:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02e1\n;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>"+
		"\3>\3>\3>\3?\3?\3?\5?\u02f3\n?\3?\3?\3?\3?\5?\u02f9\n?\7?\u02fb\n?\f?"+
		"\16?\u02fe\13?\3@\3@\3@\3@\5@\u0304\n@\3@\3@\3@\3@\3@\3@\5@\u030c\n@\3"+
		"@\3@\5@\u0310\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u032c\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\7A\u0343\nA\fA\16A\u0346\13A\3B\3B\3B"+
		"\5B\u034b\nB\3C\3C\3C\3C\3C\3C\5C\u0353\nC\3C\3C\3C\3C\3C\3C\7C\u035b"+
		"\nC\fC\16C\u035e\13C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u036e"+
		"\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u037c\nD\fD\16D\u037f\13D\3"+
		"E\3E\3E\3E\3E\3E\5E\u0387\nE\3E\3E\3E\3E\3E\3E\7E\u038f\nE\fE\16E\u0392"+
		"\13E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5"+
		"F\u03a9\nF\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03b3\nG\3H\3H\3H\5H\u03b8\nH\3"+
		"I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\5J\u03d6\nJ\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\7J\u03f3\nJ\fJ\16J\u03f6\13J\3K"+
		"\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\6T\u040d"+
		"\nT\rT\16T\u040e\3T\3T\7T\u0413\nT\fT\16T\u0416\13T\3T\5T\u0419\nT\3T"+
		"\3T\3T\3T\7T\u041f\nT\fT\16T\u0422\13T\3U\3U\3V\3V\3V\2\21\4\34&\60X^"+
		"bh|\u0080\u0084\u0086\u0088\u0092\u00a6W\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\2\r\3\2\20\21\3"+
		"\2%*\3\2\31\33\3\2\27\30\3\2 #\3\2\36\37\4\2..\63\63\3\2/\60\3\2,-\3\2"+
		"\61\62\3\2\25\26\2\u0482\2\u00ac\3\2\2\2\4\u00b3\3\2\2\2\6\u00c8\3\2\2"+
		"\2\b\u00d9\3\2\2\2\n\u00db\3\2\2\2\f\u00df\3\2\2\2\16\u00e3\3\2\2\2\20"+
		"\u00e5\3\2\2\2\22\u00e7\3\2\2\2\24\u00ea\3\2\2\2\26\u00ef\3\2\2\2\30\u00f1"+
		"\3\2\2\2\32\u00f5\3\2\2\2\34\u00fc\3\2\2\2\36\u0111\3\2\2\2 \u011c\3\2"+
		"\2\2\"\u0120\3\2\2\2$\u0129\3\2\2\2&\u012b\3\2\2\2(\u0136\3\2\2\2*\u0138"+
		"\3\2\2\2,\u0147\3\2\2\2.\u0149\3\2\2\2\60\u014b\3\2\2\2\62\u0158\3\2\2"+
		"\2\64\u015e\3\2\2\2\66\u0160\3\2\2\28\u0168\3\2\2\2:\u016f\3\2\2\2<\u0171"+
		"\3\2\2\2>\u0186\3\2\2\2@\u019e\3\2\2\2B\u01b6\3\2\2\2D\u01b8\3\2\2\2F"+
		"\u01d4\3\2\2\2H\u01d6\3\2\2\2J\u01eb\3\2\2\2L\u0203\3\2\2\2N\u021b\3\2"+
		"\2\2P\u021d\3\2\2\2R\u0239\3\2\2\2T\u023b\3\2\2\2V\u0241\3\2\2\2X\u0243"+
		"\3\2\2\2Z\u024e\3\2\2\2\\\u0250\3\2\2\2^\u0252\3\2\2\2`\u025d\3\2\2\2"+
		"b\u0268\3\2\2\2d\u0284\3\2\2\2f\u0286\3\2\2\2h\u0291\3\2\2\2j\u02ae\3"+
		"\2\2\2l\u02b8\3\2\2\2n\u02c2\3\2\2\2p\u02cc\3\2\2\2r\u02d6\3\2\2\2t\u02e0"+
		"\3\2\2\2v\u02e2\3\2\2\2x\u02e7\3\2\2\2z\u02eb\3\2\2\2|\u02ef\3\2\2\2~"+
		"\u030f\3\2\2\2\u0080\u032b\3\2\2\2\u0082\u034a\3\2\2\2\u0084\u0352\3\2"+
		"\2\2\u0086\u036d\3\2\2\2\u0088\u0386\3\2\2\2\u008a\u03a8\3\2\2\2\u008c"+
		"\u03b2\3\2\2\2\u008e\u03b7\3\2\2\2\u0090\u03b9\3\2\2\2\u0092\u03d5\3\2"+
		"\2\2\u0094\u03f7\3\2\2\2\u0096\u03f9\3\2\2\2\u0098\u03fb\3\2\2\2\u009a"+
		"\u03fd\3\2\2\2\u009c\u03ff\3\2\2\2\u009e\u0401\3\2\2\2\u00a0\u0403\3\2"+
		"\2\2\u00a2\u0405\3\2\2\2\u00a4\u0407\3\2\2\2\u00a6\u0418\3\2\2\2\u00a8"+
		"\u0423\3\2\2\2\u00aa\u0425\3\2\2\2\u00ac\u00ad\5\4\3\2\u00ad\3\3\2\2\2"+
		"\u00ae\u00af\b\3\1\2\u00af\u00b0\5\6\4\2\u00b0\u00b1\5\u00a6T\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b4\5\u00a6T\2\u00b3\u00ae\3\2\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00bb\3\2\2\2\u00b5\u00b6\f\4\2\2\u00b6\u00b7\5\6\4\2\u00b7"+
		"\u00b8\5\u00a6T\2\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\5\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c9\5\30\r\2\u00bf\u00c9\5\20\t\2\u00c0\u00c9\5"+
		"\22\n\2\u00c1\u00c9\5@!\2\u00c2\u00c9\5B\"\2\u00c3\u00c9\5\u0092J\2\u00c4"+
		"\u00c9\5D#\2\u00c5\u00c9\5F$\2\u00c6\u00c9\5\24\13\2\u00c7\u00c9\5\b\5"+
		"\2\u00c8\u00be\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c1"+
		"\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8"+
		"\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\7\3\2\2\2"+
		"\u00ca\u00cd\5\u00a0Q\2\u00cb\u00cd\5\20\t\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00d0\5\b\5\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00da\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\7\35\2\2\u00d5\u00d8\5"+
		"\u00a0Q\2\u00d6\u00d8\5\20\t\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2"+
		"\u00d8\u00da\3\2\2\2\u00d9\u00cc\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da\t\3"+
		"\2\2\2\u00db\u00dc\5\u0090I\2\u00dc\u00dd\7$\2\2\u00dd\u00de\5\u00a2R"+
		"\2\u00de\13\3\2\2\2\u00df\u00e0\5\u00a2R\2\u00e0\u00e1\7$\2\2\u00e1\u00e2"+
		"\5:\36\2\u00e2\r\3\2\2\2\u00e3\u00e4\5\u00a2R\2\u00e4\17\3\2\2\2\u00e5"+
		"\u00e6\5,\27\2\u00e6\21\3\2\2\2\u00e7\u00e8\7\7\2\2\u00e8\u00e9\5\u0096"+
		"L\2\u00e9\23\3\2\2\2\u00ea\u00eb\7\13\2\2\u00eb\u00ec\5\u00aaV\2\u00ec"+
		"\u00ed\5\26\f\2\u00ed\u00ee\7\b\2\2\u00ee\25\3\2\2\2\u00ef\u00f0\5\4\3"+
		"\2\u00f0\27\3\2\2\2\u00f1\u00f2\5 \21\2\u00f2\u00f3\5\32\16\2\u00f3\u00f4"+
		"\7\b\2\2\u00f4\31\3\2\2\2\u00f5\u00f6\5\34\17\2\u00f6\33\3\2\2\2\u00f7"+
		"\u00f8\b\17\1\2\u00f8\u00f9\5\36\20\2\u00f9\u00fa\5\u00a6T\2\u00fa\u00fd"+
		"\3\2\2\2\u00fb\u00fd\5\u00a6T\2\u00fc\u00f7\3\2\2\2\u00fc\u00fb\3\2\2"+
		"\2\u00fd\u0104\3\2\2\2\u00fe\u00ff\f\4\2\2\u00ff\u0100\5\36\20\2\u0100"+
		"\u0101\5\u00a6T\2\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\35\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0112\5\20\t\2\u0108\u0112\5\22\n\2\u0109\u0112\5"+
		"L\'\2\u010a\u0112\5N(\2\u010b\u0112\5\u0092J\2\u010c\u0112\5P)\2\u010d"+
		"\u0112\5R*\2\u010e\u0112\5\24\13\2\u010f\u0112\5*\26\2\u0110\u0112\5\b"+
		"\5\2\u0111\u0107\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u0109\3\2\2\2\u0111"+
		"\u010a\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u010d\3\2"+
		"\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\37\3\2\2\2\u0113\u0114\7\t\2\2\u0114\u0115\5\"\22\2\u0115\u0116\5\u00aa"+
		"V\2\u0116\u011d\3\2\2\2\u0117\u0118\7\t\2\2\u0118\u0119\5\"\22\2\u0119"+
		"\u011a\5$\23\2\u011a\u011b\5\u00aaV\2\u011b\u011d\3\2\2\2\u011c\u0113"+
		"\3\2\2\2\u011c\u0117\3\2\2\2\u011d!\3\2\2\2\u011e\u0121\5\u00a4S\2\u011f"+
		"\u0121\5\u00a0Q\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121#\3\2\2"+
		"\2\u0122\u0123\7\64\2\2\u0123\u012a\7\65\2\2\u0124\u0125\7\64\2\2\u0125"+
		"\u0126\5&\24\2\u0126\u0127\7\65\2\2\u0127\u012a\3\2\2\2\u0128\u012a\5"+
		"&\24\2\u0129\u0122\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"%\3\2\2\2\u012b\u012c\b\24\1\2\u012c\u012d\5(\25\2\u012d\u0133\3\2\2\2"+
		"\u012e\u012f\f\3\2\2\u012f\u0130\7\4\2\2\u0130\u0132\5(\25\2\u0131\u012e"+
		"\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\'\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\5\u00a0Q\2\u0137)\3\2\2\2\u0138"+
		"\u0139\7\n\2\2\u0139\u013a\5:\36\2\u013a+\3\2\2\2\u013b\u013c\5\"\22\2"+
		"\u013c\u013d\7\64\2\2\u013d\u013e\5.\30\2\u013e\u013f\7\65\2\2\u013f\u0148"+
		"\3\2\2\2\u0140\u0141\5\"\22\2\u0141\u0142\5.\30\2\u0142\u0148\3\2\2\2"+
		"\u0143\u0144\5\"\22\2\u0144\u0145\7\64\2\2\u0145\u0146\7\65\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u013b\3\2\2\2\u0147\u0140\3\2\2\2\u0147\u0143\3\2"+
		"\2\2\u0148-\3\2\2\2\u0149\u014a\5\60\31\2\u014a/\3\2\2\2\u014b\u014c\b"+
		"\31\1\2\u014c\u014d\5\62\32\2\u014d\u0153\3\2\2\2\u014e\u014f\f\3\2\2"+
		"\u014f\u0150\7\4\2\2\u0150\u0152\5\62\32\2\u0151\u014e\3\2\2\2\u0152\u0155"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\61\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0159\5\64\33\2\u0157\u0159\5\66\34\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0157\3\2\2\2\u0159\63\3\2\2\2\u015a\u015f\5\u0084C\2\u015b"+
		"\u015f\5\u0086D\2\u015c\u015f\5\u0088E\2\u015d\u015f\5\u0080A\2\u015e"+
		"\u015a\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2"+
		"\2\2\u015f\65\3\2\2\2\u0160\u0161\5\u00a0Q\2\u0161\u0166\7$\2\2\u0162"+
		"\u0167\5\u0084C\2\u0163\u0167\5\u0086D\2\u0164\u0167\5\u0088E\2\u0165"+
		"\u0167\5\u0080A\2\u0166\u0162\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0165\3\2\2\2\u0167\67\3\2\2\2\u0168\u0169\5,\27\2\u0169"+
		"9\3\2\2\2\u016a\u0170\5\u0084C\2\u016b\u0170\5\u0086D\2\u016c\u0170\5"+
		"\u0088E\2\u016d\u0170\5\u0080A\2\u016e\u0170\5\16\b\2\u016f\u016a\3\2"+
		"\2\2\u016f\u016b\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
		"\u016e\3\2\2\2\u0170;\3\2\2\2\u0171\u0172\5> \2\u0172=\3\2\2\2\u0173\u0174"+
		"\7\16\2\2\u0174\u0175\5Z.\2\u0175\u0176\5\u00aaV\2\u0176\u0177\5`\61\2"+
		"\u0177\u0187\3\2\2\2\u0178\u0179\7\16\2\2\u0179\u017a\5Z.\2\u017a\u017b"+
		"\5\u00aaV\2\u017b\u017c\5`\61\2\u017c\u017d\5\u00a8U\2\u017d\u017e\5\u00aa"+
		"V\2\u017e\u017f\5`\61\2\u017f\u0187\3\2\2\2\u0180\u0181\7\16\2\2\u0181"+
		"\u0182\5Z.\2\u0182\u0183\5\u00aaV\2\u0183\u0184\5`\61\2\u0184\u0185\5"+
		"> \2\u0185\u0187\3\2\2\2\u0186\u0173\3\2\2\2\u0186\u0178\3\2\2\2\u0186"+
		"\u0180\3\2\2\2\u0187?\3\2\2\2\u0188\u0189\7\f\2\2\u0189\u018a\5Z.\2\u018a"+
		"\u018b\5\u00aaV\2\u018b\u018c\5`\61\2\u018c\u018d\7\b\2\2\u018d\u019f"+
		"\3\2\2\2\u018e\u018f\7\f\2\2\u018f\u0190\5Z.\2\u0190\u0191\5\u00aaV\2"+
		"\u0191\u0192\5`\61\2\u0192\u0193\5\u00a8U\2\u0193\u0194\5\u00aaV\2\u0194"+
		"\u0195\5`\61\2\u0195\u0196\7\b\2\2\u0196\u019f\3\2\2\2\u0197\u0198\7\f"+
		"\2\2\u0198\u0199\5Z.\2\u0199\u019a\5\u00aaV\2\u019a\u019b\5`\61\2\u019b"+
		"\u019c\5<\37\2\u019c\u019d\7\b\2\2\u019d\u019f\3\2\2\2\u019e\u0188\3\2"+
		"\2\2\u019e\u018e\3\2\2\2\u019e\u0197\3\2\2\2\u019fA\3\2\2\2\u01a0\u01a1"+
		"\7\17\2\2\u01a1\u01a2\5Z.\2\u01a2\u01a3\5\u00aaV\2\u01a3\u01a4\5`\61\2"+
		"\u01a4\u01a5\7\b\2\2\u01a5\u01b7\3\2\2\2\u01a6\u01a7\7\17\2\2\u01a7\u01a8"+
		"\5Z.\2\u01a8\u01a9\5\u00aaV\2\u01a9\u01aa\5`\61\2\u01aa\u01ab\5\u00a8"+
		"U\2\u01ab\u01ac\5\u00aaV\2\u01ac\u01ad\5`\61\2\u01ad\u01ae\7\b\2\2\u01ae"+
		"\u01b7\3\2\2\2\u01af\u01b0\7\17\2\2\u01b0\u01b1\5Z.\2\u01b1\u01b2\5\u00aa"+
		"V\2\u01b2\u01b3\5`\61\2\u01b3\u01b4\5<\37\2\u01b4\u01b5\7\b\2\2\u01b5"+
		"\u01b7\3\2\2\2\u01b6\u01a0\3\2\2\2\u01b6\u01a6\3\2\2\2\u01b6\u01af\3\2"+
		"\2\2\u01b7C\3\2\2\2\u01b8\u01b9\t\2\2\2\u01b9\u01ba\5Z.\2\u01ba\u01bb"+
		"\5\u00aaV\2\u01bb\u01bc\5`\61\2\u01bc\u01bd\7\b\2\2\u01bdE\3\2\2\2\u01be"+
		"\u01bf\7\24\2\2\u01bf\u01c0\7\64\2\2\u01c0\u01c1\5T+\2\u01c1\u01c2\7\5"+
		"\2\2\u01c2\u01c3\5Z.\2\u01c3\u01c4\7\5\2\2\u01c4\u01c5\5\\/\2\u01c5\u01c6"+
		"\7\65\2\2\u01c6\u01c7\5\u00aaV\2\u01c7\u01c8\5`\61\2\u01c8\u01c9\7\b\2"+
		"\2\u01c9\u01d5\3\2\2\2\u01ca\u01cb\7\24\2\2\u01cb\u01cc\5T+\2\u01cc\u01cd"+
		"\7\5\2\2\u01cd\u01ce\5Z.\2\u01ce\u01cf\7\5\2\2\u01cf\u01d0\5\\/\2\u01d0"+
		"\u01d1\5\u00aaV\2\u01d1\u01d2\5`\61\2\u01d2\u01d3\7\b\2\2\u01d3\u01d5"+
		"\3\2\2\2\u01d4\u01be\3\2\2\2\u01d4\u01ca\3\2\2\2\u01d5G\3\2\2\2\u01d6"+
		"\u01d7\5J&\2\u01d7I\3\2\2\2\u01d8\u01d9\7\16\2\2\u01d9\u01da\5Z.\2\u01da"+
		"\u01db\5\u00aaV\2\u01db\u01dc\5f\64\2\u01dc\u01ec\3\2\2\2\u01dd\u01de"+
		"\7\16\2\2\u01de\u01df\5Z.\2\u01df\u01e0\5\u00aaV\2\u01e0\u01e1\5f\64\2"+
		"\u01e1\u01e2\5\u00a8U\2\u01e2\u01e3\5\u00aaV\2\u01e3\u01e4\5f\64\2\u01e4"+
		"\u01ec\3\2\2\2\u01e5\u01e6\7\16\2\2\u01e6\u01e7\5Z.\2\u01e7\u01e8\5\u00aa"+
		"V\2\u01e8\u01e9\5f\64\2\u01e9\u01ea\5J&\2\u01ea\u01ec\3\2\2\2\u01eb\u01d8"+
		"\3\2\2\2\u01eb\u01dd\3\2\2\2\u01eb\u01e5\3\2\2\2\u01ecK\3\2\2\2\u01ed"+
		"\u01ee\7\f\2\2\u01ee\u01ef\5Z.\2\u01ef\u01f0\5\u00aaV\2\u01f0\u01f1\5"+
		"f\64\2\u01f1\u01f2\7\b\2\2\u01f2\u0204\3\2\2\2\u01f3\u01f4\7\f\2\2\u01f4"+
		"\u01f5\5Z.\2\u01f5\u01f6\5\u00aaV\2\u01f6\u01f7\5f\64\2\u01f7\u01f8\5"+
		"\u00a8U\2\u01f8\u01f9\5\u00aaV\2\u01f9\u01fa\5f\64\2\u01fa\u01fb\7\b\2"+
		"\2\u01fb\u0204\3\2\2\2\u01fc\u01fd\7\f\2\2\u01fd\u01fe\5Z.\2\u01fe\u01ff"+
		"\5\u00aaV\2\u01ff\u0200\5f\64\2\u0200\u0201\5H%\2\u0201\u0202\7\b\2\2"+
		"\u0202\u0204\3\2\2\2\u0203\u01ed\3\2\2\2\u0203\u01f3\3\2\2\2\u0203\u01fc"+
		"\3\2\2\2\u0204M\3\2\2\2\u0205\u0206\7\17\2\2\u0206\u0207\5Z.\2\u0207\u0208"+
		"\5\u00aaV\2\u0208\u0209\5f\64\2\u0209\u020a\7\b\2\2\u020a\u021c\3\2\2"+
		"\2\u020b\u020c\7\17\2\2\u020c\u020d\5Z.\2\u020d\u020e\5\u00aaV\2\u020e"+
		"\u020f\5f\64\2\u020f\u0210\5\u00a8U\2\u0210\u0211\5\u00aaV\2\u0211\u0212"+
		"\5f\64\2\u0212\u0213\7\b\2\2\u0213\u021c\3\2\2\2\u0214\u0215\7\17\2\2"+
		"\u0215\u0216\5Z.\2\u0216\u0217\5\u00aaV\2\u0217\u0218\5f\64\2\u0218\u0219"+
		"\5H%\2\u0219\u021a\7\b\2\2\u021a\u021c\3\2\2\2\u021b\u0205\3\2\2\2\u021b"+
		"\u020b\3\2\2\2\u021b\u0214\3\2\2\2\u021cO\3\2\2\2\u021d\u021e\t\2\2\2"+
		"\u021e\u021f\5Z.\2\u021f\u0220\5\u00aaV\2\u0220\u0221\5f\64\2\u0221\u0222"+
		"\7\b\2\2\u0222Q\3\2\2\2\u0223\u0224\7\24\2\2\u0224\u0225\7\64\2\2\u0225"+
		"\u0226\5T+\2\u0226\u0227\7\5\2\2\u0227\u0228\5Z.\2\u0228\u0229\7\5\2\2"+
		"\u0229\u022a\5\\/\2\u022a\u022b\7\65\2\2\u022b\u022c\5\u00aaV\2\u022c"+
		"\u022d\5f\64\2\u022d\u022e\7\b\2\2\u022e\u023a\3\2\2\2\u022f\u0230\7\24"+
		"\2\2\u0230\u0231\5T+\2\u0231\u0232\7\5\2\2\u0232\u0233\5Z.\2\u0233\u0234"+
		"\7\5\2\2\u0234\u0235\5\\/\2\u0235\u0236\5\u00aaV\2\u0236\u0237\5f\64\2"+
		"\u0237\u0238\7\b\2\2\u0238\u023a\3\2\2\2\u0239\u0223\3\2\2\2\u0239\u022f"+
		"\3\2\2\2\u023aS\3\2\2\2\u023b\u023c\5X-\2\u023cU\3\2\2\2\u023d\u0242\5"+
		"p9\2\u023e\u0242\5r:\2\u023f\u0242\5t;\2\u0240\u0242\5n8\2\u0241\u023d"+
		"\3\2\2\2\u0241\u023e\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0240\3\2\2\2\u0242"+
		"W\3\2\2\2\u0243\u0244\b-\1\2\u0244\u0245\5V,\2\u0245\u024b\3\2\2\2\u0246"+
		"\u0247\f\4\2\2\u0247\u0248\7\4\2\2\u0248\u024a\5V,\2\u0249\u0246\3\2\2"+
		"\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024cY"+
		"\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u024f\5\u008aF\2\u024f[\3\2\2\2\u0250"+
		"\u0251\5^\60\2\u0251]\3\2\2\2\u0252\u0253\b\60\1\2\u0253\u0254\5V,\2\u0254"+
		"\u025a\3\2\2\2\u0255\u0256\f\4\2\2\u0256\u0257\7\4\2\2\u0257\u0259\5V"+
		",\2\u0258\u0255\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b_\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u025e\5b\62\2"+
		"\u025ea\3\2\2\2\u025f\u0260\b\62\1\2\u0260\u0261\5d\63\2\u0261\u0262\5"+
		"\u00a6T\2\u0262\u0269\3\2\2\2\u0263\u0264\7\22\2\2\u0264\u0269\5\u00a6"+
		"T\2\u0265\u0266\5\u0094K\2\u0266\u0267\5\u00a6T\2\u0267\u0269\3\2\2\2"+
		"\u0268\u025f\3\2\2\2\u0268\u0263\3\2\2\2\u0268\u0265\3\2\2\2\u0269\u0277"+
		"\3\2\2\2\u026a\u026b\f\5\2\2\u026b\u026c\5d\63\2\u026c\u026d\5\u00a6T"+
		"\2\u026d\u0276\3\2\2\2\u026e\u026f\f\4\2\2\u026f\u0270\7\22\2\2\u0270"+
		"\u0276\5\u00a6T\2\u0271\u0272\f\3\2\2\u0272\u0273\5\u0094K\2\u0273\u0274"+
		"\5\u00a6T\2\u0274\u0276\3\2\2\2\u0275\u026a\3\2\2\2\u0275\u026e\3\2\2"+
		"\2\u0275\u0271\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278c\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u0285\3\2\2\2\u027b"+
		"\u0285\5\20\t\2\u027c\u0285\5\22\n\2\u027d\u0285\5@!\2\u027e\u0285\5B"+
		"\"\2\u027f\u0285\5\u0092J\2\u0280\u0285\5D#\2\u0281\u0285\5F$\2\u0282"+
		"\u0285\5\24\13\2\u0283\u0285\5\b\5\2\u0284\u027a\3\2\2\2\u0284\u027b\3"+
		"\2\2\2\u0284\u027c\3\2\2\2\u0284\u027d\3\2\2\2\u0284\u027e\3\2\2\2\u0284"+
		"\u027f\3\2\2\2\u0284\u0280\3\2\2\2\u0284\u0281\3\2\2\2\u0284\u0282\3\2"+
		"\2\2\u0284\u0283\3\2\2\2\u0285e\3\2\2\2\u0286\u0287\5h\65\2\u0287g\3\2"+
		"\2\2\u0288\u0289\b\65\1\2\u0289\u028a\5j\66\2\u028a\u028b\5\u00a6T\2\u028b"+
		"\u0292\3\2\2\2\u028c\u028d\7\22\2\2\u028d\u0292\5\u00a6T\2\u028e\u028f"+
		"\5\u0094K\2\u028f\u0290\5\u00a6T\2\u0290\u0292\3\2\2\2\u0291\u0288\3\2"+
		"\2\2\u0291\u028c\3\2\2\2\u0291\u028e\3\2\2\2\u0292\u02a0\3\2\2\2\u0293"+
		"\u0294\f\5\2\2\u0294\u0295\5j\66\2\u0295\u0296\5\u00a6T\2\u0296\u029f"+
		"\3\2\2\2\u0297\u0298\f\4\2\2\u0298\u0299\7\22\2\2\u0299\u029f\5\u00a6"+
		"T\2\u029a\u029b\f\3\2\2\u029b\u029c\5\u0094K\2\u029c\u029d\5\u00a6T\2"+
		"\u029d\u029f\3\2\2\2\u029e\u0293\3\2\2\2\u029e\u0297\3\2\2\2\u029e\u029a"+
		"\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"i\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02af\3\2\2\2\u02a4\u02af\5\20\t\2"+
		"\u02a5\u02af\5\22\n\2\u02a6\u02af\5L\'\2\u02a7\u02af\5N(\2\u02a8\u02af"+
		"\5\u0092J\2\u02a9\u02af\5P)\2\u02aa\u02af\5R*\2\u02ab\u02af\5\24\13\2"+
		"\u02ac\u02af\5*\26\2\u02ad\u02af\5\b\5\2\u02ae\u02a3\3\2\2\2\u02ae\u02a4"+
		"\3\2\2\2\u02ae\u02a5\3\2\2\2\u02ae\u02a6\3\2\2\2\u02ae\u02a7\3\2\2\2\u02ae"+
		"\u02a8\3\2\2\2\u02ae\u02a9\3\2\2\2\u02ae\u02aa\3\2\2\2\u02ae\u02ab\3\2"+
		"\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02afk\3\2\2\2\u02b0\u02b1"+
		"\5\u0090I\2\u02b1\u02b2\7$\2\2\u02b2\u02b3\5\u0092J\2\u02b3\u02b9\3\2"+
		"\2\2\u02b4\u02b5\5\u0090I\2\u02b5\u02b6\t\3\2\2\u02b6\u02b7\5\u0092J\2"+
		"\u02b7\u02b9\3\2\2\2\u02b8\u02b0\3\2\2\2\u02b8\u02b4\3\2\2\2\u02b9m\3"+
		"\2\2\2\u02ba\u02bb\5\u0090I\2\u02bb\u02bc\7$\2\2\u02bc\u02bd\5\u0080A"+
		"\2\u02bd\u02c3\3\2\2\2\u02be\u02bf\5\u0090I\2\u02bf\u02c0\t\3\2\2\u02c0"+
		"\u02c1\5\u0080A\2\u02c1\u02c3\3\2\2\2\u02c2\u02ba\3\2\2\2\u02c2\u02be"+
		"\3\2\2\2\u02c3o\3\2\2\2\u02c4\u02c5\5\u0090I\2\u02c5\u02c6\7$\2\2\u02c6"+
		"\u02c7\5\u0084C\2\u02c7\u02cd\3\2\2\2\u02c8\u02c9\5\u0090I\2\u02c9\u02ca"+
		"\t\3\2\2\u02ca\u02cb\5\u0084C\2\u02cb\u02cd\3\2\2\2\u02cc\u02c4\3\2\2"+
		"\2\u02cc\u02c8\3\2\2\2\u02cdq\3\2\2\2\u02ce\u02cf\5\u0090I\2\u02cf\u02d0"+
		"\7$\2\2\u02d0\u02d1\5\u0086D\2\u02d1\u02d7\3\2\2\2\u02d2\u02d3\5\u0090"+
		"I\2\u02d3\u02d4\t\3\2\2\u02d4\u02d5\5\u0086D\2\u02d5\u02d7\3\2\2\2\u02d6"+
		"\u02ce\3\2\2\2\u02d6\u02d2\3\2\2\2\u02d7s\3\2\2\2\u02d8\u02d9\5\u0090"+
		"I\2\u02d9\u02da\7$\2\2\u02da\u02db\5\u0088E\2\u02db\u02e1\3\2\2\2\u02dc"+
		"\u02dd\5\u0090I\2\u02dd\u02de\7%\2\2\u02de\u02df\5\u0088E\2\u02df\u02e1"+
		"\3\2\2\2\u02e0\u02d8\3\2\2\2\u02e0\u02dc\3\2\2\2\u02e1u\3\2\2\2\u02e2"+
		"\u02e3\5\u0090I\2\u02e3\u02e4\7$\2\2\u02e4\u02e5\7\66\2\2\u02e5\u02e6"+
		"\7\67\2\2\u02e6w\3\2\2\2\u02e7\u02e8\5~@\2\u02e8\u02e9\7$\2\2\u02e9\u02ea"+
		"\5:\36\2\u02eay\3\2\2\2\u02eb\u02ec\7\66\2\2\u02ec\u02ed\5|?\2\u02ed\u02ee"+
		"\7\67\2\2\u02ee{\3\2\2\2\u02ef\u02f2\b?\1\2\u02f0\u02f3\5\u0084C\2\u02f1"+
		"\u02f3\5\u0080A\2\u02f2\u02f0\3\2\2\2\u02f2\u02f1\3\2\2\2\u02f3\u02fc"+
		"\3\2\2\2\u02f4\u02f5\f\3\2\2\u02f5\u02f8\7\4\2\2\u02f6\u02f9\5\u0084C"+
		"\2\u02f7\u02f9\5\u0080A\2\u02f8\u02f6\3\2\2\2\u02f8\u02f7\3\2\2\2\u02f9"+
		"\u02fb\3\2\2\2\u02fa\u02f4\3\2\2\2\u02fb\u02fe\3\2\2\2\u02fc\u02fa\3\2"+
		"\2\2\u02fc\u02fd\3\2\2\2\u02fd}\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0300"+
		"\5\u00a0Q\2\u0300\u0303\7\66\2\2\u0301\u0304\5\u0084C\2\u0302\u0304\5"+
		"\u0080A\2\u0303\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u0305\3\2\2\2"+
		"\u0305\u0306\7\67\2\2\u0306\u0310\3\2\2\2\u0307\u0308\5\u00a2R\2\u0308"+
		"\u030b\7\66\2\2\u0309\u030c\5\u0084C\2\u030a\u030c\5\u0080A\2\u030b\u0309"+
		"\3\2\2\2\u030b\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\7\67\2\2"+
		"\u030e\u0310\3\2\2\2\u030f\u02ff\3\2\2\2\u030f\u0307\3\2\2\2\u0310\177"+
		"\3\2\2\2\u0311\u0312\bA\1\2\u0312\u0313\5\u0084C\2\u0313\u0314\t\4\2\2"+
		"\u0314\u0315\5\u0080A\17\u0315\u032c\3\2\2\2\u0316\u0317\5\u0086D\2\u0317"+
		"\u0318\t\4\2\2\u0318\u0319\5\u0080A\r\u0319\u032c\3\2\2\2\u031a\u031b"+
		"\5\u0088E\2\u031b\u031c\7\31\2\2\u031c\u031d\5\u0080A\n\u031d\u032c\3"+
		"\2\2\2\u031e\u031f\5\u0084C\2\u031f\u0320\t\5\2\2\u0320\u0321\5\u0080"+
		"A\b\u0321\u032c\3\2\2\2\u0322\u0323\5\u0086D\2\u0323\u0324\t\5\2\2\u0324"+
		"\u0325\5\u0080A\6\u0325\u032c\3\2\2\2\u0326\u0327\7\64\2\2\u0327\u0328"+
		"\5\u0080A\2\u0328\u0329\7\65\2\2\u0329\u032c\3\2\2\2\u032a\u032c\5\u0082"+
		"B\2\u032b\u0311\3\2\2\2\u032b\u0316\3\2\2\2\u032b\u031a\3\2\2\2\u032b"+
		"\u031e\3\2\2\2\u032b\u0322\3\2\2\2\u032b\u0326\3\2\2\2\u032b\u032a\3\2"+
		"\2\2\u032c\u0344\3\2\2\2\u032d\u032e\f\f\2\2\u032e\u032f\t\4\2\2\u032f"+
		"\u0343\5\u0080A\r\u0330\u0331\f\5\2\2\u0331\u0332\t\5\2\2\u0332\u0343"+
		"\5\u0080A\6\u0333\u0334\f\20\2\2\u0334\u0335\t\4\2\2\u0335\u0343\5\u0084"+
		"C\2\u0336\u0337\f\16\2\2\u0337\u0338\t\4\2\2\u0338\u0343\5\u0086D\2\u0339"+
		"\u033a\f\13\2\2\u033a\u033b\7\31\2\2\u033b\u0343\5\u0088E\2\u033c\u033d"+
		"\f\t\2\2\u033d\u033e\t\5\2\2\u033e\u0343\5\u0084C\2\u033f\u0340\f\7\2"+
		"\2\u0340\u0341\t\5\2\2\u0341\u0343\5\u0086D\2\u0342\u032d\3\2\2\2\u0342"+
		"\u0330\3\2\2\2\u0342\u0333\3\2\2\2\u0342\u0336\3\2\2\2\u0342\u0339\3\2"+
		"\2\2\u0342\u033c\3\2\2\2\u0342\u033f\3\2\2\2\u0343\u0346\3\2\2\2\u0344"+
		"\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0081\3\2\2\2\u0346\u0344\3\2"+
		"\2\2\u0347\u034b\5\u00a0Q\2\u0348\u034b\58\35\2\u0349\u034b\5~@\2\u034a"+
		"\u0347\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034b\u0083\3\2"+
		"\2\2\u034c\u034d\bC\1\2\u034d\u034e\7\64\2\2\u034e\u034f\5\u0084C\2\u034f"+
		"\u0350\7\65\2\2\u0350\u0353\3\2\2\2\u0351\u0353\5\u009aN\2\u0352\u034c"+
		"\3\2\2\2\u0352\u0351\3\2\2\2\u0353\u035c\3\2\2\2\u0354\u0355\f\6\2\2\u0355"+
		"\u0356\t\4\2\2\u0356\u035b\5\u0084C\7\u0357\u0358\f\5\2\2\u0358\u0359"+
		"\t\5\2\2\u0359\u035b\5\u0084C\6\u035a\u0354\3\2\2\2\u035a\u0357\3\2\2"+
		"\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0085"+
		"\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0360\bD\1\2\u0360\u0361\5\u0084C\2"+
		"\u0361\u0362\t\4\2\2\u0362\u0363\5\u0086D\t\u0363\u036e\3\2\2\2\u0364"+
		"\u0365\5\u0084C\2\u0365\u0366\t\5\2\2\u0366\u0367\5\u0086D\6\u0367\u036e"+
		"\3\2\2\2\u0368\u0369\7\64\2\2\u0369\u036a\5\u0086D\2\u036a\u036b\7\65"+
		"\2\2\u036b\u036e\3\2\2\2\u036c\u036e\5\u0098M\2\u036d\u035f\3\2\2\2\u036d"+
		"\u0364\3\2\2\2\u036d\u0368\3\2\2\2\u036d\u036c\3\2\2\2\u036e\u037d\3\2"+
		"\2\2\u036f\u0370\f\n\2\2\u0370\u0371\t\4\2\2\u0371\u037c\5\u0086D\13\u0372"+
		"\u0373\f\7\2\2\u0373\u0374\t\5\2\2\u0374\u037c\5\u0086D\b\u0375\u0376"+
		"\f\b\2\2\u0376\u0377\t\4\2\2\u0377\u037c\5\u0084C\2\u0378\u0379\f\5\2"+
		"\2\u0379\u037a\t\5\2\2\u037a\u037c\5\u0084C\2\u037b\u036f\3\2\2\2\u037b"+
		"\u0372\3\2\2\2\u037b\u0375\3\2\2\2\u037b\u0378\3\2\2\2\u037c\u037f\3\2"+
		"\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0087\3\2\2\2\u037f"+
		"\u037d\3\2\2\2\u0380\u0381\bE\1\2\u0381\u0382\5\u0084C\2\u0382\u0383\7"+
		"\31\2\2\u0383\u0384\5\u0088E\5\u0384\u0387\3\2\2\2\u0385\u0387\5\u0096"+
		"L\2\u0386\u0380\3\2\2\2\u0386\u0385\3\2\2\2\u0387\u0390\3\2\2\2\u0388"+
		"\u0389\f\4\2\2\u0389\u038a\7\27\2\2\u038a\u038f\5\u0088E\5\u038b\u038c"+
		"\f\6\2\2\u038c\u038d\7\31\2\2\u038d\u038f\5\u0084C\2\u038e\u0388\3\2\2"+
		"\2\u038e\u038b\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391"+
		"\3\2\2\2\u0391\u0089\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\5\u008cG"+
		"\2\u0394\u0395\7+\2\2\u0395\u0396\5\u008aF\2\u0396\u03a9\3\2\2\2\u0397"+
		"\u0398\5\u008cG\2\u0398\u0399\7\61\2\2\u0399\u039a\5\u008aF\2\u039a\u03a9"+
		"\3\2\2\2\u039b\u039c\5\u008cG\2\u039c\u039d\7,\2\2\u039d\u039e\5\u008a"+
		"F\2\u039e\u03a9\3\2\2\2\u039f\u03a0\5\u008cG\2\u03a0\u03a1\7\62\2\2\u03a1"+
		"\u03a2\5\u008aF\2\u03a2\u03a9\3\2\2\2\u03a3\u03a4\7\64\2\2\u03a4\u03a5"+
		"\5\u008aF\2\u03a5\u03a6\7\65\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a9\5\u008c"+
		"G\2\u03a8\u0393\3\2\2\2\u03a8\u0397\3\2\2\2\u03a8\u039b\3\2\2\2\u03a8"+
		"\u039f\3\2\2\2\u03a8\u03a3\3\2\2\2\u03a8\u03a7\3\2\2\2\u03a9\u008b\3\2"+
		"\2\2\u03aa\u03ab\5\u008eH\2\u03ab\u03ac\t\6\2\2\u03ac\u03ad\5\u008eH\2"+
		"\u03ad\u03b3\3\2\2\2\u03ae\u03af\5\u008eH\2\u03af\u03b0\t\7\2\2\u03b0"+
		"\u03b1\5\u008eH\2\u03b1\u03b3\3\2\2\2\u03b2\u03aa\3\2\2\2\u03b2\u03ae"+
		"\3\2\2\2\u03b3\u008d\3\2\2\2\u03b4\u03b8\5:\36\2\u03b5\u03b8\5~@\2\u03b6"+
		"\u03b8\5\u00a0Q\2\u03b7\u03b4\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b6"+
		"\3\2\2\2\u03b8\u008f\3\2\2\2\u03b9\u03ba\5\u00a0Q\2\u03ba\u0091\3\2\2"+
		"\2\u03bb\u03bc\bJ\1\2\u03bc\u03d6\5\u0090I\2\u03bd\u03d6\5v<\2\u03be\u03d6"+
		"\5x=\2\u03bf\u03d6\5\u0084C\2\u03c0\u03d6\5\u0086D\2\u03c1\u03d6\5\u0088"+
		"E\2\u03c2\u03d6\5\f\7\2\u03c3\u03d6\5\n\6\2\u03c4\u03d6\5n8\2\u03c5\u03d6"+
		"\5t;\2\u03c6\u03d6\5r:\2\u03c7\u03d6\5p9\2\u03c8\u03d6\5l\67\2\u03c9\u03d6"+
		"\5,\27\2\u03ca\u03d6\5\u0096L\2\u03cb\u03d6\5\u009cO\2\u03cc\u03d6\5\u0098"+
		"M\2\u03cd\u03d6\5\u009aN\2\u03ce\u03d6\5\u009eP\2\u03cf\u03d0\t\b\2\2"+
		"\u03d0\u03d6\5\u0092J\f\u03d1\u03d2\7\64\2\2\u03d2\u03d3\5\u0092J\2\u03d3"+
		"\u03d4\7\65\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03bb\3\2\2\2\u03d5\u03bd\3"+
		"\2\2\2\u03d5\u03be\3\2\2\2\u03d5\u03bf\3\2\2\2\u03d5\u03c0\3\2\2\2\u03d5"+
		"\u03c1\3\2\2\2\u03d5\u03c2\3\2\2\2\u03d5\u03c3\3\2\2\2\u03d5\u03c4\3\2"+
		"\2\2\u03d5\u03c5\3\2\2\2\u03d5\u03c6\3\2\2\2\u03d5\u03c7\3\2\2\2\u03d5"+
		"\u03c8\3\2\2\2\u03d5\u03c9\3\2\2\2\u03d5\u03ca\3\2\2\2\u03d5\u03cb\3\2"+
		"\2\2\u03d5\u03cc\3\2\2\2\u03d5\u03cd\3\2\2\2\u03d5\u03ce\3\2\2\2\u03d5"+
		"\u03cf\3\2\2\2\u03d5\u03d1\3\2\2\2\u03d6\u03f4\3\2\2\2\u03d7\u03d8\f\r"+
		"\2\2\u03d8\u03d9\7\34\2\2\u03d9\u03f3\5\u0092J\16\u03da\u03db\f\13\2\2"+
		"\u03db\u03dc\t\4\2\2\u03dc\u03f3\5\u0092J\f\u03dd\u03de\f\n\2\2\u03de"+
		"\u03df\t\5\2\2\u03df\u03f3\5\u0092J\13\u03e0\u03e1\f\t\2\2\u03e1\u03e2"+
		"\t\t\2\2\u03e2\u03f3\5\u0092J\n\u03e3\u03e4\f\b\2\2\u03e4\u03e5\7+\2\2"+
		"\u03e5\u03f3\5\u0092J\t\u03e6\u03e7\f\7\2\2\u03e7\u03e8\t\n\2\2\u03e8"+
		"\u03f3\5\u0092J\b\u03e9\u03ea\f\6\2\2\u03ea\u03eb\t\6\2\2\u03eb\u03f3"+
		"\5\u0092J\7\u03ec\u03ed\f\5\2\2\u03ed\u03ee\t\7\2\2\u03ee\u03f3\5\u0092"+
		"J\6\u03ef\u03f0\f\4\2\2\u03f0\u03f1\t\13\2\2\u03f1\u03f3\5\u0092J\5\u03f2"+
		"\u03d7\3\2\2\2\u03f2\u03da\3\2\2\2\u03f2\u03dd\3\2\2\2\u03f2\u03e0\3\2"+
		"\2\2\u03f2\u03e3\3\2\2\2\u03f2\u03e6\3\2\2\2\u03f2\u03e9\3\2\2\2\u03f2"+
		"\u03ec\3\2\2\2\u03f2\u03ef\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2"+
		"\2\2\u03f4\u03f5\3\2\2\2\u03f5\u0093\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7"+
		"\u03f8\7\23\2\2\u03f8\u0095\3\2\2\2\u03f9\u03fa\7\3\2\2\u03fa\u0097\3"+
		"\2\2\2\u03fb\u03fc\7=\2\2\u03fc\u0099\3\2\2\2\u03fd\u03fe\7<\2\2\u03fe"+
		"\u009b\3\2\2\2\u03ff\u0400\t\f\2\2\u0400\u009d\3\2\2\2\u0401\u0402\78"+
		"\2\2\u0402\u009f\3\2\2\2\u0403\u0404\7>\2\2\u0404\u00a1\3\2\2\2\u0405"+
		"\u0406\7?\2\2\u0406\u00a3\3\2\2\2\u0407\u0408\7@\2\2\u0408\u00a5\3\2\2"+
		"\2\u0409\u040a\bT\1\2\u040a\u0419\7\5\2\2\u040b\u040d\5\u00aaV\2\u040c"+
		"\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2"+
		"\2\2\u040f\u0419\3\2\2\2\u0410\u0419\7\2\2\3\u0411\u0413\5\u00aaV\2\u0412"+
		"\u0411\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2"+
		"\2\2\u0415\u0417\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u0419\7\2\2\3\u0418"+
		"\u0409\3\2\2\2\u0418\u040c\3\2\2\2\u0418\u0410\3\2\2\2\u0418\u0414\3\2"+
		"\2\2\u0419\u0420\3\2\2\2\u041a\u041b\f\b\2\2\u041b\u041f\7\5\2\2\u041c"+
		"\u041d\f\7\2\2\u041d\u041f\5\u00aaV\2\u041e\u041a\3\2\2\2\u041e\u041c"+
		"\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421"+
		"\u00a7\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u0424\7\r\2\2\u0424\u00a9\3\2"+
		"\2\2\u0425\u0426\7\6\2\2\u0426\u00ab\3\2\2\2L\u00b3\u00bb\u00c8\u00cc"+
		"\u00d1\u00d7\u00d9\u00fc\u0104\u0111\u011c\u0120\u0129\u0133\u0147\u0153"+
		"\u0158\u015e\u0166\u016f\u0186\u019e\u01b6\u01d4\u01eb\u0203\u021b\u0239"+
		"\u0241\u024b\u025a\u0268\u0275\u0277\u0284\u0291\u029e\u02a0\u02ae\u02b8"+
		"\u02c2\u02cc\u02d6\u02e0\u02f2\u02f8\u02fc\u0303\u030b\u030f\u032b\u0342"+
		"\u0344\u034a\u0352\u035a\u035c\u036d\u037b\u037d\u0386\u038e\u0390\u03a8"+
		"\u03b2\u03b7\u03d5\u03f2\u03f4\u040e\u0414\u0418\u041e\u0420";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}