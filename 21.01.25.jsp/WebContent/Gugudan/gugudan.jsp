<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	구구단 expretion을 이용해서 했음 
		<br>
		<br>		
	<%
	for(int i=2; i<10; i++){
		for(int j=1; j<10; j++){
			%>		
			<%= i %> x <%= j %>=<%= i*j %>
				<br>	
		<% } %>
		<br>	
	<% } %>
		
		
		
	

	



</body>
</html>