package TryCatch;

import java.util.Scanner;

public class AulaTry {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Olá, esse é um exemplo de código try cath para tratamento de execeção");

			System.out.println("Digite um double: ");

			double numero = entrada.nextDouble();
			
		} catch (Exception e) {
			System.out.println("Favor digitar um número com casas decimais");
			e.printStackTrace();
		} finally {
			System.out.println("Sempre sera executado dando erro ou não");
		}

		System.out.println("Finalizado com sucesso");
		entrada.close();
	}

}
