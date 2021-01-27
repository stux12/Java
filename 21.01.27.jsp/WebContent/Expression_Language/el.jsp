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
	el(Expression Language)사용
	
	${kab}은 자바표현식 <%=kab%>와 같다
	
	remember : action tag <jsp:forward....>
	
	가능한 자바 문법사용을 줄이기위한 목적(가독성문제) 중의 하나로 사용
	parsing이 간단해져서 비교적 속도빠름, 아주복잡한경우 표현이 어려움 
	
	el언어등이 사용되는 이유
	xml, json : 데이터 교환(자료를 규칙있게 표현해야함)
	
	yaml(.yml)
		title :
			 	사과
		price :
				3000
	--%>

	<% 
	double kab = 37.8;
	String kab2 = null;
	%>
	<%= "온달" %> <!-- 표현식 -->
	${"온달"} <!-- el방식 -->
	${"형이 말하는데 el 니가 왜 거기서 나와"}<br>
	${"el"}은 참 간단해서 좋지만 공부는 해야지<br>
	${"다음el의 답은 뭘까"}<br>
	
	${100} ${100+200} ${100 > 2} ${ 10 % 3 }<br>	
		<!-- kab2가 null이니??  ""가null이니? a라는값이 있니? -->
	${ false } ${ empty kab2 } ${ empty "" } ${empty "a" } ${ null } <!-- null은 안찍힘 이걸 이용하면 parameter 전달시 미전달 값은 안나옴
																	null이면 처리가안되서 null포인터 에러가 절대 안나옴!!
																		값이 없는 null 및 형변환등에 정말 좋다!! -->
																		
	문자형 * 숫자
	<%= Integer.parseInt("100")*200 %><br>
	<!-- 기호는 따로 ""안에 넣으면 안됨 -->
	${"100"*200}
	${"100*200"}
	${50 == "50"}
	${50 eq "50"}
	${50 mod 5} <!-- 나머지 연산자 -->
	${(100>3) ? "커":"작아"}
	
	<form action="elScope.jsp" method="get">
		이름     <input type=text name="irm"><br>
		국어점수 <input type=text name="kor"><br>
		영어점수 <input type=text name="eng"><br>
		 		 <input type="submit" value="총점계산"><br>
	</form>
	
</body>
</html>