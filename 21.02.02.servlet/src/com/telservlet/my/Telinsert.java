package com.telservlet.my;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;

@WebServlet("/Telinsert")
public class Telinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Telinsert() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		int id = Integer.parseInt(request.getParameter("id1"));
		String name = request.getParameter("name1");
		String tel = request.getParameter("tel1");
		String d = request.getParameter("d1");
		System.out.println(d);
		
		
		try {
			TelInfoDAO td1 = new TelInfoDAO();
			boolean b = td1.insertInfo(id, name, tel, d);
			if(b) {
				request.setAttribute("result1", "insert성공");
			}else {
				request.setAttribute("result1", "insert실패");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		RequestDispatcher rd1 = request.getRequestDispatcher("result.jsp");
		rd1.forward(request, response);
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
