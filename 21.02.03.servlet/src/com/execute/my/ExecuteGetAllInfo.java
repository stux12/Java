package com.execute.my;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import telinfoDAO.TelInfoDAO;
import telinfoVO.TelInfoVO;

public class ExecuteGetAllInfo implements ExecuteImpl{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		
		TelInfoDAO tidao1 = new TelInfoDAO();
		ArrayList<TelInfoVO> alist1 = tidao1.getAllInfo();
		request.setAttribute("alist1", alist1);
	}
}
