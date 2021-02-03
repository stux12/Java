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
	자바빈 : javabean
	DAO VO를 위한 선수학습도 됨 스프링도 마찬가지
	
	Spring - 빈객체 ... empty가 아닌 bean객체이다
	자바,웹 - bin... 빈방이 아닌 실행파일(.class등)이 있다.
			  
	jsp useBean -- 가독성 html + 자바 ==> html화(태그형식으로 사용)
	이것처럼 action tag : jsp-forward jsp-include
	즉 객체 만드는 new형태까지도 태그형식으로 기술하는것
	jsp-useBean ...
	
	 -->

	<form action="kaja.jsp" method="get">
		이름 <input type="text" name="irum" />
		나이 <input type="text" name="na2"/>
		<input type="submit" value="가자 서버로" />
		<input type="reset" value="시러엉" />
	</form>

</body>
</html>