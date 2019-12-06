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
		PIR=9, IF=10, ELSE=11, ELSIF=12, UNLESS=13, WHILE=14, RETRY=15, BREAK=16, 
		FOR=17, TRUE=18, FALSE=19, PLUS=20, MINUS=21, MUL=22, DIV=23, MOD=24, 
		EXP=25, DOT=26, EQUAL=27, NOT_EQUAL=28, GREATER=29, LESS=30, LESS_EQUAL=31, 
		GREATER_EQUAL=32, ASSIGN=33, PLUS_ASSIGN=34, MINUS_ASSIGN=35, MUL_ASSIGN=36, 
		DIV_ASSIGN=37, MOD_ASSIGN=38, EXP_ASSIGN=39, BIT_AND=40, BIT_OR=41, BIT_XOR=42, 
		BIT_NOT=43, BIT_SHL=44, BIT_SHR=45, AND=46, OR=47, NOT=48, LEFT_RBRACKET=49, 
		RIGHT_RBRACKET=50, LEFT_SBRACKET=51, RIGHT_SBRACKET=52, NIL=53, SL_COMMENT=54, 
		ML_COMMENT=55, WS=56, INT=57, FLOAT=58, ID=59, ID_GLOBAL=60, ID_FUNCTION=61;
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
		"'pir'", "'if'", "'else'", "'elsif'", "'unless'", "'while'", "'retry'", 
		"'break'", "'for'", "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'**'", "'.'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", "'='", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'**='", "'&'", "'|'", "'^'", "'~'", "'<<'", 
		"'>>'", null, null, null, "'('", "')'", "'['", "']'", "'nil'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", "DEF", 
		"RETURN", "PIR", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "RETRY", "BREAK", 
		"FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "EXP", "DOT", 
		"EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", "GREATER_EQUAL", 
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
		public TerminalNode WHILE() { return getToken(RubyParser.WHILE, 0); }
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
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(WHILE);
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
		public Function_elsif_statementContext function_elsif_statement() {
			return getRuleContext(Function_elsif_statementContext.class,0);
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
				function_elsif_statement();
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
		public Elsif_statementContext elsif_statement() {
			return getRuleContext(Elsif_statementContext.class,0);
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
				elsif_statement();
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
		public TerminalNode WHILE() { return getToken(RubyParser.WHILE, 0); }
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
		public Function_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_while_statement; }
	}

	public final Function_while_statementContext function_while_statement() throws RecognitionException {
		Function_while_statementContext _localctx = new Function_while_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(WHILE);
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
			function_statement_expression_list();
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
		public Statement_expression_listContext statement_expression_list() {
			return getRuleContext(Statement_expression_listContext.class,0);
		}
		public Function_statement_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_statement_expression_list; }
	}

	public final Function_statement_expression_listContext function_statement_expression_list() throws RecognitionException {
		Function_statement_expression_listContext _localctx = new Function_statement_expression_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_function_statement_expression_list);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				function_statement_expression();
				setState(647);
				terminator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				match(RETRY);
				setState(650);
				terminator(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(651);
				break_expression();
				setState(652);
				terminator(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(654);
				statement_expression_list(0);
				setState(655);
				function_statement_expression();
				setState(656);
				terminator(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(658);
				statement_expression_list(0);
				setState(659);
				match(RETRY);
				setState(660);
				terminator(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(662);
				statement_expression_list(0);
				setState(663);
				break_expression();
				setState(664);
				terminator(0);
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

	public static class Function_statement_expressionContext extends ParserRuleContext {
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
			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				function_inline_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				require_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(671);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(672);
				unless_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(673);
				rvalue(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(674);
				while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(675);
				for_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(676);
				pir_inline();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(677);
				return_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(678);
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
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(682);
				((AssignmentContext)_localctx).op = match(ASSIGN);
				setState(683);
				rvalue(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				((AssignmentContext)_localctx).var_id = lvalue();
				setState(686);
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
				setState(687);
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
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(692);
				((Dynamic_assignmentContext)_localctx).op = match(ASSIGN);
				setState(693);
				dynamic_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				((Dynamic_assignmentContext)_localctx).var_id = lvalue();
				setState(696);
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
				setState(697);
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
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(702);
				((Int_assignmentContext)_localctx).op = match(ASSIGN);
				setState(703);
				int_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				((Int_assignmentContext)_localctx).var_id = lvalue();
				setState(706);
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
				setState(707);
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
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(712);
				((Float_assignmentContext)_localctx).op = match(ASSIGN);
				setState(713);
				float_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				((Float_assignmentContext)_localctx).var_id = lvalue();
				setState(716);
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
				setState(717);
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
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(722);
				((String_assignmentContext)_localctx).op = match(ASSIGN);
				setState(723);
				string_result(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				((String_assignmentContext)_localctx).var_id = lvalue();
				setState(726);
				((String_assignmentContext)_localctx).op = match(PLUS_ASSIGN);
				setState(727);
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
			setState(731);
			((Initial_array_assignmentContext)_localctx).var_id = lvalue();
			setState(732);
			((Initial_array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(733);
			match(LEFT_SBRACKET);
			setState(734);
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
			setState(736);
			((Array_assignmentContext)_localctx).arr_def = array_selector();
			setState(737);
			((Array_assignmentContext)_localctx).op = match(ASSIGN);
			setState(738);
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
			setState(740);
			match(LEFT_SBRACKET);
			setState(741);
			array_definition_elements(0);
			setState(742);
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
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(745);
				int_result(0);
				}
				break;
			case 2:
				{
				setState(746);
				dynamic_result(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(757);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Array_definition_elementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_array_definition_elements);
					setState(749);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(750);
					match(COMMA);
					setState(753);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(751);
						int_result(0);
						}
						break;
					case 2:
						{
						setState(752);
						dynamic_result(0);
						}
						break;
					}
					}
					} 
				}
				setState(759);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
			setState(776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				id();
				setState(761);
				match(LEFT_SBRACKET);
				setState(764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(762);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(763);
					dynamic_result(0);
					}
					break;
				}
				setState(766);
				match(RIGHT_SBRACKET);
				}
				break;
			case ID_GLOBAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				id_global();
				setState(769);
				match(LEFT_SBRACKET);
				setState(772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(770);
					int_result(0);
					}
					break;
				case 2:
					{
					setState(771);
					dynamic_result(0);
					}
					break;
				}
				setState(774);
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
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(779);
				int_result(0);
				setState(780);
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
				setState(781);
				dynamic_result(13);
				}
				break;
			case 2:
				{
				setState(783);
				float_result(0);
				setState(784);
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
				setState(785);
				dynamic_result(11);
				}
				break;
			case 3:
				{
				setState(787);
				string_result(0);
				setState(788);
				((Dynamic_resultContext)_localctx).op = match(MUL);
				setState(789);
				dynamic_result(8);
				}
				break;
			case 4:
				{
				setState(791);
				int_result(0);
				setState(792);
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
				setState(793);
				dynamic_result(6);
				}
				break;
			case 5:
				{
				setState(795);
				float_result(0);
				setState(796);
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
				setState(797);
				dynamic_result(4);
				}
				break;
			case 6:
				{
				setState(799);
				match(LEFT_RBRACKET);
				setState(800);
				dynamic_result(0);
				setState(801);
				match(RIGHT_RBRACKET);
				}
				break;
			case 7:
				{
				setState(803);
				dynamic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(827);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(806);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(807);
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
						setState(808);
						dynamic_result(11);
						}
						break;
					case 2:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(809);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(810);
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
						setState(811);
						dynamic_result(4);
						}
						break;
					case 3:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(812);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(813);
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
						setState(814);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(815);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(816);
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
						setState(817);
						float_result(0);
						}
						break;
					case 5:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(818);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(819);
						((Dynamic_resultContext)_localctx).op = match(MUL);
						setState(820);
						string_result(0);
						}
						break;
					case 6:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(821);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(822);
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
						setState(823);
						int_result(0);
						}
						break;
					case 7:
						{
						_localctx = new Dynamic_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_dynamic_result);
						setState(824);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(825);
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
						setState(826);
						float_result(0);
						}
						break;
					}
					} 
				}
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				function_call_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
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
			setState(843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
				{
				setState(838);
				match(LEFT_RBRACKET);
				setState(839);
				int_result(0);
				setState(840);
				match(RIGHT_RBRACKET);
				}
				break;
			case INT:
				{
				setState(842);
				int_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(853);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(851);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(845);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(846);
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
						setState(847);
						int_result(5);
						}
						break;
					case 2:
						{
						_localctx = new Int_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_result);
						setState(848);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(849);
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
						setState(850);
						int_result(4);
						}
						break;
					}
					} 
				}
				setState(855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(857);
				int_result(0);
				setState(858);
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
				setState(859);
				float_result(7);
				}
				break;
			case 2:
				{
				setState(861);
				int_result(0);
				setState(862);
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
				setState(863);
				float_result(4);
				}
				break;
			case 3:
				{
				setState(865);
				match(LEFT_RBRACKET);
				setState(866);
				float_result(0);
				setState(867);
				match(RIGHT_RBRACKET);
				}
				break;
			case 4:
				{
				setState(869);
				float_t();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(886);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(884);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(872);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(873);
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
						setState(874);
						float_result(9);
						}
						break;
					case 2:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(875);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(876);
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
						setState(877);
						float_result(6);
						}
						break;
					case 3:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(878);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(879);
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
						setState(880);
						int_result(0);
						}
						break;
					case 4:
						{
						_localctx = new Float_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_float_result);
						setState(881);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(882);
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
						setState(883);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(888);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_RBRACKET:
			case INT:
				{
				setState(890);
				int_result(0);
				setState(891);
				((String_resultContext)_localctx).op = match(MUL);
				setState(892);
				string_result(3);
				}
				break;
			case LITERAL:
				{
				setState(894);
				literal_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(905);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(903);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(897);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(898);
						((String_resultContext)_localctx).op = match(PLUS);
						setState(899);
						string_result(3);
						}
						break;
					case 2:
						{
						_localctx = new String_resultContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_result);
						setState(900);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(901);
						((String_resultContext)_localctx).op = match(MUL);
						setState(902);
						int_result(0);
						}
						break;
					}
					} 
				}
				setState(907);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				((Comparison_listContext)_localctx).left = comparison();
				setState(909);
				((Comparison_listContext)_localctx).op = match(BIT_AND);
				setState(910);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				((Comparison_listContext)_localctx).left = comparison();
				setState(913);
				((Comparison_listContext)_localctx).op = match(AND);
				setState(914);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(916);
				((Comparison_listContext)_localctx).left = comparison();
				setState(917);
				((Comparison_listContext)_localctx).op = match(BIT_OR);
				setState(918);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(920);
				((Comparison_listContext)_localctx).left = comparison();
				setState(921);
				((Comparison_listContext)_localctx).op = match(OR);
				setState(922);
				((Comparison_listContext)_localctx).right = comparison_list();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(924);
				match(LEFT_RBRACKET);
				setState(925);
				comparison_list();
				setState(926);
				match(RIGHT_RBRACKET);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(928);
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
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				((ComparisonContext)_localctx).left = comp_var();
				setState(932);
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
				setState(933);
				((ComparisonContext)_localctx).right = comp_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				((ComparisonContext)_localctx).left = comp_var();
				setState(936);
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
				setState(937);
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
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				all_result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				array_selector();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(943);
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
			setState(946);
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
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(949);
				lvalue();
				}
				break;
			case 2:
				{
				setState(950);
				initial_array_assignment();
				}
				break;
			case 3:
				{
				setState(951);
				array_assignment();
				}
				break;
			case 4:
				{
				setState(952);
				int_result(0);
				}
				break;
			case 5:
				{
				setState(953);
				float_result(0);
				}
				break;
			case 6:
				{
				setState(954);
				string_result(0);
				}
				break;
			case 7:
				{
				setState(955);
				global_set();
				}
				break;
			case 8:
				{
				setState(956);
				global_get();
				}
				break;
			case 9:
				{
				setState(957);
				dynamic_assignment();
				}
				break;
			case 10:
				{
				setState(958);
				string_assignment();
				}
				break;
			case 11:
				{
				setState(959);
				float_assignment();
				}
				break;
			case 12:
				{
				setState(960);
				int_assignment();
				}
				break;
			case 13:
				{
				setState(961);
				assignment();
				}
				break;
			case 14:
				{
				setState(962);
				function_call();
				}
				break;
			case 15:
				{
				setState(963);
				literal_t();
				}
				break;
			case 16:
				{
				setState(964);
				bool_t();
				}
				break;
			case 17:
				{
				setState(965);
				float_t();
				}
				break;
			case 18:
				{
				setState(966);
				int_t();
				}
				break;
			case 19:
				{
				setState(967);
				nil_t();
				}
				break;
			case 20:
				{
				setState(968);
				_la = _input.LA(1);
				if ( !(_la==BIT_NOT || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(969);
				rvalue(10);
				}
				break;
			case 21:
				{
				setState(970);
				match(LEFT_RBRACKET);
				setState(971);
				rvalue(0);
				setState(972);
				match(RIGHT_RBRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1003);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(976);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(977);
						match(EXP);
						setState(978);
						rvalue(12);
						}
						break;
					case 2:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(979);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(980);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(981);
						rvalue(10);
						}
						break;
					case 3:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(982);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(983);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(984);
						rvalue(9);
						}
						break;
					case 4:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(985);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(986);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHL || _la==BIT_SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(987);
						rvalue(8);
						}
						break;
					case 5:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(988);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(989);
						match(BIT_AND);
						setState(990);
						rvalue(7);
						}
						break;
					case 6:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(991);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(992);
						_la = _input.LA(1);
						if ( !(_la==BIT_OR || _la==BIT_XOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(993);
						rvalue(6);
						}
						break;
					case 7:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(994);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(995);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << LESS_EQUAL) | (1L << GREATER_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(996);
						rvalue(5);
						}
						break;
					case 8:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(997);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(998);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(999);
						rvalue(4);
						}
						break;
					case 9:
						{
						_localctx = new RvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
						setState(1000);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1001);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1002);
						rvalue(3);
						}
						break;
					}
					} 
				}
				setState(1007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
			setState(1008);
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
			setState(1010);
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
			setState(1012);
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
			setState(1014);
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
			setState(1016);
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
			setState(1018);
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
			setState(1020);
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
			setState(1022);
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
			setState(1024);
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
		public CrlfContext crlf() {
			return getRuleContext(CrlfContext.class,0);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				{
				setState(1027);
				match(SEMICOLON);
				}
				break;
			case CRLF:
				{
				setState(1028);
				crlf();
				}
				break;
			case EOF:
				{
				setState(1029);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1038);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1036);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(1032);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1033);
						match(SEMICOLON);
						}
						break;
					case 2:
						{
						_localctx = new TerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_terminator);
						setState(1034);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1035);
						crlf();
						}
						break;
					}
					} 
				}
				setState(1040);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
			setState(1041);
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
			setState(1043);
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
	private boolean array_definition_elements_sempred(Array_definition_elementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dynamic_result_sempred(Dynamic_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 12);
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 7);
		case 16:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean int_result_sempred(Int_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 4);
		case 18:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean float_result_sempred(Float_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 8);
		case 20:
			return precpred(_ctx, 5);
		case 21:
			return precpred(_ctx, 6);
		case 22:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean string_result_sempred(String_resultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 2);
		case 24:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 11);
		case 26:
			return precpred(_ctx, 9);
		case 27:
			return precpred(_ctx, 8);
		case 28:
			return precpred(_ctx, 7);
		case 29:
			return precpred(_ctx, 6);
		case 30:
			return precpred(_ctx, 5);
		case 31:
			return precpred(_ctx, 4);
		case 32:
			return precpred(_ctx, 3);
		case 33:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean terminator_sempred(TerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 5);
		case 35:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0418\4\2\t\2\4"+
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
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u029d\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u02aa\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02b4\n\67\3"+
		"8\38\38\38\38\38\38\38\58\u02be\n8\39\39\39\39\39\39\39\39\59\u02c8\n"+
		"9\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02d2\n:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02dc"+
		"\n;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\5?\u02ee\n?\3?\3?"+
		"\3?\3?\5?\u02f4\n?\7?\u02f6\n?\f?\16?\u02f9\13?\3@\3@\3@\3@\5@\u02ff\n"+
		"@\3@\3@\3@\3@\3@\3@\5@\u0307\n@\3@\3@\5@\u030b\n@\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0327\n"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\7A\u033e"+
		"\nA\fA\16A\u0341\13A\3B\3B\3B\5B\u0346\nB\3C\3C\3C\3C\3C\3C\5C\u034e\n"+
		"C\3C\3C\3C\3C\3C\3C\7C\u0356\nC\fC\16C\u0359\13C\3D\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\5D\u0369\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\7D\u0377\nD\fD\16D\u037a\13D\3E\3E\3E\3E\3E\3E\5E\u0382\nE\3E\3E\3E\3"+
		"E\3E\3E\7E\u038a\nE\fE\16E\u038d\13E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u03a4\nF\3G\3G\3G\3G\3G\3G\3G\3G\5G"+
		"\u03ae\nG\3H\3H\3H\5H\u03b3\nH\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u03d1\nJ\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\7J\u03ee\nJ\fJ\16J\u03f1\13J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3"+
		"Q\3R\3R\3S\3S\3T\3T\3T\3T\5T\u0409\nT\3T\3T\3T\3T\7T\u040f\nT\fT\16T\u0412"+
		"\13T\3U\3U\3V\3V\3V\2\20\4\34&\60X^b|\u0080\u0084\u0086\u0088\u0092\u00a6"+
		"W\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\2\f\3\2$)\3\2\30\32\3\2\26\27\3\2\37\"\3\2\35\36\4"+
		"\2--\62\62\3\2./\3\2+,\3\2\60\61\3\2\24\25\2\u046f\2\u00ac\3\2\2\2\4\u00b3"+
		"\3\2\2\2\6\u00c8\3\2\2\2\b\u00d9\3\2\2\2\n\u00db\3\2\2\2\f\u00df\3\2\2"+
		"\2\16\u00e3\3\2\2\2\20\u00e5\3\2\2\2\22\u00e7\3\2\2\2\24\u00ea\3\2\2\2"+
		"\26\u00ef\3\2\2\2\30\u00f1\3\2\2\2\32\u00f5\3\2\2\2\34\u00fc\3\2\2\2\36"+
		"\u0111\3\2\2\2 \u011c\3\2\2\2\"\u0120\3\2\2\2$\u0129\3\2\2\2&\u012b\3"+
		"\2\2\2(\u0136\3\2\2\2*\u0138\3\2\2\2,\u0147\3\2\2\2.\u0149\3\2\2\2\60"+
		"\u014b\3\2\2\2\62\u0158\3\2\2\2\64\u015e\3\2\2\2\66\u0160\3\2\2\28\u0168"+
		"\3\2\2\2:\u016f\3\2\2\2<\u0171\3\2\2\2>\u0186\3\2\2\2@\u019e\3\2\2\2B"+
		"\u01b6\3\2\2\2D\u01b8\3\2\2\2F\u01d4\3\2\2\2H\u01d6\3\2\2\2J\u01eb\3\2"+
		"\2\2L\u0203\3\2\2\2N\u021b\3\2\2\2P\u021d\3\2\2\2R\u0239\3\2\2\2T\u023b"+
		"\3\2\2\2V\u0241\3\2\2\2X\u0243\3\2\2\2Z\u024e\3\2\2\2\\\u0250\3\2\2\2"+
		"^\u0252\3\2\2\2`\u025d\3\2\2\2b\u0268\3\2\2\2d\u0284\3\2\2\2f\u0286\3"+
		"\2\2\2h\u029c\3\2\2\2j\u02a9\3\2\2\2l\u02b3\3\2\2\2n\u02bd\3\2\2\2p\u02c7"+
		"\3\2\2\2r\u02d1\3\2\2\2t\u02db\3\2\2\2v\u02dd\3\2\2\2x\u02e2\3\2\2\2z"+
		"\u02e6\3\2\2\2|\u02ea\3\2\2\2~\u030a\3\2\2\2\u0080\u0326\3\2\2\2\u0082"+
		"\u0345\3\2\2\2\u0084\u034d\3\2\2\2\u0086\u0368\3\2\2\2\u0088\u0381\3\2"+
		"\2\2\u008a\u03a3\3\2\2\2\u008c\u03ad\3\2\2\2\u008e\u03b2\3\2\2\2\u0090"+
		"\u03b4\3\2\2\2\u0092\u03d0\3\2\2\2\u0094\u03f2\3\2\2\2\u0096\u03f4\3\2"+
		"\2\2\u0098\u03f6\3\2\2\2\u009a\u03f8\3\2\2\2\u009c\u03fa\3\2\2\2\u009e"+
		"\u03fc\3\2\2\2\u00a0\u03fe\3\2\2\2\u00a2\u0400\3\2\2\2\u00a4\u0402\3\2"+
		"\2\2\u00a6\u0408\3\2\2\2\u00a8\u0413\3\2\2\2\u00aa\u0415\3\2\2\2\u00ac"+
		"\u00ad\5\4\3\2\u00ad\3\3\2\2\2\u00ae\u00af\b\3\1\2\u00af\u00b0\5\6\4\2"+
		"\u00b0\u00b1\5\u00a6T\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4\5\u00a6T\2\u00b3"+
		"\u00ae\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00bb\3\2\2\2\u00b5\u00b6\f\4"+
		"\2\2\u00b6\u00b7\5\6\4\2\u00b7\u00b8\5\u00a6T\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b5\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\5\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c9\5\30\r\2\u00bf\u00c9"+
		"\5\20\t\2\u00c0\u00c9\5\22\n\2\u00c1\u00c9\5@!\2\u00c2\u00c9\5B\"\2\u00c3"+
		"\u00c9\5\u0092J\2\u00c4\u00c9\5D#\2\u00c5\u00c9\5F$\2\u00c6\u00c9\5\24"+
		"\13\2\u00c7\u00c9\5\b\5\2\u00c8\u00be\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8"+
		"\u00c0\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2"+
		"\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\7\3\2\2\2\u00ca\u00cd\5\u00a0Q\2\u00cb\u00cd\5\20"+
		"\t\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce"+
		"\u00d0\5\b\5\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00da\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d7\7\34\2\2\u00d5\u00d8\5\u00a0Q\2\u00d6\u00d8\5\20\t\2\u00d7\u00d5"+
		"\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00cc\3\2\2\2\u00d9"+
		"\u00d4\3\2\2\2\u00da\t\3\2\2\2\u00db\u00dc\5\u0090I\2\u00dc\u00dd\7#\2"+
		"\2\u00dd\u00de\5\u00a2R\2\u00de\13\3\2\2\2\u00df\u00e0\5\u00a2R\2\u00e0"+
		"\u00e1\7#\2\2\u00e1\u00e2\5:\36\2\u00e2\r\3\2\2\2\u00e3\u00e4\5\u00a2"+
		"R\2\u00e4\17\3\2\2\2\u00e5\u00e6\5,\27\2\u00e6\21\3\2\2\2\u00e7\u00e8"+
		"\7\7\2\2\u00e8\u00e9\5\u0096L\2\u00e9\23\3\2\2\2\u00ea\u00eb\7\13\2\2"+
		"\u00eb\u00ec\5\u00aaV\2\u00ec\u00ed\5\26\f\2\u00ed\u00ee\7\b\2\2\u00ee"+
		"\25\3\2\2\2\u00ef\u00f0\5\4\3\2\u00f0\27\3\2\2\2\u00f1\u00f2\5 \21\2\u00f2"+
		"\u00f3\5\32\16\2\u00f3\u00f4\7\b\2\2\u00f4\31\3\2\2\2\u00f5\u00f6\5\34"+
		"\17\2\u00f6\33\3\2\2\2\u00f7\u00f8\b\17\1\2\u00f8\u00f9\5\36\20\2\u00f9"+
		"\u00fa\5\u00a6T\2\u00fa\u00fd\3\2\2\2\u00fb\u00fd\5\u00a6T\2\u00fc\u00f7"+
		"\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0104\3\2\2\2\u00fe\u00ff\f\4\2\2\u00ff"+
		"\u0100\5\36\20\2\u0100\u0101\5\u00a6T\2\u0101\u0103\3\2\2\2\u0102\u00fe"+
		"\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\35\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0112\5\20\t\2\u0108\u0112\5\22"+
		"\n\2\u0109\u0112\5L\'\2\u010a\u0112\5N(\2\u010b\u0112\5\u0092J\2\u010c"+
		"\u0112\5P)\2\u010d\u0112\5R*\2\u010e\u0112\5\24\13\2\u010f\u0112\5*\26"+
		"\2\u0110\u0112\5\b\5\2\u0111\u0107\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u0109"+
		"\3\2\2\2\u0111\u010a\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010c\3\2\2\2\u0111"+
		"\u010d\3\2\2\2\u0111\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2"+
		"\2\2\u0112\37\3\2\2\2\u0113\u0114\7\t\2\2\u0114\u0115\5\"\22\2\u0115\u0116"+
		"\5\u00aaV\2\u0116\u011d\3\2\2\2\u0117\u0118\7\t\2\2\u0118\u0119\5\"\22"+
		"\2\u0119\u011a\5$\23\2\u011a\u011b\5\u00aaV\2\u011b\u011d\3\2\2\2\u011c"+
		"\u0113\3\2\2\2\u011c\u0117\3\2\2\2\u011d!\3\2\2\2\u011e\u0121\5\u00a4"+
		"S\2\u011f\u0121\5\u00a0Q\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"#\3\2\2\2\u0122\u0123\7\63\2\2\u0123\u012a\7\64\2\2\u0124\u0125\7\63\2"+
		"\2\u0125\u0126\5&\24\2\u0126\u0127\7\64\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u012a\5&\24\2\u0129\u0122\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0128\3\2"+
		"\2\2\u012a%\3\2\2\2\u012b\u012c\b\24\1\2\u012c\u012d\5(\25\2\u012d\u0133"+
		"\3\2\2\2\u012e\u012f\f\3\2\2\u012f\u0130\7\4\2\2\u0130\u0132\5(\25\2\u0131"+
		"\u012e\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\'\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\5\u00a0Q\2\u0137"+
		")\3\2\2\2\u0138\u0139\7\n\2\2\u0139\u013a\5:\36\2\u013a+\3\2\2\2\u013b"+
		"\u013c\5\"\22\2\u013c\u013d\7\63\2\2\u013d\u013e\5.\30\2\u013e\u013f\7"+
		"\64\2\2\u013f\u0148\3\2\2\2\u0140\u0141\5\"\22\2\u0141\u0142\5.\30\2\u0142"+
		"\u0148\3\2\2\2\u0143\u0144\5\"\22\2\u0144\u0145\7\63\2\2\u0145\u0146\7"+
		"\64\2\2\u0146\u0148\3\2\2\2\u0147\u013b\3\2\2\2\u0147\u0140\3\2\2\2\u0147"+
		"\u0143\3\2\2\2\u0148-\3\2\2\2\u0149\u014a\5\60\31\2\u014a/\3\2\2\2\u014b"+
		"\u014c\b\31\1\2\u014c\u014d\5\62\32\2\u014d\u0153\3\2\2\2\u014e\u014f"+
		"\f\3\2\2\u014f\u0150\7\4\2\2\u0150\u0152\5\62\32\2\u0151\u014e\3\2\2\2"+
		"\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\61"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0159\5\64\33\2\u0157\u0159\5\66\34"+
		"\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\63\3\2\2\2\u015a\u015f"+
		"\5\u0084C\2\u015b\u015f\5\u0086D\2\u015c\u015f\5\u0088E\2\u015d\u015f"+
		"\5\u0080A\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2"+
		"\2\u015e\u015d\3\2\2\2\u015f\65\3\2\2\2\u0160\u0161\5\u00a0Q\2\u0161\u0166"+
		"\7#\2\2\u0162\u0167\5\u0084C\2\u0163\u0167\5\u0086D\2\u0164\u0167\5\u0088"+
		"E\2\u0165\u0167\5\u0080A\2\u0166\u0162\3\2\2\2\u0166\u0163\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\67\3\2\2\2\u0168\u0169\5,\27"+
		"\2\u01699\3\2\2\2\u016a\u0170\5\u0084C\2\u016b\u0170\5\u0086D\2\u016c"+
		"\u0170\5\u0088E\2\u016d\u0170\5\u0080A\2\u016e\u0170\5\16\b\2\u016f\u016a"+
		"\3\2\2\2\u016f\u016b\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
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
		"\2\2\u01b7C\3\2\2\2\u01b8\u01b9\7\20\2\2\u01b9\u01ba\5Z.\2\u01ba\u01bb"+
		"\5\u00aaV\2\u01bb\u01bc\5`\61\2\u01bc\u01bd\7\b\2\2\u01bdE\3\2\2\2\u01be"+
		"\u01bf\7\23\2\2\u01bf\u01c0\7\63\2\2\u01c0\u01c1\5T+\2\u01c1\u01c2\7\5"+
		"\2\2\u01c2\u01c3\5Z.\2\u01c3\u01c4\7\5\2\2\u01c4\u01c5\5\\/\2\u01c5\u01c6"+
		"\7\64\2\2\u01c6\u01c7\5\u00aaV\2\u01c7\u01c8\5`\61\2\u01c8\u01c9\7\b\2"+
		"\2\u01c9\u01d5\3\2\2\2\u01ca\u01cb\7\23\2\2\u01cb\u01cc\5T+\2\u01cc\u01cd"+
		"\7\5\2\2\u01cd\u01ce\5Z.\2\u01ce\u01cf\7\5\2\2\u01cf\u01d0\5\\/\2\u01d0"+
		"\u01d1\5\u00aaV\2\u01d1\u01d2\5`\61\2\u01d2\u01d3\7\b\2\2\u01d3\u01d5"+
		"\3\2\2\2\u01d4\u01be\3\2\2\2\u01d4\u01ca\3\2\2\2\u01d5G\3\2\2\2\u01d6"+
		"\u01d7\5J&\2\u01d7I\3\2\2\2\u01d8\u01d9\7\16\2\2\u01d9\u01da\5Z.\2\u01da"+
		"\u01db\5\u00aaV\2\u01db\u01dc\5f\64\2\u01dc\u01ec\3\2\2\2\u01dd\u01de"+
		"\7\16\2\2\u01de\u01df\5Z.\2\u01df\u01e0\5\u00aaV\2\u01e0\u01e1\5f\64\2"+
		"\u01e1\u01e2\5\u00a8U\2\u01e2\u01e3\5\u00aaV\2\u01e3\u01e4\5f\64\2\u01e4"+
		"\u01ec\3\2\2\2\u01e5\u01e6\7\16\2\2\u01e6\u01e7\5Z.\2\u01e7\u01e8\5\u00aa"+
		"V\2\u01e8\u01e9\5f\64\2\u01e9\u01ea\5H%\2\u01ea\u01ec\3\2\2\2\u01eb\u01d8"+
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
		"\5<\37\2\u0219\u021a\7\b\2\2\u021a\u021c\3\2\2\2\u021b\u0205\3\2\2\2\u021b"+
		"\u020b\3\2\2\2\u021b\u0214\3\2\2\2\u021cO\3\2\2\2\u021d\u021e\7\20\2\2"+
		"\u021e\u021f\5Z.\2\u021f\u0220\5\u00aaV\2\u0220\u0221\5f\64\2\u0221\u0222"+
		"\7\b\2\2\u0222Q\3\2\2\2\u0223\u0224\7\23\2\2\u0224\u0225\7\63\2\2\u0225"+
		"\u0226\5T+\2\u0226\u0227\7\5\2\2\u0227\u0228\5Z.\2\u0228\u0229\7\5\2\2"+
		"\u0229\u022a\5\\/\2\u022a\u022b\7\64\2\2\u022b\u022c\5\u00aaV\2\u022c"+
		"\u022d\5f\64\2\u022d\u022e\7\b\2\2\u022e\u023a\3\2\2\2\u022f\u0230\7\23"+
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
		"\u00a6T\2\u0262\u0269\3\2\2\2\u0263\u0264\7\21\2\2\u0264\u0269\5\u00a6"+
		"T\2\u0265\u0266\5\u0094K\2\u0266\u0267\5\u00a6T\2\u0267\u0269\3\2\2\2"+
		"\u0268\u025f\3\2\2\2\u0268\u0263\3\2\2\2\u0268\u0265\3\2\2\2\u0269\u0277"+
		"\3\2\2\2\u026a\u026b\f\5\2\2\u026b\u026c\5d\63\2\u026c\u026d\5\u00a6T"+
		"\2\u026d\u0276\3\2\2\2\u026e\u026f\f\4\2\2\u026f\u0270\7\21\2\2\u0270"+
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
		"\2\2\u0288\u0289\5j\66\2\u0289\u028a\5\u00a6T\2\u028a\u029d\3\2\2\2\u028b"+
		"\u028c\7\21\2\2\u028c\u029d\5\u00a6T\2\u028d\u028e\5\u0094K\2\u028e\u028f"+
		"\5\u00a6T\2\u028f\u029d\3\2\2\2\u0290\u0291\5b\62\2\u0291\u0292\5j\66"+
		"\2\u0292\u0293\5\u00a6T\2\u0293\u029d\3\2\2\2\u0294\u0295\5b\62\2\u0295"+
		"\u0296\7\21\2\2\u0296\u0297\5\u00a6T\2\u0297\u029d\3\2\2\2\u0298\u0299"+
		"\5b\62\2\u0299\u029a\5\u0094K\2\u029a\u029b\5\u00a6T\2\u029b\u029d\3\2"+
		"\2\2\u029c\u0288\3\2\2\2\u029c\u028b\3\2\2\2\u029c\u028d\3\2\2\2\u029c"+
		"\u0290\3\2\2\2\u029c\u0294\3\2\2\2\u029c\u0298\3\2\2\2\u029di\3\2\2\2"+
		"\u029e\u02aa\3\2\2\2\u029f\u02aa\5\20\t\2\u02a0\u02aa\5\22\n\2\u02a1\u02aa"+
		"\5@!\2\u02a2\u02aa\5B\"\2\u02a3\u02aa\5\u0092J\2\u02a4\u02aa\5D#\2\u02a5"+
		"\u02aa\5F$\2\u02a6\u02aa\5\24\13\2\u02a7\u02aa\5*\26\2\u02a8\u02aa\5\b"+
		"\5\2\u02a9\u029e\3\2\2\2\u02a9\u029f\3\2\2\2\u02a9\u02a0\3\2\2\2\u02a9"+
		"\u02a1\3\2\2\2\u02a9\u02a2\3\2\2\2\u02a9\u02a3\3\2\2\2\u02a9\u02a4\3\2"+
		"\2\2\u02a9\u02a5\3\2\2\2\u02a9\u02a6\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9"+
		"\u02a8\3\2\2\2\u02aak\3\2\2\2\u02ab\u02ac\5\u0090I\2\u02ac\u02ad\7#\2"+
		"\2\u02ad\u02ae\5\u0092J\2\u02ae\u02b4\3\2\2\2\u02af\u02b0\5\u0090I\2\u02b0"+
		"\u02b1\t\2\2\2\u02b1\u02b2\5\u0092J\2\u02b2\u02b4\3\2\2\2\u02b3\u02ab"+
		"\3\2\2\2\u02b3\u02af\3\2\2\2\u02b4m\3\2\2\2\u02b5\u02b6\5\u0090I\2\u02b6"+
		"\u02b7\7#\2\2\u02b7\u02b8\5\u0080A\2\u02b8\u02be\3\2\2\2\u02b9\u02ba\5"+
		"\u0090I\2\u02ba\u02bb\t\2\2\2\u02bb\u02bc\5\u0080A\2\u02bc\u02be\3\2\2"+
		"\2\u02bd\u02b5\3\2\2\2\u02bd\u02b9\3\2\2\2\u02beo\3\2\2\2\u02bf\u02c0"+
		"\5\u0090I\2\u02c0\u02c1\7#\2\2\u02c1\u02c2\5\u0084C\2\u02c2\u02c8\3\2"+
		"\2\2\u02c3\u02c4\5\u0090I\2\u02c4\u02c5\t\2\2\2\u02c5\u02c6\5\u0084C\2"+
		"\u02c6\u02c8\3\2\2\2\u02c7\u02bf\3\2\2\2\u02c7\u02c3\3\2\2\2\u02c8q\3"+
		"\2\2\2\u02c9\u02ca\5\u0090I\2\u02ca\u02cb\7#\2\2\u02cb\u02cc\5\u0086D"+
		"\2\u02cc\u02d2\3\2\2\2\u02cd\u02ce\5\u0090I\2\u02ce\u02cf\t\2\2\2\u02cf"+
		"\u02d0\5\u0086D\2\u02d0\u02d2\3\2\2\2\u02d1\u02c9\3\2\2\2\u02d1\u02cd"+
		"\3\2\2\2\u02d2s\3\2\2\2\u02d3\u02d4\5\u0090I\2\u02d4\u02d5\7#\2\2\u02d5"+
		"\u02d6\5\u0088E\2\u02d6\u02dc\3\2\2\2\u02d7\u02d8\5\u0090I\2\u02d8\u02d9"+
		"\7$\2\2\u02d9\u02da\5\u0088E\2\u02da\u02dc\3\2\2\2\u02db\u02d3\3\2\2\2"+
		"\u02db\u02d7\3\2\2\2\u02dcu\3\2\2\2\u02dd\u02de\5\u0090I\2\u02de\u02df"+
		"\7#\2\2\u02df\u02e0\7\65\2\2\u02e0\u02e1\7\66\2\2\u02e1w\3\2\2\2\u02e2"+
		"\u02e3\5~@\2\u02e3\u02e4\7#\2\2\u02e4\u02e5\5:\36\2\u02e5y\3\2\2\2\u02e6"+
		"\u02e7\7\65\2\2\u02e7\u02e8\5|?\2\u02e8\u02e9\7\66\2\2\u02e9{\3\2\2\2"+
		"\u02ea\u02ed\b?\1\2\u02eb\u02ee\5\u0084C\2\u02ec\u02ee\5\u0080A\2\u02ed"+
		"\u02eb\3\2\2\2\u02ed\u02ec\3\2\2\2\u02ee\u02f7\3\2\2\2\u02ef\u02f0\f\3"+
		"\2\2\u02f0\u02f3\7\4\2\2\u02f1\u02f4\5\u0084C\2\u02f2\u02f4\5\u0080A\2"+
		"\u02f3\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02ef"+
		"\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"}\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fb\5\u00a0Q\2\u02fb\u02fe\7\65"+
		"\2\2\u02fc\u02ff\5\u0084C\2\u02fd\u02ff\5\u0080A\2\u02fe\u02fc\3\2\2\2"+
		"\u02fe\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\7\66\2\2\u0301\u030b"+
		"\3\2\2\2\u0302\u0303\5\u00a2R\2\u0303\u0306\7\65\2\2\u0304\u0307\5\u0084"+
		"C\2\u0305\u0307\5\u0080A\2\u0306\u0304\3\2\2\2\u0306\u0305\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u0309\7\66\2\2\u0309\u030b\3\2\2\2\u030a\u02fa\3"+
		"\2\2\2\u030a\u0302\3\2\2\2\u030b\177\3\2\2\2\u030c\u030d\bA\1\2\u030d"+
		"\u030e\5\u0084C\2\u030e\u030f\t\3\2\2\u030f\u0310\5\u0080A\17\u0310\u0327"+
		"\3\2\2\2\u0311\u0312\5\u0086D\2\u0312\u0313\t\3\2\2\u0313\u0314\5\u0080"+
		"A\r\u0314\u0327\3\2\2\2\u0315\u0316\5\u0088E\2\u0316\u0317\7\30\2\2\u0317"+
		"\u0318\5\u0080A\n\u0318\u0327\3\2\2\2\u0319\u031a\5\u0084C\2\u031a\u031b"+
		"\t\4\2\2\u031b\u031c\5\u0080A\b\u031c\u0327\3\2\2\2\u031d\u031e\5\u0086"+
		"D\2\u031e\u031f\t\4\2\2\u031f\u0320\5\u0080A\6\u0320\u0327\3\2\2\2\u0321"+
		"\u0322\7\63\2\2\u0322\u0323\5\u0080A\2\u0323\u0324\7\64\2\2\u0324\u0327"+
		"\3\2\2\2\u0325\u0327\5\u0082B\2\u0326\u030c\3\2\2\2\u0326\u0311\3\2\2"+
		"\2\u0326\u0315\3\2\2\2\u0326\u0319\3\2\2\2\u0326\u031d\3\2\2\2\u0326\u0321"+
		"\3\2\2\2\u0326\u0325\3\2\2\2\u0327\u033f\3\2\2\2\u0328\u0329\f\f\2\2\u0329"+
		"\u032a\t\3\2\2\u032a\u033e\5\u0080A\r\u032b\u032c\f\5\2\2\u032c\u032d"+
		"\t\4\2\2\u032d\u033e\5\u0080A\6\u032e\u032f\f\20\2\2\u032f\u0330\t\3\2"+
		"\2\u0330\u033e\5\u0084C\2\u0331\u0332\f\16\2\2\u0332\u0333\t\3\2\2\u0333"+
		"\u033e\5\u0086D\2\u0334\u0335\f\13\2\2\u0335\u0336\7\30\2\2\u0336\u033e"+
		"\5\u0088E\2\u0337\u0338\f\t\2\2\u0338\u0339\t\4\2\2\u0339\u033e\5\u0084"+
		"C\2\u033a\u033b\f\7\2\2\u033b\u033c\t\4\2\2\u033c\u033e\5\u0086D\2\u033d"+
		"\u0328\3\2\2\2\u033d\u032b\3\2\2\2\u033d\u032e\3\2\2\2\u033d\u0331\3\2"+
		"\2\2\u033d\u0334\3\2\2\2\u033d\u0337\3\2\2\2\u033d\u033a\3\2\2\2\u033e"+
		"\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0081\3\2"+
		"\2\2\u0341\u033f\3\2\2\2\u0342\u0346\5\u00a0Q\2\u0343\u0346\58\35\2\u0344"+
		"\u0346\5~@\2\u0345\u0342\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0344\3\2\2"+
		"\2\u0346\u0083\3\2\2\2\u0347\u0348\bC\1\2\u0348\u0349\7\63\2\2\u0349\u034a"+
		"\5\u0084C\2\u034a\u034b\7\64\2\2\u034b\u034e\3\2\2\2\u034c\u034e\5\u009a"+
		"N\2\u034d\u0347\3\2\2\2\u034d\u034c\3\2\2\2\u034e\u0357\3\2\2\2\u034f"+
		"\u0350\f\6\2\2\u0350\u0351\t\3\2\2\u0351\u0356\5\u0084C\7\u0352\u0353"+
		"\f\5\2\2\u0353\u0354\t\4\2\2\u0354\u0356\5\u0084C\6\u0355\u034f\3\2\2"+
		"\2\u0355\u0352\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358"+
		"\3\2\2\2\u0358\u0085\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u035b\bD\1\2\u035b"+
		"\u035c\5\u0084C\2\u035c\u035d\t\3\2\2\u035d\u035e\5\u0086D\t\u035e\u0369"+
		"\3\2\2\2\u035f\u0360\5\u0084C\2\u0360\u0361\t\4\2\2\u0361\u0362\5\u0086"+
		"D\6\u0362\u0369\3\2\2\2\u0363\u0364\7\63\2\2\u0364\u0365\5\u0086D\2\u0365"+
		"\u0366\7\64\2\2\u0366\u0369\3\2\2\2\u0367\u0369\5\u0098M\2\u0368\u035a"+
		"\3\2\2\2\u0368\u035f\3\2\2\2\u0368\u0363\3\2\2\2\u0368\u0367\3\2\2\2\u0369"+
		"\u0378\3\2\2\2\u036a\u036b\f\n\2\2\u036b\u036c\t\3\2\2\u036c\u0377\5\u0086"+
		"D\13\u036d\u036e\f\7\2\2\u036e\u036f\t\4\2\2\u036f\u0377\5\u0086D\b\u0370"+
		"\u0371\f\b\2\2\u0371\u0372\t\3\2\2\u0372\u0377\5\u0084C\2\u0373\u0374"+
		"\f\5\2\2\u0374\u0375\t\4\2\2\u0375\u0377\5\u0084C\2\u0376\u036a\3\2\2"+
		"\2\u0376\u036d\3\2\2\2\u0376\u0370\3\2\2\2\u0376\u0373\3\2\2\2\u0377\u037a"+
		"\3\2\2\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u0087\3\2\2\2\u037a"+
		"\u0378\3\2\2\2\u037b\u037c\bE\1\2\u037c\u037d\5\u0084C\2\u037d\u037e\7"+
		"\30\2\2\u037e\u037f\5\u0088E\5\u037f\u0382\3\2\2\2\u0380\u0382\5\u0096"+
		"L\2\u0381\u037b\3\2\2\2\u0381\u0380\3\2\2\2\u0382\u038b\3\2\2\2\u0383"+
		"\u0384\f\4\2\2\u0384\u0385\7\26\2\2\u0385\u038a\5\u0088E\5\u0386\u0387"+
		"\f\6\2\2\u0387\u0388\7\30\2\2\u0388\u038a\5\u0084C\2\u0389\u0383\3\2\2"+
		"\2\u0389\u0386\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c"+
		"\3\2\2\2\u038c\u0089\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u038f\5\u008cG"+
		"\2\u038f\u0390\7*\2\2\u0390\u0391\5\u008aF\2\u0391\u03a4\3\2\2\2\u0392"+
		"\u0393\5\u008cG\2\u0393\u0394\7\60\2\2\u0394\u0395\5\u008aF\2\u0395\u03a4"+
		"\3\2\2\2\u0396\u0397\5\u008cG\2\u0397\u0398\7+\2\2\u0398\u0399\5\u008a"+
		"F\2\u0399\u03a4\3\2\2\2\u039a\u039b\5\u008cG\2\u039b\u039c\7\61\2\2\u039c"+
		"\u039d\5\u008aF\2\u039d\u03a4\3\2\2\2\u039e\u039f\7\63\2\2\u039f\u03a0"+
		"\5\u008aF\2\u03a0\u03a1\7\64\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a4\5\u008c"+
		"G\2\u03a3\u038e\3\2\2\2\u03a3\u0392\3\2\2\2\u03a3\u0396\3\2\2\2\u03a3"+
		"\u039a\3\2\2\2\u03a3\u039e\3\2\2\2\u03a3\u03a2\3\2\2\2\u03a4\u008b\3\2"+
		"\2\2\u03a5\u03a6\5\u008eH\2\u03a6\u03a7\t\5\2\2\u03a7\u03a8\5\u008eH\2"+
		"\u03a8\u03ae\3\2\2\2\u03a9\u03aa\5\u008eH\2\u03aa\u03ab\t\6\2\2\u03ab"+
		"\u03ac\5\u008eH\2\u03ac\u03ae\3\2\2\2\u03ad\u03a5\3\2\2\2\u03ad\u03a9"+
		"\3\2\2\2\u03ae\u008d\3\2\2\2\u03af\u03b3\5:\36\2\u03b0\u03b3\5~@\2\u03b1"+
		"\u03b3\5\u00a0Q\2\u03b2\u03af\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b1"+
		"\3\2\2\2\u03b3\u008f\3\2\2\2\u03b4\u03b5\5\u00a0Q\2\u03b5\u0091\3\2\2"+
		"\2\u03b6\u03b7\bJ\1\2\u03b7\u03d1\5\u0090I\2\u03b8\u03d1\5v<\2\u03b9\u03d1"+
		"\5x=\2\u03ba\u03d1\5\u0084C\2\u03bb\u03d1\5\u0086D\2\u03bc\u03d1\5\u0088"+
		"E\2\u03bd\u03d1\5\f\7\2\u03be\u03d1\5\n\6\2\u03bf\u03d1\5n8\2\u03c0\u03d1"+
		"\5t;\2\u03c1\u03d1\5r:\2\u03c2\u03d1\5p9\2\u03c3\u03d1\5l\67\2\u03c4\u03d1"+
		"\5,\27\2\u03c5\u03d1\5\u0096L\2\u03c6\u03d1\5\u009cO\2\u03c7\u03d1\5\u0098"+
		"M\2\u03c8\u03d1\5\u009aN\2\u03c9\u03d1\5\u009eP\2\u03ca\u03cb\t\7\2\2"+
		"\u03cb\u03d1\5\u0092J\f\u03cc\u03cd\7\63\2\2\u03cd\u03ce\5\u0092J\2\u03ce"+
		"\u03cf\7\64\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03b6\3\2\2\2\u03d0\u03b8\3"+
		"\2\2\2\u03d0\u03b9\3\2\2\2\u03d0\u03ba\3\2\2\2\u03d0\u03bb\3\2\2\2\u03d0"+
		"\u03bc\3\2\2\2\u03d0\u03bd\3\2\2\2\u03d0\u03be\3\2\2\2\u03d0\u03bf\3\2"+
		"\2\2\u03d0\u03c0\3\2\2\2\u03d0\u03c1\3\2\2\2\u03d0\u03c2\3\2\2\2\u03d0"+
		"\u03c3\3\2\2\2\u03d0\u03c4\3\2\2\2\u03d0\u03c5\3\2\2\2\u03d0\u03c6\3\2"+
		"\2\2\u03d0\u03c7\3\2\2\2\u03d0\u03c8\3\2\2\2\u03d0\u03c9\3\2\2\2\u03d0"+
		"\u03ca\3\2\2\2\u03d0\u03cc\3\2\2\2\u03d1\u03ef\3\2\2\2\u03d2\u03d3\f\r"+
		"\2\2\u03d3\u03d4\7\33\2\2\u03d4\u03ee\5\u0092J\16\u03d5\u03d6\f\13\2\2"+
		"\u03d6\u03d7\t\3\2\2\u03d7\u03ee\5\u0092J\f\u03d8\u03d9\f\n\2\2\u03d9"+
		"\u03da\t\4\2\2\u03da\u03ee\5\u0092J\13\u03db\u03dc\f\t\2\2\u03dc\u03dd"+
		"\t\b\2\2\u03dd\u03ee\5\u0092J\n\u03de\u03df\f\b\2\2\u03df\u03e0\7*\2\2"+
		"\u03e0\u03ee\5\u0092J\t\u03e1\u03e2\f\7\2\2\u03e2\u03e3\t\t\2\2\u03e3"+
		"\u03ee\5\u0092J\b\u03e4\u03e5\f\6\2\2\u03e5\u03e6\t\5\2\2\u03e6\u03ee"+
		"\5\u0092J\7\u03e7\u03e8\f\5\2\2\u03e8\u03e9\t\6\2\2\u03e9\u03ee\5\u0092"+
		"J\6\u03ea\u03eb\f\4\2\2\u03eb\u03ec\t\n\2\2\u03ec\u03ee\5\u0092J\5\u03ed"+
		"\u03d2\3\2\2\2\u03ed\u03d5\3\2\2\2\u03ed\u03d8\3\2\2\2\u03ed\u03db\3\2"+
		"\2\2\u03ed\u03de\3\2\2\2\u03ed\u03e1\3\2\2\2\u03ed\u03e4\3\2\2\2\u03ed"+
		"\u03e7\3\2\2\2\u03ed\u03ea\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2"+
		"\2\2\u03ef\u03f0\3\2\2\2\u03f0\u0093\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2"+
		"\u03f3\7\22\2\2\u03f3\u0095\3\2\2\2\u03f4\u03f5\7\3\2\2\u03f5\u0097\3"+
		"\2\2\2\u03f6\u03f7\7<\2\2\u03f7\u0099\3\2\2\2\u03f8\u03f9\7;\2\2\u03f9"+
		"\u009b\3\2\2\2\u03fa\u03fb\t\13\2\2\u03fb\u009d\3\2\2\2\u03fc\u03fd\7"+
		"\67\2\2\u03fd\u009f\3\2\2\2\u03fe\u03ff\7=\2\2\u03ff\u00a1\3\2\2\2\u0400"+
		"\u0401\7>\2\2\u0401\u00a3\3\2\2\2\u0402\u0403\7?\2\2\u0403\u00a5\3\2\2"+
		"\2\u0404\u0405\bT\1\2\u0405\u0409\7\5\2\2\u0406\u0409\5\u00aaV\2\u0407"+
		"\u0409\7\2\2\3\u0408\u0404\3\2\2\2\u0408\u0406\3\2\2\2\u0408\u0407\3\2"+
		"\2\2\u0409\u0410\3\2\2\2\u040a\u040b\f\7\2\2\u040b\u040f\7\5\2\2\u040c"+
		"\u040d\f\6\2\2\u040d\u040f\5\u00aaV\2\u040e\u040a\3\2\2\2\u040e\u040c"+
		"\3\2\2\2\u040f\u0412\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411"+
		"\u00a7\3\2\2\2\u0412\u0410\3\2\2\2\u0413\u0414\7\r\2\2\u0414\u00a9\3\2"+
		"\2\2\u0415\u0416\7\6\2\2\u0416\u00ab\3\2\2\2H\u00b3\u00bb\u00c8\u00cc"+
		"\u00d1\u00d7\u00d9\u00fc\u0104\u0111\u011c\u0120\u0129\u0133\u0147\u0153"+
		"\u0158\u015e\u0166\u016f\u0186\u019e\u01b6\u01d4\u01eb\u0203\u021b\u0239"+
		"\u0241\u024b\u025a\u0268\u0275\u0277\u0284\u029c\u02a9\u02b3\u02bd\u02c7"+
		"\u02d1\u02db\u02ed\u02f3\u02f7\u02fe\u0306\u030a\u0326\u033d\u033f\u0345"+
		"\u034d\u0355\u0357\u0368\u0376\u0378\u0381\u0389\u038b\u03a3\u03ad\u03b2"+
		"\u03d0\u03ed\u03ef\u0408\u040e\u0410";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}