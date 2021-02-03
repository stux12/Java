<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
request.setCharacterEncoding("UTF-8");
String irum = (String)request.getParameter("irum");
String na2 = (String)request.getParameter("na2");
out.println("여기는 자바스타일로 출력"+irum+","+na2+"<br>");
%>

<!-- Sawon sawon1.new Sawon()하는걸 useBean으로쓰면 -->
<!-- id는 객체명 class=패키지명.클래스명 -->
<jsp:useBean id="sawon1" class="sawonpkg.Sawon"></jsp:useBean>
<jsp:useBean id="sawon2" class="sawonpkg.Sawon"></jsp:useBean>
<!-- Spring에서는 <bean id="" class=""/>형태로 사용함 -->

 
<!-- 자바에서 setter로 넘어오는 irum 및 na2를 받아보자
	sawon1.setIrum(request.getParameter("irum"))
	sawon1.setNa2(request.getParameter("na2")) 
	여기서는 name = "객체명"
	Property = 속성
	-->
<jsp:setProperty name="sawon1" property="irum"/>
<jsp:setProperty name="sawon1" property="na2"/>
<!-- set+Na2()                   파라미터값역할-->
<!-- Spring에서는 <property name="" property=""/> -->


<jsp:setProperty name="sawon2" property="*"/>
<!-- set + 전부 => 다 set한다 
	폼에서 넘어오는것을 all set, 단 getProperty는 * 기호 사용 못함!!!!
	즉, setter에 한해서 전부다 넘어오는 역할을 *가 담당함
	-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>bean</title>
</head>
<body>
	
	<h2>jsp : getProperty</h2>
	이름은 <jsp:getProperty property="irum" name="sawon1"/>
	나이는 <jsp:getProperty property="na2" name="sawon1"/>
	
	<h2>jsp : getProperty</h2>
	이름은 <jsp:getProperty property="irum" name="sawon2"/>
	나이는 <jsp:getProperty property="na2" name="sawon2"/>
	
	
</body>
</html>