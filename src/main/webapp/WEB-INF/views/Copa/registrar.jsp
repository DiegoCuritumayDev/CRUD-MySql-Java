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
<title>registrar</title>
</head>
<body>
	<div align="center">
	<h3>¡Registrar Nueva Copa!</h3>
	
	<!-- Formulario Spring -->
	<form:form name="" method="post" action="" modelAttribute="copa">
		Nombre de la Copa: <form:input type="text" path="nombreCo" placeholder="Ejm. Copa Detroit"/> <br><br>
		Valor del Premio $/: <form:input type="number" path="vpremio"/> <br><br>
		Fecha de Apertura: <form:input type="date" path="fapertura"/> <br><br>
		Fecha de Clausura: <form:input type="date" path="fclausura"/> <br><br>
		
		<button type="submit">Guardar</button>
		<button type="button" onclick="location.href='/senati/copa/listar'">Cancelar</button>
	</form:form>
	</div>
</body>
</html>