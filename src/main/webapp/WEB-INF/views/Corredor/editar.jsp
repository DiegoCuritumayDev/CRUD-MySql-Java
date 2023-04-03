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
	<h3>¡Corredor - Editar!</h3>
	
	<!-- Formulario Spring -->
	<form:form name="" method="post" action="" modelAttribute="corredor">
		Corredor ID: <form:input class="idLabel" type="text" path="corredorId" readonly="true"/> <br><br>
		Nombre y apellidos: <form:input type="text" path="nombre"/> <br><br>
		Sexo: 
		<form:select path="sexo">
			<form:option value="">-- Seleccione --</form:option>
			<form:option value="M">Masculino</form:option>
			<form:option value="F">Femenino</form:option>
		</form:select> <br> <br>
		Fecha de nacimiento: <form:input type="date" path="fnacimiento"/> <br><br>
		Sueldo (S/): <form:input type="number" step="any" path="sueldo"/> <br><br>
		Celular: <form:input type="text" path="celular"/> <br><br>
		Email: <form:input type="text" path="email"/> <br><br>
		Fecha de contrato: <form:input type="date" path="fcontrato"/> <br><br>
		
		<button type="submit">Guardar</button>
		<button type="button" onclick="location.href='/senati/corredor/listar'">Cancelar</button>
	</form:form>
	</div>
</body>
</html>