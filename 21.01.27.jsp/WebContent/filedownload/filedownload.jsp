<%@page import="java.io.*"%>
<%@page import="java.text.*"%>
<%@page import="java.lang.*"%>
<%@page import="java.util.*"%>
<%@page import="java.net.*"%>
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
	
	<% o
		request.setCharacterEncoding("UTF-8");
		//파일 업로드 된 경로
		String root = request.getSession().getServletContext().getRealPath("/");
		String savePath = root + "upload";
		//서버에 실제 저장된 파일명
		String filename = "test.txt";
		//실제 내보낼 파일명
		String orgfilename = "test.txt";
		
		InputStream in = null;
		OutputStream os = null;
		File file = null;
		boolean skip = false;
		String client = "";
		
		try{
			//파일을 읽어 스트림에 담기
			try{
				file = new File(savePath, filename);
				in = new FileInputStream(file);
			}catch(FileNotFoundException fe){
				skip = true;
			}
			
			client = request.getHeader("User-Agent");
			//파일 다운로드 헤더 지정
			response.reset();
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Description","JSP Generated Data");
			
			if(!skip){
				
			}
		}
		
	%>

</body>
</html>