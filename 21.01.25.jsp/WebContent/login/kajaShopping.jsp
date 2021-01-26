<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>가방구입하러와썽</h2>
	
	<% 
	String id1=(String)session.getAttribute("id1");
	String pw1=(String)session.getAttribute("pw1");
	
	if(!id1.equals("babo") || !pw1.equals("ondal")){
		out.println("<h2>id 암호 입력 에러입니다 로그인 화면으로 가세요</h2>");
		out.println("<a href='login.jsp'>여기</a>를 입력하세요");
	}else{
		out.println("구매완료~");
	}
	
	%>
	

	
</body>
</html>