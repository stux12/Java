<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    안녕 방가방가합니다 이것은 값을 가져오는겁니당~
    오늘도 즐겁다 어려웡
    
    
    <%-- scriptlet 자바문법 시작하는곳 자바랑 문법이 똑같음!!!중요!!
    	javascript : html + script
    	   jsp	   : html + java 
    	 --%>
    	
    <% //String values = request.getParameter("values"); //호영 이름을 받아서 name에 들어감
      String name = request.getParameter("name");
       String age = request.getParameter("age");
    
    
//    int idx = values.indexOf(",");
//    String name = values.substring(0,idx);
//    String age = values.substring(idx+1);
    %>
    <%-- expression 결과를 찍기위해 사용하는곳 --%>
    그리고 당신의 이름은 <%= name %> 이군요
    나이는<%= age %> 이군요