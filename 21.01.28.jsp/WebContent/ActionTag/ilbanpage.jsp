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
	String bimil = request.getParameter("bimil");
	if(bimil.equals("bimil")){
	%>
		<jsp:forward page ="bimilpage.jsp">
			<jsp:param name="bimil2" value="bimil2"/>
		</jsp:forward>
	<%	
	}
	%>
		여기는 일반페이지입니다
</body>
</html>