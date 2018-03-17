package com.tecsoluction.underground;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.underground.entidade.Usuario;
import com.tecsoluction.underground.exception.CustomGenericException;
import com.tecsoluction.underground.servico.RoleServicoImpl;
import com.tecsoluction.underground.servico.UsuarioServicoImpl;




@ControllerAdvice
public class ContextoAplicacao {

	@Autowired
	private  UsuarioServicoImpl usuarioService = new UsuarioServicoImpl();
	
//	@Autowired
//	private EmpresaServicoImpl empresaService = new EmpresaServicoImpl();
//	
//	@Autowired
//	private ProdutoServicoImpl produtoService = new ProdutoServicoImpl();
//	
	@Autowired
	private RoleServicoImpl roleService = new RoleServicoImpl();
	
//	private Empresa empresa;
	

	@Autowired
	public ContextoAplicacao() {

	}

	@ModelAttribute
	public void addAttributes(Model model) {

//		  List<Empresa> empresas = empresaService.findAll();

	        //verifica se há empresa cadastrada
//	        if(empresas.isEmpty()) {
//	        	
//	        model.addAttribute("erro", "Nenhuma Empresa Cadastrada");
//	        
//	        empresa = new Empresa();
//	        
//	        empresa.setAtivo(true);
//	        empresa.setCnpj("9999999");
//	        empresa.setNomefantasia("Empresa Padrão");
//	        empresa.setTelefone("55 81 3469-5251");
//	        empresa.setImagem("logof.png");
//	        empresa.setBanner("bannerf.png");
//	        empresa.setEmail("empresa@empresa.com");
//	        	
//	        	
//	        } else {
//	        
//	         empresa = empresas.get(0);
//	        
//	        }
	        
	        // fim de empresa
	        
	        
	        //inicio de ususario logado
	        
	        Usuario usuario = new Usuario();
	        usuario.setEmail(SecurityContextHolder.getContext().getAuthentication().getName());
	        usuario = usuarioService.findByEmail(usuario.getEmail());
	        
	        //verifica se há usuario cadastrado
	        if(usuario == null) {
	        	
	        model.addAttribute("mensagem", "Carregado Usuario Padrão");
	        
	        usuario = new Usuario();
	        UUID idf = UUID.fromString("4b71a569-c0bd-41a2-bffe-35e39e1a875a");
	        usuario = usuarioService.findOne(idf);
	        	
	        	
	        } else {
        	
		        model.addAttribute("mensagem", "Bem-Vindo " + usuario.getEmail());

	        
	        }

	        
	        model.addAttribute("usuarioAtt", usuario);
//	        model.addAttribute("empresas", empresas);
//	        model.addAttribute("empresa", empresa);

	}

	@ExceptionHandler(CustomGenericException.class)
	public ModelAndView handleCustomException(Exception ex) {
		//TODO: Remover o new apos implementar os erros no controllers
		
		//https://www.mkyong.com/spring-mvc/spring-mvc-exceptionhandler-example/
		CustomGenericException ex1 = new CustomGenericException(ex.getCause().toString(), ex.getMessage());
		ModelAndView model = new ModelAndView("/public/error/erro");
		model.addObject("errCode", ex1.getErrCode());
		model.addObject("errMsg", ex1.getErrMsg());

		return model;

	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {

		ModelAndView model = new ModelAndView("/public/error/erro");
		model.addObject("errMsg", ex.toString());

		return model;

	}

}
