package Aula03;

import java.util.Date;

public class Teste {

	public static void main(String[] args) {

		Cachorro cao = new Cachorro();

		cao.setNome("Shadow");
		cao.setCor("Preto");
		cao.setPeso(10.5d);
		cao.setRaca("Husky Siberiano");

		cao.setDantaNascimento(new Date());

		// System.out.println("Nome do dog: " + cao.getNome());
		// System.out.println("Cor do dog: " + cao.getCor());
		// System.out.println("Peso do dog: " + cao.getPeso());
		// System.out.println("Raça do dog: " + cao.getRaca());
		// System.out.println("Data de nascimento" + cao.getDantaNascimento());
		// System.out.println(cao.comer());
		// System.out.println(cao.dormir());
		// System.out.println(cao.latir());

		Cachorro cao2 = new Cachorro();

		cao2.setNome("Bob");
		cao2.setCor("Branco");
		cao2.setPeso(5.0d);
		cao2.setRaca("Puddo");

		Cachorro cao3 = new Cachorro();

		cao3.setNome("Isolado");
		cao3.setCor("Cinza");
		cao3.setPeso(7.0d);
		cao3.setRaca("Salsicha");

		System.out.println("Cães: " + cao.getNome() + " " + cao.latir());
		System.out.println("Cães: " + cao.getNome() + " " + cao.latir("5"));
		System.out.println("Cães: " + cao.getNome() + " " + cao.latir("AAAAUUUUU"));

		System.out.println("-------------------------------");

		System.out.println("Cães: " + cao2.getNome() + " " + cao2.latir());
		System.out.println("Cães: " + cao2.getNome() + " " + cao2.latir("5"));
		System.out.println("Cães: " + cao2.getNome() + " " + cao2.latir("Au-Au-Au"));

	}

}
