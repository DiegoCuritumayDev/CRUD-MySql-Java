<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- Libreria Spring Security TagLib -->
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value='/css/styleHome.css'/>" rel="stylesheet">
<title>home</title>
</head>
<body>
	<div class="home" align="center">
		<h1>Bienvenido al home de la Página</h3>
		
		<p>¿A donde desea dirigirse?</p><br>
		
		<a href="/senati/corredor/listar"><span></span><span></span><span></span><span></span>Corredores</a>
		<a href="/senati/auto/listar"><span></span><span></span><span></span><span></span>Autos</a>
		<a btn-1" href="/senati/conyuge/listar"><span></span><span></span><span></span><span></span>Conyuges</a>
		<a href="/senati/copa/listar"><span></span><span></span><span></span><span></span>Copas</a>
		<a href="/senati/equipo/listar"><span></span><span></span><span></span><span></span>Equipos</a>
		
		<!-- Si es visitante -->
		<security:authorize access="isAnonymous()">
			<a href="/senati/login"><span></span><span></span><span></span><span></span>Login</a>
		</security:authorize>
		
		<div class="logout">
		<!-- Si es usuario autenticado -->
		<security:authorize access="isAuthenticated()">
			<security:authentication property="principal.username" var="username"/>
			<br><br><br><br>Bienvenido/a ${username}   <a href="/senati/logout"><span></span><span></span><span></span><span></span>Logout</a>
		</security:authorize>
		</div>
	</div>
</body>
</html>