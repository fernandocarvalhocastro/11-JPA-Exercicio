package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_CONTA_CORRENTE")
public class ContaCorrente extends Conta{

	@Column(name="vl_tarifa", nullable=true)
	private double valorTarifa;
	
	@Column(name="vl_cheque_especial")
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
