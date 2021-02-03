package com.execute.my;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

public class ExecuteGetOneInfo implements ExecuteImpl {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		 
		String name = request.getParameter("name");

		TelInfoDAO tidao1 = new TelInfoDAO();
		TelInfoVO tv1 = tidao1.getInfo(name);
		
		request.setAttribute("tv1", tv1);
	}

}
