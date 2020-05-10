package com.javastruts.actions;

import com.opensymphony.xwork2.Action;

public class AcaoServico implements Action {
	
	public String execute() {
		return SUCCESS;
	}
	
	public String getTheInformationIneed() {
		return " The iformation from service class";
	}
	


}
