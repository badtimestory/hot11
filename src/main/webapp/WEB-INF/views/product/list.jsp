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

	<h1>Product List page</h1>
	<table>
			<tr>
				<th>상품번호</th>
				<th>상품명</th>
				<th>상품가격</th>
				
			</tr>
			<c:forEach items="${list}" var="product">
			<tr>
				<th>${product.p_num}</th>
				<th><a href="./detail?p_num=${product.p_num}">${product.p_name}</a></th>
				<th>${product.p_price}</th>
			</tr>
			
			</c:forEach>
			
		
		</table>
		<hr>
		<a href="../cart/list?"></a>
		<a href="./add">상품추가</a>
</body>
</html>