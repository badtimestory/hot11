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
<c:import url="../template/shop_header_css.jsp"></c:import>
</head>
<body>
	<c:import url="../template/shop_header.jsp"></c:import>
	<h1>Join Page</h1>

	<form action="./join" method="post" id="frm">
		<form:form action="./join">

		<fieldset>
			<legend>ID</legend>
			<input type="text" name="m_id" id="id">
			<div id="idResult"></div>
		</fieldset>


		<fieldset>
			<legend>Password</legend>
			<input type="password" name="m_pw" id="pw"
				placeholder="8글자이상 12글자 이하로 작성하세요.">
			<!-- input 안에 placeholder="8글자이상 12글자 이하로 작성하세요." -->
			<div id="pwResult"></div>
		</fieldset>


		<fieldset>
			<legend>Password 확인</legend>
			<input type="password" name="m_pw2" id="pw2">
			<div id="pwResult2"></div>
		</fieldset>

		<fieldset>
			<legend>Name</legend>
			<input type="text" name="m_name" id="name">
		</fieldset>

		<fieldset>
			<legend>Phone</legend>
			<input type="tel" name="m_phone" id="phone">
		</fieldset>

		<fieldset>
			<legend>email *</legend>
				<input type="text" id="email_id" class="form_w200" value="" title="email ID" placeholder="email" maxlength="18"/>@
				<input type="text" id="email_domain" class="form_w200" value="" title="email domain" placeholder="email domain" maxlength="18"/>
				<select class="select" title="이메일 도메인 주소 선택" onclick="setEmailDomain(this.value);return false;">
					<option value="">-선택-</option>
					<option value="naver.com">naver.com</option>
					<option value="gmail.com">gmail.com</option>
					<option value="hanmail.net">hanmail.net</option>
					<option value="nate.com">nate.com</option>
					<option value="hotmail.com">hotmail.com</option>
				</select>
		</fieldset>

		<fieldset>
			<legend>Address</legend>
			<input type="text" name="m_address" id="address">
		</fieldset>

		<fieldset>
			<legend>Birth</legend>
			<input type="date" name="m_birth" id="birth">
		</fieldset>

		<fieldset>
			<button type="submit" id="btn">JOIN</button>
		</fieldset>

		</form:form>
		</form>

		<script type="text/javascript" src="../resources/js/join.js"></script>
        <script> 
            var email_rule =  /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
            var email_id =$("#email_id").val();
            var email_domain =$("#email_domain").val();
            var mail ="";
           
            if(!email_id){
                alert("이메일을 입력해주세요");
              $("#email_id").focus();
              return false;
            }
            if(!email_domain){
                alert("도메인을 입력해주세요");
              $("#email_domain").focus();
              return false;
            }
            mail = email_id+"@"+email_domain;
            $("#mail").val(mail);  
            
            if(!email_rule.test(mail)){
                alert("이메일을 형식에 맞게 입력해주세요.");
              return false;
            }
            
            function setEmailDomain(domain){
                  $("#email_domain").val(domain);
              }
              
          </script>
</body>
</html>