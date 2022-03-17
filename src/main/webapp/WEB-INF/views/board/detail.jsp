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
	<h3>SUBJECT : ${dto.b_title}</h3>
	<h3>NAME : ${dto.b_writer}</h3>
	${dto.b_contents}
	<hr>
	<div>
		<a href="./update?b_num=${dto.b_num}">수정</a>
		<a href="./delete?b_num=${dto.b_num}">삭제</a>
	</div>
</body>
</html>