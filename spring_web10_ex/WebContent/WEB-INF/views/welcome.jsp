<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome.jsp</title>
</head>
<body>
	<h2>welcome.jsp</h2>
	<h3>가입해주셔서감사합니다</h3>
	<h3>가입 정보 확인</h3>
	<ul>
		<li>id : ${dto.id }</li>
		<li>pw : ${dto.pwd }</li>
		<li>confirm : ${dto.confirm }</li>
		<li>email : ${dto.email }</li>
	</ul>
	
	<a href="../main"><span>[메인 화면으로 이동]</span></a>
	


</body>
</html>