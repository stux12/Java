<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- tag라이브러리는 만들어 쓰는건데 c가 표준형이 되어버림 -->
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
													<!-- 접두사
													con : together -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 만일 위에 taglib선언 안하고 사용하면 jstl문장은 무시하고 패스 -->
	<c:out value="안녕 jstl"/><br>
	<% out.print("안녕 jstl"); %>
	
	<% String aa = "chokichi"; %>
	<%= aa %>
	<!-- set 초기치주는것 bb라는 변수에 value를 집어넣음  -->
	<c:set var="bb" value="chokichi"></c:set><br>
	${bb} <!-- jstl + el의 합작품 -->
	
	<!-- 초기치 주는방법 2번째 -->
	<% int jumsoo=100; %>
	<%= jumsoo %>
	<c:set var="jum">100</c:set><br>
	${jum}<br>
	${jumsoo}
</body>
</html>