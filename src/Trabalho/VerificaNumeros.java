package Trabalho;

import java.util.Scanner;

public class VerificaNumeros {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 0, valor = 0, maior = 0, menor = 0;

		for (i = 0; i < 10; i++) {
			System.out.printf("\n Digite o %d valor: ", i);
			valor = entrada.nextInt();
			if (valor > maior) {
				maior = valor;
			} else if (valor < menor) {
				menor = valor;
			}
		}
		System.out.printf("O maior valor digitado = %d \n Menor valor digitado = %d", maior, menor);
		entrada.close();
		
		/*
		 * Que tal treinar mais e criar uma nova classe em Java
		 * que solicite ao usuário um valor inicial e um valor final e
		 * a classe imprima todas os númeors entre esses dois valores.
		 * */
		 
	}
}
