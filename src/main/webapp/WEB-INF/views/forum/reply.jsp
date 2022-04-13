<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${forum} Reply Page</h1>
	
	<form action="./reply" method="post">
		<input type="hidden" readonly="readonly" value="${dto.num}" name="num">
		<input type="hidden" name="m_id" value="${member.m_id}" readonly="readonly" id="m_id">
		Title<input type="text" name="title">
		Writer<input type="text" name="writer">
		<div>
			Category 
			<select name="t_num">
				<option value="1">OUTER</option>
				<option value="2">TOP</option>
				<option value="3">BOTTOM</option>
			</select>
		</div>
		Contents<textarea name="contents" rows="" cols=""></textarea>
		<button type="submit">추가</button>
		
	</form>
	
</body>
</html>