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
	<h3>¡Listado de Copas a competir!</h3>
	
	<a href="/senati/home">Home</a> | 
	<a href="/senati/copa/registrar">Registrar</a> <br><br>
	
	<div class="div-table" align="center">
	<table class="tabla">
		<tr class="encabezado">
			<td><b>ID</b></td>
			<td><b>Nombre de Copa</b></td>
			<td><b>V. del premio</b></td>
			<td><b>F. Apertura</b></td>
			<td><b>F. Clausura</b></td>
			<td class="ac"><b>Acción</b></td>
		</tr>
		
		<c:forEach var="copa" items="${bCopas}">
			<tr>
				<td>${copa.copaId}</td>
				<td>${copa.nombreCo}</td>
				<td>${copa.vpremio}</td>
				<td>${copa.fapertura}</td>
				<td>${copa.fclausura}</td>
				<td>
					<a class="editar" href="/senati/copa/editar/${copa.copaId}">Editar</a> | 
					<a class="borrar" href="/senati/copa/borrar/${copa.copaId}">Borrar</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	</div>
</body>
</html>