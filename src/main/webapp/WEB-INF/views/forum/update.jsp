<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${forum} Update Page</h1>
	
	<form action="./update" method="POST">
			<input type="hidden" readonly="readonly" name="num" value="${dto.num}">
			<div>
			제목 <input type="text" name="title" placeholder="제목을 입력하세요" value="${dto.title}">
			</div>
			<div>
			내용 <textarea rows="" cols="" name="contents" placeholder="내용을 입력하세요">${dto.contents}</textarea>			
			</div>
		
			
			<input type="submit" value="ADD">
	</form>
</body>
</html>