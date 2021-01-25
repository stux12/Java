<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<!--  
	브라우저 알아내기
	브라우저 엔진(크롬,opera-Blink, 사파리-webkit, 파폭-gecko, IE-Trident, MAC_IE-Tasman(ms의 레이아웃 엔진))
				Layout Engine : Rendering engine이라고도 하며 html,css 정의 형태대로 화면에 보여주게하는 SW이다.
	-->
</head>
<body>
	<!-- 브라우저 엔진들 -->
	getHeader --> <%= request.getHeader("user-agent") %> <br>
	<!-- 프로젝트명~현재파일명 중요!! -->
	RequestURI --> <%= request.getRequestURI() %> <br>
	<!-- 현재파일명 앞에 폴더가있으면 폴더명이 앞에 붙음 중요!! -->
	ServletPath --> <%= request.getServletPath() %> <br>
	<!-- 서버주소 -->
	ServerName --> <%= request.getServerName() %> <br>
	<!-- 서버 포트번호 -->
	ServerPort --> <%= request.getServerPort() %> <br>
	<!-- HTTP 버전 -->
	Protocol --> <%= request.getProtocol() %> <br>
	<!-- get, post방식 -->
	Method --> <%= request.getMethod() %>	
	
</body>
</html>