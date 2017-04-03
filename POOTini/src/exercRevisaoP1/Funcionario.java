package exercRevisaoP1;

public abstract class Funcionario {

	private String codigo;
	private String nome;
	private double salario;

	Funcionario(String c, String n, double s) {
		this.codigo = c;
		this.nome = n;
		this.salario = s;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public abstract double getSalarioLiquido();
	
//	public setSalarioBruto(double s){
//		
//	}
			

}
