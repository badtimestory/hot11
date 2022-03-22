<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>주문서 작성 페이지</h1>
	<form action="./add" method="post">
		<!-- o_num, m_id, p_num, t_num, o_name, o_date, o_phone, o_address, o_amount, o_price, o_pay-->
		<!-- 같이 넘어가야할 것  -->
		
		<input type="hidden" name="m_id" value="${member.m_id}" >
		<input type="text" name="p_num" value="${dto.p_num}">
		<input type="text" name="t_num" value="${dto.t_num}" >
		
		<h5>주문내역</h5>
		<hr>
		<div>
			<h5>주문정보</h5>
			주문하시는 분 <input type="text" name="o_name">
			주소 <textarea rows="" cols="" name="o_address" ></textarea>
			핸드폰번호 <input type="text" name="o_phone">
			배송메시지 <textarea rows="" cols="" name="o_message"></textarea>
		</div>

		
		<div>
		<h5>결제수단</h5>		
		무통장입금<input type="radio" name="o_pay" value="1">
		카드<input type="radio" name="o_pay" value="0">
		 
		</div>
		
		<h5>최종결제 금액</h5>
		주문 수량 <input type="text" name="o_amount" value="${dto.o_amount }">
		결제 금액 <input type="text" name="o_price" value="${dto.o_price }">
		<input type="submit" value="add">결제하기
		
	</form>
</body>
</html>