<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>
	<h1>��� ��ü ���</h1>
	<table border="2">
	<thead>	<tr><th>��ȣ</th>	<th>�̸�</th>	<th>��ȭ</th>	</tr>
	</thead>
	<tbody>
		<c:forEach var="imsi" items="${alist}">
		<tr><td>${imsi.id}</td>
			<%-- <td>${imsi.name}</td> --%>
			<td><a href="getTelinfo.do?name=${imsi.name}"> ${imsi.name}</a>
			<td>${imsi.tel}</td> </tr>
		</c:forEach>
	</tbody>
	</table>
	<div>
	<a href="<c:url value='/sawonInsertForm.do' />">[������]</a>
	<a href="<c:url value='/sawonAll.do' />">[��κ���]</a>
	</div>
	
	
	
	
	
		
</body>
</html>
