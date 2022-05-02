package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.ResellRDTO;
import com.service.SupervisingService;

@Controller
public class SupervisingController {

	@Autowired
	SupervisingService service;
	
	@RequestMapping("/MyAttendedRaffle")
	public ModelAndView MyAttendedRaffle(String memberno) {
		List<ResellRDTO> list = new ArrayList<>();
		list = service.selectMyAttendedRaffle(memberno);
		ModelAndView mav = new ModelAndView();
		mav.addObject("AttendedRaffle", list);
		mav.setViewName("");
		return mav;
	}
}
