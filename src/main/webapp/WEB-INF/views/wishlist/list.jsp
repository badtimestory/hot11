<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관심상품 목록</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/shop_header.jsp"></c:import>

	<h1>${sessionScope.member.m_name}님의 관심상품 목록</h1>
	
	<table>
		<thead>
			<tr>
				<th>체크박스</th>
				<th>이미지</th>
				<th>상품정보</th>
				<th>판매가</th>
							
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${wishlistList}" var="wishlistList">
				<tr>
					<td><input type="hidden" name="w_num" value="${pageScope.wishlistList.w_num}"> </td>
					<td>이미지</td>
					<td><a href="./detail?p_num=${pageScope.wishlist.p_num}">${pageScope.wishlistList.p_name}</a>정보</td>
					<td><input type="number" readonly id="p_price" name="p_price" value="${pageScope.wishlistList.p_price}">가격</td>
					<td><a href="..orders/add?m_id=${sessionScope.member.m_id}&w_num=${wishlistList.w_num}$p_num=${pageScope.wishlistList.p_num}">주문하기</a></td>
					<td><a href="./delete?p_num=${wishlist.p_num}">삭제</a></td>
				</tr>
			
			</c:forEach>
		</tbody>
		
	</table>
	
		<c:if test="${not empty member}">
		<a href="./delete?num=${dto.num}">삭제</a>
		</c:if>
	</div>
	
	<script type="text/javascript" src="../resources/js/wishlist"></script>
</body>
</html>