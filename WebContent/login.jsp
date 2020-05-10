<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 
 <s:form action="loginaction">
     <s:textfield label="Login" key="loginid" />
     <s:password  label="Senha" key="senha" />
     <s:submit />
</s:form>
 
 <!-- SEM MODEL DRIVEN 
  <s:form action="loginaction">
     <s:textfield label="Login" key="usuario.loginid" />
     <s:password  label="Senha" key="usuario.senha" />
     <s:submit />
</s:form>
 -->
</body>
</html>