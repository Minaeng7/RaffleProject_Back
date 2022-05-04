package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.MemberDTO;
import com.dto.ResellRDTO;
import com.dto.SellRDTO;
import com.service.SupervisingService;

@Controller
public class SupervisingController {

	@Autowired
	SupervisingService service;
	
	@RequestMapping("/MyAttendedRaffle")
	public ModelAndView MyAttendedRaffle(HttpSession session) {
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		int memberno = dto.getMemberno();
		List<ResellRDTO> listR = new ArrayList<>();
		listR = service.selectMyAttendedRaffleR(memberno);
		List<SellRDTO> listS = new ArrayList<>();
		listS = service.selectMyAttendedRaffleS(memberno);
		ModelAndView mav = new ModelAndView();
		mav.addObject("AttendedRaffleR", listR);
		mav.addObject("AttendedRaffleS", listS);
		mav.setViewName("MyRaffle/MyAttendedRaffle");
		return mav;
	}
	@RequestMapping("/SupervisingRaffle")
	public ModelAndView MyRaffle(HttpSession session) {
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		int memberno = dto.getMemberno();
		List<ResellRDTO> listR = new ArrayList<>();
		List<SellRDTO> listS = new ArrayList<>();
		listS = service.selectMyRaffleS(memberno);
		listR = service.selectMyRaffleR(memberno);
		ModelAndView mav = new ModelAndView();
		mav.addObject("MyRaffleR", listR);
		mav.addObject("MyRaffleS", listS);
		mav.setViewName("MyRaffle/SupervisingRaffle");
		return mav;
	}

}
