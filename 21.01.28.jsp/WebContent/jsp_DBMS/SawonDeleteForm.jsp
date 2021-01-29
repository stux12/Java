<%@page import="telinfoVO.TelInfoVO"%>
<%@page import="telinfoDAO.TelInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 삭제 폼</title>
</head>
<body>
	<h1>사원 삭제 폼</h1>
	<%
		request.setCharacterEncoding("UTF-8");
		TelInfoDAO tidao = new TelInfoDAO();
		String oriName = request.getParameter("name"); //// <a>태그 선택한것 = <input ...>
		//out.print(oriName);
		TelInfoVO tv2 = tidao.search_nametel(oriName);
		//홍길동 정보 (id, name ....) 를 db에서 꺼내서 객체 상태로 tv2에 넘어온다.
		//out.println(tv2.getId());
	%>
	<!--  DB에서 꺼낸 홍길동 자료를 화면에 띄우는 부분 -->
	<form action="SawonDeleteProcess.jsp" method="post">
		<table border=2>
			<tr>
				<th>사번</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>입사일</th>
			</tr>
			<tr>
				<td><input type="text" name="id" value=<%=tv2.getId()%>	readonly /></td>
				<td><input type="text" name="name" value=<%=tv2.getName()%>	readonly /></td>
				<td><input type="text" name="tel" value=<%=tv2.getTel()%> readonly /></td>
				<td><input type="text" name="d" value=<%=tv2.getD()%> readonly /></td>
			</tr>
			<tr>
				<td colspan=4><input type="submit" value="삭제하자" /></td>
			</tr>
		</table>



		<table border=0>
			<tr>
				<td><a href="SawonInsertForm.jsp">[입력]</a></td>
				<td><a href="SawonAllforUpdate.jsp">[수정]</a></td>
				<td><a href="SawonAllView.jsp">[모두보기]</a></td>
			</tr>
		</table>
	</form>

</body>
</html>