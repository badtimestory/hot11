<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/css/table.css">
<link rel="stylesheet" href="../resources/css/list.css">
</head>
<body>
	<h1>${forum} Detail Page</h1>
	
	
	<h3>No.: ${dto.num}</h3>
	<h3>Title: ${dto.title}</h3>
	<h3>Writer: ${dto.writer}</h3>
	<h3>Date: ${dto.regDate}</h3>
	<h3>질문내역: ${dto.t_num}</h3>
	<a href="./list">목록</a>
	<a href="./update?num=${dto.num}">글 수정</a>
	<a href="./delete?num=${dto.num}">글 삭제</a>
	
	<a href="./reply?num=${dto.num}">댓글</a>
</body>
</html>