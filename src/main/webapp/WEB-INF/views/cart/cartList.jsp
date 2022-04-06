<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
<link href="../resources/css/cart.css" rel="stylesheet">

</head>
<c:import url="../template/shop_header.jsp"></c:import>
	<h3>${sessionScope.member.m_name}님의 장바구니 목록</h3>
	<ul>
		<li>
			<div class="allCheck">
				모두 선택<input type="checkbox" id="allCheck"> 
			</div>
			
			<div class="delBtn">
				<button type="button" id="selectDelBtn" class="selectDelete_btn">선택 삭제</button>
			</div>
		</li>
	</ul>
	
	
	<table class="list">
		<thead>
			<tr>
				<th>선택</th>
				<th>이미지</th>
				<th>상품정보</th>
				<th>판매가</th>
				<th>수량</th>
				<th>합계</th>
				<th></th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${cartList}" var="cartList">
				<tr>
					<td><input type="checkbox" class="check" data-c_num="${cartList.c_num}"> </td>
					<td>이미지</td>
					<td><a href="./detail?p_num=${pageScope.cartList.p_num}">${pageScope.cartList.p_name}</a></td>
					<td><input type="number" readonly id="p_price" name="p_price" value="${pageScope.cartList.p_price}"></td>
					<td> 
					<input type="number" class="count" name="c_stock" readonly="readonly" id="c_stock" value="${pageScope.cartList.c_stock}">
					</td> 
					<td><input type="number" id="c_amount" value="${pageScope.cartList.p_price * pageScope.cartList.c_stock}" readonly></td> 
					
					<td><button type="button" class="delete_btn" data-c_num="${cartList.c_num }">삭제</button></td>
					<%-- <td> <input type="hidden" name="c_num" value="${pageScope.cartList.c_num}"> </td> --%>
					
			

				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script type="text/javascript" src="../resources/js/cart.js"></script>
</body>
</html>