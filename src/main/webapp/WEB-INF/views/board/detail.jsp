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
	<!-- model.addAttribute("detail", boardDTO); -->
	<h3>SUBJECT : ${detail.title}</h3>
	<h3>NAME : ${detail.writer}</h3>
	${detail.contents}
	<div>
		<a>수정</a>
		<a>삭제</a>
	</div>
</body>
</html>