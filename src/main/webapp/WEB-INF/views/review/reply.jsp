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
	<h1>Reply Test Page</h1>
	<form action="./reply" method="POST">
	<input type="hidden" name="num" readonly="readonly" value="${reply.num}">
		<div>
		제목 <input type="text" name="title">
		</div>
		<div>
		작성자 <input type="text" name="writer">
		</div>
		<div>
		내용 <textarea rows="" cols="" name="contents">${reply.contents}</textarea>
		</div>
	<button>작성</button>
	</form>
	
</body>
</html>