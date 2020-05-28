package ClassesAbstratct;

public class TesteConta {

	public static void main(String[] args) {

		int i = 0;
		Conta conta1;

		if (i == 0) {
			conta1 = new ContaPoupanca();
			conta1.saldo = 12345;
			conta1.imprimeExtrado();
		}else {
			conta1 = new ContaCorrente();
			conta1.saldo = 12345;
			conta1.imprimeExtrado();
		}

		/*
		 * Conta conta1 = new ContaPoupanca(); 
		 * conta1.saldo = 12345;
		 * conta1.imprimeExtrado();
		 * 
		 * Conta conta2 = new ContaCorrente(); 
		 * conta2.saldo = 12345;
		 * conta2.imprimeExtrado();
		 */

	}

}
