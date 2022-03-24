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
	<h1>장바구니 목록</h1>

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
					<td>${pageScope.cart.p_price}</td>
					<td><input type="text" class="qunatity" value="1"> 
						<span>
							<button class="plus_btn">+</button>
							<button class="minus_btn">-</button>
						</span>
					</td>
					<td>${pageScope.cart.c_amount}</td>
					<td>주문하기/<a href="./delete?c_num=${cart.c_num}">삭제</a></td>
					
			

				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>