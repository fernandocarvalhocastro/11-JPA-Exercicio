package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_CONTA_POUPANCA")
public class ContaPoupanca extends Conta{

	@Column(name="vl_rendimento", nullable=false)
	private double valorRendimento;

	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaPoupanca(double valorRendimento) {
		super();
		this.valorRendimento = valorRendimento;
	}

	public double getValorRendimento() {
		return valorRendimento;
	}

	public void setValorRendimento(double valorRendimento) {
		this.valorRendimento = valorRendimento;
	}

}
