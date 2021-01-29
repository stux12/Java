<%@page import="telinfoDAO.TelInfoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		TelInfoDAO tidao = new TelInfoDAO();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String sDate = request.getParameter("sDate");
		
		//dao를 통해서 db에 insert하기
		boolean b1 = tidao.insert_nametel(id, name, tel, sDate);
							//dao객체.메소드()로 dao에 있는 메소드 호출
							//db에서 insert한후 성공하면 true 실패하면 false
		if(b1){
			response.sendRedirect("SawonAllView.jsp");
		}else{
		%>
			<a href="SawonInsertForm.jsp">사원입력 에러- 입력화면으로</a>
		<% } %>
</body>
</html>