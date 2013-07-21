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
		AND=1, THEN=2, ELSE=3, BOOL=4, INT=5, SUM=6, SUB=7, IF=8, WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"AND", "THEN", "ELSE", "BOOL", "INT", "SUM", "SUB", "IF", "WS"
	};
	public static final String[] ruleNames = {
		"AND", "THEN", "ELSE", "BOOL", "INT", "SUM", "SUB", "IF", "WS"
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
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\13D\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\3\2\6\2\27\n\2\r\2\16\2\30\3\3\6\3\34\n\3\r\3\16\3\35\3"+
		"\4\6\4!\n\4\r\4\16\4\"\3\5\6\5&\n\5\r\5\16\5\'\3\6\6\6+\n\6\r\6\16\6,"+
		"\3\7\6\7\60\n\7\r\7\16\7\61\3\b\6\b\65\n\b\r\b\16\b\66\3\t\6\t:\n\t\r"+
		"\t\16\t;\3\n\6\n?\n\n\r\n\16\n@\3\n\3\n\2\13\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\2\3\2\13\3((\6ggjjppvv\5ggnnuu\tHHVVcc"+
		"ggnntuww\3\62;\3--\3//\4hhkk\6\13\f\17\17\"\"*+L\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\3\26\3\2\2\2\5\33\3\2\2\2\7 \3\2\2\2\t%\3\2\2\2"+
		"\13*\3\2\2\2\r/\3\2\2\2\17\64\3\2\2\2\219\3\2\2\2\23>\3\2\2\2\25\27\t"+
		"\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\4\3"+
		"\2\2\2\32\34\t\3\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3"+
		"\2\2\2\36\6\3\2\2\2\37!\t\4\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3"+
		"\2\2\2#\b\3\2\2\2$&\t\5\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2"+
		"(\n\3\2\2\2)+\t\6\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\f\3\2\2"+
		"\2.\60\t\7\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\16"+
		"\3\2\2\2\63\65\t\b\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67"+
		"\3\2\2\2\67\20\3\2\2\28:\t\t\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2"+
		"\2<\22\3\2\2\2=?\t\n\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2"+
		"\2\2BC\b\n\2\2C\24\3\2\2\2\r\2\30\35\"%\',\61\66;@";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}