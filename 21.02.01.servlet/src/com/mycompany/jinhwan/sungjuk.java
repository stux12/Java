package com.mycompany.jinhwan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sungjuk")
public class sungjuk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public sungjuk() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//text=html 문자형태 UTF-8설정
		response.setContentType("text/html;charset=UTF-8");
		
		//post형식일경우 해줘야하는것!!
		request.setCharacterEncoding("UTF-8"); 
		response.setCharacterEncoding("UTF-8"); 
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//jsp처럼 쓰기위해
		PrintWriter out = response.getWriter();
		out.println("<h1>방가방가 서블릿</h1>");
		
		//MVC2모델 : M V(jsp) C(Servlet)
		//index : 처음 가동시키는 뭔가가 있어야함. ==>컨트롤러 ==> View에 나오게함
		
		//인자를 가지고 보내기 위해
		request.setAttribute("name", "방가방가~");
		
		//다른곳으로 보내기 위해S서는
		RequestDispatcher rd1 = request.getRequestDispatcher("/View/view.jsp");
		rd1.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
