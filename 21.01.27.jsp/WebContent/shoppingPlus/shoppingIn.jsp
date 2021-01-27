<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="shoppingErrorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//변수 선언
	String sangpum = request.getParameter("sangpum");
	int soo1 = Integer.parseInt(request.getParameter("soo"));

	
	//가격을 넣기위한 세션
	Object ob1 = session.getAttribute("cts1");
	Object ob2 = session.getAttribute("cts2");
	Object ob3 = session.getAttribute("cts3");

	//수량을 넣기위한 세션
	Object obj1 = session.getAttribute("cnts1");
	Object obj2 = session.getAttribute("cnts2");
	Object obj3 = session.getAttribute("cnts3");
	
	//기존에 값이 있으면 값을 가져오기 위해 쓴곳
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
	
	int ct1=0, ct2=0, ct3=0;
	if(ob1 != null){
		ct1 = (Integer)ob1;
	}
	if(ob2 != null){
		ct2 = (Integer)ob2;
	}
	if(ob3 != null){
		ct3 = (Integer)ob3;
	}
	
	//기존에 있던 값과 새로들어온 값을 추가해주는곳
	cnt = soo1;
	if("gabang".equals(sangpum)){
		int soo = 50000;
		ct1 += soo;
		cnt1 += cnt;
	}else if("sinbal".equals(sangpum)){
		int soo = 20000;
		ct2 += soo;
		cnt2 += cnt;
	}else{
		int soo = 30000;
		ct3 += soo;
		cnt3 += cnt;
	}
	
	//웹페이지에서 값을 
	session.setAttribute("cnts1", cnt1);
	session.setAttribute("cnts2", cnt2);
	session.setAttribute("cnts3", cnt3);
	session.setAttribute("cts1", ct1);
	session.setAttribute("cts2", ct2);
	session.setAttribute("cts3", ct3);
	
	
	%>
	<h2>현재 장바구니 내역</h2>
	<hr>
	<%if(cnt1 != 0){%>가방:<%=cnt1 %><%} %><br>
	<%if(cnt2 != 0){%>신발:<%=cnt2 %><%} %><br>
	<%if(cnt3 != 0){%>옷:<%=cnt3 %><%} %><br>
	<br>
	<a href="shopping.jsp">이전</a> <a href="noshopping.jsp">모두 취소</a> <a href="bayshopping.jsp">주문</a>
</body>
</html>