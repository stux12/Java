<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include</title>
	
	<style>
		table tr td{
			border: 1px solid;
		}
	</style>
	
</head>
<body>

	<!-- 
	include지시어  : 포함시켜서 함께 수행 (.js같은 주로 정적페이지에 사용) <%-- %><%@ include file="aa.js" %> --%>
	
	
	action tag     : 먼저 실행하고 그 결과를 포함시킴 (jsp같은 동적페이지에 사용) <%--<jsp:forward page="aa.jsp"/>--%>
						html + 자바 = jsp 하면 자바를 계속 끼워야해서 불편 그걸 해결하기위해
						html + 태그형식의 자바 = jsp로 하자 가독성을 높이기위해서 액션태그사용
	 -->

	<h2>include 지시어로 파일 포함하기</h2>
	우리 회사는 작지만 확실한 행복을 보장하는 이벤트를 합니다 <br>
	방문을 환영합니다 <br>
	<hr>
	<!-- include지시어 방식 -->
	<%@ include file="includeSub.jsp" %>
	
	<!-- 액션태그방식 -->
	<table>
		<tr>
			<td colspan="2" width="1000px" height="100px"><jsp:include page="ActionHeader.jsp"/></td>
		</tr>
		<tr>
			<td width="30%" height="100px"><jsp:include page="ActionLeft.jsp"/></td>
			<td width="70%" height="100px"><h4 align="center"><jsp:include page="ActionRight.jsp"/></h4></td>
		</tr>p
		<tr>
			<td colspan="2" width="100%" height="100px"><jsp:include page="ActionFooter.jsp"/></td>
		</tr>
	</table>
	
	
</body>
</html>