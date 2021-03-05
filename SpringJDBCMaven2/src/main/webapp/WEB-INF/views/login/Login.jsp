<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	<form action="login.do" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="id"/></td>
			</tr>
			<tr>
				<td>pw</td>
				<td><input type="text" name="pw"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="로그인"/></td>
				<td><a href="insert.do">회원가입</a></td>
			</tr>
		</table>
	</form>
	
</body>
</html>