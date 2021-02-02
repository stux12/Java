package com.telservlet.my;

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

@WebServlet("/Telallview")
public class Telallview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Telallview() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String kaja = null;
		TelInfoDAO tidao1 = null;
		ArrayList<TelInfoVO> alist1 = null;
		
		//계산 및 판단 즉, business logic 은 서블릿에서 함
		try {
			tidao1 = new TelInfoDAO();
			alist1 = tidao1.getAllInfo();
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		//그다음 작업인 컬렉션을 출력하는것은 뷰에서 해야함
		//인자를 가지고 뷰로 가야하기 때문에
		request.setAttribute("alist1", alist1);
		
		kaja = "getAllinfo.jsp";
		RequestDispatcher rd1 = request.getRequestDispatcher(kaja);
		rd1.forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
