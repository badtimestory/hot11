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
<h1>UPDATE Page</h1>

    <form action="./update" method="post" id="frm" >

        <fieldset>
            <legend>ID</legend>
            <input type="text" name="m_id" id="id" value="${member.m_id}" readonly="readonly">
            <div id="idResult"></div>
        </fieldset>

        
        <fieldset>
            <legend>Password</legend>
            <input type="password" name="m_pw" value="${member.m_pw}" id="pw">
            <div id="pwResult"></div>
        </fieldset>

        
        <fieldset>
            <legend>Password 확인</legend>
            <input type="password" name="m_pw2" value="${member.m_pw}" id="pw2">
            <div id="pwResult2"></div>
        </fieldset>

        <fieldset>
            <legend>Name</legend>
            <input type="text" name="m_name" value="${member.m_name}" id="name">
        </fieldset>

        <fieldset>
            <legend>Phone</legend>
            <input type="text" name="m_phone" value="${member.m_phone}" id="phone">
        </fieldset>

        <fieldset>
            <legend>Email</legend>
            <input type="text" name="m_email" value="${member.m_email}" id="email"> 
        </fieldset>

        <fieldset>
            <legend>Address</legend>
            <input type="text" name="m_address" value="${member.m_address}" id="address">
        </fieldset>

        <fieldset>
            <legend>Birth</legend>
            <input type="date" name="m_birth" value="${member.m_birth}" id="birth" readonly="readonly">
        </fieldset>

        <fieldset>
            <input type="submit" name="UPDATE"></button>
            <button type="button">확인</button>
        </fieldset>

    </form>
</body>
</html>