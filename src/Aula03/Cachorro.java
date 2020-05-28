package Aula03;

import java.util.Date;

public class Cachorro {

	int id;

	private String nome;
	private String cor;
	private Double peso;
	private String raca;

	Date dantaNascimento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Date getDantaNascimento() {
		return dantaNascimento;
	}

	public void setDantaNascimento(Date dantaNascimento) {
		this.dantaNascimento = dantaNascimento;
	}

	public String latir() {
		return "raw raw";
	}
	
	public int latir(int latido) {
		int latidoAuxiliar;
		latidoAuxiliar = latido;
		return latidoAuxiliar;
	}
	
	public String latir(String latido) {
		String latidoAuxiliar;
		latidoAuxiliar = latido + " raw raw";
		return latidoAuxiliar;

	}

	public String farejar() {
		return "farejarr farejarrr";
	}

	public String pular() {
		return "PULOU";
	}

	public String morder() {
		return "morder";
	}

	public String comer() {
		return "vou te comer vou te comer";
	}

	public String dormir() {
		return "zzZZzzZZ";
	}
}
