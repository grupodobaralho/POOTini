package exercRevisaoP2;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	public enum Genero {
		MASC, FEM
	}

	String nome;
	LocalDate nasc;
	Genero genero;
	String email;

	public Person(String nome, LocalDate nasc, Genero genero, String email) {
		this.nome = nome;
		this.nasc = nasc;
		this.genero = genero;
		this.email = email;
	}

	public int getIdade() {
		return Period.between(nasc, LocalDate.now()).getYears();
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getNasc() {
		return nasc;
	}

	public Genero getGenero() {
		return genero;
	}

	public String getEmail() {
		return email;
	}

}