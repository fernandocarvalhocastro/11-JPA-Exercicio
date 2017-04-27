package br.com.fiap.entity;

public class Agencia {
	private int numeroAgencia;
	private String endereco;

	public Agencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agencia(int numeroAgencia, String endereco) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.endereco = endereco;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
