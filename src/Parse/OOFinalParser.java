// Generated from C:\Users\Vitor\Desktop\WorkSpace\OOLpParser\src\Parse\OOFinal.g4 by ANTLR 4.0
package Parse;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OOFinalParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, THEN=2, ELSE=3, BOOL=4, INT=5, SUM=6, SUB=7, IF=8, WS=9, COMENTARIO=10;
	public static final String[] tokenNames = {
		"<INVALID>", "AND", "THEN", "ELSE", "BOOL", "INT", "SUM", "SUB", "IF", 
		"WS", "COMENTARIO"
	};
	public static final int
		RULE_operation = 0, RULE_inteiro = 1, RULE_booleano = 2, RULE_soma = 3, 
		RULE_subtracao = 4, RULE_negacao = 5, RULE_and = 6, RULE_condicao = 7, 
		RULE_exp = 8;
	public static final String[] ruleNames = {
		"operation", "inteiro", "booleano", "soma", "subtracao", "negacao", "and", 
		"condicao", "exp"
	};

	@Override
	public String getGrammarFileName() { return "OOFinal.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public OOFinalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OperationContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << BOOL) | (1L << INT) | (1L << SUM) | (1L << SUB) | (1L << IF))) != 0)) {
				{
				{
				setState(18); exp();
				}
				}
				setState(23);
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

	public static class InteiroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(OOFinalParser.INT, 0); }
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitInteiro(this);
		}
	}

	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(INT);
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

	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(OOFinalParser.BOOL, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitBooleano(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(BOOL);
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

	public static class SomaContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode SUM() { return getToken(OOFinalParser.SUM, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitSoma(this);
		}
	}

	public final SomaContext soma() throws RecognitionException {
		SomaContext _localctx = new SomaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_soma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(SUM);
			setState(29); exp();
			setState(30); exp();
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

	public static class SubtracaoContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode SUB() { return getToken(OOFinalParser.SUB, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SubtracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterSubtracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitSubtracao(this);
		}
	}

	public final SubtracaoContext subtracao() throws RecognitionException {
		SubtracaoContext _localctx = new SubtracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subtracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(SUB);
			setState(33); exp();
			setState(34); exp();
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

	public static class NegacaoContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SUB() { return getToken(OOFinalParser.SUB, 0); }
		public NegacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterNegacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitNegacao(this);
		}
	}

	public final NegacaoContext negacao() throws RecognitionException {
		NegacaoContext _localctx = new NegacaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_negacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(SUB);
			setState(37); exp();
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

	public static class AndContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode AND() { return getToken(OOFinalParser.AND, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(AND);
			setState(40); exp();
			setState(41); exp();
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

	public static class CondicaoContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode THEN() { return getToken(OOFinalParser.THEN, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(OOFinalParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(OOFinalParser.IF, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(IF);
			setState(44); exp();
			setState(45); match(THEN);
			setState(46); exp();
			setState(47); match(ELSE);
			setState(48); exp();
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

	public static class ExpContext extends ParserRuleContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public NegacaoContext negacao() {
			return getRuleContext(NegacaoContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public SubtracaoContext subtracao() {
			return getRuleContext(SubtracaoContext.class,0);
		}
		public SomaContext soma() {
			return getRuleContext(SomaContext.class,0);
		}
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp);
		try {
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); soma();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); subtracao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52); negacao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53); and();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54); condicao();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55); inteiro();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56); booleano();
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

	public static final String _serializedATN =
		"\2\3\f>\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\3\2\7\2\26\n\2\f\2\16\2\31\13\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n<\n\n\3\n\2\13\2\4\6\b\n\f\16\20"+
		"\22\2\2;\2\27\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b\36\3\2\2\2\n\"\3\2\2"+
		"\2\f&\3\2\2\2\16)\3\2\2\2\20-\3\2\2\2\22;\3\2\2\2\24\26\5\22\n\2\25\24"+
		"\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27"+
		"\3\2\2\2\32\33\7\7\2\2\33\5\3\2\2\2\34\35\7\6\2\2\35\7\3\2\2\2\36\37\7"+
		"\b\2\2\37 \5\22\n\2 !\5\22\n\2!\t\3\2\2\2\"#\7\t\2\2#$\5\22\n\2$%\5\22"+
		"\n\2%\13\3\2\2\2&\'\7\t\2\2\'(\5\22\n\2(\r\3\2\2\2)*\7\3\2\2*+\5\22\n"+
		"\2+,\5\22\n\2,\17\3\2\2\2-.\7\n\2\2./\5\22\n\2/\60\7\4\2\2\60\61\5\22"+
		"\n\2\61\62\7\5\2\2\62\63\5\22\n\2\63\21\3\2\2\2\64<\5\b\5\2\65<\5\n\6"+
		"\2\66<\5\f\7\2\67<\5\16\b\28<\5\20\t\29<\5\4\3\2:<\5\6\4\2;\64\3\2\2\2"+
		";\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\23"+
		"\3\2\2\2\4\27;";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}