package com.mgr.controller.loginprocess;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mgr.login.service.LoginInfoService;
import com.mgr.login.vo.LoginInfoVO;

@Controller
public class LoginController {

	@Resource(name="LoginInfoService")
	private LoginInfoService loginInfoService;
	
	/* 회원 정보 보기 */
	@RequestMapping("/getLogininfo.do")
	public String getLogininfo(LoginInfoVO vo1, Model model1) throws Exception{
		model1.addAttribute("Logininfo", loginInfoService.getLogininfo(vo1));
		return "getLogininfo";
	}
	
	/* 회원 삭제 */
	@RequestMapping("/deleteLogininfo.do")
	public String deleteLogininfo(LoginInfoVO vo1) throws Exception{
		loginInfoService.deleteTelinfo(vo1);
		return "Login";
	}
	
	/* 로그 아웃 */
	@RequestMapping("/logOut.do")
	public String logOutinfo() throws Exception{
		return "Login";
	}
	
	/* 회원 가입 */
	@RequestMapping("/insertLogininfo.do")
	public String insertLogininfo(LoginInfoVO vo1) throws Exception{
		loginInfoService.insertTelinfo(vo1);
		return "Login";
	}
	
	/* 회원 체크 */
	@RequestMapping("/login.do")
	public String login(LoginInfoVO vo1, Model model1) throws Exception{
		int check = loginInfoService.loginCheck(vo1);
		if(check==1) {
			model1.addAttribute("Logininfo", loginInfoService.getLogininfo(vo1));
			return "Logininfo";
		}else {
			return "Login";
		}
	}
	
}
