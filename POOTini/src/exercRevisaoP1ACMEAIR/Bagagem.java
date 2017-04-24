package exercRevisaoP1ACMEAIR;

public abstract class Bagagem implements Comparable<Bagagem> {

	private double peso;
	private String descricao;

	private static int totalBagagens = 0;

	public Bagagem(double peso, String descricao) {
		this.peso = peso;
		this.descricao = descricao;
		totalBagagens++;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public double getPeso() {
		return this.peso;
	}

	public abstract double getCusto();

	public int compareTo(Bagagem b) {
		if (this.peso < b.peso)
			return -1;
		else if (this.peso > b.peso)
			return 1;
		else
			return 0;
	}

	public static int getTotalBagagens() {
		return totalBagagens;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\n[Bagagem]\nPeso: " + peso + "\nDescricao: " + descricao);
		return str.toString();
	}

}
