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
	<h1>list page</h1>
	
		<table>
			<tr>
				<th>NUM</th>
				<th>TITLE</th>
				<th>CONTENTS</th>
				<th>WRITER</th>
			</tr>
	<c:forEach items="${list}" var="board">
			<tr>
				<th>${board.num}</th>
				<th>${board.title}</th>
				<th>${board.contents}</th>
				<th>${board.writer}</th>
			</tr>
	</c:forEach>
		</table>
</body>
</html>