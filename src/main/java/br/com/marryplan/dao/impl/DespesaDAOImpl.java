package br.com.marryplan.dao.impl;


import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import br.com.marryplan.entidade.Despesa;
import br.com.marryplan.entidade.Tarefas;
import br.com.marryplan.dao.DespesaDAO;


@Repository
public class DespesaDAOImpl extends AbstractDAO implements DespesaDAO {

	@Override
	public void salvar(Despesa despesa) {
		// TODO Auto-generated method stub
		this.getEntityManager().persist(despesa);
	}

	@Override
	public void excluir(long id) {
		// TODO Auto-generated method stub
		Despesa despesa= this.consultarPorId(id);
		this.getEntityManager().remove(despesa);
		
	}

	@Override
	public void alterar(Despesa despesa) {
		// TODO Auto-generated method stub
		this.getEntityManager().merge(despesa);
	}

	@Override
	public Despesa consultarPorId(long id) {
		return super.getEntityManager().find(Despesa.class, id);
	}

	
	@Override
	public List<Despesa> consultarTodos() {
		// TODO Auto-generated method stub
		Query query = super.getEntityManager().createQuery("select A from Despesa A");
		List<Despesa> listarDespesa = query.getResultList();
		getEntityManager().close();
		return listarDespesa;
		
	}
	
	
}
