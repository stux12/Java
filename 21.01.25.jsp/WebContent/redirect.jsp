<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<pre>
		원래는 이 화면이 출력되는 것인데
		변신을 해서 다른 화면이 출력된다?
	</pre>
	
	<!-- 지금 현재 페이지는 없는걸로 간주하고 kaja1.jsp로 이동함
		인자같은것 못가지고감 
		인자를 가지고 가는것 getRequestDispatcher()
		-->
	<% response.sendRedirect("kaja1.jsp"); %>
	로그인하고 왔어 - 안했어 - 다시 로그인 화면으로 보내자
</body>
</html>