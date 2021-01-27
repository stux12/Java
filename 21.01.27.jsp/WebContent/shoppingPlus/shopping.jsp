<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>쇼핑몰 상품을 선택하고 수량을 입력하고 장바구니에 담으세여</h2>
	<form action="shoppingIn.jsp" method="get">
		<select name="sangpum">
			<option value="gabang">가방(1개 50000원)</option>
			<option value="sinbal">신발(1개 20000원)</option>
			<option value="oht">옷(1개 30000원)</option>
		</select>
		<input type="number" name="soo">개<br>
		<input type="submit" value="장바구니 담기">
		<input type="reset" value="안사">
		
	</form>


</body>
</html>