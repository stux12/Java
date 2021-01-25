<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
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
	ArrayList list = new ArrayList();
	%>
	
	<%
	//post방식일때 무조건 필요 그냥 습관적으로 해야한다 생각하기
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	int id1 = Integer.valueOf((request.getParameter("search1")));
	
	String sql = "select * from TelTable7 where id = ?";
		pstmt1 = con1.prepareStatement(sql);
		pstmt1.setInt(1, id1);
		//JDBC 조회문 resultset에 담기
		rs1 = pstmt1.executeQuery();
		
		//resultset에 담긴 결과를 arraylist에 담기
		out.print("정보를 검색한결과입니다 > <br>");
		while(rs1.next()){
			String a = rs1.getString("bigo").replace("\r\n", "<br>");
			out.print(a); 
			%>
			<br>
			<textarea cols=50 rows=5 name="textarea1"><%= rs1.getString("bigo") %>
			</textarea>	<br>
		<%}
		//열었던거 닫아주기 메모리낭비하지않기 위해
		rs1.close(); pstmt1.close(); con1.close();
		/* 
			주의할점
			textarea vs textarea 일때는 엔터가 잘들음
			그렇지않은경우 엔터 안들을수 있음
			WHY??
			자바에선 \n으로 알아들음 하지만 jsp에선 <br>이 엔터이기 때문에 안먹음
			해결하려면 자바쪽에서 replace("\r\n","<br>")로 하면 엔터먹음
		*/
		%>
	
	
</body>
</html>