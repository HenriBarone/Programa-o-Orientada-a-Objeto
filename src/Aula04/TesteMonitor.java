package Aula04;

public class TesteMonitor {

	public static void main(String[] args) {

		Monitor dell = new Monitor();

		dell.setMarca("Dell E1913C");

		System.out.println("Seu monitor recebeu a marca: " + dell.getMarca());

		dell.setLigar();
		dell.StatusMonitor();

		// Metodo para desligar

		// dell.setDesligar();
		// dell.StatusMonitor();

	}

}
