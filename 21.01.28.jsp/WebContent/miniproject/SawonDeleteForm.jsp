<%@page import="telinfoVO.TelInfoVO"%>
<%@page import="telinfoDAO.TelInfoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>삭제할 이름 선택</h1>
	<!-- 
		SawonAllforDelete.jsp 홍길동을 클릭하면
		SawonDeleteForm.jsp 홍길동 정보를 모두 보여준후 삭제하자 버튼을 누르면
		SawonDeleteProcess.jsp 여기서 삭제를 처리 후 다른 모든사원 출력
		
	 -->
	 <%
	 request.setCharacterEncoding("UTF-8");
	 TelInfoDAO tidao = new TelInfoDAO();
	 ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();
	 %>
	 <table border=2>
	 	<tr>
	 		<th>사번</th><th>이름</th><th>전화번호</th>입사일<th>
	 	</tr>
	 	<%
	 		for(TelInfoVO imsi : tiArray){
	 	%>
	 	<tr>
	 		<td><%=imsi.getId() %></td>
	 		<td><a href="SawonDeleteForm.jsp?name=<%=imsi.getName() %>"><%=imsi.getName() %></a>
	 		<td><%=imsi.getTel() %></td>
	 		<td><%=imsi.getD() %></td>
	 		<% } %>
	 	</tr>
	 	
	 </table>
</body>
</html>