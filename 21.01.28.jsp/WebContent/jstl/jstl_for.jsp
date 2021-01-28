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
		String[] kwail = {"사과","배","감"};
		session.setAttribute("kwail", kwail);
	%>
	<a href="jstl_for2.jsp">가자3- 일단 foreach개념인 for(:)를 사용</a>
</body>
</html>