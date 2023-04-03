<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Librer�a Spring Form -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value='/css/styleERB.css'/>" rel="stylesheet">
<title>Borrar</title>
</head>
<body>
	<div align="center">
	<h3>�Auto - Borrar!</h3>
	
	<form:form name="" method="post" action="" modelAttribute="auto">
		ID: <form:input class="idLabel" type="text" path="autoId" readonly="true"/> <br><br>
		Marca: <form:input type="text" path="marca" readonly="true"/> <br><br>
		Motor: <form:input type="text" path="motor" readonly="true"/> <br><br>
		
		<p>�Est� seguro de borrar?</p>
		
		<button type="submit">Si,borrar</button>
		<button type="button" onclick="location.href='/senati/auto/listar'">Cancelar</button>
	</form:form>
	</div>
</body>
</html>