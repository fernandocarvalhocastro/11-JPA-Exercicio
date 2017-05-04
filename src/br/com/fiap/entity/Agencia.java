package br.com.fiap.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
//@SequenceGenerator(allocationSize=1, name="seqAgencia", sequenceName="SQ_AGENCIA")
@Table(name="T_AGENCIA")
public class Agencia {
	
	@Id
	//@GeneratedValue(generator="seqAgencia",strategy=GenerationType.SEQUENCE)
	@Column(name="nr_agencia")
	private int numeroAgencia;
	
	@Column(name="ds_endereco", nullable=true)
	private String endereco;

	public Agencia() {
		super();
		// TODO Auto-generated constructor stub
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
