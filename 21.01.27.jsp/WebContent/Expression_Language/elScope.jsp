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
	String irm = request.getParameter("irm");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	%>
	이름은<%=irm %>이시군요<br>
	총점은<%=kor+eng %>점입니다
	<br>
	위 방법을 el로 처리하면
	이름 ${param.irum}<br>
	총점 ${param.kor + param.eng} <br><!-- 인트변환 불필요 -->
	
	<!-- el으로한 Scope!! -->
	<!-- getAttribute("page1")이런걸 el로하면 -->
	${pageScope.page1}<!-- null일경우 출력X -->
	${requestScope.page1}
	${sessionScope.page1}
	${applicationScope.page1}
</body>
</html>