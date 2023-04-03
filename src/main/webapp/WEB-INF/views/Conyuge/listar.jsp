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
	<h3>¡Listado de Conyuges!</h3>
	
	<a href="/senati/home">Home</a> | 
	<a href="/senati/conyuge/registrar">Registrar</a> <br><br>
	
	<div class="div-table" align="center">
	<table class="tabla">
		<tr class="encabezado">
			<td><b>ID</b></td>
			<td><b>Nombres y Apellidos</b></td>
			<td><b>DNI</b></td>
			<td><b>Celular</b></td>
			<td><b>Nombre del Corredor</b></td>
			<td class="ac"><b>Acción</b></td>
		</tr>
		
		<c:forEach var="conyuge" items="${bConyuges}">
			<tr>
				<td>${conyuge.conyugeId}</td>
				<td>${conyuge.nombreAp}</td>
				<td>${conyuge.dni}</td>
				<td>${conyuge.celular}</td>
				<td>${conyuge.corredor.nombre}</td>
				<td>
					<a class="editar" href="/senati/conyuge/editar/${conyuge.conyugeId}">Editar</a> | 
					<a class="borrar" href="/senati/conyuge/borrar/${conyuge.conyugeId}">Borrar</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	</div>
</body>
</html>