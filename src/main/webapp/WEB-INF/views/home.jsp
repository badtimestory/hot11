<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Home Page</h1>
	<h3>${sessionScope.member.m_name}님</h3>
	<div>
		<c:if test="${empty member}">
			<a href="./memberJoin/login">Login</a>
			<a href="./memberJoin/join">Join</a>
		</c:if>
		
		<c:if test="${not empty member }">
			<a href="./memberJoin/mypage">My Page</a>
			<a href="./memberJoin/logout">Logout</a>
		</c:if>
	</div>
</body>
</html>