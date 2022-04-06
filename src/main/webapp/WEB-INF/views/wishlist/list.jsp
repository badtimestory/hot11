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
		
			<div class="rule-container">
			
			<div class="middle">
				<div class="rule">
					<span class="col1"><input type="checkbox" id="checkAll"></span> <span class="col2">이미지</span>
					<span class="col3">상품정보</span> <span class="col4">판매가</span>

				</div>
			</div>
			
			<tbody>
				<c:forEach items="${wishlistList}" var="wishlistList">
					<div id="rules">
						<div class="rule">
							<fieldset>
								<input type="checkbox" class="check"> <span></span>
								<input type="hidden" name="w_num"value="${pageScope.wishlistList.w_num}">
								<span>이미지</span> 
								<span> <a href="./detail?p_num=${pageScope.wishlist.p_num}">${pageScope.wishlistList.p_name}</a></span>
								<span><input type="number" readonly id="p_price" name="p_price" value="${pageScope.wishlistList.p_price}"></span>
								<p class="delToWish">
								<span><button class="del" type="button" data-w_num="${wishlistList.w_num}">삭제</button></span>
								</p>
							</fieldset>
							<!-- <div>
				
					 <span></span> <input type="hidden" name="w_num" value="${pageScope.wishlistList.w_num}"> </td>
					<span>이미지</span>
					<span> <a href="./detail?p_num=${pageScope.wishlist.p_num}">${pageScope.wishlistList.p_name}</a></span>
					<span><input type="number" readonly id="p_price" name="p_price" value="${pageScope.wishlistList.p_price}"></span>
					<span><a href="..orders/add?m_id=${sessionScope.member.m_id}&w_num=${wishlistList.w_num}$p_num=${pageScope.wishlistList.p_num}">주문하기</a></span>
					<span><a href="./delete?p_num=${wishlist.p_num}">삭제</a></span>
				
				</div>-->
						</div>
					</div>
			</div>
			</c:forEach>
		</tbody>
		</div>
	

	<c:if test="${not empty member}">
		<button type="button" id="btnDelete" >관심상품 비우기</button>
	</c:if>
	</div>

	<script src="../resources/js/wishlist.js"></script>
</body>
</html>