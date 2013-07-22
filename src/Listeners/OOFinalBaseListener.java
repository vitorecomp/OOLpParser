// Generated from C:\Users\Fraps\Documents\Antlr\Proj2\OOFinal.g4 by ANTLR 4.0
package Listeners;

import Linguagens.*;
import Parse.OOFinalListener;
import Parse.OOFinalParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;
import java.util.*;

public class OOFinalBaseListener implements OOFinalListener {
    Stack<Expressao> pilha = new Stack<Expressao>();
    @Override
    public void enterBooleano(OOFinalParser.BooleanoContext ctx) {
        //Crio um boolenao
        
        //Adiciona na Pilha
    }

    @Override
    public void exitBooleano(OOFinalParser.BooleanoContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void enterExp(OOFinalParser.ExpContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void exitExp(OOFinalParser.ExpContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void enterOperation(OOFinalParser.OperationContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void exitOperation(OOFinalParser.OperationContext ctx) {
        //Avlaiar a Expressao
        //Imprimir o resultador
    }

    @Override
    public void enterNegacao(OOFinalParser.NegacaoContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void exitNegacao(OOFinalParser.NegacaoContext ctx) {
        //pega um valor da pilha
        //cria uma expressao negaçao
        //addicina na pilha
    }

    @Override
    public void enterCondicao(OOFinalParser.CondicaoContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void exitCondicao(OOFinalParser.CondicaoContext ctx) {
        //pega 3 valores na pilha
        //ordem ELSE
        //THEN
        //CONDIÇAO
        //cria uma expressao if
        //coloca na pilha
    }

    @Override
    public void enterSubtracao(OOFinalParser.SubtracaoContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void exitSubtracao(OOFinalParser.SubtracaoContext ctx) {
        //tira dois da pilha
        //cria uma subtraço
        //coloca na pilha
    }

    @Override
    public void enterSoma(OOFinalParser.SomaContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void exitSoma(OOFinalParser.SomaContext ctx) {
        //tira dois da pilha
        //cria uma subtraço
        //coloca na pilha
    }

    @Override
    public void enterInteiro(OOFinalParser.InteiroContext ctx) {
        //cria uma expressao Inteiro
        //coloca na pilha
    }

    @Override
    public void exitInteiro(OOFinalParser.InteiroContext ctx) {
        //nao e nessesario fazer nada aqui
    }

    @Override
    public void enterThen2(OOFinalParser.Then2Context ctx) {
        //nao e necessario fazer nda aqui
    }

    @Override
    public void exitThen2(OOFinalParser.Then2Context ctx) {
        //nao e necessario fazer nda aqui
    }

    @Override
    public void enterElse2(OOFinalParser.Else2Context ctx) {
        //nao e necessario fazer nda aqui
    }

    @Override
    public void exitElse2(OOFinalParser.Else2Context ctx) {
        //nao e necessario fazer nda aqui
    }

    @Override
    public void enterAnd(OOFinalParser.AndContext ctx) {
        //nao e necessario fazer nda aqui
    }

    @Override
    public void exitAnd(OOFinalParser.AndContext ctx) {
        //pega dois valores da pilha
        //cria uma nova nova expressao And
        //adicino na pilha
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        //nao e necessario fazer nda aqui
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        //nao e necessario fazer nda aqui
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        //nao e necessario fazer nda aqui
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        //nao e necessario fazer nda aqui
    }
}
