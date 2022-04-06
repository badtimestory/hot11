<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#preview > img {
		margin: 20px;
		width: 200px;
		height: 200px;
	}
</style>
<c:import url="../template/shop_header_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/shop_header.jsp"></c:import>
	<h1>Product Add Page</h1>
	<form action="./add" method="POST" enctype="multipart/form-data">
	<div>
		<label>상품명</label>
		<input type="text" name="p_name">
	</div>
	<div>

		<select name="t_num">
				<option value="1">OUTER</option>
				<option value="2">TOP</option>
				<option value="3">BOTTOM</option>
			</select>
	</div>
	
	<div>
		<label>상품가격</label>
		<input type="text" name="p_price">
	</div>
	<div>
		<label>재고량</label> 
		<input type="text" name="p_stock">
	</div>
	<div>
		<label>상품정보</label>
		<textarea rows="5" cols="50" name="p_detail" placeholder="상품정보를 입력하세요"></textarea>
	</div>
	<div class="container">
	 	<label>이미지</label>
	 	<!-- accept="image/*" ==> 모든 타입의 이미지 파일 허용 -->
	 	<input type="file" id="photo" name="photo" accept="image/*" onchange="previewImage(this)"/>
		 <div id="preview"></div>
	</div>

	<button>작성</button>
	</form>
	<script type="text/javascript" src="../resources/js/productAdd.js"></script>
</body>
</html>