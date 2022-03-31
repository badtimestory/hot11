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
	<h1>Product Detail Page</h1>
	<input type="hidden" readonly id="p_num" name="p_num" value="${dto.p_num}">
	<h3> 상품번호 : ${dto.p_num}</h3>
	<h3>카테고리: ${dto.t_num}</h3>
	<h3>상품명 : ${dto.p_name}</h3>
	<input type="number" readonly id="p_price" name="p_price" value="${dto. p_price}">
	<h3>상품가격 : ${dto. p_price}</h3>
	<h3>상품상세정보 : ${dto. p_detail}</h3>
	<a href="./update?p_num=${dto.p_num}">수정</a>
	<a href="./delete?p_num=${dto.p_num}">삭제</a>
	<p class="addToCart">
		<button type="button" class="addCart_btn" data-pNum="${dto.p_num}" data-tNum="${dto.t_num}" data-cAmount="${dto.p_price}">장바구니 추가</button>
		<script type="text/javascript" src="../resources/js/addToCart.js"></script>
		
		</p>
</body>
</html>