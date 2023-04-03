<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Librería Spring Form -->
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
	<h3>¡Copa - Borrar!</h3>
	
	<form:form name="" method="post" action="" modelAttribute="copa">
		ID: <form:input class="idLabel" type="text" path="copaId" readonly="true"/> <br><br>
		Nombre de la Copa: <form:input type="text" path="nombreCo" readonly="true"/> <br><br>
		
		<p>¿Está seguro de borrar?</p>
		
		<button type="submit">Si,borrar</button>
		<button type="button" onclick="location.href='/senati/copa/listar'">Cancelar</button>
	</form:form>
	</div>
</body>
</html>