<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="<c:url value='/css/styleLogin.css'/>" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" rel="stylesheet">
<script type="text/javascript" src="<c:url value='/js/showPass.js'/>"></script>
</head>
<body>
	<div class="login-box" align="center">
		<h3>Login de la página</h3>
		
		<form name="" method="post" action="/senati/login">
			
			<!-- token de seguridad -->
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			
			<!-- Si estan mal las credenciales -->
			<c:if test="${param.error!=null}">
				<span class="notexist">!Error, acceso denegado!</span> <br><br>
			</c:if>
			
			<!-- Si se ha cerrado sesion -->
			<c:if test="${param.logout!=null}">
				<span class="disconnect">!Has sido desconectado!</span> <br><br>
			</c:if>
			<div class="user-box">
				<input type="text" name="txtUsername" required/><label>Username</label> <br>
			</div>
			<div class="user-box">
				<input type="password" name="txtPassword" id="password" required/><label>Password</label>
				<span><i class="fa-regular fa-eye" id="eye" onclick="toggle()"></i></span> <br><br>
			</div>
			
			<button type="submit">
				<span class="span"></span>
				<span class="span"></span>
				<span class="span"></span>
				<span class="span"></span>
				Iniciar sesión
			</button>
			<button type="button" onclick="location.href='/senati/home'">Cancelar</button>
		</form>
	</div>
</body>
</html>