package exercRevisaoP1ACMEAIR;

public class BagagemNormal extends Bagagem {
	
	private static int custoFixo = 0;

	public BagagemNormal(double peso, String descricao) {
		super(peso, descricao);
	}

	@Override
	public double getCusto() {
		if(super.getPeso() <= 20)
			return 0;
		else 
			return Math.ceil(super.getPeso() - 20) * BagagemNormal.custoFixo;
	}
	
	public static void setCustoFixo(int custoFixo) {
		BagagemNormal.custoFixo = custoFixo;
	}
	
	public static int getCustoFixo() {
		return BagagemNormal.custoFixo;
	}

}
