package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.MemberDTO;
import com.service.MemberSerivce;

@Controller
public class MemberController {
	@Autowired
	MemberSerivce service;

	@RequestMapping(value = "/memberAdd")
	public String memberAdd(MemberDTO m, Model model) {
		service.memberAdd(m);
		model.addAttribute("success", "회원가입성공");
		return "Main";
	}
	@RequestMapping(value = "/Myinfo")
	public ModelAndView Mypage(HttpSession session) {
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		int memberno = dto.getMemberno();		
		dto = service.Mypage(memberno);
		System.out.println(dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("mypage", dto);
		mav.setViewName("Mypage/Myinfo");
		return mav;
		
		
	}


}
