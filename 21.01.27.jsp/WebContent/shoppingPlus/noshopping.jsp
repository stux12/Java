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
	//session.invalidate() 세션삭제!!
	//session.removeAttribute("cnts1") 세션의 한속성만 삭제하기
	 -->
	<% session.invalidate(); %>
	
	모두 취소되었습니다<br>
	다시 주문하시러 가시겠습니까? <a href="shopping.jsp">GO</a>
</body>
</html>