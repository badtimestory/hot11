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
<link rel="stylesheet" href="../resources/css/join.css">
</head>
<body>
	<c:import url="../template/shop_header.jsp"></c:import>
	
	<h3 class="basic-title"> 기본정보</h3>
	<h3 class="etc"><img src="../resources/images/ico_required.png" alt="필수"> 필수입력사항</h3>

	<form action="./join" method="post" id="frm">
	
		<table>
			<tbody>
				<tr>
					<th scope="row">ID <img src="../resources/images/ico_required.png" alt="필수"></th>
					<td colspan="2"><input type="text" name="m_id" id="id"></td>
					<td id="idResult"></td>
				</tr>


			<tr>
				<th scope="row">Password <img src="../resources/images/ico_required.png" alt="필수"></th>
				<td colspan="2"><input type="password" name="m_pw" id="pw"
					placeholder="8글자이상 12글자 이하로 작성하세요."></td>
				<td id="pwResult"></td>
			</tr>


			<tr>
				<th scope="row">Password 확인 <img src="../resources/images/ico_required.png" alt="필수"></th>
				<td colspan="2"><input type="password" name="m_pw2" id="pw2"></td>
				<td id="pwResult2"></td>
			</tr>

			<tr>
				<th scope="row">Name <img src="../resources/images/ico_required.png" alt="필수"></th>
				<td><input type="text" name="m_name" id="name"></td>
			</tr>

			<tr>
				<th>Phone <img src="../resources/images/ico_required.png" alt="필수"></th>
				<td><input type="tel" placeholder="숫자만 입력해주세요." name="m_phone" id="phone"></td>
			</tr>

			<tr>
				<th>Email <img src="../resources/images/ico_required.png" alt="필수"></th>
				<td><input type="text" placeholder="ex)id@gmail.com" name="m_email" id="email"></td> 
			</tr>

			<tr>
				<th>Address <img src="../resources/images/ico_required.png" alt="필수"></th>
				<td><input type="text" name="m_address" id="address"></td>
			</tr>

			<tr>
				<th>Birth</th>
				<td><input type="date" name="m_birth" id="birth"></td>
			</tr>
			
			
			</tbody>
		</table>	
			<div><button type="button" id="btn">JOIN</button></div>

		</form>

		<script type="text/javascript" src="../resources/js/join.js"></script>
        
		
</body>
</html>