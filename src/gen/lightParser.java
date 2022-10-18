// Generated from C:/Users/soren/IdeaProjects/02332Mandatory/src\light.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lightParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, IDENTIFIER=14, CONST=15, HVIDRUM=16, 
		KOMMENTAR=17, MULTILINECOMMENTS=18;
	public static final int
		RULE_start = 0, RULE_latch = 1, RULE_updateDec = 2, RULE_simulate = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "latch", "updateDec", "simulate", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.update'", "'.simulate'", 
			"'.latch'", "'->'", "'='", "'('", "')'", "'!'", "'&&'", "'||'"
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

	@Override
	public String getGrammarFileName() { return "light.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lightParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Token nameH;
		public Token nameIn;
		public Token nameOut;
		public LatchContext latch;
		public List<LatchContext> latches = new ArrayList<LatchContext>();
		public SimulateContext simulate;
		public List<SimulateContext> sims = new ArrayList<SimulateContext>();
		public TerminalNode EOF() { return getToken(lightParser.EOF, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(lightParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(lightParser.IDENTIFIER, i);
		}
		public List<UpdateDecContext> updateDec() {
			return getRuleContexts(UpdateDecContext.class);
		}
		public UpdateDecContext updateDec(int i) {
			return getRuleContext(UpdateDecContext.class,i);
		}
		public List<LatchContext> latch() {
			return getRuleContexts(LatchContext.class);
		}
		public LatchContext latch(int i) {
			return getRuleContext(LatchContext.class,i);
		}
		public List<SimulateContext> simulate() {
			return getRuleContexts(SimulateContext.class);
		}
		public SimulateContext simulate(int i) {
			return getRuleContext(SimulateContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			((StartContext)_localctx).nameH = match(IDENTIFIER);
			setState(12);
			match(T__1);
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(13);
				((StartContext)_localctx).nameIn = match(IDENTIFIER);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(T__2);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(20);
				((StartContext)_localctx).nameOut = match(IDENTIFIER);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				((StartContext)_localctx).latch = latch();
				((StartContext)_localctx).latches.add(((StartContext)_localctx).latch);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(31);
			match(T__3);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(32);
				updateDec();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(T__4);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(39);
				((StartContext)_localctx).simulate = simulate();
				((StartContext)_localctx).sims.add(((StartContext)_localctx).simulate);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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

	public static class LatchContext extends ParserRuleContext {
		public Token name1;
		public Token name2;
		public List<TerminalNode> IDENTIFIER() { return getTokens(lightParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(lightParser.IDENTIFIER, i);
		}
		public LatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterLatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitLatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitLatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchContext latch() throws RecognitionException {
		LatchContext _localctx = new LatchContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_latch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__5);
			setState(48);
			((LatchContext)_localctx).name1 = match(IDENTIFIER);
			setState(49);
			match(T__6);
			setState(50);
			((LatchContext)_localctx).name2 = match(IDENTIFIER);
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

	public static class UpdateDecContext extends ParserRuleContext {
		public Token name;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(lightParser.IDENTIFIER, 0); }
		public UpdateDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterUpdateDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitUpdateDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitUpdateDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateDecContext updateDec() throws RecognitionException {
		UpdateDecContext _localctx = new UpdateDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_updateDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((UpdateDecContext)_localctx).name = match(IDENTIFIER);
			setState(53);
			match(T__7);
			setState(54);
			expr(0);
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

	public static class SimulateContext extends ParserRuleContext {
		public Token name;
		public TerminalNode CONST() { return getToken(lightParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(lightParser.IDENTIFIER, 0); }
		public SimulateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterSimulate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitSimulate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitSimulate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimulateContext simulate() throws RecognitionException {
		SimulateContext _localctx = new SimulateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simulate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((SimulateContext)_localctx).name = match(IDENTIFIER);
			setState(57);
			match(T__7);
			setState(58);
			match(CONST);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext e1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public Token x;
		public TerminalNode IDENTIFIER() { return getToken(lightParser.IDENTIFIER, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ExprContext {
		public ExprContext e1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61);
				match(T__8);
				setState(62);
				((ParenthesesContext)_localctx).e1 = expr(0);
				setState(63);
				match(T__9);
				}
				break;
			case T__10:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__10);
				setState(66);
				((NotContext)_localctx).e1 = expr(4);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				((VariableContext)_localctx).x = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						((AndContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(71);
						match(T__11);
						setState(72);
						((AndContext)_localctx).e2 = expr(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						((OrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(74);
						match(T__12);
						setState(75);
						((OrContext)_localctx).e2 = expr(3);
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012R\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u000f\b\u0000\n"+
		"\u0000\f\u0000\u0012\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0016"+
		"\b\u0000\n\u0000\f\u0000\u0019\t\u0000\u0001\u0000\u0004\u0000\u001c\b"+
		"\u0000\u000b\u0000\f\u0000\u001d\u0001\u0000\u0001\u0000\u0005\u0000\""+
		"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		")\b\u0000\n\u0000\f\u0000,\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004E\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004M\b\u0004"+
		"\n\u0004\f\u0004P\t\u0004\u0001\u0004\u0000\u0001\b\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0000U\u0000\n\u0001\u0000\u0000\u0000\u0002/\u0001"+
		"\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000"+
		"\u0000\bD\u0001\u0000\u0000\u0000\n\u000b\u0005\u0001\u0000\u0000\u000b"+
		"\f\u0005\u000e\u0000\u0000\f\u0010\u0005\u0002\u0000\u0000\r\u000f\u0005"+
		"\u000e\u0000\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f\u0012\u0001\u0000"+
		"\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000"+
		"\u0000\u0000\u0011\u0013\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000"+
		"\u0000\u0000\u0013\u0017\u0005\u0003\u0000\u0000\u0014\u0016\u0005\u000e"+
		"\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000"+
		"\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000"+
		"\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f#\u0005\u0004\u0000\u0000 \"\u0003\u0004\u0002\u0000"+
		"! \u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000&*\u0005\u0005\u0000\u0000\')\u0003\u0006\u0003\u0000(\'\u0001"+
		"\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000-.\u0005\u0000\u0000\u0001.\u0001\u0001\u0000\u0000\u0000/0\u0005"+
		"\u0006\u0000\u000001\u0005\u000e\u0000\u000012\u0005\u0007\u0000\u0000"+
		"23\u0005\u000e\u0000\u00003\u0003\u0001\u0000\u0000\u000045\u0005\u000e"+
		"\u0000\u000056\u0005\b\u0000\u000067\u0003\b\u0004\u00007\u0005\u0001"+
		"\u0000\u0000\u000089\u0005\u000e\u0000\u00009:\u0005\b\u0000\u0000:;\u0005"+
		"\u000f\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0006\u0004\uffff"+
		"\uffff\u0000=>\u0005\t\u0000\u0000>?\u0003\b\u0004\u0000?@\u0005\n\u0000"+
		"\u0000@E\u0001\u0000\u0000\u0000AB\u0005\u000b\u0000\u0000BE\u0003\b\u0004"+
		"\u0004CE\u0005\u000e\u0000\u0000D<\u0001\u0000\u0000\u0000DA\u0001\u0000"+
		"\u0000\u0000DC\u0001\u0000\u0000\u0000EN\u0001\u0000\u0000\u0000FG\n\u0003"+
		"\u0000\u0000GH\u0005\f\u0000\u0000HM\u0003\b\u0004\u0004IJ\n\u0002\u0000"+
		"\u0000JK\u0005\r\u0000\u0000KM\u0003\b\u0004\u0003LF\u0001\u0000\u0000"+
		"\u0000LI\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000\b\u0010\u0017\u001d#*DLN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}