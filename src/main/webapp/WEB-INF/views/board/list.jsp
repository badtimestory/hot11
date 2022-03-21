<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/shop_header.jsp"></c:import>
	<h1>Board list page</h1>
		<table>
			<tr>
				<th>NO.</th>
				<th>SUBJECT</th>
				<th>NAME</th>
			</tr>
				<c:forEach items="${list}" var="dto">
			<tr>
				<th>${dto.b_num}</th>
				<th><a href="./detail?b_num=${dto.b_num}">${dto.b_title}</a></th>
				<th>${dto.b_writer}</th>
			</tr>
				</c:forEach>
		</table>
		<a href="./add">쓰기</a>
</body>
</html>