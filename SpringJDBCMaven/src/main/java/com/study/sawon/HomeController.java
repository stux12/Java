package com.study.sawon;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/moya.do", method = RequestMethod.POST)
	/* 아무 메소드가 있으면됨 그리고 반드시 반환형은 스트링이 되어야 함 */
	public String kaja(@RequestParam(value = "irum", defaultValue = "") String irumResult, Model model) {
						/* HttpServletrequest request 해서 */
						/* request.getParameter("irum")을 의미 */

		if (irumResult.equals("") || irumResult == null) {
			return "kajaError";
		} else {
			model.addAttribute("mirum", irumResult);
			return "kaja";
		}

		/*
		 * model은 값을 보낼려고 준비되어 있는것임 model의 속성은
		 */

	}

}
