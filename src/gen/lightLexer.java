// Generated from C:/Users/Gusta/IdeaProjects/02332Mandatory/src\light.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lightLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, IDENTIFIER=14, CONST=15, HVIDRUM=16, 
		KOMMENTAR=17, MULTILINECOMMENTS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "IDENTIFIER", "CONST", "HVIDRUM", 
			"KOMMENTAR", "MULTILINECOMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.latch'", "'='", "'.update'", 
			"'->'", "'.simulate'", "'('", "')'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IDENTIFIER", "CONST", "HVIDRUM", "KOMMENTAR", "MULTILINECOMMENTS"
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


	public lightLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "light.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\7\17o\n\17\f\17\16\17r\13\17\3\20\6\20u\n"+
		"\20\r\20\16\20v\3\21\6\21z\n\21\r\21\16\21{\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\7\22\u0084\n\22\f\22\16\22\u0087\13\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\7\23\u0091\n\23\f\23\16\23\u0094\13\23\3\23\3\23\3\23\3"+
		"\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\3\2\t\5\2C\\aac|\6\2\62;C\\aac|\3\2"+
		"\62\63\4\2\13\f\"\"\3\2\f\f\3\2\61\61\3\2,,\2\u009f\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'"+
		"\3\2\2\2\5\61\3\2\2\2\79\3\2\2\2\tB\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17"+
		"S\3\2\2\2\21V\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2"+
		"\33i\3\2\2\2\35l\3\2\2\2\37t\3\2\2\2!y\3\2\2\2#\177\3\2\2\2%\u008a\3\2"+
		"\2\2\'(\7\60\2\2()\7j\2\2)*\7c\2\2*+\7t\2\2+,\7f\2\2,-\7y\2\2-.\7c\2\2"+
		"./\7t\2\2/\60\7g\2\2\60\4\3\2\2\2\61\62\7\60\2\2\62\63\7k\2\2\63\64\7"+
		"p\2\2\64\65\7r\2\2\65\66\7w\2\2\66\67\7v\2\2\678\7u\2\28\6\3\2\2\29:\7"+
		"\60\2\2:;\7q\2\2;<\7w\2\2<=\7v\2\2=>\7r\2\2>?\7w\2\2?@\7v\2\2@A\7u\2\2"+
		"A\b\3\2\2\2BC\7\60\2\2CD\7n\2\2DE\7c\2\2EF\7v\2\2FG\7e\2\2GH\7j\2\2H\n"+
		"\3\2\2\2IJ\7?\2\2J\f\3\2\2\2KL\7\60\2\2LM\7w\2\2MN\7r\2\2NO\7f\2\2OP\7"+
		"c\2\2PQ\7v\2\2QR\7g\2\2R\16\3\2\2\2ST\7/\2\2TU\7@\2\2U\20\3\2\2\2VW\7"+
		"\60\2\2WX\7u\2\2XY\7k\2\2YZ\7o\2\2Z[\7w\2\2[\\\7n\2\2\\]\7c\2\2]^\7v\2"+
		"\2^_\7g\2\2_\22\3\2\2\2`a\7*\2\2a\24\3\2\2\2bc\7+\2\2c\26\3\2\2\2de\7"+
		"#\2\2e\30\3\2\2\2fg\7(\2\2gh\7(\2\2h\32\3\2\2\2ij\7~\2\2jk\7~\2\2k\34"+
		"\3\2\2\2lp\t\2\2\2mo\t\3\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q"+
		"\36\3\2\2\2rp\3\2\2\2su\t\4\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2w \3\2\2\2xz\t\5\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2"+
		"\2}~\b\21\2\2~\"\3\2\2\2\177\u0080\7\61\2\2\u0080\u0081\7\61\2\2\u0081"+
		"\u0085\3\2\2\2\u0082\u0084\n\6\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\b\22\2\2\u0089$\3\2\2\2\u008a\u008b\7\61\2"+
		"\2\u008b\u008c\7,\2\2\u008c\u0092\3\2\2\2\u008d\u008e\7,\2\2\u008e\u0091"+
		"\n\7\2\2\u008f\u0091\n\b\2\2\u0090\u008d\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7,\2\2\u0096\u0097\7\61\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\b\23\2\2\u0099&\3\2\2\2\t\2pv{\u0085\u0090"+
		"\u0092\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}