package TryCatch;

import java.util.Scanner;

public class TrabalhoAulaTry {

	public static void main(String[] args) {

		int vResult, vDivid1, vDivid2;
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Favor digitar um valor inteiro para a divis�o: ");
			vDivid1 = entrada.nextInt();

			System.out.println("Favor digitar um outro n�mero inteiro para divis�o: ");
			vDivid2 = entrada.nextInt();

			vResult = vDivid1 / vDivid2;

			System.out.println("Finalizado com sucesso, Resultado: " + vResult);

		} catch (ArithmeticException e) {
			System.out.println("Impossivel a divis�o por '0' :P");

		}
		entrada.close();
	}
}
