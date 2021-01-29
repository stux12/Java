<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- request.getAttribute -->
	${requestScope.cong}
	${cong}
	이름 :	${ param.name } <br>
	학점 : A학점입니다.
	<a href="input.jsp">입력GO</a>
</body>
</html>