package com.mycompany.jinhwan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//앞에 @ : annotation(애노테이션) : 클래스 위에서 사용 + web.xml의 역할을 대신해줌
			// urlmapping : 이 페이지를 찾아갈때 끝에가 /hello_Servlet이어야 한다.
			// 찾아갈 url을 알려주는 의미!! 
			// 이 한줄을 web.xml에 쓰면 10줄쓸걸 한줄로 처리가능
			// 단점으로는 너무 간단한게 단점이 됨, 내용을 공부하지 않으면 분석이 안됨
@WebServlet("/helloServlet")
								// HttpServlet을 상속해서 객체생성함
public class helloServlet extends HttpServlet {
	
	// 직렬화에 관한것임
	// 전송을할때 
	// marshaling - unmarshaling 서로다른 시스템에서 주고받고할때 해줘야함, 범위가 좀 큼
	// serialization(직렬화) - deserialization 객체는 그대로 무조건 그대로 보내면 안됨 xml or binary(1011110111)로 바꿔서 보내야함
	//							바꿔서 보내기 위해서 하는걸 직렬화라고 함
	//							받는쪽에선 역직렬화해서 다시 객체로 바꿔줘야함
	//							역직렬화는 JVM이 따져서 확인작업을 함
	// 이걸 안해주면 컴파일러가 자동으로 값을 할당하게 되는데 이 값이 계속적으로 변하기때문에
	private static final long serialVersionUID = 1L;

	// 생성자
    public helloServlet() {
    }
    
    
	// 메소드 호출문처럼 보이지만 정의문임		요청						응답	예외처리
	//클래스가 있는 이유 웹자바에서는 내장객체가 만들어져있지 않기때문에 만들어줘야함
	//따라서 request가 아닌 다른 변수명을 주어줘도 됨!!!!
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
						
		
		//응답 response.getWrite == (jsp)out.print() 클라이언트로 보내는 명령어
							//추가한다 이 추가한값이 클라이언트로 보내짐
		//get방식이건 post방식이건 이걸처리함 결국 현재로서는 똑같다~
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//jsp의 반대 자바니깐 java를 쓰고 html을 끼워서 넣음
		//text를 html로 언어는 UTF-8형태로 설정
		response.setContentType("text/html;charset-UTF-8");

		//jsp처럼 out을 쓰고싶으면 out객체를 만들어 써야함
		PrintWriter out = response.getWriter();
		out.println("<h1>방가방가 Hello Servlet 이라는 </h1>");
		System.out.println("모야");
		
		//앞에 주소창에 앞에 localhost안뜸 프로젝트명만나옴
		response.getWriter().println(request.getContextPath());
		//프로젝트명/파일경로가 나옴
		response.getWriter().println(request.getRequestURI());
		//전체경로가 나옴
		response.getWriter().println(request.getRequestURL());
		//파일명만 나옴 urlmapping!!
		response.getWriter().println(request.getServletPath());
		//절대경로 옛날버전!!!
		response.getWriter().println(request.getRealPath("/")); //old버전
		//절대경로 현재버전!!!
		response.getWriter().println(request.getSession().getServletContext().getRealPath("/"));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet을 호출함 메소드 호출문~
		//kaja()처럼 다른곳으로 이동할수도 있음
		doGet(request, response);
	
		
	}

}
