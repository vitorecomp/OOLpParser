package Linguagens;

/**
 * Classe que representa uma expressao do tipo IF. Uma expressao do tipo IF tem
 * tres subexpressoes, ....
 *
 *
 * @author rodrigobonifacio
 *
 */
public class ExpressaoIF extends Expressao {

    private Expressao condicao;
    private Expressao entao;
    private Expressao senao;

    public ExpressaoIF(Expressao exp1, Expressao exp2, Expressao exp3) {
        condicao = exp1;
        entao = exp2;
        senao = exp3;
    }

    @Override
    public Valor avaliar() throws ErroDeTipo {
        // TODO Auto-generated method stub
        if (!checaTipo()) {
            throw new ErroDeTipo();
        }
        ValorBooleano v1 = (ValorBooleano) condicao.avaliar();
        if (v1.getValor()) {
            return entao.avaliar();
        } else {
            return senao.avaliar();
        }
    }

    @Override
    public Boolean checaTipo() {
        return !recuperaTipo().equals(TipoExpressao.INVALIDO) && condicao.recuperaTipo().equals(TipoExpressao.BOOLEANO);
    }

    @Override
    public TipoExpressao recuperaTipo() {
        if (entao.recuperaTipo().equals(senao.recuperaTipo())) {
            return entao.recuperaTipo();
        } else {
            return TipoExpressao.INVALIDO;
        }
    }
}
