package com.frontcontroller.my;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

@WebServlet("*.do")
//.do는 전부 여기로 오게 하고싶다 그럴려면 *.do로 하면됨 do는 무조건 do인거아님 하고싶은걸로 해도됨
//.do붙은것은 모두 이곳으로 찾아오게 됨
public class Sawonfrontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Sawonfrontcontroller() {
        super();
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	//post일경우 한글처리를 위해
    	request.setCharacterEncoding("UTF-8");
    	response.setCharacterEncoding("UTF-8");
    	
    	//서블릿 가동은 http://.../서블릿명
    	//이걸 착안하여 구분을 해야한다.
    
    	//이 방법이 제일 정확해서 이걸로 사용함
    	//참고 goni9071.tistory.com/354
    	System.out.println(request.getRequestURI()); //프로젝트명 + 파일명
    	System.out.println(request.getContextPath()); //프로젝트명
    	
    	
    	
    	// 위 두개를 빼면 파일명만 나오니 substring을 사용해서 한다
    	// substring(1) 인자1개의 의미는 ~부터 끝까지!!
    	String c = request.getRequestURI().substring(request.getContextPath().length());
    	
    	System.out.println(request.getServletPath());
    	System.out.println(c); //위방법보다는 정확한방법으로 사용하기
    	
    	// 각종 전역함수 선언
    	String str = null; // 어느페이지로 갈지 결정
    	TelInfoDAO tidao1= null; //DAO객체사용 
    	ArrayList<TelInfoVO> alist1 = null; //데이터베이스 정보를 담기위해
    	TelInfoVO tv1 = null; // 정보를 담는 그릇
    	int id = 0; //id담을변수
    	String name = null; //이름담을변수
    	String tel = null; //전화번호담을변수
    	String d = null; //date담을변수
    	boolean tf = false; //update delete insert 되었는지 확인하기 위해
    	
    	// 들어온 정보가 어떤건지 판별하기 위해
    	switch (c) {
    	// 전체검색
		case "/getAllInfo.do": 
				
			try {
				tidao1 = new TelInfoDAO();
			}catch (Exception e) {
				e.printStackTrace();
			}
		
			try {
				alist1 = tidao1.getAllInfo();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			request.setAttribute("alist1", alist1);
			str = "getAllinfo.jsp";
			
			break;

			
		//하나검색
		case "/telSearchone.do" : 
			
			name = request.getParameter("name");
			try {
				tidao1 = new TelInfoDAO();
				tv1 = tidao1.getInfo(name);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			request.setAttribute("tv1", tv1);
			
			str = "getOneinfo.jsp";
			break;
		
		// 정보입력
		case "/Telinsert.do" :
			id = Integer.parseInt(request.getParameter("id1"));
			name = request.getParameter("name1");
			tel = request.getParameter("tel1");
			d = request.getParameter("d1");
			
			str = "result.jsp";
			try {
				tidao1 = new TelInfoDAO();
				tf = tidao1.insertInfo(id, name, tel, d);
				if(tf) {
					request.setAttribute("result1", "insert성공");
				}else {
					request.setAttribute("result1", "insert실패");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			break;
			
		case "/TelDelete.do" :
			name = request.getParameter("name");
						
			try {
				tidao1 = new TelInfoDAO();
				tf = tidao1.deleteInfo(name);
			}catch (Exception e) {
				e.printStackTrace();
			}
				
			if(tf) {
				request.setAttribute("result1", "삭제good");
			}else {
				request.setAttribute("result1", "삭제오류");
			}
			str = "result.jsp";
			break;
		
			
		case "/Telupdate.do" :
			id = Integer.parseInt(request.getParameter("id"));
			name = request.getParameter("name");
			tel = request.getParameter("tel");
			d = request.getParameter("d");
			
			String name4 = request.getParameter("name2");
			
			//업데이트 처리
			try {
				tidao1 = new TelInfoDAO();
				
				tf = tidao1.update_nametel(id, name, tel, d, name4);
				//업데이트 성공여부
				if(tf) {
					request.setAttribute("result1", "update성공");
				}else {
					request.setAttribute("result1", "update실패");
				}
				str = "result.jsp";
			}catch (Exception e) {
				e.printStackTrace();
			}
			break;
		
		
		default:
			response.sendRedirect("ErrorPage.jsp");
			break;
		}
    
    	
		RequestDispatcher rd1 = request.getRequestDispatcher(str);
		rd1.forward(request, response);
    	    	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
