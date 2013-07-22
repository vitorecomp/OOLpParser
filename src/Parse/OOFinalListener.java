// Generated from C:\Users\Vitor\Desktop\WorkSpace\OOLpParser\src\Parse\OOFinal.g4 by ANTLR 4.0
package Parse;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface OOFinalListener extends ParseTreeListener {
	void enterBooleano(OOFinalParser.BooleanoContext ctx);
	void exitBooleano(OOFinalParser.BooleanoContext ctx);

	void enterExp(OOFinalParser.ExpContext ctx);
	void exitExp(OOFinalParser.ExpContext ctx);

	void enterOperation(OOFinalParser.OperationContext ctx);
	void exitOperation(OOFinalParser.OperationContext ctx);

	void enterNegacao(OOFinalParser.NegacaoContext ctx);
	void exitNegacao(OOFinalParser.NegacaoContext ctx);

	void enterCondicao(OOFinalParser.CondicaoContext ctx);
	void exitCondicao(OOFinalParser.CondicaoContext ctx);

	void enterSubtracao(OOFinalParser.SubtracaoContext ctx);
	void exitSubtracao(OOFinalParser.SubtracaoContext ctx);

	void enterSoma(OOFinalParser.SomaContext ctx);
	void exitSoma(OOFinalParser.SomaContext ctx);

	void enterInteiro(OOFinalParser.InteiroContext ctx);
	void exitInteiro(OOFinalParser.InteiroContext ctx);

	void enterAnd(OOFinalParser.AndContext ctx);
	void exitAnd(OOFinalParser.AndContext ctx);
}