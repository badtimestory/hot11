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
	<h3>${dto.id}</h3>
	<h3>${dto.name}</h3>
	<h3>${dto.phone}</h3>
	<h3>${dto.email}</h3>
	<h3>${dto.address}</h3>
	<h3>${dto.birth }</h3>
	
	<a href="./delete?id=${dto.id}" >회원탈퇴</a>
	<a href="./update?id=${dto.id}">회원정보수정</a>
</body>
</html>