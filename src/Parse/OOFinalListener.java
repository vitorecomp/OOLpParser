package Parse;

// Generated from C:\Users\Vitor\Desktop\WorkSpace\OO Final\src\Parse\OOFinal.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface OOFinalListener extends ParseTreeListener {
	void enterBooleano(OOFinalParser.BooleanoContext ctx);
	void exitBooleano(OOFinalParser.BooleanoContext ctx);

	void enterFactor(OOFinalParser.FactorContext ctx);
	void exitFactor(OOFinalParser.FactorContext ctx);

	void enterInteiro(OOFinalParser.InteiroContext ctx);
	void exitInteiro(OOFinalParser.InteiroContext ctx);

	void enterElse2(OOFinalParser.Else2Context ctx);
	void exitElse2(OOFinalParser.Else2Context ctx);

	void enterAnd(OOFinalParser.AndContext ctx);
	void exitAnd(OOFinalParser.AndContext ctx);

	void enterExp(OOFinalParser.ExpContext ctx);
	void exitExp(OOFinalParser.ExpContext ctx);

	void enterOperation(OOFinalParser.OperationContext ctx);
	void exitOperation(OOFinalParser.OperationContext ctx);

	void enterNegacao(OOFinalParser.NegacaoContext ctx);
	void exitNegacao(OOFinalParser.NegacaoContext ctx);

	void enterValue(OOFinalParser.ValueContext ctx);
	void exitValue(OOFinalParser.ValueContext ctx);

	void enterSoma(OOFinalParser.SomaContext ctx);
	void exitSoma(OOFinalParser.SomaContext ctx);

	void enterSubtracao(OOFinalParser.SubtracaoContext ctx);
	void exitSubtracao(OOFinalParser.SubtracaoContext ctx);

	void enterCondicao(OOFinalParser.CondicaoContext ctx);
	void exitCondicao(OOFinalParser.CondicaoContext ctx);

	void enterThen2(OOFinalParser.Then2Context ctx);
	void exitThen2(OOFinalParser.Then2Context ctx);
}