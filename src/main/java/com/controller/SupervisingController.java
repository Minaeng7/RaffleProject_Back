package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	@RequestMapping("/MyAttendedRaffle")
	public ModelAndView MyAttendedRaffle(String memberno) {
		List<ResellRDTO> listR = new ArrayList<>();
		listR = service.selectMyAttendedRaffleR(memberno);
		List<SellRDTO> listS = new ArrayList<>();
		listS = service.selectMyAttendedRaffleS(memberno);
		ModelAndView mav = new ModelAndView();
		Map<String,List>map = new HashMap<>();
		map.put("AttendedRaffleR", listR);
		map.put("AttendedRaffleS", listS);
		mav.addAllObjects(map);
		mav.setViewName("MyAttendedRaffle");
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
