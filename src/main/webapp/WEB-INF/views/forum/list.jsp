<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/shop_header_css.jsp"></c:import>
<link rel="stylesheet" href="../resources/css/table.css">
<link rel="stylesheet" href="../resources/css/list.css">
</head>
<body>
<c:import url="../template/shop_header.jsp"></c:import>
	<div class="table-container">
		<h1 class="title">${forum} List Page</h1>

		<div>
			<form action="./list" method="get">
				<fieldset>
					<select name="kind">
						<option value="col1">제목</option>
						<option value="col1">내용</option>
						<option value="col1">작성자</option>

					</select> <input type="text" name="search" value="${pager.search}">
					<button type="submit">검색</button>
				</fieldset>
			</form>
		</div>

		<table class="table-basic">
			<tr>
				<td>No.</td>
				<td>제목</td>
				<td>작성자</td>
				<td>날짜</td>
			</tr>
			<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.num}</td>
					<td><a href="./detail?num=${dto.num}">
					<c:catch var="message">
						<c:forEach begin="1" end="${dto.depth}">--</c:forEach>
					</c:catch>
							${dto.title}
							</a>
					</td>
					<td>${dto.writer}</td>
					<td>${dto.regDate}</td>

				</tr>

			</c:forEach>
		</table>

		<div>
			<c:if test="${pager.pre}">
				<a href="./list?page=${pager.startNum-1}">PREVIEW</a>
			</c:if>

			<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
				<a href="./list?page=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a>
			</c:forEach>

			<c:if test="${pager.next}">
				<a href="./list?page=${pager.lastNum+1}">NEXT</a>
			</c:if>
		</div>
		<c:if test="${empty member}">
		<a href="/s1/memberJoin/login">ADD</a>
		</c:if>
		<c:if test="${not empty member }">
		<a href="./add">ADD</a>
		</c:if>
	</div>
</body>
</html>