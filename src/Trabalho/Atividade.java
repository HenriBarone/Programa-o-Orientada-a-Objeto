package Trabalho;

import java.util.Scanner;

public class Atividade {
	
	public static void main(String[] args) {
		
		float base, altura, area;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a altura do triangulo: ");
		base = entrada.nextFloat();
		
		System.out.println("Informe a altura do triangulo: ");
		altura = entrada.nextFloat();
		
		area = (base* altura)/2;
		
		System.out.printf("A �rea do triangulo eh %1.f: ", area);
		//System.out.println("A �rea do triangulo eh: "+ area);
		
		//Agora crie uma nova classe que calcula a �rea do quadrado]
		entrada.close();
	}

}
