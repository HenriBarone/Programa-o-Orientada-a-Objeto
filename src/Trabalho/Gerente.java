package Trabalho;

public class Gerente extends Funcionario {

	int senha = 123456;
	int numeroFuncionariosGerenciados;

	public boolean autenticador(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

}
