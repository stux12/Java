]<%@page import="telinfoDAO.TelInfoDAO"%>
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
      //int id= Integer.parseInt(request.getParameter("id"));
      String name = request.getParameter("name");
      //delete from....where name=?  getParameter("tel"); getParameter("sDate");
      boolean b1 = tidao.delete_nametel(name);//name
      if(b1){
         response.sendRedirect("SawonAllView.jsp"); //delete ok
      }
      else{%>
		<a href="SawonAllforDelete.jsp">사원삭제 에러 - 삭제화면으로</a>
	<%}%>
</body>
</html>