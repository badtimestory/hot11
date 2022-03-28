<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관심상품 목록</title>
</head>
<body>

	<h1>관심상품 목록</h1>
	
	<table>
		<thead>
			<tr>
				<th>이미지</th>
				<th>상품정보</th>
				<th>판매가</th>
				<th>선택</th>				
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="wishlist">
				<tr>
					<td>이미지</td>
					<td><a href="./detail?p_num=${pageScope.cart.p_num}">${pageScope.wishlist.p_name}</a></td>
					<td>${pageScope.wishlist.p_price}</td>
					<td>주문하기/<a href="./delete?p_num=${wishlist.p_num}">삭제</a></td>
				</tr>
			
			</c:forEach>
		</tbody>
		
	</table>
	
	<div>
			<c:if test="${pager.pre}">
				<a href="./list?page=${pager.startNum-1}">PREVIEW</a>
			</c:if>
		
			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
			
			<a href="./list?page=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a>
			</c:forEach>
		
			<c:if test="${pager.next}">
				<a href="./list?page=${pager.lastNum+1}">NEXT</a>
			</c:if>
		
		</div>
		<c:if test="${not empty member}">
		<a href="./delete?num=${dto.num}">삭제</a>
		</c:if>
	</div>
	

</body>
</html>