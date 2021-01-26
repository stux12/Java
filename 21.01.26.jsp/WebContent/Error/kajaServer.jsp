<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="naerrorpage.jsp"%>
   						<!-- 이 jsp에서 에러가날시 에러페이지로 이동하게 함!!! --> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>kajaServer.jsp</title>
</head>
<body>
	
	<% 
	int na2soo1 = Integer.valueOf(request.getParameter("na2"));
	out.print("나이는"+na2soo1);
	%>
	
</body>
</html>