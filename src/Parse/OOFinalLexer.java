// Generated from C:\Users\Vitor\Desktop\WorkSpace\OOLpParser\src\Parse\OOFinal.g4 by ANTLR 4.0
package Parse;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OOFinalLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, THEN=2, ELSE=3, BOOL=4, INT=5, SUM=6, SUB=7, IF=8, WS=9, COMENTARIO=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"AND", "THEN", "ELSE", "BOOL", "INT", "SUM", "SUB", "IF", "WS", "COMENTARIO"
	};
	public static final String[] ruleNames = {
		"AND", "THEN", "ELSE", "BOOL", "INT", "SUM", "SUB", "IF", "WS", "COMENTARIO"
	};


	public OOFinalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OOFinal.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 8: WS_action((RuleContext)_localctx, actionIndex); break;

		case 9: COMENTARIO_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\fT\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\3\2\6\2\31\n\2\r\2\16\2\32\3\3\6\3\36\n\3\r\3"+
		"\16\3\37\3\4\6\4#\n\4\r\4\16\4$\3\5\6\5(\n\5\r\5\16\5)\3\6\6\6-\n\6\r"+
		"\6\16\6.\3\7\6\7\62\n\7\r\7\16\7\63\3\b\6\b\67\n\b\r\b\16\b8\3\t\6\t<"+
		"\n\t\r\t\16\t=\3\n\6\nA\n\n\r\n\16\nB\3\n\3\n\3\13\3\13\7\13I\n\13\f\13"+
		"\16\13L\13\13\3\13\5\13O\n\13\3\13\3\13\3\13\3\13\2\f\3\3\1\5\4\1\7\5"+
		"\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\2\25\f\3\3\2\f\7((CCffpp~~\b"+
		"AAggjjppvv~~\7<<ggnnuu~~\tHHVVccggnntuww\3\62;\6--CCff~~\7//UUddww~~\4"+
		"hhkk\t\13\f\17\17\"\"*+..}}\177\177\4\f\f\17\17^\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\30\3\2\2\2\5\35\3\2\2\2\7\"\3\2\2"+
		"\2\t\'\3\2\2\2\13,\3\2\2\2\r\61\3\2\2\2\17\66\3\2\2\2\21;\3\2\2\2\23@"+
		"\3\2\2\2\25F\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3"+
		"\2\2\2\32\33\3\2\2\2\33\4\3\2\2\2\34\36\t\3\2\2\35\34\3\2\2\2\36\37\3"+
		"\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \6\3\2\2\2!#\t\4\2\2\"!\3\2\2\2#$\3\2"+
		"\2\2$\"\3\2\2\2$%\3\2\2\2%\b\3\2\2\2&(\t\5\2\2\'&\3\2\2\2()\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*\n\3\2\2\2+-\t\6\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2"+
		"./\3\2\2\2/\f\3\2\2\2\60\62\t\7\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\16\3\2\2\2\65\67\t\b\2\2\66\65\3\2\2\2\678\3"+
		"\2\2\28\66\3\2\2\289\3\2\2\29\20\3\2\2\2:<\t\t\2\2;:\3\2\2\2<=\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>\22\3\2\2\2?A\t\n\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2"+
		"\2BC\3\2\2\2CD\3\2\2\2DE\b\n\2\2E\24\3\2\2\2FJ\7%\2\2GI\n\13\2\2HG\3\2"+
		"\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2MO\7\17\2\2NM\3"+
		"\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\f\2\2QR\3\2\2\2RS\b\13\3\2S\26\3\2\2\2"+
		"\17\2\32\37$\').\638=BJN";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}