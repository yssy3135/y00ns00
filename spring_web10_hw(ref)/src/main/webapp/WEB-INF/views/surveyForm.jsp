<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>surveyForm</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">

	$(function(){
	
		
		$("#btn").click(function(){
			document.frm.action = "<c:url value='/survey/survey.ok'/>";
			document.frm.submit();
		});
	});


</script>
</head>
<body>

	<h2>surveyForm.jsp</h2>
	<h2>좋아하는 사진은?</h2>
	<form action="#" name = "frm">
		<div>
			<input type="checkbox" name="ck" id="" value = "a" />
			<img src="<c:url value="/resources/a.png"/>" alt="짱구" />
		
		</div>
		
		<div>
			<input type="checkbox" name="ck" id=""  value="b"/>
			<img src="<c:url value="/resources/b.png"/>" alt="도라에몽" />
		</div>
		
		&nbsp;&nbsp;&nbsp;
		
		<input type="button" value="선택" id = "btn" />
	
	
	</form>
	

</body>
</html>