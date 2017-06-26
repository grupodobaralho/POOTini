package exercRevisaoP2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cadastro {
	private List<Funcionario> lista;

	public Cadastro() {
		lista = new ArrayList<>();
	}

	public void add(Funcionario func) {
		lista.add(func);
	}

	public void exibeTotalPorCargo() {
		HashMap<String, Integer> hm = new HashMap<>();
		lista.forEach(e -> {
			if (!hm.containsKey(e.getCargo()))
				hm.put(e.getCargo(), 1);
			else
				hm.put(e.getCargo(), hm.get(e.getCargo()) + 1);
		});
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
	}
}
