<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="s" uri="/struts-tags" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Busca</title>
</head>
<body>
<!-- 
   <form action="acao">
       <input id="language" name="idioma">
       <input type="submit" />
   </form>
-->
<s:form action="acao">
  <s:textfield label="Busca" key="idioma" />
  <s:submit />
</s:form>




</body>
</html>