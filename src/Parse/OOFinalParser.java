package Parse;

// Generated from C:\Users\Vitor\Desktop\WorkSpace\OO Final\src\Parse\OOFinal.g4 by ANTLR 4.0
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
		AND=1, THEN=2, ELSE=3, BOOL=4, INT=5, SUM=6, SUB=7, IF=8, WS=9;
	public static final String[] tokenNames = {
		"<INVALID>", "AND", "THEN", "ELSE", "BOOL", "INT", "SUM", "SUB", "IF", 
		"WS"
	};
	public static final int
		RULE_operation = 0, RULE_factor = 1, RULE_inteiro = 2, RULE_booleano = 3, 
		RULE_value = 4, RULE_soma = 5, RULE_subtracao = 6, RULE_negacao = 7, RULE_and = 8, 
		RULE_condicao = 9, RULE_then2 = 10, RULE_else2 = 11, RULE_exp = 12;
	public static final String[] ruleNames = {
		"operation", "factor", "inteiro", "booleano", "value", "soma", "subtracao", 
		"negacao", "and", "condicao", "then2", "else2", "exp"
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(26); exp();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); value();
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
		enterRule(_localctx, 4, RULE_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(INT);
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
		enterRule(_localctx, 6, RULE_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(BOOL);
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

	public static class ValueContext extends ParserRuleContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(40);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); inteiro();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); booleano();
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
		enterRule(_localctx, 10, RULE_soma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(SUM);
			setState(43); exp();
			setState(44); exp();
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
		enterRule(_localctx, 12, RULE_subtracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(SUB);
			setState(47); exp();
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
		enterRule(_localctx, 14, RULE_negacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(SUB);
			setState(51); exp();
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
		enterRule(_localctx, 16, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(AND);
			setState(54); exp();
			setState(55); exp();
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
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public Then2Context then2() {
			return getRuleContext(Then2Context.class,0);
		}
		public Else2Context else2() {
			return getRuleContext(Else2Context.class,0);
		}
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
		enterRule(_localctx, 18, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(IF);
			setState(58); booleano();
			setState(59); then2();
			setState(60); else2();
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

	public static class Then2Context extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode THEN() { return getToken(OOFinalParser.THEN, 0); }
		public Then2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterThen2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitThen2(this);
		}
	}

	public final Then2Context then2() throws RecognitionException {
		Then2Context _localctx = new Then2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_then2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(THEN);
			setState(63); operation();
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

	public static class Else2Context extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(OOFinalParser.ELSE, 0); }
		public Else2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).enterElse2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OOFinalListener ) ((OOFinalListener)listener).exitElse2(this);
		}
	}

	public final Else2Context else2() throws RecognitionException {
		Else2Context _localctx = new Else2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_else2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(ELSE);
			setState(66); operation();
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
		public NegacaoContext negacao() {
			return getRuleContext(NegacaoContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 24, RULE_exp);
		try {
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); soma();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); subtracao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70); negacao();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71); and();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72); condicao();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73); value();
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
		"\2\3\13O\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2"+
		"!\13\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6+\n\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16M\n\16\3\16\2\17"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2H\2\37\3\2\2\2\4\"\3\2\2\2\6$\3\2"+
		"\2\2\b&\3\2\2\2\n*\3\2\2\2\f,\3\2\2\2\16\60\3\2\2\2\20\64\3\2\2\2\22\67"+
		"\3\2\2\2\24;\3\2\2\2\26@\3\2\2\2\30C\3\2\2\2\32L\3\2\2\2\34\36\5\32\16"+
		"\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!\37"+
		"\3\2\2\2\"#\5\n\6\2#\5\3\2\2\2$%\7\7\2\2%\7\3\2\2\2&\'\7\6\2\2\'\t\3\2"+
		"\2\2(+\5\6\4\2)+\5\b\5\2*(\3\2\2\2*)\3\2\2\2+\13\3\2\2\2,-\7\b\2\2-.\5"+
		"\32\16\2./\5\32\16\2/\r\3\2\2\2\60\61\7\t\2\2\61\62\5\32\16\2\62\63\5"+
		"\32\16\2\63\17\3\2\2\2\64\65\7\t\2\2\65\66\5\32\16\2\66\21\3\2\2\2\67"+
		"8\7\3\2\289\5\32\16\29:\5\32\16\2:\23\3\2\2\2;<\7\n\2\2<=\5\b\5\2=>\5"+
		"\26\f\2>?\5\30\r\2?\25\3\2\2\2@A\7\4\2\2AB\5\2\2\2B\27\3\2\2\2CD\7\5\2"+
		"\2DE\5\2\2\2E\31\3\2\2\2FM\5\f\7\2GM\5\16\b\2HM\5\20\t\2IM\5\22\n\2JM"+
		"\5\24\13\2KM\5\n\6\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2"+
		"LK\3\2\2\2M\33\3\2\2\2\5\37*L";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}