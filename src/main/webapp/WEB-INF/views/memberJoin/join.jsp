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
            <input type="text" name="id" id="id">
            <div id="idResult"></div>
        </fieldset>

        
        <fieldset>
            <legend>Password</legend>
            <input type="password" name="pw" id="pw">
            <div id="pwResult"></div>
        </fieldset>

        
        <fieldset>
            <legend>Password 확인</legend>
            <input type="password" name="pw2" id="pw2">
            <div id="pwResult2"></div>
        </fieldset>

        <fieldset>
            <legend>Name</legend>
            <input type="text" name="name" id="name">
        </fieldset>

        <fieldset>
            <legend>Phone</legend>
            <input type="text" name="phone" id="phone">
        </fieldset>

        <fieldset>
            <legend>Email</legend>
            <input type="text" name="email" id="email"> 
        </fieldset>

        <fieldset>
            <legend>Address</legend>
            <input type="text" name="address" id="address">
        </fieldset>

        <fieldset>
            <legend>Birth</legend>
            <input type="date" name="birth" id="birth">
        </fieldset>

        <fieldset>
            <button type="submit" id="btn">JOIN</button>
        </fieldset>

    </form>
</body>
</html>