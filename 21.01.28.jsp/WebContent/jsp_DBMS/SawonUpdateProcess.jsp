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
	<%
		request.setCharacterEncoding("UTF-8");
		TelInfoDAO tidao = new TelInfoDAO();
		
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		
		boolean b1 = tidao.update_nametel(tel, name);
		if(b1){
			response.sendRedirect("SawonAllView.jsp");
		}else{%>
			<a href="SawonUpdateForm.jsp">사원수정 에러 - 수정화면으로</a>
		<% } %>
		<%-- 파람값을 가지고 페이지를 넘어가는거 <>안에 jsp:param해서 파람값 넣어서 보낼수도 있음<> --%>
		<%-- <jsp:forward page=""/jsp:forward> --%>
</body>
</html>