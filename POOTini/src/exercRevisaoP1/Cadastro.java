package exercRevisaoP1;

import java.util.ArrayList;

public class Cadastro {
	ArrayList<Funcionario> lista;

	public Cadastro() {
		lista = new ArrayList<>();

	}

	public void inclui(Funcionario f) {
		lista.add(f);
	}

	public boolean exclui(String codigo) {
		return lista.remove(codigo);
	}

	public String geraRelatorio() {
		return lista.toString();
	}

	public boolean gravaArquivo(String nomeArq) {
		return false;
	}

}
