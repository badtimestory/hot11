<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Update Page</h1>
	<form action="./update" method="POST">
		<input type = "hidden" name="p_num" readonly="readonly" value="${dto.p_num}">
		<div>
			상품명 <input type="text" name="p_name" value="${dto.p_name}">
		</div>
		<div>
			상품가격 <input type="text" name="p_price" value="${dto.p_price}">
		</div>
		<div>
			재고량 <input type="text" name="p_stock" value="${dto.p_stock}">
		</div>
		<div>
			<textarea rows="10" cols="" name="p_detail" placeholder="상품정보를 입력하세요">${dto.p_detail}</textarea>
		</div>
		<button>작성</button>
	</form>
</body>
</html>