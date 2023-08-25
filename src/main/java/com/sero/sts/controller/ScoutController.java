package com.sero.sts.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sero.sts.service.ScoutService;

@Controller
public class ScoutController {

	@Autowired
	private ScoutService scoutService;
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		return "loginForm";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam String id, @RequestParam String pw, HttpServletRequest request) {
		boolean flag = scoutService.login(id, pw);
		
		if (flag) {
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			return "redirect:/main";
		} else {
			return "redirect:/loginForm";
		}
	}
	
}
