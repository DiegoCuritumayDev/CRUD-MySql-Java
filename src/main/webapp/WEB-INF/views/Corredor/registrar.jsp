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
	<h3>¡Corredor - Registrar!</h3>
	
	<!-- Formulario Spring -->
	<form:form name="" method="post" action="" modelAttribute="corredor">
		Nombre y apellidos: <form:input type="text" path="nombre" placeholder="Ejm. Piero Martinez Rojas"/> <br><br>
		Sexo: 
		<form:select path="sexo">
			<form:option value="">-- Seleccione --</form:option>
			<form:option value="M">Masculino</form:option>
			<form:option value="F">Femenino</form:option>
		</form:select> <br><br>
		Fecha de nacimiento: <form:input type="date" path="fnacimiento"/> <br><br>
		Sueldo (S/): <form:input type="number" step="any" path="sueldo" placeholder="Ejm. 1025"/> <br><br>
		Celular: <form:input type="text" path="celular" placeholder="Ejm. 994313746"/> <br><br>
		Email: <form:input type="text" path="email" placeholder="Ejm. mario@gmail.com"/> <br><br>
		Fecha de contrato: <form:input type="date" path="fcontrato"/> <br><br>
		
		Auto:
		<form:select path="auto.autoId">
			<form:option value="">-- Seleccione --</form:option>
			<form:options items="${bAutos}" itemValue="autoId" itemLabel="autoId"/>
		</form:select> <br><br>
		
		Equipo:
		<form:select path="equipo.equipoId">
			<form:option value="">-- Seleccione --</form:option>
			<form:options items="${bEquipos}" itemValue="equipoId" itemLabel="nombreDep"/>
		</form:select> <br><br>
		
		Copa:
		<form:select path="copa.copaId">
			<form:option value="">-- Seleccione --</form:option>
			<form:options items="${bCopas}" itemValue="copaId" itemLabel="nombreCo"/>
		</form:select> <br><br>
		
		<button type="submit">Guardar</button>
		<button type="button" onclick="location.href='/senati/corredor/listar'">Cancelar</button>
	</form:form>
	</div>
</body>
</html>