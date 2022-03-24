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
	<h1>Review List Page</h1>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>추천수</th>
		</tr>
		<tr>
		<c:forEach items="${list}" var="review">
		<tr>
			<th>${review.num}</th>
			<td>
				<a href="./detail?num=${review.num}">
					<c:catch var="message">
						<c:forEach begin="1" end="${review.depth}">&nbsp&nbsp</c:forEach>
					</c:catch>
				${review.title}
				</a>
			</td>
			<th>${review.writer}</th>
			<th>${review.regDate}</th>
			<th>${review.hit}</th>
		</tr>
		</c:forEach>
	</table>
		<a href="./add">작성</a>
</body>
</html>