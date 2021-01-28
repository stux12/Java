<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//forward로 넘긴페이지는 파라미터값을 그대로 가져올수있음
	String bimil = request.getParameter("bimil");
	//forward로 넘길때 추가한 파라미터값도 가져올수있음
	String bimil2 = request.getParameter("bimil2");
	out.print(bimil2);
	%>
	${param.bimil}
	${param.bimil2}
	여기는 관리자페이지입니다
</body>
</html>