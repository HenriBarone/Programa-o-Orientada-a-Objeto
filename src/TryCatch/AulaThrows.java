package TryCatch;

import java.util.Scanner;

public class AulaThrows {

	public static void main(String[] args) {

		System.out.println("Entre com um número inteiro");

		try {
			// int num = lerNumero();
			//int num = lerNumeroLancaExcecao();
			int num = lerNemeroLancaExcecao2();

			System.out.println("Você digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}
		System.out.println("Codigo continua");

	}

	public static int lerNumero() throws Exception {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		return num;
	}

	public static int lerNumeroLancaExcecao() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num == 1) {
			throw new IllegalArgumentException();
		}
		return num;
	}
	
	public static int lerNemeroLancaExcecao2() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if (num == 2) {
			throw new AulaCriaExcecao("Erro de citação");
		}
		return num;
	}

}
