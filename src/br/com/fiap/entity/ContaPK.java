package br.com.fiap.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ContaPK implements Serializable{
	
	private int agencia;
	private int numeroConta;
	
	public int getAgencia() {
		return agencia;
	}
	public void setNumeroAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	
	
	
}