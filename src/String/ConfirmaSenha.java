package String;

import java.util.Scanner;

public class ConfirmaSenha {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String senhaCriada = new String();
		String senhaConfirmada = new String();

		System.out.println("Informe a senha que voc� deseja criar: ");
		senhaCriada = entrada.nextLine();

		System.out.println("Confirme a senha: ");
		senhaConfirmada = entrada.nextLine();

		if (senhaConfirmada.equals(senhaConfirmada)) {
			System.out.println("As senhas s�o iguais, portanto a redefini��o ser� feita");
		} else {
			System.out.println("As senhas n�o s�o iguais");
		}

		System.out.printf("\nCaracter da sua senha da posi��o 1: %s", senhaCriada.charAt(1));
		System.out.printf("\nQuantidae de caracteres da sua senha: %s", senhaCriada.length());

		StringBuffer nome = new StringBuffer("Henri");
		nome.append(" Barone");

		System.out.printf("\nNome e sobrenome: %s", nome);

		entrada.close();
	}

}
