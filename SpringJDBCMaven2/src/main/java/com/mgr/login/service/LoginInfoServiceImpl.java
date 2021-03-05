package com.mgr.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.login.dao.LoginInfoDAO;
import com.mgr.login.vo.LoginInfoVO;

@Service("LoginInfoService")
public class LoginInfoServiceImpl implements LoginInfoService {

	@Autowired
	private LoginInfoDAO loginInfoDAO;
	
	@Override
	public void insertLogininfo(LoginInfoVO vo1) throws Exception {
		loginInfoDAO.insertLogininfo(vo1);
	}

	@Override
	public void deleteLogininfo(LoginInfoVO vo1) throws Exception {
		loginInfoDAO.deleteLogininfo(vo1);
	}

	@Override
	public LoginInfoVO getLogininfo(LoginInfoVO vo1) throws Exception {
		return loginInfoDAO.getLogininfo(vo1);
	}
	
	@Override
	public int loginCheck(LoginInfoVO vo1) throws Exception {
		return loginInfoDAO.checkLogininfo(vo1);
	}

}
