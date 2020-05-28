package Aula04;

public class Monitor {

	private String marca;
	
	private int statusMonitor;
	private int desligar;
	private int ligar;

	public int getLigar() {
		return ligar;
	}

	public void setLigar() {
		statusMonitor = 1;
		this.ligar = statusMonitor;
	}

	public int getDesligar() {
		return desligar;
	}

	public void setDesligar() {
		statusMonitor = 0;
		this.desligar = statusMonitor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void StatusMonitor() {
		int statusAuxiliar = statusMonitor;

		if (statusAuxiliar == 1) {
			System.out.println("Seu monitor esta ligado Uhu");

		} else if (statusAuxiliar == 0) {
			System.out.println("Seu monitor esta desligado ;-;");
		}
	}

}
