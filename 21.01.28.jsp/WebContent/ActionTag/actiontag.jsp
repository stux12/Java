<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- 
	Action tag
	
	- 자바형식을 안보이게하는 el언어
	- jsp를 실행하는 중간에 변화가 필요할경우 미리 준비한 내용을 처리하기 위한것
	
	Standard action tag(표준액션)
	- forward <jsp:forward> 파람값을 들고감
	- include <jsp:include> 파람값을 안들고감
	- useBean <jsp:useBean> 자바빈 : servlet에서함
	- setProperty <jsp:setProperty>
	- getProperty <jsp:getProperty>
	
	Custom tag(커스텀) : 개발자가 작성
	- taglib을 사용하여 사용할 class를 미리 지시한다
	- JSTL은 custom tag나 표준으로 선정됨
	- <%@ taglib prefix="c"....>
	- <%@ taglib prefix="tf"   > 
	- <c:set...>
	- <tf:...>
	 --%>
	<pre> 
	include directive : 내용을 그대로 include
	<%--
	<%@ include file = "includeSub.jsp"%>
	정적 파일을 포함시킬때 , 포함후 처리가 된다
	 --%>
	include action tag : html, jsp등의 처리결과를 include
	</pre>
	<jsp:include page = "include.jsp"/>
	<!-- 
	<input type = text name="irum1" value="jehoon"
	 -->
	
	
	
	<%-- 
		이 jsp로 보낼때 파라미터값을 포함시켜서 보냄
			액션태그는 이 값을 보내서 수행이 되서 포함이 되지만
			그냥 include는 값을 보내는것없이 그냥 페이지자체가 포함만됨
	--%>
	<jsp:include page = "includeSub.jsp">
		<jsp:param name="irum1" value="jehoon"/>
		<jsp:param name="irum2" value="soobin"/>
	</jsp:include>	
	
	<!-- action tag 에서 로그인시 특정 암호가 들어오면 "관리자"모드로 그렇지않으면 일반사용자 모드로 가자-->
	<%-- <jsp:forward page ="impossible.jsp" --%>
	
	<form action="ilbanpage.jsp" method="get">
		비밀번호 입력 : <input type="text" name="bimil">
	</form>


</body>
</html>