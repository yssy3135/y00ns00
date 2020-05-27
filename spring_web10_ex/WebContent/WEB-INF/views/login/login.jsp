<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">

	$(function(){
			$('#btn').click(function(){
				location.href = '<c:url value = "/register/step1.do"></c:url>';
				
				
			})
			$('#login').click(function(){
					document.frm.action='<c:url value = "/member/login.do"></c:url>';
					document.frm.method = 'post';
					document.frm.submit();
			});
	});

</script>


</head>
<body>

	

	<h2>login.jsp</h2>
	<form name = "frm">
	<table>
		<tr>
			<th>ID</th>
			<td>
				<input type="text" name="id" id="id" />
			</td>
		</tr>
				<tr>
			<th>PW</th>
			<td>
				<input type="text" name="pwd" id="pwd" />
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="로그인" id = "login" />
				<input type="button" value="회원가입" id = "btn" />
			</td>
		</tr>
	</table>
		
	
	</form>

</body>
</html>