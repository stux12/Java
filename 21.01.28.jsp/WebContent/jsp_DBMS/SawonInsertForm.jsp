<%@page import="telinfoVO.TelInfoVO"%>
<%@page import="telinfoDAO.TelInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 정보 입력</h1>

	<form action="SawonInsertProcess.jsp" method="post">
		<table border=2>
			<tr>
				<td>사번</td>
				<td><input type=text name=id></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type=text name=name></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type=text name=tel></td>
			</tr>
			<tr>
				<td>입사일</td>
				<td><input type=text name=sDate></td>
			</tr>
			<tr>
				<td colspan=2><input type=submit value="추가하자"></td>
			</tr>
		</table>

		<table border=0>
			<tr>
				<td><a href="SawonInsertForm.jsp">[입력]</a></td>
				<td><a href="SawonAllforUpdate.jsp">[수정]</a></td>
				<td><a href="SawonAllforDelete.jsp">[삭제]</a></td>
				<td><a href="SawonAllView.jsp">[모두보기]</a></td>
			</tr>
		</table>
	</form>

</body>
</html>