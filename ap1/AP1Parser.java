// Generated from AP1.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AP1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INT=9, 
		VAR_ID=10, WS=11, COMMENT=12, BLOCK_COMMENT=13, BL=14;
	public static final int
		RULE_s = 0, RULE_line = 1, RULE_atrib = 2, RULE_op = 3, RULE_hop = 4, 
		RULE_expr = 5, RULE_term = 6;
	public static final String[] ruleNames = {
		"s", "line", "atrib", "op", "hop", "expr", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'+'", "'-'", "'/'", "'*'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "INT", "VAR_ID", 
		"WS", "COMMENT", "BLOCK_COMMENT", "BL"
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
	public String getGrammarFileName() { return "AP1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AP1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			line();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> BL() { return getTokens(AP1Parser.BL); }
		public TerminalNode BL(int i) {
			return getToken(AP1Parser.BL, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			int _alt;
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				expr(0);
				setState(17);
				match(T__0);
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(18);
						match(BL);
						}
						} 
					}
					setState(23);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(24);
						line();
						}
						} 
					}
					setState(29);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				atrib();
				setState(31);
				match(T__0);
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(32);
						match(BL);
						}
						} 
					}
					setState(37);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(38);
						line();
						}
						} 
					}
					setState(43);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
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

	public static class AtribContext extends ParserRuleContext {
		public TerminalNode VAR_ID() { return getToken(AP1Parser.VAR_ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(VAR_ID);
			setState(47);
			match(T__1);
			setState(48);
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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

	public static class HopContext extends ParserRuleContext {
		public HopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).enterHop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).exitHop(this);
		}
	}

	public final HopContext hop() throws RecognitionException {
		HopContext _localctx = new HopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public HopContext hop() {
			return getRuleContext(HopContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).exitExpr(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(55);
				match(T__6);
				setState(56);
				expr(0);
				setState(57);
				match(T__7);
				}
				break;
			case INT:
			case VAR_ID:
				{
				setState(59);
				term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(63);
						hop();
						setState(64);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(67);
						op();
						setState(68);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(74);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AP1Parser.INT, 0); }
		public TerminalNode VAR_ID() { return getToken(AP1Parser.VAR_ID, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AP1Listener ) ((AP1Listener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VAR_ID) ) {
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
		case 5:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\3\3\7\3"+
		"$\n\3\f\3\16\3\'\13\3\3\3\7\3*\n\3\f\3\16\3-\13\3\5\3/\n\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7?\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7I\n\7\f\7\16\7L\13\7\3\b\3\b\3\b\4\27%\3\f\t\2\4\6"+
		"\b\n\f\16\2\5\3\2\5\6\3\2\7\b\3\2\13\fP\2\20\3\2\2\2\4.\3\2\2\2\6\60\3"+
		"\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f>\3\2\2\2\16M\3\2\2\2\20\21\5\4\3\2"+
		"\21\3\3\2\2\2\22\23\5\f\7\2\23\27\7\3\2\2\24\26\7\20\2\2\25\24\3\2\2\2"+
		"\26\31\3\2\2\2\27\30\3\2\2\2\27\25\3\2\2\2\30\35\3\2\2\2\31\27\3\2\2\2"+
		"\32\34\5\4\3\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2"+
		"\36/\3\2\2\2\37\35\3\2\2\2 !\5\6\4\2!%\7\3\2\2\"$\7\20\2\2#\"\3\2\2\2"+
		"$\'\3\2\2\2%&\3\2\2\2%#\3\2\2\2&+\3\2\2\2\'%\3\2\2\2(*\5\4\3\2)(\3\2\2"+
		"\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2.\22\3\2\2\2. \3\2"+
		"\2\2/\5\3\2\2\2\60\61\7\f\2\2\61\62\7\4\2\2\62\63\5\f\7\2\63\7\3\2\2\2"+
		"\64\65\t\2\2\2\65\t\3\2\2\2\66\67\t\3\2\2\67\13\3\2\2\289\b\7\1\29:\7"+
		"\t\2\2:;\5\f\7\2;<\7\n\2\2<?\3\2\2\2=?\5\16\b\2>8\3\2\2\2>=\3\2\2\2?J"+
		"\3\2\2\2@A\f\5\2\2AB\5\n\6\2BC\5\f\7\6CI\3\2\2\2DE\f\4\2\2EF\5\b\5\2F"+
		"G\5\f\7\5GI\3\2\2\2H@\3\2\2\2HD\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
		"K\r\3\2\2\2LJ\3\2\2\2MN\t\4\2\2N\17\3\2\2\2\n\27\35%+.>HJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}