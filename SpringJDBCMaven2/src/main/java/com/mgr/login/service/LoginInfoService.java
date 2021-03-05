package com.mgr.login.service;

import com.mgr.login.vo.LoginInfoVO;

public interface LoginInfoService {
	
	public void insertLogininfo(LoginInfoVO vo1) throws Exception;
		
	public void deleteLogininfo(LoginInfoVO vo1) throws Exception;
	
	public LoginInfoVO getLogininfo(LoginInfoVO vo1) throws Exception;
	
	public int loginCheck(LoginInfoVO vo1) throws Exception;
}
