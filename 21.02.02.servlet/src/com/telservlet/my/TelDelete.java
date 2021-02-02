package com.telservlet.my;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.net.aso.e;
import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

@WebServlet("/TelDelete")
public class TelDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TelDelete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
	
		Boolean b = false;
		
		try {
			TelInfoDAO td1 = new TelInfoDAO();
			b = td1.deleteInfo(name);
		}catch (Exception e) {
			e.printStackTrace();
		}
			
		
		if(b) {
			request.setAttribute("result1", "삭제good");
		}else {
			request.setAttribute("result1", "삭제오류");
		}
		
		RequestDispatcher rd1 = request.getRequestDispatcher("result.jsp");
		rd1.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
