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
        //cria uma expressao Inteiro
        boolean value = false;
        if(ctx.BOOL().getText().equals("True"))
        {
              value = true; 
        }else{
              value  = false; 
        }
        ValorBooleano valueExp = new ValorBooleano(value);
        //coloca na pilha
        pilha.push(valueExp);
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
        try
        {
        Expressao exp = (Expressao) pilha.pop();
        ValorGenerico termo = (ValorGenerico) exp.avaliar();
        System.out.println(termo.getValor());
        //Imprimir o resultador
        }catch( ErroDeTipo e)
        {
            System.out.println("Erro de Tipo");
        }
    }

    @Override
    public void enterNegacao(OOFinalParser.NegacaoContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void exitNegacao(OOFinalParser.NegacaoContext ctx) {
        Expressao valueExp1 = (Expressao) pilha.pop();
        //cria uma soma
        ExpressaoNegacao exp = new ExpressaoNegacao(valueExp1);
        //coloca na pilha
        pilha.push(exp);
    }

    @Override
    public void enterCondicao(OOFinalParser.CondicaoContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void exitCondicao(OOFinalParser.CondicaoContext ctx) {
        Expressao valueExp1 = (Expressao) pilha.pop();
        Expressao valueExp2 = (Expressao) pilha.pop();
        Expressao valueExp3 = (Expressao) pilha.pop();
  
        //cria uma soma
        ExpressaoIF exp = new ExpressaoIF(valueExp3, valueExp2, valueExp1);
        //coloca na pilha
        pilha.push(exp);
    }

    @Override
    public void enterSubtracao(OOFinalParser.SubtracaoContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void exitSubtracao(OOFinalParser.SubtracaoContext ctx) {
        //tira dois da pilha
        Expressao valueExp1 = (Expressao) pilha.pop();
        Expressao valueExp2 = (Expressao) pilha.pop();
        //cria uma subtrçao
        ExpressaoSubtracao exp = new ExpressaoSubtracao(valueExp1, valueExp2);
        //coloca na pilha
        pilha.push(exp);
    }

    @Override
    public void enterSoma(OOFinalParser.SomaContext ctx) {
        //Nao e Nessesario Nada
    }

    @Override
    public void exitSoma(OOFinalParser.SomaContext ctx) {
        //tira dois da pilha
        Expressao valueExp1 = (Expressao) pilha.pop();
        Expressao valueExp2 = (Expressao) pilha.pop();
        //cria uma soma
        ExpressaoSoma exp = new ExpressaoSoma(valueExp1, valueExp2);
        //coloca na pilha
        pilha.push(exp);
    }

    @Override
    public void enterInteiro(OOFinalParser.InteiroContext ctx) {
        //cria uma expressao Inteiro
        int value  = Integer.valueOf(ctx.INT().getText());
        ValorInteiro valueExp = new ValorInteiro(value);
        //coloca na pilha
        pilha.push(valueExp);
    }

    @Override
    public void exitInteiro(OOFinalParser.InteiroContext ctx) {
        //nao e nessesario fazer nada aqui
    }

    
    @Override
    public void enterAnd(OOFinalParser.AndContext ctx) {
        //nao e necessario fazer nda aqui
    }

    @Override
    public void exitAnd(OOFinalParser.AndContext ctx) {
        //tira dois da pilha
        Expressao valueExp1 = (Expressao) pilha.pop();
        Expressao valueExp2 = (Expressao) pilha.pop();
        //cria uma subtrçao
        ExpressaoAnd exp = new ExpressaoAnd(valueExp1, valueExp2);
        //coloca na pilha
        pilha.push(exp);
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
