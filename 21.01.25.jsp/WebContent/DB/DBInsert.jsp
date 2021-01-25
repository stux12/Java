<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	//JDBC 연결
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	PreparedStatement pstmt1=null;
	ResultSet rs1=null;
	%>
	
	<%
	//post방식일때 무조건 필요 그냥 습관적으로 해야한다 생각하기
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	String id1 = request.getParameter("id1");
	String textarea1 = request.getParameter("textarea1");
	
	String sql = "insert into TelTable7 values (?,?)";
		pstmt1 = con1.prepareStatement(sql);
		pstmt1.setString(1, id1);
		pstmt1.setString(2, textarea1);
		//JDBC 업데이트
		pstmt1.executeUpdate();
		
	%>
	<a href="DBSearch.html">[검색]</a>
</body>
</html>