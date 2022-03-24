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
	<h1>My Page</h1>
	<h3>${dto.m_id}</h3>
	<input type="hidden" name="m_pw" value="${dto.m_pw}" readonly="readonly" >
	<h3>${dto.m_name}</h3>
	<h3>${dto.m_phone}</h3>
	<h3>${dto.m_email}</h3>
	<h3>${dto.m_address}</h3>
	<h3>${dto.m_birth }</h3>
	
	<a href="./delete?m_id=${dto.m_id}" >회원탈퇴</a>
	<a href="./update?m_id=${dto.m_id}">회원정보수정</a>
</body>
</html>