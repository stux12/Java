<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>내정보</h1>
	<form action="login.do" method="post">
		<table>
			<tr>
				<td>id</td>
				<td>pw</td>
				<td>이름</td>
			</tr>
			<tr>
				<td><input type="text" name="id" value="${Logininfo.id}" readonly/></td>
				<td><input type="text" name="pw" value="${Logininfo.pw}" readonly/></td>
				<td><input type="text" value="${Logininfo.name}" readonly/></td>
			</tr>
			<tr>
				<td><input type="submit" value="처음으로" /></td>
			</tr>
		</table>
	</form>
</body>
</html>