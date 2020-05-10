package com.javastruts.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private String loginid;
	private String senha;
	
	public void validade() {		
		
		if(getLoginid().isEmpty()) {
			addFieldError("loginid", "Login não pode ser vazio");			
		}

		if(getSenha().isEmpty()) {
			addFieldError("senha", "Senha não pode ser vazia");			
		}
		
		
	}
	
	public String execute() {
		
		if(getLoginid().equals("loginid") && getSenha().equals("senha")) {
			return SUCCESS; }
		else {
			return ERROR;	
	  }
			
		
	}

	public String getLoginid() {
		return loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
