<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입</h1>
	<form action="insertLogininfo.do" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>pw</td>
				<td><input type="text" name="pw" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="[가입]" /></td>
			</tr>
		</table>
	</form>
</body>
</html>