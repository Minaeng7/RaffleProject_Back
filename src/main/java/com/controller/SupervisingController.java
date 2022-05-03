package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.ResellRDTO;
import com.dto.SellRDTO;
import com.service.SupervisingService;

@Controller
public class SupervisingController {

	@Autowired
	SupervisingService service;
	
	@RequestMapping("/MyAttendedRaffleR")
	public ModelAndView MyAttendedRaffleR(String memberno) {
		List<ResellRDTO> list = new ArrayList<>();
		list = service.selectMyAttendedRaffleR(memberno);
		ModelAndView mav = new ModelAndView();
		mav.addObject("AttendedRaffle", list);
		mav.setViewName("");
		return mav;
	}
	@RequestMapping("/MyRaffleR")
	public ModelAndView MyRaffleR(String memberno) {
		List<ResellRDTO> list = new ArrayList<>();
		list = service.selectMyRaffleR(memberno);
		ModelAndView mav = new ModelAndView();
		mav.addObject("MyRaffle", list);
		mav.setViewName("");
		return mav;
	}
	@RequestMapping("/MyAttendedRaffleS")
	public ModelAndView MyAttendedRaffleS(String memberno) {
		List<SellRDTO> list = new ArrayList<>();
		list = service.selectMyAttendedRaffleS(memberno);
		ModelAndView mav = new ModelAndView();
		mav.addObject("AttendedRaffle", list);
		mav.setViewName("");
		return mav;
	}
	@RequestMapping("/MyRaffleS")
	public ModelAndView MyRaffle(String memberno) {
		List<SellRDTO> list = new ArrayList<>();
		list = service.selectMyRaffleS(memberno);
		ModelAndView mav = new ModelAndView();
		mav.addObject("MyRaffle", list);
		mav.setViewName("");
		return mav;
	}
}
