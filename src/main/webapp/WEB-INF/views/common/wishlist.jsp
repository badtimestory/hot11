<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items="${wishlist}" var="dto" varStatus="i">
	<tr>
		<%--<td id="up${i.index}">${dto.contents}</td>--%>
		
		<td>
		<c:if test="${memberJoin.m_id eq dto.m_id}">
		<%--<button class="update" type="button" data-index="${i.index}">수정</button>--%>
		
		<button class="del" type="button" data-num="${dto.w_num}">삭제</button>
		</c:if>
		</td>
		
	</tr>
</c:forEach>