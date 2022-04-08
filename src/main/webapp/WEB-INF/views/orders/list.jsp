<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h1>주문확인</h1>
<form action="./list" method="get"></form>

	<section id="content">
		<ul class="orderList">
			<c:forEach items="${orderList}" var="orderList">
				<li>
					<div>
						<p><span>주문번호</span><a href="./orderView?n=${orderList.orderid }">${orderList.orderid}</a></p>
						<p><span>수령인</span>${orderList.o_name}</p>
						<p><span>주소</span>${orderList.o_address}</p>
						<p><span>금액</span>${orderList.o_amount}</p>
						
					</div>
				</li>
			</c:forEach>
		</ul>
	</section>
	
</body>
</html>