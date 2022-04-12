<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관심상품 목록</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
<link rel="stylesheet" href="../resources/css/wishlist.css">
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
</head>
<body>
	<c:import url="../template/shop_header.jsp"></c:import>

	<h1>Wish List</h1>
	<input type="hidden" id="m_id" name="m_id"
		value="${sessionScope.member.m_id}">


	<table class="table">

		<thead class="dle">
			<tr class="middle">
				<th class="product">
					<ul>
						<li>
							<div class="checkAll">
								<input type="checkbox" id="checkAll">
							</div>

						</li>
					</ul>
				</th>
				<th class="product">이미지</th>
				<th class="product">상품정보</th>
				<th class="col3">판매가</th>
				<th class="product">선택</th>


			</tr>
		</thead>

		<tbody class="xas">
			<c:forEach items="${requestScope.wishlistList}" var="wishlistList">
				<tr id="rules">

					<td class="product"><input type="checkbox" class="check" 
						data-w_num="${wishlistList.w_num}"></td>
						<td class="product"><img alt="상품이미지"
			src="../resources/images/products/${pageScope.wishlistList.fileDTOs[0].pf_fileName}" width="120"></td>
					<td class="product"><a
						href="../product/detail?p_num=${pageScope.wishlistList.p_num}">${pageScope.wishlistList.p_name}</a></td>
					<td class="number"><input type="number" readonly id="p_price" name="p_price"
						value="${pageScope.wishlistList.p_price}"></td>
					<td class="product"><button class="del" type="button"
							data-w_num="${wishlistList.w_num}">삭제</button></td>			
					
				</tr>

			</c:forEach>

		</tbody>
		</div>
	</table>
	<tfoot>

		<div class="delBtn">
			<button type="button" id="DelBtn" class="Delete_btn">선택 삭제</button>
			<script>
				$(".Delete_btn").click(function() {
					var confirm_val = confirm("삭제하시겠습니까?");
					if (confirm_val) {
						var checkArr = new Array();
						$("input[class='check']:checked").each(function() {
							checkArr.push($(this).attr("data-w_num"));
						});
						$.ajax({
							url : "../wishlist/seleDelet",
							type : "post",
							data : {
								check : checkArr
							},
							success : function(result) {
								if (result == 1) {
									location.reload();
								} else {
									alert("삭제실패")
								}
							}
						});

					}

				})
			</script>
		</div>

	</tfoot>




	<script type="text/javascript" src="../resources/js/wishlist.js"></script>
</body>
</html>