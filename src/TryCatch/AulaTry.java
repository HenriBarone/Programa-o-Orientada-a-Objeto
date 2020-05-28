package TryCatch;

import java.util.Scanner;

public class AulaTry {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Ol�, esse � um exemplo de c�digo try cath para tratamento de exece��o");

			System.out.println("Digite um double: ");

			double numero = entrada.nextDouble();
			
		} catch (Exception e) {
			System.out.println("Favor digitar um n�mero com casas decimais");
			e.printStackTrace();
		} finally {
			System.out.println("Sempre sera executado dando erro ou n�o");
		}

		System.out.println("Finalizado com sucesso");
		entrada.close();
	}

}
