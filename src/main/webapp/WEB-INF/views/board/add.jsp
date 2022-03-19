<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/header_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
 	<h1>Board Add Page</h1>
 	<!-- 서버로 POST 요청 -->
 	<form action="./add" method="POST">
 		<div>
			제목 <input type="text" name="b_title" placeholder="제목을 입력하세요">
		</div>
		<div>
		<!-- 임시로 작성자 탑텐으로 고정 -->		
 		작성자 <input type="text" name="b_writer" value="탑텐" readonly="readonly">
 		</div>
		<div>
			내용 <textarea rows="" cols="" name="b_contents" placeholder="내용을 입력하세요"></textarea>
		</div>
	<button>작성</button>
 	</form>
</body>
</html>