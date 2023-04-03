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
	<h3>¡Conyuge - Borrar!</h3>
	
	<form:form name="" method="post" action="" modelAttribute="conyuge">
		Corredor ID: <form:input class="idLabel" type="text" path="conyugeId" readonly="true"/> <br><br>
		Nombre y apellidos: <form:input type="text" path="nombreAp" readonly="true"/> <br><br>
		
		<p>¿Está seguro de borrar?</p>
		
		<button type="submit">Si,borrar</button>
		<button type="button" onclick="location.href='/senati/conyuge/listar'">Cancelar</button>
	</form:form>
	</div>
</body>
</html>