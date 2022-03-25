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
					<td>이미지</td>
					<td><a href="./detail?p_num=${pageScope.cart.p_num}">${pageScope.cart.p_name}</a></td>
					<td id="price">${pageScope.cart.p_price}</td>
					<td><input type="number" class="count" name="p_count" readonly="readonly" id="result" value="${pageScope.cart.p_count}"> 
					
							<input type="button" id="plus" value="+">
							<input type="button" id="minus" value="-">
				
						</td>
					<td id="amount">${pageScope.cart.c_amount}</td>
					<td>주문하기/<a href="./delete?c_num=${pageScope.cart.c_num}&m_id=${member.m_id}">삭제</a></td>
					
			

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script type="text/javascript" src="../resources/js/cart.js"></script>
</body>
</html>