package br.com.fiap.entity;

public class Conta {
	
	private int numeroConta;
	private double saldo;

	public Conta(int numeroConta, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
