<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		table, tr, td{
			border: 1px solid;
		}
	</style>
</head>
<body>
	구입내역
	
	
	<% // post방식 사용시 한글이 안깨지게 하기 위해서 사용 
	request.setCharacterEncoding("UTF-8"); 
	response.setCharacterEncoding("UTF-8"); 
	%>
	
	<% // 값을 html로 부터 받아오는곳
	String sunteak1 = request.getParameter("sunteak1");
	// 값이 여러개 넘어오는것은 []로 받아야하며 Values를 붙여줘야함!!
	String[] jepum1 = request.getParameterValues("jepum1");
	String bangbub1 = request.getParameter("bay");
	%>
	
	
	<table>
		<tr>
			<td>제품종류 번호 및 제목    </td>
			<td><%= sunteak1 %></td>
		</tr>
		<tr>
			<td>제품 선택</td>
			<td><% for(int i=0; i<jepum1.length; i++){
						out.print(jepum1[i]);
				%>
				<!-- 만약 []으로 오는값이 꼭 값을 받아야하는게 아닌 null로 받아도 될경우엔
				if(jepum1 != null)을 확인해야한다.!! -->
				<br>
				<%}%>
			</td>
			
		</tr>
		<tr>
			<td>구입 방법    </td>
			<td><%= bangbub1 %></td>
			
		</tr>
		<tr>
			<td colspan="2">다시 구입하려면 <a href="Study.html">여기</a>를 누르세요</td>
		</tr>
		
	</table>
	
</body>
</html>