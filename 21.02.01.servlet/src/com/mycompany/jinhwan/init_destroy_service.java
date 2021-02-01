package com.mycompany.jinhwan;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/init_destroy_service")
public class init_destroy_service extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public init_destroy_service() {
        super();
    }

    //결과를 확인해보면
    //1st : init, service
    //2st : service
    //3st : service
    //이건 servlet의 lifecycle을 알아야함
    //(자바에서) 객체생성 - 초기치 - .... - 객체소멸
    // servlet은 첫가동 : init, service(쓰레드) - 두번째부터는 service만 가동 - 객체 소멸은 destory(was를 내리면)
    /*
    Context가 로드후 첫 실행시 init
 	Context가 실행시마다 service
    Context가 로드시 distroy가 나옴 첫리로드시
    */
    
    
    //시작하자마자 초기치를 줘야할때
	public void init(ServletConfig config) throws ServletException {
		System.out.println("나 init이야");
	}

	//리로드시에 뜨게됨
	public void destroy() {
		System.out.println("나 destroy야");
	}

	
	//서비스가 직접 선언을 안해줬을때는 get,post를 찾아감
	// 이렇게 직접 선언해주면 get post는없는거라 생각하면 됨
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("나 service야");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
