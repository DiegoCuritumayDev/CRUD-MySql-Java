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
	<h3>¡Registrar Conyuge Nuevo!</h3>
	
	<!-- Formulario Spring -->
	<form:form name="" method="post" action="" modelAttribute="conyuge">
		Nombres y Apellidos: <form:input type="text" path="nombreAp" placeholder="Ejm. Sofia Vergara"/> <br><br>
		DNI: <form:input type="text" path="dni" placeholder="Introduce DNI del conyuge"/> <br><br>
		Celular: <form:input type="text" path="celular" placeholder="Ejm. 997384690"/> <br><br>
		
		Seleccionar Corredor:
		<form:select path="corredor.corredorId">
			<form:option value="">-- Seleccione --</form:option>
			<form:options items="${bCorredores}" itemValue="corredorId" itemLabel="nombre"/>
		</form:select> <br><br>
		
		<button type="submit">Guardar</button>
		<button type="button" onclick="location.href='/senati/conyuge/listar'">Cancelar</button>
	</form:form>
	</div>
</body>
</html>