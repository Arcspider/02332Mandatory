// Generated from C:/Users/hayda/Documents/IntelliJ/02332Mandatory/src\light.g4 by ANTLR 4.10.1
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
		T__9=10, T__10=11, IDENTIFIER=12, CONST=13, HVIDRUM=14, KOMMENTAR=15, 
		MULTILINECOMMENTS=16;
	public static final int
		RULE_start = 0, RULE_hardware = 1, RULE_inputs = 2, RULE_outputs = 3, 
		RULE_latches = 4, RULE_rules = 5, RULE_update = 6, RULE_latchOP = 7, RULE_simulate = 8, 
		RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "hardware", "inputs", "outputs", "latches", "rules", "update", 
			"latchOP", "simulate", "expr"
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
		public HardwareContext hardware() {
			return getRuleContext(HardwareContext.class,0);
		}
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public LatchesContext latches() {
			return getRuleContext(LatchesContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public TerminalNode EOF() { return getToken(lightParser.EOF, 0); }
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
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
			setState(20);
			hardware();
			setState(21);
			inputs();
			setState(22);
			outputs();
			setState(23);
			latches();
			setState(24);
			update();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(25);
				rules();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(31);
				simulate();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
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

	public static class HardwareContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(lightParser.IDENTIFIER, 0); }
		public HardwareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hardware; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterHardware(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitHardware(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitHardware(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HardwareContext hardware() throws RecognitionException {
		HardwareContext _localctx = new HardwareContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hardware);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			((HardwareContext)_localctx).name = match(IDENTIFIER);
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

	public static class InputsContext extends ParserRuleContext {
		public Token name;
		public List<TerminalNode> IDENTIFIER() { return getTokens(lightParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(lightParser.IDENTIFIER, i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__1);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(43);
				((InputsContext)_localctx).name = match(IDENTIFIER);
				}
				}
				setState(48);
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

	public static class OutputsContext extends ParserRuleContext {
		public Token name;
		public List<TerminalNode> IDENTIFIER() { return getTokens(lightParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(lightParser.IDENTIFIER, i);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitOutputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitOutputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_outputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__2);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(50);
				((OutputsContext)_localctx).name = match(IDENTIFIER);
				}
				}
				setState(55);
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

	public static class LatchesContext extends ParserRuleContext {
		public LatchOPContext latchOP() {
			return getRuleContext(LatchOPContext.class,0);
		}
		public LatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterLatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitLatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitLatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchesContext latches() throws RecognitionException {
		LatchesContext _localctx = new LatchesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_latches);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__3);
			setState(57);
			latchOP();
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

	public static class RulesContext extends ParserRuleContext {
		public Token name;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(lightParser.IDENTIFIER, 0); }
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((RulesContext)_localctx).name = match(IDENTIFIER);
			setState(60);
			match(T__4);
			setState(61);
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

	public static class UpdateContext extends ParserRuleContext {
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__5);
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

	public static class LatchOPContext extends ParserRuleContext {
		public Token name1;
		public Token name2;
		public List<TerminalNode> IDENTIFIER() { return getTokens(lightParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(lightParser.IDENTIFIER, i);
		}
		public LatchOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latchOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterLatchOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitLatchOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitLatchOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchOPContext latchOP() throws RecognitionException {
		LatchOPContext _localctx = new LatchOPContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_latchOP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((LatchOPContext)_localctx).name1 = match(IDENTIFIER);
			setState(66);
			match(T__6);
			setState(67);
			((LatchOPContext)_localctx).name2 = match(IDENTIFIER);
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
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 16, RULE_simulate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__7);
			setState(70);
			rules();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << IDENTIFIER) | (1L << CONST))) != 0)) {
				{
				{
				setState(71);
				expr(0);
				}
				}
				setState(76);
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
	public static class ConstantContext extends ExprContext {
		public Token c;
		public TerminalNode CONST() { return getToken(lightParser.CONST, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lightListener ) ((lightListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lightVisitor ) return ((lightVisitor<? extends T>)visitor).visitConstant(this);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(78);
				match(T__8);
				setState(79);
				((NotContext)_localctx).e1 = expr(5);
				}
				break;
			case CONST:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				((ConstantContext)_localctx).c = match(CONST);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				((VariableContext)_localctx).x = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						((AndContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(85);
						match(T__9);
						setState(86);
						((AndContext)_localctx).e2 = expr(5);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						((OrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(88);
						match(T__10);
						setState(89);
						((OrContext)_localctx).e2 = expr(4);
						}
						break;
					}
					} 
				}
				setState(94);
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
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0010`\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e"+
		"\t\u0000\u0001\u0000\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u00034\b\u0003\n\u0003\f\u00037\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\bI\b\b\n\b\f\bL\t\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tS\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t[\b\t\n\t\f\t^\t\t\u0001\t\u0000\u0001\u0012\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000^\u0000\u0014\u0001\u0000\u0000"+
		"\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000"+
		"\u00061\u0001\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\n;\u0001\u0000"+
		"\u0000\u0000\f?\u0001\u0000\u0000\u0000\u000eA\u0001\u0000\u0000\u0000"+
		"\u0010E\u0001\u0000\u0000\u0000\u0012R\u0001\u0000\u0000\u0000\u0014\u0015"+
		"\u0003\u0002\u0001\u0000\u0015\u0016\u0003\u0004\u0002\u0000\u0016\u0017"+
		"\u0003\u0006\u0003\u0000\u0017\u0018\u0003\b\u0004\u0000\u0018\u001c\u0003"+
		"\f\u0006\u0000\u0019\u001b\u0003\n\u0005\u0000\u001a\u0019\u0001\u0000"+
		"\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\"\u0001\u0000\u0000"+
		"\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f!\u0003\u0010\b\u0000"+
		" \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001\u0000\u0000"+
		"\u0000\'(\u0005\u0001\u0000\u0000()\u0005\f\u0000\u0000)\u0003\u0001\u0000"+
		"\u0000\u0000*.\u0005\u0002\u0000\u0000+-\u0005\f\u0000\u0000,+\u0001\u0000"+
		"\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/\u0005\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000015\u0005\u0003\u0000\u000024\u0005\f\u0000\u000032\u0001\u0000\u0000"+
		"\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006\u0007\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"89\u0005\u0004\u0000\u00009:\u0003\u000e\u0007\u0000:\t\u0001\u0000\u0000"+
		"\u0000;<\u0005\f\u0000\u0000<=\u0005\u0005\u0000\u0000=>\u0003\u0012\t"+
		"\u0000>\u000b\u0001\u0000\u0000\u0000?@\u0005\u0006\u0000\u0000@\r\u0001"+
		"\u0000\u0000\u0000AB\u0005\f\u0000\u0000BC\u0005\u0007\u0000\u0000CD\u0005"+
		"\f\u0000\u0000D\u000f\u0001\u0000\u0000\u0000EF\u0005\b\u0000\u0000FJ"+
		"\u0003\n\u0005\u0000GI\u0003\u0012\t\u0000HG\u0001\u0000\u0000\u0000I"+
		"L\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000K\u0011\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0006"+
		"\t\uffff\uffff\u0000NO\u0005\t\u0000\u0000OS\u0003\u0012\t\u0005PS\u0005"+
		"\r\u0000\u0000QS\u0005\f\u0000\u0000RM\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\\\u0001\u0000\u0000\u0000"+
		"TU\n\u0004\u0000\u0000UV\u0005\n\u0000\u0000V[\u0003\u0012\t\u0005WX\n"+
		"\u0003\u0000\u0000XY\u0005\u000b\u0000\u0000Y[\u0003\u0012\t\u0004ZT\u0001"+
		"\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0013\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000\b\u001c\".5JRZ\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}