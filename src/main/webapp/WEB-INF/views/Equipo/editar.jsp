<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Librería Spring Form -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value='/css/styleERB.css'/>" rel="stylesheet">
<title>editar</title>
</head>
<body>
	<div align="center">
	<h3>¡Equipos - Editar!</h3>
	
	<form:form name="" method="post" action="" modelAttribute="equipo">
		ID: <form:input class="idLabel" type="text" path="equipoId" readonly="true"/> <br><br>
		Nombre del Equipo: <form:input type="text" path="nombreDep"/> <br><br>
		Telefono: <form:input type="text" path="telefono"/> <br><br>
		
		<button type="submit">Guardar</button>
		<button type="button" onclick="location.href='/senati/equipo/listar'">Cancelar</button>
	</form:form>
	</div>
</body>
</html>