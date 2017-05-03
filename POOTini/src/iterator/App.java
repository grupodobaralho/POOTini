package iterator;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		// Exemplo de iterador no for..each
		ArrayList<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			lista.add(i);

		// Passa por todos
		for(int v: lista)
			System.out.print(v+" ");
		System.out.println();		

		// Mesma coisa, mas usando a nossa classe agora...
		ListaInt lista2 = new ListaInt();
		for(int v: lista2)
			System.out.print(v+" ");
		System.out.println();
	}
}
