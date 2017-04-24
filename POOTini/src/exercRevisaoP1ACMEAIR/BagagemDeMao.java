package exercRevisaoP1ACMEAIR;

public class BagagemDeMao extends Bagagem {

	public BagagemDeMao(double peso, String descricao) {
		super(peso, descricao);
	}

	@Override
	public double getCusto() {
		double peso = super.getPeso();
		if (peso < 5)
			return 0;
		if (peso >= 5 && peso <= 10)
			return Math.ceil(peso - 5) * 10;
		else
			return Math.ceil(peso - 5) * 20;
	}

}
