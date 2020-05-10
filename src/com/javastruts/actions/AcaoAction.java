package com.javastruts.actions;

import com.javastruts.pojo.Usuario;
import com.javastruts.services.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

// public class AcaoAction extends ActionSupport{  (Sem  model driven)

public class AcaoAction extends ActionSupport implements ModelDriven<Usuario>{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;  
    
    private Usuario usuario = new Usuario();
    
    
    public void validate() {    	
    	
    	if(usuario.getLoginid().isEmpty()) {   		
    		addFieldError("loginid", "Login está em branco");
    	}
    	
    	if(usuario.getSenha().isEmpty()) {    				
    	    addFieldError("senha", "Senha está em branco");
    	}
    }
	
   public String execute() {  
	   
	  LoginService loginService = new LoginService();	
	  
	  if (loginService.verificaLogin(usuario))
	     { 
		   usuario.setStatus(SUCCESS); 
		 } 
		  else {
			  usuario.setStatus(ERROR);
	 	 }		 
		 
	   return usuario.getStatus();	   
   }   
   
   public String addMetodo() {	    
	   System.out.println("metodo addMetodo");
	   return SUCCESS;
   }
  
    public String removeMetodo() {
    	System.out.println("metodo removeMetodo");
    	return ERROR;
    }
    
    public String terceiroMetodo() {
    	System.out.println("metodo terceiroMetodo");
    	return ERROR;
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public Usuario getModel() {		 
		return usuario;
	}

	


    
    

 
  
  
   
   
}
