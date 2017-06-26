package exercRevisaoP2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

import exercRevisaoP2.Person.Genero;

public class App {

	public static void main(String[] args) {
		// exercicio1();
		// exercicio2();
		// exercicio3();
		// exercicio4();
		//exercicio5();
	}

	public static void exercicio1() {
		// 1) As exceções nos permite prever e tratar possíveis erros no
		// sistema. Ao utilizarmos exceções, podemos manipular o comportamento
		// do sistema caso um erro possível venha a ocorrer, como a execução de
		// um método alternativo, ou um aviso específico para o usuário que
		// possa vir a ajudar na detecção do problema. O tratamento de exceção
		// na leitura e escrita de arquivos é obrigatória pois ela evita falhas
		// como a não existencia dos arquivos, ou do fechamento do mesmo. Tais
		// falhas podem gerar problemas graves e inclusive o travamento do
		// sistema.

		try {
			int[] vetor = new int[4];
			vetor[4] = 1;
			System.out.println("Esse texto não será impresso");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceção ao acessar um índice do vetor que não existe");
		}
		System.out.println("Esse texto será impresso após a exception");

	}

	public static void exercicio2() {
		String nome = "";
		double media;
		int quantNotas;
		Scanner sc2;
		Path path = Paths.get("exemplo.txt");

		try (Scanner sc = new Scanner(Files.newBufferedReader(path, Charset.forName("utf8")))) {
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				sc2 = new Scanner(linha);
				sc2.useDelimiter("[\\s+]");
				nome = sc2.next();
				media = 0;
				quantNotas = 0;
				while (sc2.hasNext()) {
					media += Double.parseDouble(sc2.next());
					quantNotas++;
				}
				media = media / quantNotas;
				if (media >= 7)
					System.out.println(nome + " " + media);
			}
		} catch (IOException e) {
			System.out.println("FALHOU");
			e.printStackTrace();
		} catch (Throwable e1) {
			System.out.println("A app apresentou o seguinte erro:");
			e1.printStackTrace();
		} finally {
			System.out.println("<<Lista de Aprovados>>");
		}

	}

	public static void exercicio3() {
		Person p1 = new Person("Israel", LocalDate.of(1993, 04, 19), Genero.MASC, "EMAILP1");
		Person p2 = new Person("Velho", LocalDate.of(1928, 04, 19), Genero.MASC, "EMAILP2");
		Person p3 = new Person("Velha", LocalDate.of(1930, 04, 19), Genero.FEM, "EMAILP3");
		Person p4 = new Person("Nova", LocalDate.of(2002, 04, 19), Genero.FEM, "EMAILP4");
		Person p5 = new Person("Novo", LocalDate.of(2002, 04, 19), Genero.MASC, "EMAILP5");
		Person p6 = new Person("Viniboy", LocalDate.of(1999, 04, 19), Genero.MASC, "EMAILP6");

		ArrayList<Person> lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		lista.add(p6);

		System.out.println("Nome das pessoas maiores de 18 anos: ");
		lista.stream().filter(e -> e.getIdade() > 18).forEach(e -> {
			System.out.println(e.getNome());
		});

		System.out.println("\nE-mail das mulheres com mais de 60 anos: ");
		lista.stream().filter(e -> e.getIdade() > 60).forEach(e -> {
			System.out.println(e.getEmail());
		});

		System.out.println("\nMedia de Idade dos homens: ");
		List<Integer> idades = new ArrayList<>();
		lista.stream().filter(e -> e.getGenero().equals(Genero.MASC)).forEach(e -> {
			idades.add(e.getIdade());
		});
		IntSummaryStatistics stats = idades.stream().mapToInt(e -> e).summaryStatistics();
		System.out.println(stats.getAverage());
	}

	public static void exercicio4() {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addLast(5); deque.addLast(1); deque.addLast(-500);deque.addLast(10); 
		deque.addLast(-4); deque.addLast(0); deque.addLast(60);deque.addLast(2);
		deque.addLast(-2); deque.addLast(-8); deque.addLast(-7);deque.addLast(600);
		System.out.println("Original: "+deque+'\n');	
		System.out.println("Modificada: "+trocaSinal(deque));
	}

	public static Deque<Integer> trocaSinal(Deque<Integer> dados) {
		int tamanho = dados.size();
		for(int i=0; i<tamanho; i++){
			Integer aux = dados.removeLast();
			aux = aux * -1;
			dados.addFirst(aux);
		}		
		return dados;
	}

	public static void exercicio5(){
		Funcionario f1 = new Funcionario("Amauri", "Prefeito");
		Funcionario f2 = new Funcionario("Amarildo", "Deputado");
		Funcionario f3 = new Funcionario("Amaurelo", "Prefeito");
		Funcionario f4 = new Funcionario("Amaudeu", "Governador");
		Funcionario f5 = new Funcionario("Amaurroca", "Deputado");
		Funcionario f6 = new Funcionario("Amaurilha", "Deputado");
		Funcionario f7 = new Funcionario("Amara", "Deputado");
		Funcionario f8 = new Funcionario("Amaurando", "Prefeito");		
		Cadastro ca = new Cadastro(); ca.add(f1);ca.add(f2);ca.add(f3);
		ca.add(f4);ca.add(f5);ca.add(f6);ca.add(f7);ca.add(f8);	
		
		ca.exibeTotalPorCargo();				
	}
}
