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
	장바구니(shopping carter)
	
	장바구니 : 청바지를 담고 노트북을 구경하더라도 장바구니에 청바지가 담겨있어야함
		그래서 웹브라우저를 닫지않는한 장바구니는 계속 유지
		
	그러기 위해선 범위를 알아야함
	범위(scope) : pageContext < request < session < application
	
	pageContext = 현재페이지에 있는한 유지
	request = 다른페이지로 넘어갈때 정보를 전달해서 유지
	session = 웹브라우저가 살아있는한 유지
	application = WAS,TOMCAT을 닫지않는한 유지
	
	범위 유지하는 방법
	("속성명","값") ==>("irum","홍길동") 이런 인자를 주고 전달함
	 -->
	<%
	//범위에서 해당 값 인식을 위해
	//scope.저장메소드("속성명","값")
	pageContext.setAttribute("page1", "pagelove"); //한페이지범위
	request.setAttribute("req1", "reqlove"); //요청범위
	session.setAttribute("res", "seslove"); //브라우저살아있는동안
	application.setAttribute("app1", "applove"); //WAS 서버 살아있는동안
	%>	 
	
	<a href="scope2.jsp">scope2.jsp로 가보자</a>

</body>
</html>