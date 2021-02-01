package com.mycompany.jinhwan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Hakjum")
public class Hakjum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Hakjum() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//한글처리
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String name = request.getParameter("irum");
		int jum = Integer.parseInt(request.getParameter("jum"))/10;
		String gak=null;
		String kaja=null;
		//이렇게 일일이 다 계산을하면 귀찮으니 클래스를 만들고 호출을 해서 사용
		//이를 service logic이라고 함
		//.jsp를 왜 각각 5개 만드는지 jsp에선 계산이안되고 view만 되니깐
		switch (jum) {
		case 10:
		case 9:
		case 8:
		case 7: 
			gak="A"; kaja="A.jsp"; break;
		case 6:
		case 5:
		case 4:
		case 3:
			gak="B"; kaja="B.jsp"; break;
		default:
			gak="C"; kaja="C.jsp"; break;
		}
		
		request.setAttribute("gak", gak);
		RequestDispatcher rd1 = request.getRequestDispatcher("/View/"+kaja);
		rd1.forward(request, response);
	}

}
