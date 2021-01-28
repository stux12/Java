<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	String[] kwail = (String [])session.getAttribute("kwail");
	for(String imsi : kwail){
		out.println(imsi+"<br>");
		//자바는 for(..:..)
		//자바스크립트는 for(..in..)
		//jstl은 forEach var=".." items=".."
	}
	%>
	<!-- el방식으로 for문은 -->
	<h2>jstl + el스타일</h2>
	<c:forEach var="imsi" items="${kwail}">
		${imsi}<br>
	</c:forEach>
</body>
</html>