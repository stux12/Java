package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HWorld") //맵핑시키는것
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    // 라이프사이클( @PostConstruct 선처리
    @Override //최초 실행시 한번만 실행됨!!
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println("init");
    }	
    
    @Override //서버 종료시 종료됨!!!
    public void destroy() {
    	// TODO Auto-generated method stub
    	System.out.println("destroy");
    }
    //) @PreDestroy 후처리
    
    
    @PostConstruct //이 메소드가 선처리되는 메소드라고 해주는것 init()실행전 먼저실행됨
    private void initPostConstruct() {
		// TODO Auto-generated method stub
System.out.println("initPostConstruct");
	}
   
    @PreDestroy //자원해제가 된후 실행이 되는곳 destroy()실행후 실행됨
    private void destroyPreDestroy() {
		// TODO Auto-generated method stub
    	System.out.println("destroyPreDestroy");
	}
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		 
		response.setContentType("text/html; charset-UTF-8");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("helloWorld");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}

}
