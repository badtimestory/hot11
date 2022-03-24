<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/shop_header.jsp"></c:import>
	<h1>Review Detail Page</h1>
	<h3>R_NUM : ${detail.num}</h3>
	<h3>P_NUM : ${detail.p_num}</h3>
	<h3>O_NUM : ${detail.o_num}</h3>
	<h3>M_ID : ${detail.m_id}</h3>
	<h3>T_NUM : ${detail.num}</h3>
	<h3>R_TITLE : ${detail.title}</h3>
	<h3>R_CONTENTS : ${detail.contents}</h3>
	<h3>R_WRITER : ${detail.writer}</h3>
	<h3>R_REGDATE : ${detail.regDate}</h3>
	<h3>R_HIT : ${detail.hit}</h3>
	<h3>R_REF : ${detail.ref}</h3>
	<h3>R_STEP : ${detail.step}</h3>
	<h3>R_DEPTH : ${detail.depth}</h3>
	<hr>
	<a href="./update?num=${detail.num}">수정</a>
	<a href="./delete?num=${detail.num}">삭제</a>
	<a href="./reply?num=${detail.num}">답글</a>
	
</body>
</html>