package Array;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		int[] a = new int[4];
		int[] b = new int[4];
		int[] soma = new int[4];
		int i = 0;

		Scanner entrada = new Scanner(System.in);

		for (i = 0; i < 4; i++) {
			System.out.printf("\n Digite o %d valor do vetor A: ", i + 1);
			a[i] = entrada.nextInt();
		}

		for (i = 0; i < 4; i++) {
			System.out.printf("\n Digite o %d valor do vetor B: ", i + 1);
			a[i] = entrada.nextInt();
		}

		System.out.println("\n\n Vetores resultantes = ");

		for (i = 0; i < 4; i++) {
			soma[i] = a[i] + b[i];

			System.out.print(soma[i] + ", ");
		}
		entrada.close();
	}

}
