<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 여기서 <%는 지시어 접두어
	<% page : 페이지에 대한 지시어라는 뜻
	charset = EUC-KR 은 jsp에서 클라이언트한테 값을 보낼때 인코딩방식
	pageEncoding = EUC-KR 은 jsp 자체의 인코딩 방식을 의미함 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	오늘 날짜를 출력해보자(자바문법을 script하여서!!)
	<% 
	Date d1 = new Date();
	out.println("날짜 출력이라고? "+ d1+"<p>");
	out.println(request.getRequestURI()+"로 요청한 URI구만"+"<br>");
	//out : jsp 내장객체
	//request : 요청담당 내장객체
	//response : 응답담당
	%>
	
	<%-- 선언문 원래 선언을 선언문에 하는것이 원칙이나 그냥 스크립트릿에 써도 됨--%>
	<%! String aa="ondal"; %>
	<% out.println(aa); %>
	<% String aa2 = "ondal";
		out.println(aa2);%>
		
	<%-- out.println(d1)을 줄여쓰려면 expression방식이라함--%>	
	아하 ~ 그렇구나 오늘날짜는 <%= d1 %> 이군요 <br>
	
	<%-- .java 변환형태는 hello.jsp라면
		Hello_jsp.java(서블릿,웹자바) 형식으로 변환된다
		이 파일이 있는곳은?? \.metadata\.plugins\org.eclipse.wst.server.core\tmp(0,1,2)
							 \work\Catalina\localhost\프로젝트명\org\apache\jsp\hello_jsp.java로 들어감 --%>
							 
	<% 
	int num = 34;
	if(num%2==0){
		out.println("짝수입니다");
	}else{
		out.println("홀수입니다");
	}%>
	
	<br>
	
	<% 
	int lotto[] = new int[6]; 
	for(int i=0; i<lotto.length; i++){
			lotto[i] = (int)Math.ceil(Math.random()*45);
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					i--;	
				}
	}
	}
	Arrays.sort(lotto);
	for(int i=0; i<lotto.length; i++){
		out.println(lotto[i]+"\t");
		
	}
	%>
	
	
	<%
	//out.println("<h1>구구단 5단~~</h1>");
	%>
	<br>
	<%
	//int dan = 5;
	for(int i=2; i<10; i++){
		//out.println("<pre>"+dan+" * "+i+" = "+dan*i+"</pre>");
		out.println("<h1>구구단"+i+"단~~</h1>");
		for(int j=1; j<10; j++){
			out.println(i+" * "+ j + " = "+ i*j);
			%>
		<br>
	<% } %>
	<%-- 이렇게 문장을 끊었다가 다시 연결해도 컴퓨터는
	자바는 따로 인식되기 때문에 이어짐!! 중요!! --%>
		<br>
	<% } %>
	
	
	

</body>
</html>