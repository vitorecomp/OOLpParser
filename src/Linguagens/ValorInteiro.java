package Linguagens;

public class ValorInteiro extends ValorGenerico<Integer> {

	public ValorInteiro(Integer valor) {
		super(valor);
	}

	@Override
	public TipoExpressao recuperaTipo() {
		return TipoExpressao.INTEIRO;
	}

}
