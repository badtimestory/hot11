<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/shop_header.jsp"></c:import>
	<h3>${sessionScope.member.m_name}님의 장바구니 목록</h3>
	<table>
		<thead>
			<tr>
				<th></th>
				<th>이미지</th>
				<th>상품정보</th>
				<th>판매가</th>
				<th>수량</th>
				<th>합계</th>
				<th>선택</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${list}" var="cart">
				<tr>
					<td> <input type="hidden" name="c_num" value="${pageScope.cart.c_num}"> </td>
					<td>이미지</td>
					<td><a href="./detail?p_num=${pageScope.cart.p_num}">${pageScope.cart.p_name}</a></td>
					<td><input type="number" readonly id="p_price" name="p_price" value="${pageScope.cart.p_price}"></td>
					<td><input type="number" class="count" name="p_count" readonly="readonly" id="p_count" value="${pageScope.cart.p_count}"> 
					
							<input type="button" id="plus" value="+">
							<input type="button" id="minus" value="-">
				
						</td>
					<td><input type="number" name="c_amount" id="c_amount" value="${pageScope.cart.c_amount}" readonly></td>
					
					<td><a href="../orders/add?m_id=${sessionScope.member.m_id }&c_num=${cart.c_num}&p_num=${pageScope.cart.p_num}">주문</a></td>
					<td><a href="./delete?c_num=${pageScope.cart.c_num}">삭제</a></td>
					
			

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script type="text/javascript" src="../resources/js/cart.js"></script>
</body>
</html>