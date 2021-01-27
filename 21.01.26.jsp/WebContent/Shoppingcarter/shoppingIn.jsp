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
	int soo1 = Integer.parseInt(request.getParameter("soo"));
	String gabang = "가방";
	String sinbal = "신발";
	String oht = "옷";
	
	Object obj1 = session.getAttribute("cnts1");
	Object obj2 = session.getAttribute("cnts2");
	Object obj3 = session.getAttribute("cnts3");
	
	//받아온 sangpum이 뭔지 확인
	//방법1) 내가직접푼방식 일일이 다해줘야해서 귀찮아짐
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
	
	
	//방법2)
	int cnt1=0, cnt2=0, cnt3=0, cnt=0;
	if(obj1 != null){
		cnt1 = (Integer)obj1;
	}
	if(obj2 != null){
		cnt2 = (Integer)obj2;
	}
	if(obj3 != null){
		cnt3 = (Integer)obj3;
	}
	
	cnt = soo1;
	if("gabang".equals(sangpum)){
		cnt1 += cnt;
	}else if("sinbal".equals(sangpum)){
		cnt2 += cnt;
	}else{
		cnt3 += cnt;
	}
	
	session.setAttribute("cnts1", cnt1);
	session.setAttribute("cnts2", cnt2);
	session.setAttribute("cnts3", cnt3);
	
	//session.invalidate() 세션삭제!!
	//session.removeAttribute("cnts1") 세션의 한속성만 삭제하기
	%>
	<br>
	<br>
	<br>
	<br>
	<br>
	<h2>현재 장바구니 내역</h2>
	<hr>
	<%if(cnt1 != 0){%>가방:<%=cnt1 %><%} %><br>
	<%if(cnt2 != 0){%>신발:<%=cnt2 %><%} %><br>
	<%if(cnt3 != 0){%>옷:<%=cnt3 %><%} %><br>
	<br>
	이전으로 가시려면<a href="shopping.jsp">여기</a>를 누르세요
</body>
</html>