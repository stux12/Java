<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%           //받아올때 형태가 오브젝트이기 때문에 형변환 해줘야함
	out.println((String)pageContext.getAttribute("page1"));//null뜸 pageContext는 그페이지내에서만 살아있기때문
	
	out.println((String)request.getAttribute("req1")); //null 요청을 연결시킬 근거가 없음
	//앞에 요청이 뒤의요청이 되려면 forward 액션태그 include등 이런식으로 넘어와야지 연결되었다는걸 의미함
	
	out.println((String)session.getAttribute("res"));//장바구니는 이 session을 이용함
	
	out.println((String)application.getAttribute("app1")); //꺼져도 살아있음
	%>

	<a href="scope3.jsp">여기서 브라우저 모두닫고 scope3.jsp 재수행!!!</a><br>	
						이어서 WAS내리고 scope3.jsp재수행

</body>
</html>