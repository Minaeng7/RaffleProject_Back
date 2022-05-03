package com.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.RListDTO;
import com.dto.SListDTO;
import com.service.RListService;
import com.service.SListService;

@Controller
public class RandomController {

	@Autowired
	RListService rservice;
	@Autowired
	SListService sservice;
	
	@RequestMapping("/RShuffle")
	public ModelAndView RShuffle(int resell_rno) {
		List<RListDTO>list = rservice.shuffle(resell_rno);
		Collections.shuffle(list);
		RListDTO dto = list.get(0);
		ModelAndView mav = new ModelAndView();
		mav.addObject("Winner",dto);
		mav.setViewName("Winneris");
		return mav;
	}
	@RequestMapping("/SShuffle")
	public ModelAndView SShuffle(int sell_rno) {
		List<SListDTO>list = sservice.shuffle(sell_rno);
		Collections.shuffle(list);
		SListDTO dto = list.get(0);
		ModelAndView mav = new ModelAndView();
		mav.addObject("Winner",dto);
		mav.setViewName("Winneris");
		return mav;
	}

}
