<%@page import="telinfoVO.TelInfoVO"%>
<%@page import="telinfoDAO.TelInfoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 전체 명단</title>
</head>
<body>
	<h1>사원 전체 명단</h1>
	<%
		request.setCharacterEncoding("UTF-8"); 
		TelInfoDAO tidao = new TelInfoDAO();
		//전체 출력을 위해서 DAO 준비
		ArrayList<TelInfoVO> tiArray=tidao.getAllInfo(); 
	%>
	
	<!-- 전체인원에 대한 객체수만큼 반복하여 출력해보자 -->
	<table border=2>
		<tr>
			<th>사번</th><th>이름</th><th>전화번호</th><th>입사일</th>
		</tr>
		<%
			for(TelInfoVO imsi : tiArray){
		%>		
		<tr>
			<td><%= imsi.getId() %></td>
			<td><%= imsi.getName() %></td>
			<td><%= imsi.getTel() %></td>
			<td><%= imsi.getD() %></td>
		</tr>
		<%	}	%> 
	</table>
	
	<table border=0>
		<tr>
			<td><a href="SawonInsertForm.jsp">[입력]</a></td>
			<td><a href="SawonAllforUpdate.jsp">[수정]</a></td>
			<td><a href="SawonAllforDelete.jsp">[삭제]</a></td>
		</tr>
	</table>
		
	
</body>
</html>