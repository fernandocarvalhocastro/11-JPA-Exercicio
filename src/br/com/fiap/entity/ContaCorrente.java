package br.com.fiap.entity;

public class ContaCorrente {

	private double valorTarifa;
	private double chequeEspecial;

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(double valorTarifa, double chequeEspecial) {
		super();
		this.valorTarifa = valorTarifa;
		this.chequeEspecial = chequeEspecial;
	}

	public double getValorTarifa() {
		return valorTarifa;
	}

	public void setValorTarifa(double valorTarifa) {
		this.valorTarifa = valorTarifa;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

}
