<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
<link href="../resources/css/cart.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>

</head>
<c:import url="../template/shop_header.jsp"></c:import>

	<h3>${sessionScope.member.m_name}님의 장바구니 목록</h3>
	<input type="hidden" id="m_id" name="m_id" value="${sessionScope.member.m_id}">
<div class="mi">
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
			<tr class="middle">
				<th>선택</th>
				<th class="col3">이미지</th>
				<th class="col3">상품정보</th>
				<th class="col3">판매가</th>
				<th class="col3">수량</th>
				<th class="col4">합계</th>
				<th></th>
			</tr>
		</thead>

		<tbody>
			<c:set var="sum" value="0"/>
			<c:forEach items="${cartList}" var="cartList">
				<tr id="rules">
					<td><input type="checkbox" name="check" class="check" data-c_num="${cartList.c_num}"> </td>
					<td>이미지</td>
					<td><a href="../product/detail?p_num=${pageScope.cartList.p_num}">${pageScope.cartList.p_name}</a></td>
					<td><input type="number" readonly id="p_price" name="p_price" value="${pageScope.cartList.p_price}"></td>
					<td> 
					<input type="number" class="count" name="c_stock" readonly="readonly" id="c_stock" value="${pageScope.cartList.c_stock}">
					</td> 
					<td><input type="number" id="c_amount" value="${pageScope.cartList.p_price * pageScope.cartList.c_stock}" readonly></td> 
					
					<td><button type="button" class="delete_btn" data-c_num="${cartList.c_num }">삭제</button></td>
					<%-- <td> <input type="hidden" name="c_num" value="${pageScope.cartList.c_num}"> </td> --%>
					
			

				</tr>
				<c:set var="sum" value="${sum+(pageScope.cartList.p_price*pageScope.cartList.c_stock)}"/>
			</c:forEach>
		</tbody>
		
	</table>
</div>
		<div class="listResult">
			<div class="sum">
			
				총합계 :<fmt:formatNumber pattern="###,###,###" value="${sum}" />원
			</div>
			<div class="order">
				<button type="button" class="orderInfo_btn">주문정보입력</button>
				
				<!-- $(선택자).동작함수 -->
				<script>
					$(".orderInfo_btn").click(function () {
						$(".orderInfo").slideDown();
						$(".orderInfo_btn").slideUp();
					});
				</script>
			</div>
		</div>
		
		<div class="orderInfo">
			<form role="form" method="post" autocomplete="off">
				<input type="hidden" name="o_amount" value="${sum}"/>
				
				<div class="inputArea">
					<label for="">주문하는 사람</label>
					<input type="text" name="o_name" id="o_name" required="required">
				</div>
				
				<div class="inputArea">
					<label for="o_phone">주문자 연락처</label>
					<input type="text" name="o_phone" id="o_phone" required="required">
				</div>
				
				<div class="inputArea">
					<label for="o_address">주소</label>
					<input type="text" name="o_address" id="o_address" required="required">
				</div>
				
				<div class="inputArea">
					<button type="submit" class="order_btn">주문</button>
					<button type="button" class="cancel_btn">취소</button>
					
					<script>
					$(".cancel_btn").click(function () {
						$(".orderInfo").slideUp();
						$(".orderInfo_btn").slideDown();
						
					});
					</script>
				</div>
			</form>
		</div>

	<script type="text/javascript" src="../resources/js/cart.js"></script>
</body>
</html>