package br.com.marryplan.service;


import java.util.List;

import br.com.marryplan.entidade.Despesa;
import br.com.marryplan.vo.DespesaVO;

public interface DespesaService {


	public void salvar(DespesaVO despesaVO);
	public List<DespesaVO> listarTodosDespesa();
	public void excluir(long id);
	public void alterarDespesa(DespesaVO despesaVO);
	public Despesa consultarDespesaPorId(long id);		
}
