<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/header_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
	<h1>DetailOrders List Page</h1>
		<table>
			<tr>
				<th>상세주문번호</th>
				<th>주문수량</th>
			</tr>
			<c:forEach items="${list}" var="dto">
			<tr>
				<th>${dto.d_num}</th>
				<th>${dto.d_amount}</th>
				<th><a href="./update?d_num=${dto.d_num}">수정</a><th>
			</tr>
			</c:forEach>
		</table>
</body>
</html>