package Aula02;

import java.util.Date;

public class CartaoCredito {

	String nome;
	Double numero;
	Date dataValidade;
	int codSeguranca;
	String bandeira;
	public Date setDataValidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public int getCodSeguranca() {
		return codSeguranca;
	}

	public void setCodSeguranca(int codSeguranca) {
		this.codSeguranca = codSeguranca;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

}
