<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>주문확인</h1>
<form action="./list" method="get"></form>

<!-- o_num, m_id, p_num, t_num, o_name, o_date, o_phone, o_address, o_amount, o_price, o_pay-->
		<h5>주문내역</h5>
		<hr>
		<table>
			<thead>
				<tr>
					<th>주문번호</th>
					<th>아이디</th>
					<th>제품번호</th>
					<th>카테고리번호</th>
					<th>주문자이름</th>
					<th>주문날짜</th>
					<th>핸드폰번호</th>
					<th>주소</th>
					<th>수량</th>
					<th>총금액</th>
					<th>지불수단</th>
					<th>배송메시지</th>
				</tr>
			</thead>
			<!-- o_num, m_id, p_num, t_num, o_name, o_date, o_phone, o_address, o_amount, o_price, o_pay-->
			<tbody>
				<c:forEach items="${list}" var="orders">
					<tr>
						<td>${orders.o_num}</td>
						<td>${orders.m_id}</td>
						<td>${orders.p_num }</td>
						<td>${orders.t_num }</td>
						<td>${orders.o_name }</td>
						<td>${orders.o_date }</td>
						<td>${orders.o_phone }</td>
						<td>${orders.o_address }</td>
						<td>${orders.o_amount }</td>
						<td>${orders.o_price }</td>
						<td>${orders.o_pay }</td>
						<td>${orders.o_message }</td>
					</tr>
				</c:forEach>
			
			</tbody>
		</table>
		
	
</body>
</html>