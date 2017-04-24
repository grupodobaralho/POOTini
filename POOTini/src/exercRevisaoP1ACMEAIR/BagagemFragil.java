package exercRevisaoP1ACMEAIR;

public class BagagemFragil extends Bagagem {

	private double valorSeguro;

	public BagagemFragil(double peso, String descricao) {
		super(peso, descricao);
	}

	public double getValorSeguro() {
		return this.valorSeguro;
	}

	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	@Override
	public double getCusto() {
		if(super.getPeso() <= 20) 
			return 0;
		else 
			return Math.ceil(super.getPeso() - 20) * (BagagemNormal.getCustoFixo() * 2);
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(super.toString());
		str.append("[Frágil]\nValor do Seguro: " + valorSeguro);		
		return str.toString();
	}
}