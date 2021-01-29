<%@page import="telinfoVO.TelInfoVO"%>
<%@page import="java.util.ArrayList"%>
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
	<h1>삭제할 이름 선택</h1>
	<!--  SawonAllforDelete.jsp 홍길동을 클릭하면
         SawonDeleteForm.jsp 홍길동정보를 DB에거 꺼내서 모두 보여준후 [삭제하자] 를 누르면
         SawonDeleteProcess.jsp 여기서 삭제를 처리 후 삭제가된 자료를 뺴고  사원 출력함 -->
	<%
   //SawonAllforDelete.jsp
   request.setCharacterEncoding("euc-kr");
   TelInfoDAO tidao=new TelInfoDAO();
   ArrayList<TelInfoVO> tiArray = tidao.getAllInfo();//사원전체보기
   
   %>
	<table border=2>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>입사일</th>
		</tr>
		<% //SawonAllforDelete.jsp
   for(TelInfoVO imsi : tiArray){ %>
		<tr>
			<td><%=imsi.getId() %></td>
			<!-- blue색 , 밑줄,  손가락나오는 모양 -->
			<td><a href="SawonDeleteForm.jsp?name=<%=imsi.getName()%>"><%= imsi.getName() %></a></td>
			<%-- <a href="url?name=hong"> hong</a></td> --%>
			<td><%=imsi.getTel() %></td>
			<td><%=imsi.getD() %></td>
			<% }%>
		</tr>
	</table>

	<table border=0>
		<tr>
			<td><a href="SawonInsertForm.jsp">[입력]</a></td>
			<td><a href="SawonAllforUpdate.jsp">[수정]</a></td>
			<td><a href="SawonAllView.jsp">[모두보기]</a></td>
		</tr>
	</table>
</body>
</html>