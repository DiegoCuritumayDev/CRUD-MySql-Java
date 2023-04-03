<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value='/css/style.css'/>" rel="stylesheet">
<title>listar</title>
</head>
<body>
	<div class="div-principal" align="center">
	<h3>¡Listado de Autos!</h3>
	
	<a href="/senati/home">Home</a> | 
	<a href="/senati/auto/registrar">Registrar</a> <br><br>
	
	<div class="div-table"  align="center">
	<table class="tabla">
		<tr class="encabezado">
			<td><b>ID</b></td>
			<td><b>Marca</b></td>
			<td><b>Motor</b></td>
			<td class="ac"><b>Acción</b></td>
		</tr>
		
		<c:forEach var="auto" items="${bAutos}">
			<tr>
				<td>${auto.autoId}</td>
				<td>${auto.marca}</td>
				<td>${auto.motor}</td>
				<td>
					<a class="editar" href="/senati/auto/editar/${auto.autoId}">Editar</a> | 
					<a class="borrar" href="/senati/auto/borrar/${auto.autoId}">Borrar</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	</div>
</body>
</html>