package com.telservlet.my;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;

@WebServlet("/Telupdate")
public class Telupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Telupdate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
				
		//전체 칼럼 수정하기 위해 담음
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String d = request.getParameter("d");
		
		String name2 = request.getParameter("name2");
		
		
		//업데이트 처리
		try {
			TelInfoDAO td1 = new TelInfoDAO();
			
			boolean b = td1.update_nametel(id, name, tel, d, name2);
			
			//업데이트 성공여부
			if(b) {
				request.setAttribute("result1", "update성공");
			}else {
				request.setAttribute("result1", "update실패");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//forward로 인자를 가지고 다른페이지로 이동
		RequestDispatcher rd1 = request.getRequestDispatcher("result.jsp");
		rd1.forward(request, response);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
