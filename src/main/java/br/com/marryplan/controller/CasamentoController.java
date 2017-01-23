package br.com.marryplan.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.marryplan.service.CasamentoService;
import br.com.marryplan.vo.CasamentoVO;


@ManagedBean (name = "casamentoMbean")
@SessionScoped
public class CasamentoController extends AbstractController{
	
	@Autowired
	private CasamentoService casamentoService;
	private CasamentoVO casamentoVO ;
	

	@PostConstruct
	public void init(){
		super.getConfigSpring();
		this.setCasamentoVO(this.casamentoService.consultarCasamentoVO(2));
	}
	
	CasamentoService getCasamentoService() {
		return casamentoService;
	}

	public void setCasamentoService(CasamentoService casamentoService) {
		this.casamentoService = casamentoService;
	}

	public CasamentoVO getCasamentoVO() {
		return casamentoVO;
	}

	public void setCasamentoVO(CasamentoVO casamentoVO) {
		this.casamentoVO = casamentoVO;
	}
	
	
	
	public void editarCasamento(){
		// chamando o método editar implementado na camada Service
		
		casamentoService.editarCasamentoVO(casamentoVO);
		
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("O casamento de " + casamentoVO.getNomeNoiva() + " e "
						+ casamentoVO.getNomeNoivo() + " foi alterado com sucesso!"));
	}
	
	
	//Limpar os campos
	
	
	
	public void cadastrar(){
		casamentoService.cadastrarCasamentoVO(casamentoVO);
		
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("O casamento de " + casamentoVO.getNomeNoiva() + " e "
						+ casamentoVO.getNomeNoivo() + " foi alterado com sucesso!"));
		
	}
	
	
	
}
