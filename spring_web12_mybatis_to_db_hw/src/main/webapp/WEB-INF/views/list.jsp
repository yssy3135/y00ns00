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
			<th>사원번호</th>
			<th>사원이름</th>
			<th>급여</th>
			<th>부서번호</th>
		</tr>
		
	<c:forEach var="i" items="${list }">
	
		<tr>
			<td><c:out value="${i.empno }"/></td>
			<td><c:out value="${i.ename }"/></td>
			<td><c:out value="${i.sal }"/></td>
			<td><c:out value="${i.deptno }"/></td>
		</tr>
	
	
	
	</c:forEach>
		
		
	</table>
	
	<a href="/insert">
		<input type="button" value = "사원정보입력" />
	</a>

</body>
</html>