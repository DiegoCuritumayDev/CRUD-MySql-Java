<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value='/css/style.css'/>" rel="stylesheet">
<title>listar</title>
</head>
<body>
	<div align="center">
	<h3>¡Listado de Equipos!</h3>
	
	<a href="/senati/home">Home</a> | 
	<a href="/senati/equipo/registrar">Registrar</a> <br><br>
	
	<div class="div-table" align="center">
	<table class="tabla">
		<tr class="encabezado">
			<td><b>ID</b></td>
			<td><b>Nombre del Equipo</b></td>
			<td><b>Telefono</b></td>
			<td class="ac"><b>Acción</b></td>
		</tr>
		
		<c:forEach var="equipo" items="${bEquipos}">
			<tr>
				<td>${equipo.equipoId}</td>
				<td>${equipo.nombreDep}</td>
				<td>${equipo.telefono}</td>
				<td>
					<a class="editar" href="/senati/equipo/editar/${equipo.equipoId}">Editar</a> | 
					<a class="borrar" href="/senati/equipo/borrar/${equipo.equipoId}">Borrar</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	</div>
</body>
</html>