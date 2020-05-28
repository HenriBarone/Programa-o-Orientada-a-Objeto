package Variaveis;

public class Variaveis {

	public static void main(String[] args) {

		// Estoura o limite do inter transformando em negativo;
		int var1 = 2147483647; // valor maximo de um inteiro
		int var2 = 1;

		System.out.println(var1 + var2);

		System.out.println("\"Hello \" Word!"); // permite \" dentro do testo ou \\ uma barra na string"
		System.out.println("\"Hello, Word!\"\n\r");	//\n quebra de liinha \r maior espaço na quebra

		System.out.println("1\\4");
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println("O valor de verdade é :"+ verdadeiro);
		System.out.println("O valor de falso é :"+ falso);
		
	
		if (!verdadeiro) {
			System.out.println("\né verdadeiro");
		}else {
			System.out.println("\nÉ falso");
		}
	}

}
