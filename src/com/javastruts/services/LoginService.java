package com.javastruts.services;

import com.javastruts.pojo.Usuario;

public class LoginService {
	
	public boolean verificaLogin(Usuario usuario) {
		
		if(usuario.getLoginid().equals("loginind") && usuario.getSenha().equals("senha")) {
			return true;
		}
		return false;
	}

}
