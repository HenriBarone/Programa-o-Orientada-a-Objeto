package Trabalho;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		int senhaDigitada = scan.nextInt();

		g1.nome = "Roberto";
		if (g1.autenticador(senhaDigitada)) {
			System.out.printf("O nome do gerente eh: %s", g1.nome);
			scan.close();
		}
	}

	/*
	 * Contrua os cronstrutores que permite instanciar
	 * 
	 * 
	 */

}
