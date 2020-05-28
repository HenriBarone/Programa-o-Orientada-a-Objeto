package Aula02;

import java.util.Date;

public class Pessoa {

	public static void main(String args[]) {

		String nome = "Henri";
		String sobrenome = "Barone";
		int idade = 22;
		Double altura = 1.75;
		char carteiraHabilitacao = 'B';

		// System.out.printf("Hello" + nome + " seu sobrenome eh: " + sobrenome +
		// idade);

		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Carteira de Habilitação: " + carteiraHabilitacao);

		CartaoCredito cartao = new CartaoCredito();

		cartao.setNome("Henri");
		cartao.setBandeira("Master");
		cartao.setCodSeguranca(155);
		cartao.setDataValidade = new Date();
		cartao.setNumero(5.00);

		System.out.println("Nome do cartão: " + cartao.getNome());
		System.out.println("Bandeira do cartão: " + cartao.getBandeira());

	}

}
