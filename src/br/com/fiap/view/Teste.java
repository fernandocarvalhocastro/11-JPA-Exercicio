package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaDAO;
import br.com.fiap.dao.impl.ContaDAOImpl;
import br.com.fiap.entity.Agencia;
import br.com.fiap.entity.ContaPoupanca;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {
	
	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ContaDAO dao = new ContaDAOImpl(em);
		
		Agencia agencia = new Agencia();
		agencia.setEndereco("Lins de vasconcelos, 1222");
		agencia.setNumeroAgencia(1234);
		
		ContaPoupanca contaP = new ContaPoupanca();
		contaP.setAgencia(agencia);
		contaP.setNumeroConta(123456780);
		contaP.setSaldo(12);
		contaP.setValorRendimento(400);
		
		dao.create(contaP);
		try {
			dao.commit();
		} catch (CommitErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		em.close();
		System.exit(0);
	}
}
