// Generated from C:/Users/hayda/Documents/IntelliJ/02332Mandatory/src\light.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, IDENTIFIER=12, CONST=13, HVIDRUM=14, KOMMENTAR=15, 
		MULTILINECOMMENTS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "IDENTIFIER", "CONST", "HVIDRUM", "KOMMENTAR", "MULTILINECOMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.latch'", "'='", "'.update'", 
			"'->'", "'.simulate'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"IDENTIFIER", "CONST", "HVIDRUM", "KOMMENTAR", "MULTILINECOMMENTS"
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
		"\u0004\u0000\u0010\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0005\u000be\b\u000b\n\u000b\f\u000bh\t\u000b\u0001\f\u0004\fk\b\f\u000b"+
		"\f\f\fl\u0001\r\u0004\rp\b\r\u000b\r\f\rq\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000ez\b\u000e\n\u000e\f\u000e"+
		"}\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0087\b\u000f\n\u000f"+
		"\f\u000f\u008a\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0007"+
		"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000001\u0002\u0000\t\n "+
		" \u0001\u0000\n\n\u0001\u0000//\u0001\u0000**\u0095\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000"+
		"\u0003+\u0001\u0000\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u0007<"+
		"\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000bE\u0001\u0000"+
		"\u0000\u0000\rM\u0001\u0000\u0000\u0000\u000fP\u0001\u0000\u0000\u0000"+
		"\u0011Z\u0001\u0000\u0000\u0000\u0013\\\u0001\u0000\u0000\u0000\u0015"+
		"_\u0001\u0000\u0000\u0000\u0017b\u0001\u0000\u0000\u0000\u0019j\u0001"+
		"\u0000\u0000\u0000\u001bo\u0001\u0000\u0000\u0000\u001du\u0001\u0000\u0000"+
		"\u0000\u001f\u0080\u0001\u0000\u0000\u0000!\"\u0005.\u0000\u0000\"#\u0005"+
		"h\u0000\u0000#$\u0005a\u0000\u0000$%\u0005r\u0000\u0000%&\u0005d\u0000"+
		"\u0000&\'\u0005w\u0000\u0000\'(\u0005a\u0000\u0000()\u0005r\u0000\u0000"+
		")*\u0005e\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005.\u0000\u0000"+
		",-\u0005i\u0000\u0000-.\u0005n\u0000\u0000./\u0005p\u0000\u0000/0\u0005"+
		"u\u0000\u000001\u0005t\u0000\u000012\u0005s\u0000\u00002\u0004\u0001\u0000"+
		"\u0000\u000034\u0005.\u0000\u000045\u0005o\u0000\u000056\u0005u\u0000"+
		"\u000067\u0005t\u0000\u000078\u0005p\u0000\u000089\u0005u\u0000\u0000"+
		"9:\u0005t\u0000\u0000:;\u0005s\u0000\u0000;\u0006\u0001\u0000\u0000\u0000"+
		"<=\u0005.\u0000\u0000=>\u0005l\u0000\u0000>?\u0005a\u0000\u0000?@\u0005"+
		"t\u0000\u0000@A\u0005c\u0000\u0000AB\u0005h\u0000\u0000B\b\u0001\u0000"+
		"\u0000\u0000CD\u0005=\u0000\u0000D\n\u0001\u0000\u0000\u0000EF\u0005."+
		"\u0000\u0000FG\u0005u\u0000\u0000GH\u0005p\u0000\u0000HI\u0005d\u0000"+
		"\u0000IJ\u0005a\u0000\u0000JK\u0005t\u0000\u0000KL\u0005e\u0000\u0000"+
		"L\f\u0001\u0000\u0000\u0000MN\u0005-\u0000\u0000NO\u0005>\u0000\u0000"+
		"O\u000e\u0001\u0000\u0000\u0000PQ\u0005.\u0000\u0000QR\u0005s\u0000\u0000"+
		"RS\u0005i\u0000\u0000ST\u0005m\u0000\u0000TU\u0005u\u0000\u0000UV\u0005"+
		"l\u0000\u0000VW\u0005a\u0000\u0000WX\u0005t\u0000\u0000XY\u0005e\u0000"+
		"\u0000Y\u0010\u0001\u0000\u0000\u0000Z[\u0005!\u0000\u0000[\u0012\u0001"+
		"\u0000\u0000\u0000\\]\u0005&\u0000\u0000]^\u0005&\u0000\u0000^\u0014\u0001"+
		"\u0000\u0000\u0000_`\u0005|\u0000\u0000`a\u0005|\u0000\u0000a\u0016\u0001"+
		"\u0000\u0000\u0000bf\u0007\u0000\u0000\u0000ce\u0007\u0001\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000g\u0018\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000ik\u0007\u0002\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000m\u001a\u0001\u0000\u0000\u0000np\u0007\u0003\u0000\u0000on\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0006\r\u0000\u0000"+
		"t\u001c\u0001\u0000\u0000\u0000uv\u0005/\u0000\u0000vw\u0005/\u0000\u0000"+
		"w{\u0001\u0000\u0000\u0000xz\b\u0004\u0000\u0000yx\u0001\u0000\u0000\u0000"+
		"z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0006"+
		"\u000e\u0000\u0000\u007f\u001e\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"/\u0000\u0000\u0081\u0082\u0005*\u0000\u0000\u0082\u0088\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005*\u0000\u0000\u0084\u0087\b\u0005\u0000\u0000"+
		"\u0085\u0087\b\u0006\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005*\u0000\u0000\u008c\u008d\u0005/\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0006\u000f\u0000\u0000\u008f \u0001\u0000"+
		"\u0000\u0000\u0007\u0000flq{\u0086\u0088\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}