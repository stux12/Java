<%@page import="java.io.InputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
	참고사이트 
	https://kitchu.tistory.com/48
	https://m.blog.naver.com/okopok5019/221553342844
	 -->
	<%
		request.setCharacterEncoding("UTF-8");
		//파일 업로드 된 경로
		String root = request.getSession().getServletContext().getRealPath("/");
		String savePath = root + "upload";
		//서버에 실제 저장된 파일명
		String filename = "test.txt";
		//실제 내보낼 파일명
		String orgfilename = "test.txt";
		
		InputStream in =
		
	
	%>

</body>
</html>