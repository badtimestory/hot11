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
			<div class="checkAll">
				모두 선택<input type="checkbox" id="checkAll">
			</div>
			
			<div class="delBtn">
				<button type="button" id="DelBtn" class="Delete_btn">선택 삭제</button>
			</div>
		</li>
	</ul>

		<table class="table">

			<thead class="dle">
				<tr class="middle">

					<th></th>
					<th class="col2">이미지</th>
					<th class="col3">상품정보</th>
					<th>상품번호</th>
					<th>카트리스트 번호</th>
					<th class="col3">판매가</th>
					<th class="col4">선택</th>

				</tr>
			</thead>

			<tbody class="xas">
				<c:forEach items="${wishlistList}" var="wishlistList">
					<tr id="rules">

						<td><input type="checkbox" class="check" data-w_num="${wishlistList.w_num}"> </td>
						<td><a href="../product/detail?p_num=${pageScope.wishlistList.p_num}">이미지
						<img alt src="../resources/images/products/${dto.productFileDTO.pf_fileName}"></a></td>
						<td><a href="../product/detail?p_num=${pageScope.wishlistList.p_num}">${pageScope.wishlistList.p_name}</a></td>
						<td><a href="../product/detail?p_num=${pageScope.wishlistList.p_num}">${pageScope.wishlistList.p_num}</a></td>
						<td><a href="../product/detail?p_num=${pageScope.wishlistList.p_num}">${pageScope.wishlistList.t_num}</a></td>
						<td><input type="number" readonly id="p_price" name="p_price"	value="${pageScope.wishlistList.p_price}"></td>
						
						<td><button class="del" type="button"data-w_num="${wishlistList.w_num}">삭제</button></td>
						<td><button type="button" class="addCart_btn" data-pNum="${wishlistList.p_num}" data-tNum="${wishlistList.t_num}">장바구니 추가</button></td>			
						
					</tr>					
				</c:forEach>
			</tbody>

			</div>
		</table>
	</div>



	<script type="text/javascript" src="../resources/js/wishlist.js"></script>
</body>
</html>