// Generated from C:/Users/usuario/Desktop/ProyectoLenguajes/grammar\Ruby.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RubyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ESCAPED_QUOTE", "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", 
			"END", "DEF", "RETURN", "PIR", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", 
			"UNTIL", "RETRY", "BREAK", "FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", 
			"DIV", "MOD", "EXP", "DOT", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", 
			"LESS_EQUAL", "GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", 
			"BIT_XOR", "BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", 
			"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "SL_COMMENT", 
			"ML_COMMENT", "WS", "INT", "FLOAT", "ID", "ID_GLOBAL", "ID_FUNCTION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "';'", null, "'require'", "'end'", "'def'", "'return'", 
			"'pir'", "'if'", "'else'", "'elsif'", "'unless'", "'while'", "'until'", 
			"'retry'", "'break'", "'for'", "'true'", "'false'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'**'", "'.'", "'=='", "'!='", "'>'", "'<'", "'<='", "'>='", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'**='", "'&'", "'|'", 
			"'^'", "'~'", "'<<'", "'>>'", null, null, null, "'('", "')'", "'['", 
			"']'", "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITERAL", "COMMA", "SEMICOLON", "CRLF", "REQUIRE", "END", "DEF", 
			"RETURN", "PIR", "IF", "ELSE", "ELSIF", "UNLESS", "WHILE", "UNTIL", "RETRY", 
			"BREAK", "FOR", "TRUE", "FALSE", "PLUS", "MINUS", "MUL", "DIV", "MOD", 
			"EXP", "DOT", "EQUAL", "NOT_EQUAL", "GREATER", "LESS", "LESS_EQUAL", 
			"GREATER_EQUAL", "ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "EXP_ASSIGN", "BIT_AND", "BIT_OR", "BIT_XOR", 
			"BIT_NOT", "BIT_SHL", "BIT_SHR", "AND", "OR", "NOT", "LEFT_RBRACKET", 
			"RIGHT_RBRACKET", "LEFT_SBRACKET", "RIGHT_SBRACKET", "NIL", "SL_COMMENT", 
			"ML_COMMENT", "WS", "INT", "FLOAT", "ID", "ID_GLOBAL", "ID_FUNCTION"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public RubyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ruby.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u01a5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u0088\n\3\f\3\16\3\u008b"+
		"\13\3\3\3\3\3\3\3\3\3\7\3\u0091\n\3\f\3\16\3\u0094\13\3\3\3\5\3\u0097"+
		"\n\3\3\4\3\4\3\5\3\5\3\6\5\6\u009e\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\5\61\u0140\n\61\3\62\3\62\3\62\3\62\5\62"+
		"\u0146\n\62\3\63\3\63\3\63\3\63\5\63\u014c\n\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\38\38\38\38\39\39\79\u015c\n9\f9\169\u015f\139\39\5"+
		"9\u0162\n9\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\7:\u0170\n:\f:\16:\u0173"+
		"\13:\3:\3:\3:\3:\3:\3:\5:\u017b\n:\3:\3:\3:\3:\3;\6;\u0182\n;\r;\16;\u0183"+
		"\3;\3;\3<\6<\u0189\n<\r<\16<\u018a\3=\7=\u018e\n=\f=\16=\u0191\13=\3="+
		"\3=\6=\u0195\n=\r=\16=\u0196\3>\3>\7>\u019b\n>\f>\16>\u019e\13>\3?\3?"+
		"\3?\3@\3@\3@\5\u0089\u0092\u0171\2A\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t"+
		"\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/"+
		"\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-"+
		"[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177@\3\2\b\4\2\f"+
		"\f\17\17\4\2\13\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\3\2AA\2\u01b5"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0096\3\2\2\2\7\u0098\3\2\2\2"+
		"\t\u009a\3\2\2\2\13\u009d\3\2\2\2\r\u00a1\3\2\2\2\17\u00a9\3\2\2\2\21"+
		"\u00ad\3\2\2\2\23\u00b1\3\2\2\2\25\u00b8\3\2\2\2\27\u00bc\3\2\2\2\31\u00bf"+
		"\3\2\2\2\33\u00c4\3\2\2\2\35\u00ca\3\2\2\2\37\u00d1\3\2\2\2!\u00d7\3\2"+
		"\2\2#\u00dd\3\2\2\2%\u00e3\3\2\2\2\'\u00e9\3\2\2\2)\u00ed\3\2\2\2+\u00f2"+
		"\3\2\2\2-\u00f8\3\2\2\2/\u00fa\3\2\2\2\61\u00fc\3\2\2\2\63\u00fe\3\2\2"+
		"\2\65\u0100\3\2\2\2\67\u0102\3\2\2\29\u0105\3\2\2\2;\u0107\3\2\2\2=\u010a"+
		"\3\2\2\2?\u010d\3\2\2\2A\u010f\3\2\2\2C\u0111\3\2\2\2E\u0114\3\2\2\2G"+
		"\u0117\3\2\2\2I\u0119\3\2\2\2K\u011c\3\2\2\2M\u011f\3\2\2\2O\u0122\3\2"+
		"\2\2Q\u0125\3\2\2\2S\u0128\3\2\2\2U\u012c\3\2\2\2W\u012e\3\2\2\2Y\u0130"+
		"\3\2\2\2[\u0132\3\2\2\2]\u0134\3\2\2\2_\u0137\3\2\2\2a\u013f\3\2\2\2c"+
		"\u0145\3\2\2\2e\u014b\3\2\2\2g\u014d\3\2\2\2i\u014f\3\2\2\2k\u0151\3\2"+
		"\2\2m\u0153\3\2\2\2o\u0155\3\2\2\2q\u0159\3\2\2\2s\u0167\3\2\2\2u\u0181"+
		"\3\2\2\2w\u0188\3\2\2\2y\u018f\3\2\2\2{\u0198\3\2\2\2}\u019f\3\2\2\2\177"+
		"\u01a2\3\2\2\2\u0081\u0082\7^\2\2\u0082\u0083\7$\2\2\u0083\4\3\2\2\2\u0084"+
		"\u0089\7$\2\2\u0085\u0088\5\3\2\2\u0086\u0088\n\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0097\7$"+
		"\2\2\u008d\u0092\7)\2\2\u008e\u0091\5\3\2\2\u008f\u0091\n\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0097\7)\2\2\u0096\u0084\3\2\2\2\u0096\u008d\3\2\2\2\u0097\6\3\2\2\2"+
		"\u0098\u0099\7.\2\2\u0099\b\3\2\2\2\u009a\u009b\7=\2\2\u009b\n\3\2\2\2"+
		"\u009c\u009e\7\17\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\7\f\2\2\u00a0\f\3\2\2\2\u00a1\u00a2\7t\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7s\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7k\2\2"+
		"\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\16\3\2\2\2\u00a9\u00aa\7"+
		"g\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7f\2\2\u00ac\20\3\2\2\2\u00ad\u00ae"+
		"\7f\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7h\2\2\u00b0\22\3\2\2\2\u00b1\u00b2"+
		"\7t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7w\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\u00b7\7p\2\2\u00b7\24\3\2\2\2\u00b8\u00b9\7r\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00bb\7t\2\2\u00bb\26\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd"+
		"\u00be\7h\2\2\u00be\30\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7n\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\32\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7h\2\2"+
		"\u00c9\34\3\2\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7"+
		"n\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7u\2\2\u00d0\36"+
		"\3\2\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7k\2\2\u00d4"+
		"\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6 \3\2\2\2\u00d7\u00d8\7w\2\2\u00d8"+
		"\u00d9\7p\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7n\2\2"+
		"\u00dc\"\3\2\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7v"+
		"\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7{\2\2\u00e2$\3\2\2\2\u00e3\u00e4"+
		"\7d\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7c\2\2\u00e7"+
		"\u00e8\7m\2\2\u00e8&\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7q\2\2\u00eb"+
		"\u00ec\7t\2\2\u00ec(\3\2\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7t\2\2\u00ef"+
		"\u00f0\7w\2\2\u00f0\u00f1\7g\2\2\u00f1*\3\2\2\2\u00f2\u00f3\7h\2\2\u00f3"+
		"\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7g\2\2"+
		"\u00f7,\3\2\2\2\u00f8\u00f9\7-\2\2\u00f9.\3\2\2\2\u00fa\u00fb\7/\2\2\u00fb"+
		"\60\3\2\2\2\u00fc\u00fd\7,\2\2\u00fd\62\3\2\2\2\u00fe\u00ff\7\61\2\2\u00ff"+
		"\64\3\2\2\2\u0100\u0101\7\'\2\2\u0101\66\3\2\2\2\u0102\u0103\7,\2\2\u0103"+
		"\u0104\7,\2\2\u01048\3\2\2\2\u0105\u0106\7\60\2\2\u0106:\3\2\2\2\u0107"+
		"\u0108\7?\2\2\u0108\u0109\7?\2\2\u0109<\3\2\2\2\u010a\u010b\7#\2\2\u010b"+
		"\u010c\7?\2\2\u010c>\3\2\2\2\u010d\u010e\7@\2\2\u010e@\3\2\2\2\u010f\u0110"+
		"\7>\2\2\u0110B\3\2\2\2\u0111\u0112\7>\2\2\u0112\u0113\7?\2\2\u0113D\3"+
		"\2\2\2\u0114\u0115\7@\2\2\u0115\u0116\7?\2\2\u0116F\3\2\2\2\u0117\u0118"+
		"\7?\2\2\u0118H\3\2\2\2\u0119\u011a\7-\2\2\u011a\u011b\7?\2\2\u011bJ\3"+
		"\2\2\2\u011c\u011d\7/\2\2\u011d\u011e\7?\2\2\u011eL\3\2\2\2\u011f\u0120"+
		"\7,\2\2\u0120\u0121\7?\2\2\u0121N\3\2\2\2\u0122\u0123\7\61\2\2\u0123\u0124"+
		"\7?\2\2\u0124P\3\2\2\2\u0125\u0126\7\'\2\2\u0126\u0127\7?\2\2\u0127R\3"+
		"\2\2\2\u0128\u0129\7,\2\2\u0129\u012a\7,\2\2\u012a\u012b\7?\2\2\u012b"+
		"T\3\2\2\2\u012c\u012d\7(\2\2\u012dV\3\2\2\2\u012e\u012f\7~\2\2\u012fX"+
		"\3\2\2\2\u0130\u0131\7`\2\2\u0131Z\3\2\2\2\u0132\u0133\7\u0080\2\2\u0133"+
		"\\\3\2\2\2\u0134\u0135\7>\2\2\u0135\u0136\7>\2\2\u0136^\3\2\2\2\u0137"+
		"\u0138\7@\2\2\u0138\u0139\7@\2\2\u0139`\3\2\2\2\u013a\u013b\7c\2\2\u013b"+
		"\u013c\7p\2\2\u013c\u0140\7f\2\2\u013d\u013e\7(\2\2\u013e\u0140\7(\2\2"+
		"\u013f\u013a\3\2\2\2\u013f\u013d\3\2\2\2\u0140b\3\2\2\2\u0141\u0142\7"+
		"q\2\2\u0142\u0146\7t\2\2\u0143\u0144\7~\2\2\u0144\u0146\7~\2\2\u0145\u0141"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0146d\3\2\2\2\u0147\u0148\7p\2\2\u0148\u0149"+
		"\7q\2\2\u0149\u014c\7v\2\2\u014a\u014c\7#\2\2\u014b\u0147\3\2\2\2\u014b"+
		"\u014a\3\2\2\2\u014cf\3\2\2\2\u014d\u014e\7*\2\2\u014eh\3\2\2\2\u014f"+
		"\u0150\7+\2\2\u0150j\3\2\2\2\u0151\u0152\7]\2\2\u0152l\3\2\2\2\u0153\u0154"+
		"\7_\2\2\u0154n\3\2\2\2\u0155\u0156\7p\2\2\u0156\u0157\7k\2\2\u0157\u0158"+
		"\7n\2\2\u0158p\3\2\2\2\u0159\u015d\7%\2\2\u015a\u015c\n\2\2\2\u015b\u015a"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162\7\17\2\2\u0161\u0160\3"+
		"\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\f\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\b9\2\2\u0166r\3\2\2\2\u0167\u0168\7?\2\2\u0168"+
		"\u0169\7d\2\2\u0169\u016a\7g\2\2\u016a\u016b\7i\2\2\u016b\u016c\7k\2\2"+
		"\u016c\u016d\7p\2\2\u016d\u0171\3\2\2\2\u016e\u0170\13\2\2\2\u016f\u016e"+
		"\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175\7?\2\2\u0175\u0176\7g\2"+
		"\2\u0176\u0177\7p\2\2\u0177\u0178\7f\2\2\u0178\u017a\3\2\2\2\u0179\u017b"+
		"\7\17\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2"+
		"\u017c\u017d\7\f\2\2\u017d\u017e\3\2\2\2\u017e\u017f\b:\2\2\u017ft\3\2"+
		"\2\2\u0180\u0182\t\3\2\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\b;"+
		"\2\2\u0186v\3\2\2\2\u0187\u0189\t\4\2\2\u0188\u0187\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018bx\3\2\2\2\u018c"+
		"\u018e\t\4\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192"+
		"\u0194\7\60\2\2\u0193\u0195\t\4\2\2\u0194\u0193\3\2\2\2\u0195\u0196\3"+
		"\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197z\3\2\2\2\u0198\u019c"+
		"\t\5\2\2\u0199\u019b\t\6\2\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d|\3\2\2\2\u019e\u019c\3\2\2\2"+
		"\u019f\u01a0\7&\2\2\u01a0\u01a1\5{>\2\u01a1~\3\2\2\2\u01a2\u01a3\5{>\2"+
		"\u01a3\u01a4\t\7\2\2\u01a4\u0080\3\2\2\2\25\2\u0087\u0089\u0090\u0092"+
		"\u0096\u009d\u013f\u0145\u014b\u015d\u0161\u0171\u017a\u0183\u018a\u018f"+
		"\u0196\u019c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}