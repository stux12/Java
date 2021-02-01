<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Spring에서는 ojdbc.jar를 톰캣에 넣어줘야함  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	MVC2 하는방법
	1) input => servlet => output
	2) input, output을 한파일로 하는 방법
	3) 모두 하나의 servlet으로 처리 하는 방법 ======> 나중에는 이걸로 해야함!!!!!!!!!!!!!!!!!!!!!!
	4) servlet을 여러개 만들어서 즉, controller를 여러개 만들어서 처리 하는 방법
	 -->
	<table border="2">
		<tr>
			<td colspan="4">
				<form action="Telallview">
					<input type="submit" value="가자" />
				</form>
			</td>
		</tr>
	</table>

</body>
</html>