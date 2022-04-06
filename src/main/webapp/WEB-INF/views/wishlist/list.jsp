<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관심상품 목록</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
<link rel="stylesheet" href="../resources/css/wishlist.css">
</head>
<body>
	<c:import url="../template/shop_header.jsp"></c:import>

	<h1>Wish List</h1>
	<div class="mi">
	<ul>
		<li>
			<div class= "checkAll">
				모두 선택<input type="checkbox" id="checkAll">
			</div>			
			
		</li>
	</ul>

	<table class="table">
	
	<thead>
		<tr class="middle">
			<th>모두선택</th>
			<th class="col2">이미지</th>
			<th class="col3">상품정보</th>
			<th class="col3">판매가</th>
			<th class="col4">선택</th>
		</tr>
	</thead>
					
	<tbody>
				<c:forEach items="${wishlistList}" var="wishlistList">
					<tr id="rules">	
					
						<td><input type="checkbox" class="check"></td>
						<td>이미지</td> 
						<td><a href="./detail?p_num=${pageScope.wishlist.p_num}">${pageScope.wishlistList.p_name}</a></td>
						<td><input type="number" readonly id="p_price" name="p_price" value="${pageScope.wishlistList.p_price}"></td>
						<p class="delToWish">
						<td><button class="del" type="button" data-w_num="${wishlistList.w_num}">삭제</button></td>
						</p>
							
							<!-- <div>
				
					 <span></span> <input type="hidden" name="w_num" value="${pageScope.wishlistList.w_num}"> </td>
					<span>이미지</span>
					<span> <a href="./detail?p_num=${pageScope.wishlist.p_num}">${pageScope.wishlistList.p_name}</a></span>
					<span><input type="number" readonly id="p_price" name="p_price" value="${pageScope.wishlistList.p_price}"></span>
					<span><a href="..orders/add?m_id=${sessionScope.member.m_id}&w_num=${wishlistList.w_num}$p_num=${pageScope.wishlistList.p_num}">주문하기</a></span>
					<span><a href="./delete?p_num=${wishlist.p_num}">삭제</a></span>
				
				</div>-->
						
					</tr>
			</div>
			</c:forEach>
		</tbody>
		</div>
	</table>
	
	</div>

	<script src="../resources/js/wishlist.js"></script>
</body>
</html>