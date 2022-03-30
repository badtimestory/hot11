<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/shop_header.jsp"></c:import>
	<h1>Review Add Page</h1>
	<form action="./add" method="POST">
	<input type="hidden" name="m_id" value="${member.m_id}" readonly="readonly"/>
		<div>
		제목 <input type="text" name="title">
		</div>
		<div>
		작성자 <input type="text" name="writer" value="${member.m_id}">
		</div>
		<div>
			카테고리 
			<select name="t_num">
				<option value="1">OUTER</option>
				<option value="2">TOP</option>
				<option value="3">BOTTOM</option>
			</select>
		</div>
		<div>
		내용 <textarea rows="" cols="" name="contents"></textarea>
		</div>
	<button>작성</button>
	</form>
</body>
</html>