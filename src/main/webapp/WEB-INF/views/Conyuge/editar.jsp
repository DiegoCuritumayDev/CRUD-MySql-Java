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
	<h3>¡Conyuge - Editar!</h3>
	
	<!-- Formulario Spring -->
	<form:form name="" method="post" action="" modelAttribute="conyuge">
		ID de Conyuge: <form:input class="idLabel" type="text" path="conyugeId" readonly="true"/> <br><br>
		Nombre y apellidos: <form:input type="text" path="nombreAp"/> <br><br>
		DNI: <form:input type="text" path="dni"/> <br><br>
		Celular: <form:input type="text" path="celular"/> <br><br>
		Corredor:
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