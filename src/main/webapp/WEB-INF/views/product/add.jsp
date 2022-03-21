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
	<h1>Product Add Page</h1>
	<form action="./add" method="POST">
	<div>
		상품명 <input type="text" name="p_name">
	</div>
	<div>
		상품가격 <input type="text" name="p_price">
	</div>
	<div>
		재고량 <input type="text" name="p_stock">
	</div>
	<div>
		<textarea rows="10" cols="" name="p_detail" placeholder="상품정보를 입력하세요"></textarea>
	</div>
	<button>작성</button>
	</form>
</body>
</html>