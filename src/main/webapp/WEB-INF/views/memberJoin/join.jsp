<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.slim.min.js" integrity="sha256-u7e5khyithlIdTpu22PHhENmPcRdFiHRjhAuHcs05RI="
crossorigin="anonymous"></script>
<c:import url="../template/shop_header_css.jsp"></c:import>
</head>
<body>
	<c:import url="../template/shop_header.jsp"></c:import>
	<h1>Join Page</h1>

	<form action="./join" method="post" id="frm">
	

		<fieldset>
			<legend>ID *</legend>
			<input type="text" name="m_id" id="id">
			<div id="idResult"></div>
		</fieldset>


		<fieldset>
			<legend>Password *</legend>
			<input type="password" name="m_pw" id="pw"
				placeholder="8글자이상 12글자 이하로 작성하세요.">
			<!-- input 안에 placeholder="8글자이상 12글자 이하로 작성하세요." -->
			<div id="pwResult"></div>
		</fieldset>


		<fieldset>
			<legend>Password 확인 *</legend>
			<input type="password" name="m_pw2" id="pw2">
			<div id="pwResult2"></div>
		</fieldset>

		<fieldset>
			<legend>Name *</legend>
			<input type="text" name="m_name" id="name">
		</fieldset>

		<fieldset>
			<legend>Phone *</legend>
			<input type="tel" placeholder="숫자만 입력해주세요." name="m_phone" id="phone">
		</fieldset>

		<fieldset>
			<legend>Email</legend>
            <input type="text" placeholder="ex)id@gmail.com" name="m_email" id="email"> 
		</fieldset>

		<fieldset>
			<legend>Address *</legend>
			<input type="text" name="m_address" id="address">
		</fieldset>

		<fieldset>
			<legend>Birth</legend>
			<input type="date" name="m_birth" id="birth">
		</fieldset>

		<fieldset>
			<button type="button" id="btn">JOIN</button>
		</fieldset>


		</form>

		<script type="text/javascript" src="../resources/js/join.js"></script>
        
		
</body>
</html>