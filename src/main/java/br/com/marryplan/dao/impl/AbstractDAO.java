package br.com.marryplan.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.marryplan.entidade.Despesa;
import br.com.marryplan.entidade.Tarefas;

public class AbstractDAO {
	
	@PersistenceContext(unitName="jpa-persistence")
	private EntityManager em;

	public EntityManager getEntityManager() {
		return em;
	}

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}


}
