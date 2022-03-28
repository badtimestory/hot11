<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="./template/header_css.jsp"></c:import>
<script type="text/javascript"></script>
</head>
<body>
	<c:import url="./template/header.jsp"></c:import>

	<h1>메인 페이지</h1>
	<h3>
		님 환영합니다 <span class="material-icons-outlined"> account_circle </span>

	</h3>
	

	<div>
		<c:if test="${not empty member}">
			<a class="my" href="./member/mypage">MyPage</a>
			<a href="./member/logout">Logout</a>
		</c:if>

		<c:if test="${empty member}">
			<a href="./memberJoin/login">Login</a>
			<a href="./memberJoin/join">Join</a>
		</c:if>

	</div>


	


</body>
</html>