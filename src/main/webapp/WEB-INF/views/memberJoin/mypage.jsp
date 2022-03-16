<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>My Page</h1>
	<h3>${member.id}</h3>
	<input type="hidden" name="pw" value="${member.pw}" readonly="readonly" >
	<h3>${member.name}</h3>
	<h3>${member.phone}</h3>
	<h3>${member.email}</h3>
	<h3>${member.address}</h3>
	<h3>${member.birth }</h3>
	
	<a href="./delete?id=${member.id}" >회원탈퇴</a>
	<a href="./update?id=${member.id}">회원정보수정</a>
</body>
</html>