package at.example;// Generated from Signal.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SignalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WEATHER=3, DIFFICULTY=4, AVALANCHE=5, DIFFICULTY_LEVEL=6, 
		WEATHER_LEVEL=7, AVALANCHE_LEVEL=8, AND=9, OTHER=10, WS=11, NEWLINE=12;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_route = 2, RULE_parenthesis_expr = 3, 
		RULE_expr = 4, RULE_weather_condition = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "route", "parenthesis_expr", "expr", "weather_condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, "'^'", "'v'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WEATHER", "DIFFICULTY", "AVALANCHE", "DIFFICULTY_LEVEL", 
			"WEATHER_LEVEL", "AVALANCHE_LEVEL", "AND", "OTHER", "WS", "NEWLINE"
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
	public String getGrammarFileName() { return "at/example/Signal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SignalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SignalParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			line();
			setState(13);
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

	public static class LineContext extends ParserRuleContext {
		public RouteContext route() {
			return getRuleContext(RouteContext.class,0);
		}
		public TerminalNode AND() { return getToken(SignalParser.AND, 0); }
		public Parenthesis_exprContext parenthesis_expr() {
			return getRuleContext(Parenthesis_exprContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			route();
			setState(16);
			match(AND);
			setState(17);
			parenthesis_expr();
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

	public static class RouteContext extends ParserRuleContext {
		public TerminalNode DIFFICULTY() { return getToken(SignalParser.DIFFICULTY, 0); }
		public RouteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_route; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterRoute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitRoute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitRoute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteContext route() throws RecognitionException {
		RouteContext _localctx = new RouteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_route);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(DIFFICULTY);
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

	public static class Parenthesis_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Parenthesis_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterParenthesis_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitParenthesis_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitParenthesis_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesis_exprContext parenthesis_expr() throws RecognitionException {
		Parenthesis_exprContext _localctx = new Parenthesis_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parenthesis_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(T__0);
			setState(22);
			expr();
			setState(23);
			match(T__1);
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
		public Weather_conditionContext weather_condition() {
			return getRuleContext(Weather_conditionContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(SignalParser.OTHER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				weather_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				weather_condition();
				setState(27);
				match(OTHER);
				setState(28);
				expr();
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

	public static class Weather_conditionContext extends ParserRuleContext {
		public TerminalNode WEATHER() { return getToken(SignalParser.WEATHER, 0); }
		public TerminalNode AVALANCHE() { return getToken(SignalParser.AVALANCHE, 0); }
		public Weather_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weather_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterWeather_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitWeather_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitWeather_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Weather_conditionContext weather_condition() throws RecognitionException {
		Weather_conditionContext _localctx = new Weather_conditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_weather_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==WEATHER || _la==AVALANCHE) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6!\n\6\3\7\3\7\3\7\2\2\b\2\4\6"+
		"\b\n\f\2\3\4\2\5\5\7\7\2\37\2\16\3\2\2\2\4\21\3\2\2\2\6\25\3\2\2\2\b\27"+
		"\3\2\2\2\n \3\2\2\2\f\"\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\3\3\2\2"+
		"\2\21\22\5\6\4\2\22\23\7\13\2\2\23\24\5\b\5\2\24\5\3\2\2\2\25\26\7\6\2"+
		"\2\26\7\3\2\2\2\27\30\7\3\2\2\30\31\5\n\6\2\31\32\7\4\2\2\32\t\3\2\2\2"+
		"\33!\5\f\7\2\34\35\5\f\7\2\35\36\7\f\2\2\36\37\5\n\6\2\37!\3\2\2\2 \33"+
		"\3\2\2\2 \34\3\2\2\2!\13\3\2\2\2\"#\t\2\2\2#\r\3\2\2\2\3 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}