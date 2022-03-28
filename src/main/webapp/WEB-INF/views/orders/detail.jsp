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
	<form action="./detail" method="get">
		<!-- o_num, m_id, p_num, t_num, o_name, o_date, o_phone, o_address, o_amount, o_price, o_pay-->
		<h5>주문내역</h5>
		<hr>
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
				<c:forEach items="${dto.cartDTOs}" var="c">
					<tr>
						<td><input type="hidden" name="c_num"
							value="${c.c_num}"></td>
						<td>이미지</td>
						<td><a href="./detail?p_num=${c.p_num}">${c.p_name}</a></td>
						<td><input type="number" readonly id="p_price" name="p_price"
							value="${c.p_price}"></td>
						<td><input type="number" class="count" name="p_count" readonly="readonly" id="p_count"
							value="${c.p_count}"></td>
						<td><input type="number" name="c_amount" id="c_amount"
							value="${c.c_amount}" readonly></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>