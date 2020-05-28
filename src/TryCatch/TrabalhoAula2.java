package TryCatch;

import java.util.Scanner;

public class TrabalhoAula2 {

	public static void main(String[] args) {

		System.out.println("Digite '0' para o Sucesso! :)");

		try {
			int num = mExecao();

			System.out.println("Nice boys Sucesso :)");
		} catch (Exception e) {
			System.out.println("Entrada Inválida");
			e.printStackTrace();

		}

	}

	public static int mExecao() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num != 0) {
			throw new TrabMinhaExcecao("FALHA!! tente novamente");
		}
		return num;
	}
}
