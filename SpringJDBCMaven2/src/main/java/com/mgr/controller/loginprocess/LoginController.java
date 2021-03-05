package com.mgr.controller.loginprocess;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mgr.login.service.LoginInfoService;
import com.mgr.login.vo.LoginInfoVO;

@Controller
public class LoginController {

	@Resource(name = "LoginInfoService")
	private LoginInfoService loginInfoService;

	/* 회원 정보 보기 */
	@RequestMapping("/getLogininfo.do")
	public String getLogininfo(LoginInfoVO vo1, Model model1) throws Exception {
		model1.addAttribute("Logininfo", loginInfoService.getLogininfo(vo1));
		return "login/getLogininfo";
	}

	/* 회원 삭제 */
	@RequestMapping("/deleteLogininfo.do")
	public String deleteLogininfo(LoginInfoVO vo1, HttpSession session) throws Exception {
		session.removeAttribute("Logininfo");
		session.removeAttribute("Loginlog");
		loginInfoService.deleteLogininfo(vo1);
		return "login/Login";
	}

	/* 로그 아웃 */
	@RequestMapping("/logOut.do")
	public String logOutinfo(HttpSession session) throws Exception {
		session.removeAttribute("Logininfo");
		session.removeAttribute("Loginlog");
		return "login/Login";
	}

	/* 회원 가입 */
	@RequestMapping("/insertLogininfo.do")
	public String insertLogininfo(LoginInfoVO vo1) throws Exception {
		loginInfoService.insertLogininfo(vo1);
		return "login/Login";
	}

	/* 회원 체크 */
	@RequestMapping("/login.do")
	/* HttpSession session 으로 servlet할때 session값을 사용할 수 있음 */
	/* HttpServletResponse response를 적어서 이용하면 out.print해서 스크립트언어를 사용가능 */
	/* 한글을 썼을때 인코딩시 글씨가 깨지지 않기 위해 선언해줌 */
	/* response.setContentType("text/html; charset=UTF-8");*/
	/* PrintWriter out = response.getWriter();*/
	/* out.println("<script>alert(\"로그아웃 되었습니다.\")</script>"); out.flush();*/
	/* out.flush()는 out을 사용한것들을 한번에 모두 묶어서 보내는 역할을함 */
	public String login(LoginInfoVO vo1, HttpSession session) throws Exception {
		int check = loginInfoService.loginCheck(vo1);
		if (check == 1) {
			LoginInfoVO vo2 = loginInfoService.getLogininfo(vo1);
			/*따로 선언해줘도 되고 아니면 vo2자체를 setAttr해서 이 값을 사용하는곳에서 .id 이런식으로 가져와도 됨*/
			session.setAttribute("Logininfo", vo2.getName());
			session.setAttribute("Loginlog", vo2.getId());
			return "login/Logininfo";
		} else {
			return "login/Login";
		}
	}

	/* 회원가입하는곳으로 이동 */
	@RequestMapping("/insert.do")
	public String insert() throws Exception {
		return "login/insertLogininfo";
	}

}
