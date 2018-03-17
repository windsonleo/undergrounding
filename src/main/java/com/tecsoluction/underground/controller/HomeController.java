package com.tecsoluction.underground.controller;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsoluction.underground.servico.UsuarioServicoImpl;


@Controller
public class HomeController {
	
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    
	@Autowired
	private  UsuarioServicoImpl usuarioService = new UsuarioServicoImpl();
	
    @Autowired 
    private JavaMailSender mailSender;
	

	
	  @ModelAttribute
	    public void addAttributes(Model model) {
		  
//		  	List<Produto> produtos = produtoService.findAll();
//
//	        List<Categoria> categorias = categoriaService.findAll();
	        
//
//	        model.addAttribute("categorias", categorias);
//	        model.addAttribute("produtos", produtos);


	    }
	
	
	
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView Home(Locale locale, Model model) {
       
    	logger.info("Welcome Home /home! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/home");


        return home;
    }
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Homem(Locale locale, Model model) {
       
    	logger.info("Welcome Home /! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/home");


        return home;
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView Login(Locale locale, Model model) {
      
    	logger.info("Welcome login! The client locale is {}.", locale);


        ModelAndView login = new ModelAndView("/public/login");
        
//        login.addObject("usuario", new Usuario());


        return login;
    }
    
    
    @RequestMapping(value = "/erro", method = RequestMethod.GET)
    public ModelAndView Error(Locale locale, Model model) {
       
    	logger.info("Welcome Error ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/erro");


        return home;
    }
    
    @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
    public ModelAndView accessdenied(Locale locale, Model model) {
       
    	logger.info("Welcome accessdenied ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/accessdenied");


        return home;
    }
    
    
    @RequestMapping(value = "/esquecisenha", method = RequestMethod.GET)
    public ModelAndView Cadastros(Locale locale, Model model) {
       
    	logger.info("Welcome cadastros ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/esquecisenha");


        return home;
    }
    
    @RequestMapping(value = "/registro", method = RequestMethod.GET)
    public ModelAndView Registro(Locale locale, Model model) {
       
    	logger.info("Welcome registro ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/registro");


        return home;
    }
    
    @RequestMapping(value = "/encontros", method = RequestMethod.GET)
    public ModelAndView Encontros(Locale locale, Model model) {
       
    	logger.info("Welcome encontros ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/encontros");


        return home;
    }
    
    @RequestMapping(value = "/movimentacoes", method = RequestMethod.GET)
    public ModelAndView Movimentacoes(Locale locale, Model model) {
       
    	logger.info("Welcome movimentacoes ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/private/movimentacoes");


        return home;
    }
    
    @RequestMapping(value = "/financeiro", method = RequestMethod.GET)
    public ModelAndView ffinanceiro(Locale locale, Model model) {
       
    	logger.info("Welcome financeiro ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/private/financeiro");


        return home;
    }
    
    
//    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
//    public ModelAndView Checkout(Locale locale, Model model) {
//       
//    	logger.info("Welcome Checkout ! The client locale is {}.", locale);
//
//        ModelAndView home = new ModelAndView("/public/checkout");
//
//
//        return home;
//    }
    
    @RequestMapping(value = "/ajuda", method = RequestMethod.GET)
    public ModelAndView Ajuda(Locale locale, Model model) {
       
    	logger.info("Welcome ajuda ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/ajuda");


        return home;
    }
    
    @RequestMapping(value = "/contato", method = RequestMethod.GET)
    public ModelAndView Contato(Locale locale, Model model) {
       
    	logger.info("Welcome Contato ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/contato");


        return home;
    }
    
    
    @RequestMapping(value = "/entregas", method = RequestMethod.GET)
    public ModelAndView Entrega(Locale locale, Model model) {
       
    	logger.info("Welcome Entrega ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/entrega");


        return home;
    }
    
     
    
    @RequestMapping(value = "/catalogo", method = RequestMethod.GET)
    public ModelAndView Catalogo(Locale locale, Model model) {
       
    	logger.info("Welcome catalogo ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/catalogo");


        return home;
    }
    
    
    @RequestMapping(value = "/novos", method = RequestMethod.GET)
    public ModelAndView novos(Locale locale, Model model) {
       
    	logger.info("Welcome novos! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/novos");


        return home;
    }
     
    @RequestMapping(value = "/aempresa", method = RequestMethod.GET)
    public ModelAndView AeMPRESA(Locale locale, Model model) {
       
    	logger.info("Welcome ampresa ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/empresa");


        return home;
    }
     
    @RequestMapping(value = "/indicacao", method = RequestMethod.GET)
    public ModelAndView Indicacao(Locale locale, Model model) {
       
    	logger.info("Welcome indicacao ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/indicacao");


        return home;
    }
     
    @RequestMapping(value = "/ofertas", method = RequestMethod.GET)
    public ModelAndView Ofertas(Locale locale, Model model) {
       
    	logger.info("Welcome ofertas ! The client locale is {}.", locale);

        ModelAndView home = new ModelAndView("/public/ofertas");


        return home;
    }
    
//    @RequestMapping(value = "/enviaremail", method = RequestMethod.POST)
//    public ModelAndView enviaremail(Locale locale, Model model) {
//       
//    	logger.info("Welcome enviaremail ! The client locale is {}.", locale);
//    	
//        ModelAndView home = new ModelAndView("/public/home");
//
//    	senderMailService = new SenderMailService();
//    	
//    	senderMailService.enviar();
//    	
//
//        return home;
//    }
   
    @RequestMapping(value = "/enviaremail", method = RequestMethod.GET)
    public ModelAndView enviaremail(Locale locale, Model model, HttpServletRequest request) {
       
    	
    	logger.info("Welcome enviaremail ! The client locale is {}.", locale);
    	
    	String sucesso = "Email enviado com sucesso!";
    	
    	String erro = "Erro ao enviar email.";
    	
    	UUID idf = UUID.fromString("2700325f-cc1b-428b-b617-0a3a5f57a246");
    	
//    	Empresa empresa = empresaServico.findOne(idf);
    
    	
    	String email = request.getParameter("email");
    	

        ModelAndView home = new ModelAndView("/public/home");
       

        SimpleMailMessage message = new SimpleMailMessage();

        message.setText("Olá Voce Recebeu este Email da Tecshop");
        message.setTo(email);
//        message.setFrom(empresa.getEmail());

        try {
            mailSender.send(message);
            home.addObject("sucesso", sucesso);
            return home;
        } catch (Exception e) {
            e.printStackTrace();
            home.addObject("erro", erro + e);
            return home;
        }
        
    }  

}
