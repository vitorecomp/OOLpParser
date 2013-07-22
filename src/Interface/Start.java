package Interface;


// import ANTLR's runtime libraries
import Listeners.*;
import Parse.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

public class Start{

    public static void main(String[] args) throws Exception {
// create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(System.in);
// create a lexer that feeds off of input CharStream
        OOFinalLexer lexer = new OOFinalLexer(input);
// create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
        OOFinalParser parser = new OOFinalParser(tokens);
        ParseTree tree = parser.operation(); // begin parsing at init rule
// Create a generic parse tree walker that can trigger callbacks ➤
        ParseTreeWalker walker = new ParseTreeWalker();
// Walk the tree created during the parse, trigger callbacks ➤
        walker.walk(new OOFinalBaseListener(), tree);
        System.out.println(); // print a \n after translation
    }
}