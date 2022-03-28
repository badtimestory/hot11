<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${forum}Add Page</h1>
	
	<form action="./add" method="POST">
		Title<input type="text" name="title" id="title">
		Writer<input type="text" name="writer" id="writer">
		Contents<textarea name="contents" rows="" cols="" ></textarea>		
		
		<button type="submit">ADD</button>
	</form>
</body>
</html>