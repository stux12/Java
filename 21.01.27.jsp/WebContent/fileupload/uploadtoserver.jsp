<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>upload하자</h2>
	<!-- 
	객체는 기존의 객체가 아닌 cos.jar의 객체를 만들어 사용함
	cos.jar안에 이 객체가 있음
	MultipartRequest(5개인자) // 객체생성(예:mr1)+upload
	new MultipartRequest(request, bang, 10*1024*1024, "UTF-8", new DefaultFileRenamePolicy());
	
	bang = 사진같은 파일이 들어갈곳 서버쪽의 upbang에 들어감
	
	10*1024*1024 = 1kb=1024byte=2^20 byte
	1024kb = 1mb	10mb = 올릴 최대 byte 10mb넘어가면 못올림
	
	DefaultFileRenamePolicy = 업로드시 bang에 이름이 같은 중복파일 존재시 처리할 정책
							예) ondal.jpg 가 있는데 똑같은 게 들어올시 ondal(1).jpg로 처리해줌
	 -->
	 
	 <%
	 String bang = "d:/uploadBang";
	 
	 //파일 업로드하기위한 객체선언
	 // 객체가 생성됨과 동시에 바로 사진이 업로드 됨
	 MultipartRequest mr1 = new MultipartRequest(request, bang, 10*1024*1024, "UTF-8", new DefaultFileRenamePolicy());
	 
	 //request사용 못하므로 대신 객체 mr1을 사용
	 //request사용 못하는 이유는 enctype=multipart를 선언했기때문에 못씀
	 String virum1 = mr1.getParameter("irum1");
	 					//file을 받을때는 getFilesystemName으로 받아야함
	 String vfilename1 = mr1.getFilesystemName("file1");
	
	 if(vfilename1 != null){
		 out.println("사용자 이름은"+virum1+"  이시구요 <br>");
		 out.println("추카추카"+vfilename1+" 라는 파일을 올렸어요");
	 }else{
		 out.println("에러");
	 }
	 %>
</body>
</html>