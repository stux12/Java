<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${Logininfo.name}님 메뉴를 선택하세요</h1>
	<table>
		<tr>
			<td><a href="getAllTelinfo.do">[모두보기]</a></td>
			<td><a href="getLogininfo.do?id=${Logininfo.id}">[정보보기]</a></td>
			<td><a href="logOut.do">[로그아웃]</a></td>
			<td><a href="deleteLogininfo.do">[회원탈퇴]</a></td>
		</tr>
	</table>
</body>
</html>