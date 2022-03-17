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
				<th>NO.</th>
				<th>SUBJECT</th>
				<th>NAME</th>
			</tr>
				<c:forEach items="${list}" var="board">
			<tr>
				<th>${board.b_num}</th>
				<th><a href="./detail?b_num=${board.b_num}">${board.b_title}</a></th>
				<th>${board.b_writer}</th>
			</tr>
				</c:forEach>
		</table>
		<a href="./add">쓰기</a>
</body>
</html>