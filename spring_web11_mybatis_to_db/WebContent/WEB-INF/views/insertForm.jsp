<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insertForm.jsp</title>
</head>
<body>

	<h2>insertForm.jsp</h2>
	<form action="insertOk">
		<table>
			<tr>
				<th>DEPTNO</th>
				<td><input type="text" name="deptno" id="" /></td>
			</tr>
			<tr>
				<th>DNAME</th>
				<td><input type="text" name="dname" id="" /></td>
			</tr>
			<tr>
				<th>LOC</th>
				<td><input type="text" name="loc" id="" /></td>
			</tr>
			
			<tr>
				<td colspan = "2">
					<input type="submit" value="입력" />
					<input type="reset" value="reset" />
				</td>
			</tr>
			
		</table>
	</form>


</body>
</html>