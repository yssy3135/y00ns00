<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			
			b = document.getElementById("b");
			a = document.getElementById("a");
			frm = document.getElementById("frm");

			if(a.checked == false && b.checked == true){
				
				console.log(document.frm);
				document.frm.action = '<c:url value = "/survey/survey.choose"></c:url>';
				document.frm.method = 'post';
				document.frm.submit();
				
			}else if(a.checked == true && b.checked == false ){
				
				document.frm.action = '<c:url value = "/survey/survey.choose"></c:url>';
				document.frm.method = 'post'
				document.frm.submit();

			}
			
			
			
		});
		
		
	});


</script>
</head>
<body>

<form  id ="frm" name = "frm">
	<table>
		<tr>
			
			<td><img src="<c:url value="/images/a.png"></c:url>" alt="짱구" /></td>
			<td><img src="<c:url value="/images/b.png"></c:url>" alt="도라" /></td>
		</tr>
		<tr>
			<td><input type="radio" name="a" id="a" /></td>
			<td><input type="radio" name="b" id="b" /></td>
		</tr>
		<tr >
			<td colspan= "2">
				<input type="button" value="선택" id = "btn" />
			</td>
		</tr>
	</table>
	
</form>


</body>
</html>