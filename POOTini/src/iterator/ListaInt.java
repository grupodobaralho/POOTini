package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaInt implements Iterable<Integer> {

	private ArrayList<Integer> lista;
	
	public ListaInt() {
		// Exemplo: cria uma lista com 10 números
		lista = new ArrayList<>();
		for(int i=0; i<10; i++)
			lista.add(i);
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new IteradorLista();
	}

	private class IteradorLista implements Iterator<Integer> {

		// Posição inicial na lista
		int pos = 0;
		
		@Override
		public boolean hasNext() {
			// Retorna true enquanto há elementos a percorrer
			return pos < lista.size();
		}

		@Override
		public Integer next() {
			// Salva o elemento na posição atual
			int v = lista.get(pos);
			// Avança para a próxima...
			pos++;
			// E retorna o elemento salvo
			return v;
		}
	}
}