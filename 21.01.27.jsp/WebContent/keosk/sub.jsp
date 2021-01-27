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
	int soo = Integer.parseInt(request.getParameter("soo"));
	String[] cafe = request.getParameterValues("cafe");
	int count = 0;
	
	
	String[] cafe2 = request.getParameterValues("cafe2");
	int sum=0; //총 금액수 나중에 받아온 soo하고 빼서 계산용
	int cnt=0; //주문한개수확인용
	for(String cafe1 : cafe2){
		String[] cafes = cafe1.split(",");
		int price = Integer.valueOf(cafes[1].trim());
		sum += price;
		cnt++;
	}
	
	%>
	<h2>주문서</h2>
	<hr>
	
	<%
	
	for(int i=0; i<cafe.length; i++){
		if(cafe[i].equals("solt")){
			out.print("흑당커피 구매하실려는군요");
			if(soo-2700<0){
				count++;
			}
			soo = soo-2700;
			out.print("<br>");
		}
		if(cafe[i].equals("late")){
			out.print("카페라떼 구매하실려는군요");
			if(soo-1700<0){
				count++;
			}
			soo = soo-1700;
			out.print("<br>");
		}
		if(cafe[i].equals("moca")){
			out.print("카페모카 구매하실려는군요");
			if(soo-2000<0){
				count++;
			}
			soo = soo-2000;
			out.print("<br>");
		}
		if(cafe[i].equals("ame")){
			out.print("아메리카노 구매하실려는군요");
			if(soo-900<0){
				count++;
			}
			soo = soo-900;
			out.print("<br>");
		}
		if(cafe[i].equals("ess")){
			out.print("에스프레소 구매하실려는군요");
			if(soo-3000<0){
				count++;
			}
			soo = soo-3000;
			out.print("<br>");
		}
		if(cafe[i].equals("cafu")){
			out.print("카푸치노 구매하실려는군요");
			if(soo-2000<0){
				count++;
			}
			soo = soo-2000;
			out.print("<br>");
		}
	}
	
	%>
	<% 
	if(count==0){
		out.print("총계산후 남은금액은"+soo+" 원입니다");
	}else{
		soo = -soo;
		out.print("잔액이 부족합니다!! 부족한 잔액은"+soo+"원입니다.");
	}
	%>	
	
	
	
</body>
</html>