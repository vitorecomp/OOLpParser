/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oo.pkgfinal;

import Parse.OOFinalLexer;
import Parse.OOFinalParser;
import Listeners.OOFinalBaseListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author Vitor
 */
public class OOFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
    // Cria o stream de carateres para ser trabalhado
    ANTLRInputStream input = new ANTLRInputStream(System.in);

    //cria o lexer
    OOFinalLexer lexer = new OOFinalLexer(input);

    //Cria o buffer de tookens para o parse
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    //Executa o parse
    OOFinalParser parser = new OOFinalParser(tokens);

    //Cria a Arvore
    ParseTree tree = parser.operation();
    //Cria um camaninho na arvore
    ParseTreeWalker walker = new ParseTreeWalker();
    //caminha na arvore
    walker.walk(new OOFinalBaseListener(), tree);

    }
}
