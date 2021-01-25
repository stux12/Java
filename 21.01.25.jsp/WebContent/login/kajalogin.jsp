<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>나는 로그인 받는 서버</h2>
	<%
	//post방식의 한글처리 방식
	request.setCharacterEncoding("UTF-8"); 
	response.setCharacterEncoding("UTF-8"); 
	%>
	
	<%
	//id1값이 넘어옴				//태그name써줘야함
	String id1 = request.getParameter("id1");
	//pw1값이 넘어옴
	String pw1 = request.getParameter("pw1"); 
	//get 방식이였을경우 주소값이 http://url?id1=값 & pw1= 값 형태
	//post 방식은 주소창에 url만보임
	int age1 = Integer.valueOf(request.getParameter("age1"));
	
	%>
	
	아이디는<%= id1 %> 이고 암호는 <%= pw1 %>이시네요 <br>
	<%= 2021-age1 %>년생이시군요

</body>
</html>