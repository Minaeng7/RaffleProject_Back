package com.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;
import com.service.MemberService;

@Controller
public class LoginController {//로그인, 로그아웃
	@Autowired
	MemberService service;
	
	@RequestMapping("/login")
	public String login(@RequestParam Map<String, String> map, HttpSession session) {
		MemberDTO mdto = service.login(map);
		//System.out.println(mdto);
		
		if (mdto != null) {
			session.setAttribute("login", mdto);
			return "main";
		} else {
			return "loginForm";
		}
		
	}
	
	@RequestMapping(value = "/loginCheck/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:../";
	}
		

}
