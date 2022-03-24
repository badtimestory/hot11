<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Review Update Page</h1>
	<form action="./update" method="POST">
	<input type="hidden" name="num" readonly="readonly" value="${update.num}">
		<div>
		제목 <input type="text" name="title" value="${update.title}">
		</div>
		<div>
		작성자 <input type="text" name="writer" value="${update.writer}">
		</div>
		<div>
		내용 <textarea rows="" cols="" name="contents">${update.contents}</textarea>
		</div>
	<button>수정</button>
	</form>
</body>
</html>