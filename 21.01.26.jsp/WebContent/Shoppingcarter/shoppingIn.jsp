<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="shoppingErrorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>장바구니</h3>
	<hr>

	<%
	//변수 선언
	String sangpum = request.getParameter("sangpum");
	int soo = Integer.parseInt(request.getParameter("soo"));
	String gabang = "가방";
	String sinbal = "신발";
	String oht = "옷";
	
	//받아온 sangpum이 뭔지 확인
	if(sangpum.equals("gabang")){
		//값이 널이아닐경우엔 값이 있다는거니 soo를 추가해야함
		if(session.getAttribute("gabangsoo")!=null){
			soo += (int)session.getAttribute("gabangsoo");
			session.setAttribute("gabangsoo", soo);		
		}else{
			session.setAttribute("gabangsoo", soo);
		}
	}else if(sangpum.equals("sinbal")){
		if(session.getAttribute("sinbalsoo")!=null){
			soo += (int)session.getAttribute("sinbalsoo");
			session.setAttribute("sinbalsoo", soo);
		}else{
			session.setAttribute("sinbalsoo", soo);
		}
	}else{
		if(session.getAttribute("ohtsoo")!=null){
			soo += (int)session.getAttribute("ohtsoo");
			session.setAttribute("ohtsoo", soo);
		}else{
			session.setAttribute("ohtsoo", soo);
		}
	}
	
	//출력을 할때 개수의 값이 널이 아닐경우에만 출력하게끔 한것
	if(session.getAttribute("gabangsoo")!=null){
		out.println(gabang+"의 개수는"+session.getAttribute("gabangsoo")+"개입니다.<br>");
	}
	if(session.getAttribute("sinbalsoo")!=null){
		out.println(sinbal+"의 개수는"+session.getAttribute("sinbalsoo")+"개입니다.<br>");
	}
	if(session.getAttribute("ohtsoo")!=null){
		out.println(oht+"의 개수는"+session.getAttribute("ohtsoo")+"개입니다.<br>");
	}
	
	%>
	
	<br>
	이전으로 가시려면<a href="shopping.jsp">여기</a>를 누르세요
</body>
</html>