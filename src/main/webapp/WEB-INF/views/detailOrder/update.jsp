<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>DetailOrders Update Page</h1>
	<form action="./update" method="POST">
	<input type="hidden" name="d_num" readonly="readonly" value="${dto.d_num}">
		주문수량 <input type="number" name="d_amount" value="${dto.d_amount}" min="1">
	<button>작성</button>
	</form>
	<a href="delete?d_num=${dto.d_num}">삭제</a>
</body>
</html>