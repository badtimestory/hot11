<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
<link href="../resources/css/orders.css" rel="stylesheet">
</head>
<body>
<c:import url="../template/shop_header.jsp"></c:import>
<form action="./orderView" method="get"></form>

<h3>${sessionScope.member.m_name}님의 주문내역</h3>
<input type="hidden" name="m_id" value="${sessionScope.member.m_id}" >
	<section id="content">
		<div class="orderInfo">
		<!-- varStatus 상태용 변수 -->
			<c:forEach items="${orderView}" var="orderView" varStatus="status">
			<!-- 첫번째인지 여부 -->
			<c:if test="${status.first}">
				<p><span>수령인</span>${orderView.o_name}</p>
				<p><span>주소</span>${orderView.o_address}</p>
				<p><span>총금액</span><fmt:formatNumber pattern="###,###,###" value="${orderView.o_amount }"/>원</p>
			</c:if>
			
			</c:forEach>
		</div>
		
		<ul class="orderView">
			<c:forEach items="${requestScope.orderView}" var="orderView">
				<li>
					<span>
					<img alt="상품이미지"
			src="../resources/images/products/${pageScope.orderView.fileDTOs[0].pf_fileName}" width="120">
					</span>
					<div class="gdsInfo">
					<p>
						<span>상품명</span>${orderView.p_name }<br />
						<span>개당 가격</span><fmt:formatNumber pattern="###,###,###" value="${orderView.p_price }"/>원<br />
						<span>구입 수량</span>${orderView.c_stock } 개 <br />
						<span>최종 가격</span><fmt:formatNumber pattern="###,###,###" value="${orderView.p_price * orderView.c_stock }"/>원
					</p>
					</div>
				</li>
			</c:forEach>
		</ul>
	</section>
	
</body>
</html>