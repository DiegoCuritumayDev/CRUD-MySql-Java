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
</style>
<title>registrar</title>
</head>
<body>
	<div align="center">
	<h3>¡Registrar Auto Nuevo!</h3>
	
	<!-- Formulario Spring -->
	<form:form name="" method="post" action="" modelAttribute="auto">
		Marca: <form:input type="text" path="marca" placeholder="Ejm. Ferrari"/> <br><br>
		Motor: <form:input type="text" path="motor" placeholder="Ejm. 1500HP"/> <br><br>
		
		<button type="submit">Guardar</button>
		<button type="button" onclick="location.href='/senati/auto/listar'">Cancelar</button>
	</form:form>
	</div>
</body>
</html>