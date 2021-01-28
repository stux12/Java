<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>결제</h2>
	<hr>
	<%
	Object ob1 = session.getAttribute("cts1");
	Object ob2 = session.getAttribute("cts2");
	Object ob3 = session.getAttribute("cts3");
	/* ol표기법으로 세션값을 가져옴 */
	if(ob1 != null){
		%>
				<!-- 앞에 스코프는 생략가능함 el에서 자체적으로 네임만적으면 알아서 맞는 스코프로 지원함 -->
		가방수량 : ${sessionScope.cnts1}개 금액 : ${sessionScope.cts1}원 입니다.<br>
		<%
	}
	if(ob2 != null){
		%>
		신발수량 : ${sessionScope.cnts2}개 금액 : ${sessionScope.cts2}원 입니다.<br>
		<%
	}
	if(ob3 != null){
		%>
		옷수량 : ${sessionScope.cnts3}개 금액 : ${sessionScope.cts3}원 입니다.<br>
		<%
	}
	%>
	총금액은 ${sessionScope.cts1 + sessionScope.cts2 + sessionScope.cts3}원 입니다
	
</body>
</html>