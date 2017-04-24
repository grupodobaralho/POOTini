package exercRevisaoP1ACMEAIR;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListaDeBagagens {

	private ArrayList<Bagagem> lista;

	public ListaDeBagagens(int t) {
		lista = new ArrayList<>();
	}

	public ListaDeBagagens() {
		lista = new ArrayList<>();
	}

	public boolean add(Bagagem b) {
		if (b == null)
			return false;
		else {
			lista.add(b);
			return true;
		}
	}

	public double custoTotal() {
		double custoTotal = 0;
		for (Bagagem b : lista) {
			custoTotal = custoTotal + b.getCusto();
		}
		return custoTotal;
	}

	public int getTotalBagagensDeMao() {
		int total = 0;
		for (Bagagem b : lista) {
			if (b instanceof BagagemDeMao)
				total++;
		}
		return total;

	}

	public String relatorio() {
		StringBuilder str = new StringBuilder();
		for (Bagagem b : lista) {
			str.append(b.toString());
		}
		return str.toString();
	}
	
	public void ordenaPeso(){
		lista.sort((b1,b2) -> b1.compareTo(b2));
		//os dois geitos funcionam
//		Collections.sort(lista);
	}
	
	public void ordenaPesoComparator(){
		lista.sort(Comparator.comparing(Bagagem::getPeso));
	}

	public void gravaArquivo() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		try (Writer writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("ListaDeBagagens.txt"), "utf-8"))) {
			writer.write(relatorio());
			writer.close();
		}
	}
	
	

}
