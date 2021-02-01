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
	String irum = request.getParameter("irum");
	int jum = Integer.parseInt(request.getParameter("jum"));
	String gak = (String)request.getAttribute("gak");
	%>
	${param.irum}님의 점수는 ${param.jum}이고<br>
	${gak}학점입니다!!
</body>
</html>