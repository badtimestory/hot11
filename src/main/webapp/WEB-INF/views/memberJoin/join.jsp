<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Join Page</h1>

    <form action="./join" method="post" id="frm" >

        <fieldset>
            <legend>ID</legend>
            <input type="text" name="m_id" id="id">
            <div id="idResult"></div>
        </fieldset>

        
        <fieldset>
            <legend>Password</legend>
            <input type="password" name="m_pw" id="pw">
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
            <input type="text" name="m_phone" id="phone">
        </fieldset>

        <fieldset>
            <legend>Email</legend>
            <input type="text" name="m_email" id="email"> 
        </fieldset>

        <fieldset>
            <legend>Address</legend>
            <input type="text" name="m_address" id="address">
        </fieldset>

        <fieldset>
            <legend>Birth</legend>
            <input type="text" name="m_birth" id="birth">
        </fieldset>

        <fieldset>
            <button type="submit" id="btn">JOIN</button>
        </fieldset>

    </form>
</body>
</html>