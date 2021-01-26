<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
    <% response.setStatus(200); %>
    <!-- 404 500...: 간혹 이페이지를 500으로 처리하는경우를 방지하기 위해서
    이 설정값으로 200을 직접주면 200은 정상이므로 결과를 출력하게함 무조건 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>naerrorpage.jsp</title>
</head>
<body>
	
	<pre>
		다음과 같은 에러가 발생했습니다.
		계속 에러가 발생되면 상담원에게 전화주시기 바랍니다.
		전화번호는 02-3456-7890 입니다
	</pre>
	
	<hr>
	
	<!-- 내장객체.메소드
		out request response exception객체 -->
	에러내용은 <h3><%= exception.getMessage() %></h3>
		<!-- 예: 나이를 빈칸으로 처리 한 경우 에러 내용은 For input String:""
		위에 페이지지시어에 isErrorPage="true"를 선언해줘야 exception객체 사용가능!! -->
</body>
</html>