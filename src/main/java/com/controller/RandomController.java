package com.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.RListDTO;
import com.dto.SListDTO;
import com.service.RListService;
import com.service.SListService;

@Controller
public class RandomController {

	RListService rservice;
	SListService sservice;
	
	@RequestMapping("/RShuffle")
	public ModelAndView RShuffle(String Raffleno) {
		List<RListDTO>list = rservice.shuffle(Raffleno);
		Collections.shuffle(list);
		RListDTO dto = list.get(0);
		ModelAndView mav = new ModelAndView();
		mav.addObject("Winner",dto);
		mav.setViewName("Winneris");
		return mav;
	}
	@RequestMapping("/SShuffle")
	public ModelAndView SShuffle(String Raffleno) {
		List<SListDTO>list = sservice.shuffle(Raffleno);
		Collections.shuffle(list);
		SListDTO dto = list.get(0);
		ModelAndView mav = new ModelAndView();
		mav.addObject("Winner",dto);
		mav.setViewName("Winneris");
		return mav;
	}

}
