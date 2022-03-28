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
	<h1>주문서 작성 페이지</h1>
	<form action="./add" method="post" id="frm">
		<!-- o_num, m_id, p_num, t_num, o_name, o_date, o_phone, o_address, o_amount, o_price, o_pay-->
		<!-- 같이 넘어가야할 것  -->
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

		
		<h5>주문정보</h5>
		<hr>
		<table>
			<tbody>
				<tr>
					<th scope="row">주문하시는 분 <img
						src="../resources/image/ico_required.png" alt="필수"></th>
					<td colspan="2"><input type="text" name="o_name" id="o_name"></td>
				</tr>


				<tr>
					<th scope="row">주소 <img src="../resources/image/ico_required.png" alt="필수"></th>
					<td colspan="2">
					<input type="text" name="o_address" id="o_address"></td>
				</tr>


				<tr>
					<th>Phone <img src="../resources/image/ico_required.png"alt="필수"></th>
					<td><input type="tel" placeholder="숫자만 입력해주세요." name="o_phone" id="o_phone"></td>
				</tr>

				<tr>
					<th>배송메시지 <img src="../resources/image/ico_required.png"alt="필수"></th>
					<td><textarea rows="" cols="" name="o_message" id="o_message" ></textarea></td>
				</tr>

			</tbody>
		</table>
		<input type="hidden" name="m_id" value="${member.m_id}"> 
		<input type="hidden" name="c_num" value="${cart.c_num}"> 
		
		<hr>
		<table>
			<tr>
			<th>결제수단</th>
			<td>무통장입금<input type="radio" name="o_pay" value="무통장입금"> 
			카드<input type="radio" name="o_pay" value="카드"></td>
			</tr>
		</table>
			

	

		<h5>최종결제 금액</h5>
		<c:forEach items="#{dto.cartDTOs}" var="c">
		주문 수량 <input type="text" name="o_amount" value="${c.p_count}">
		결제 금액 <input type="text" name="o_price" value="${c.c_amount}">
		</c:forEach>
		<input type="button" id="btn1" value="add">결제하기

	</form>
	<script src="../resources/js/orders.js"></script>
</body>
</html>