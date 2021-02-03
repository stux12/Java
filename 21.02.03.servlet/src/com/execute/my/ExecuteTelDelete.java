package com.execute.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;

public class ExecuteTelDelete implements ExecuteImpl {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		 
		
		String name = request.getParameter("name");

		TelInfoDAO tidao1 = new TelInfoDAO();
		boolean tf = tidao1.deleteInfo(name);

		if (tf) {
			request.setAttribute("result1", "삭제good");
		} else {
			request.setAttribute("result1", "삭제오류");
		}

	}

}
