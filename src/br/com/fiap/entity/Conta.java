package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CONTA")
@IdClass(ContaPK.class)
@Inheritance(strategy=InheritanceType.JOINED)
public class Conta {
	
	@Id
	//@SequenceGenerator(allocationSize=1, name="seqConta", sequenceName="SQ_CONTA")
	//@GeneratedValue(generator="seqConta",strategy=GenerationType.SEQUENCE)
	@Column(name="nr_conta")
	private int numeroConta;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
	@JoinColumn(name="nr_agencia")
	private Agencia agencia;
	
	@Column(name="vl_saldo", nullable=false)
	private double saldo;

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

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

}
