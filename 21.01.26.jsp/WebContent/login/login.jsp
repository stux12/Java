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
	//post방식의 한글처리 방식
	request.setCharacterEncoding("UTF-8"); 
	response.setCharacterEncoding("UTF-8"); 
	%>

	<%
	String id1 = request.getParameter("id1");
	String pw1 = request.getParameter("pw1");
	session.setAttribute("id1", id1);
	session.setAttribute("pw1", pw1);
	%>
	
	아하 id는 <%= id1 %> 이고 암호는 <%= pw1 %> 이시군요 <p>
	
	<a href="kajaShopping.jsp">쇼핑하러가자아~</a>
</body>
</html>