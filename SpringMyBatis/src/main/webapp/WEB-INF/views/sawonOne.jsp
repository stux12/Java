<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>Insert title here</title>
</head>   <!-- �� ���ϸ��� sawonGetTelinfo.jsp -->
<!-- ���⼭�� �Ѹ��� ���� ������ ȭ�鿡 ��� -->
<body>
	<h1>��� ���� �� ����</h1> <!-- �� ������ ������ ���� or  ���� -->
	<hr>
	<form action="updateTelinfo.do" method="post"> <!-- �����Ϸ� -->
	<table border="2">
	 <tr><td>���</td>
         <td><input type="text" name="id" value="${sawonVO.id}"></td></tr>
              <!-- input value����� ����� �� �ȴٴ�   ${sawonVO.getId()}-->
 	<tr><td>�̸�</td><td>${sawonVO.name} </td></tr> 
          <!--  �̰� ��¸� �ȴٴ�  -->
	<tr><td>��ȭ��ȣ</td>
        <td><input type="text" name="tel" value="${sawonVO.tel}"></td></tr>

	<input type="hidden" name="name" value="${sawonVO.name}">
<tr><td colspan="2"><input type="submit" value="���� ����"></td></tr> 
</table>
   </form>
  <
<table border=0>
<tr><td><a href="sawonAll.do">[��κ���]</a></td>
 <td><a href="deleteTelinfo.do?name=${sawonVO.name}">[����]</a>
</table>         <!-- �����Ϸ� -->
	
</body>
</html>

