<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- Libreria JSTL Core -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>listar</title>
<link href="<c:url value='/css/style.css'/>" rel="stylesheet">
</head>
<body>
	<div align="center">
	<h3>¡Corredores - Listar!</h3>
	
	<a href="/senati/home">Home |</a>
	<a href="/senati/corredor/registrar">Registrar</a> <br><br>
	
	<div class="div-table" align="center">
	<table class="tabla">
		<!-- encabezado -->
		<tr class="encabezado">
			<td><b>ID</b></td>
			<td><b>Nombres y Apellidos</b></td>
			<td><b>Sexo</b></td>
			<td><b>F.Nacimiento</b></td>
			<td><b>Sueldo</b></td>
			<td><b>Celular</b></td>
			<td><b>Email</b></td>
			<td><b>Fecha de Contrato</b></td>
			<td class="ac"><b>Acción</b></td>
		</tr>
		
		<!-- filas -->
		<c:forEach var="corredor" items="${participes}">
			<tr>
				<td>${corredor.corredorId}</td>
				<td>${corredor.nombre}</td>
				<td>${corredor.sexo}</td>
				<td>${corredor.fnacimiento}</td>
				<td>${corredor.sueldo}</td>
				<td>${corredor.celular}</td>
				<td>${corredor.email}</td>
				<td>${corredor.fcontrato}</td>
				<td>
					<a class="editar" href="/senati/corredor/editar/${corredor.corredorId}" type="button">Editar</a> | 
					<a class="borrar" href="/senati/corredor/borrar/${corredor.corredorId}" type="button">Borrar</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	</div>
</body>
</html>








