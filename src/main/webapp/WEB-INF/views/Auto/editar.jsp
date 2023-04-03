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
	<h3>¡Autos - Editar!</h3>
	
	<form:form name="" method="post" action="" modelAttribute="auto">
		ID de Auto: <form:input class="idLabel" type="text" path="autoId" readonly="true"/> <br><br>
		Marca: <form:input type="text" path="marca"/> <br><br>
		Motor: <form:input type="text" path="motor"/> <br><br>
		
		<button type="submit">Guardar</button>
		<button type="button" onclick="location.href='/senati/auto/listar'">Cancelar</button>
	</form:form>
	</div>
</body>
</html>