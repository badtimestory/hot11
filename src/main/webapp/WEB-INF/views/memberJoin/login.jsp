<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
<link href="../resources/css/login.css" rel="stylesheet">
</head>
<body>
<c:import url="../template/shop_header.jsp"></c:import>
	<h1>Login</h1>

	<form action="./login" method="post">
	<div class="loginbox">
		<fieldset>
			<legend>ID</legend>
			<input type="text" name="m_id" value="${cookie.remember.value}">
		</fieldset>

		<fieldset>
			<legend>Password</legend>
			<input type="password" name="m_pw">
		</fieldset>

		<fieldset>
			<legend>Remember Me</legend>
			<input type="checkbox" name="remember" value="1">
		</fieldset>

		<fieldset>
			<button type="submit">Login</button>
		</fieldset>
	</div>
	</form>
</body>
</html>