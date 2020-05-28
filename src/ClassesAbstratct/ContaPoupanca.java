package ClassesAbstratct;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

	public void imprimeExtrado() {
		System.out.println("### Extrato da Conta ###");
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss AA");
		Date date = new Date();
		
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Data: "+ data.format(date));
	}

}
