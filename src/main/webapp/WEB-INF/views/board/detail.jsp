<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Detail Test Page</h1>
	<h3>SUBJECT : ${dto.title}</h3>
	<h3>NAME : ${dto.writer}</h3>
	${dto.contents}
	<hr>
	<div>
		<a href="./update?num=${dto.num}">수정</a>
		<a href="./delete?num=${dto.num}">삭제</a>
	</div>
</body>
</html>