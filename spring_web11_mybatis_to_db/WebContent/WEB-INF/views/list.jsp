<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
	<h2>list.jsp</h2>
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서명</th>
			<th>부서위치</th>
		</tr>
		
	<c:forEach var="i" items="${list }">
		
		<tr>
			<td><c:out value="${i.deptno }"/></td>
			<td><c:out value="${i.dname }"/></td>
			<td><c:out value="${i.loc }"/></td>
		</tr>
	</c:forEach>
	</table>
	
	<!--
		
		/insert ==> insertForm.jsp
		
		/insertOk =====> insertOk.jsp
		(파라미터)  DB
		
		cf) /insert   (get)  ==>  insertForm.jsp  ==> list.jsp
			/insert   (post) ====> list.jsp
			
	 
	  -->
	<a href="/insert">
		<input type="button" value = "부서정보입력" />
	</a>
	
	
	
</body>
</html>