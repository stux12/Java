package com.telservlet.my;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

@WebServlet("/Telsearchone")
public class Telsearchone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//servlet도 get방식 ?name=이 가능하다!!
    public Telsearchone() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String kaja = null;
		TelInfoVO tv1 = null;
		try {
			TelInfoDAO td1 = new TelInfoDAO();
			tv1 = td1.getInfo(name);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("tv1", tv1);
		
		kaja = "getOneinfo.jsp";
		RequestDispatcher rd1 = request.getRequestDispatcher(kaja);
		rd1.forward(request, response);
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
