<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% // post방식 사용시 한글이 안깨지게 하기 위해서 사용 
	request.setCharacterEncoding("UTF-8"); 
	response.setCharacterEncoding("UTF-8"); 
	

	String name = request.getParameter("name");
	int jumsu = Integer.parseInt(request.getParameter("jumsu"));
	int jumsu2 = Integer.parseInt(request.getParameter("jumsu2"));
	
	int cong = (jumsu+jumsu2)/20;
	request.setAttribute("cong", cong);
	String hakjum = null;
	switch(cong){
		case 10:
			hakjum="A"; break;
		case 9:
		case 8:
		case 7:
		case 6:
			hakjum="B"; break;
		case 5:
		case 4:
		case 3:
			hakjum="C"; break;
		case 2:
		case 1:
		case 0:
			hakjum="낙제"; break;
	}
	%>
	<!-- mvc모델을 맞추려면 별도로
	A.jsp B.jsp C.jsp 낙제.jsp가 필요
	즉 다른페이지에서 + 학점인자값도 가지고 가려면
	sendRedirect 인자를 보내려면 getParam사용
	RequestDispatcher.forward() 인자를 보낼수있음
	-->
	
	<%   /* 보통 서블릿에 사용하는건데 param값을 가지고 요청한곳으로 넘김 */
		request.getRequestDispatcher("/jspview/"+hakjum+".jsp").forward(request, response);
		
	%>
	
</body>
</html>