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
	<h1>카테고리</h1>
	
	<table>
			<tr>
				<th>카테고리번호</th>
				<th>카테고리이름</th>
			</tr>
			<c:forEach items="${list}" var="cate">
			<tr>
				<th>${cate.t_num}</th>
				<th>${cate.t_name}</th>
			</tr>
			</c:forEach>
		</table>
</body>
</html>