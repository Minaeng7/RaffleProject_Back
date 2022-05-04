package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dto.ResellRDTO;
import com.dto.SellRDTO;
import com.service.ListService;

@Controller
public class ProductController {
	@Autowired
	ListService service;
	
	@RequestMapping(value="/loginCheck/AddSell")
	public String AddProduct() {
		return "redirect:../AddSell";
	}
	
	@RequestMapping(value="/loginCheck/SellRetrieve")
	public ModelAndView AddSell(SellRDTO sdto, HttpSession session) {
		service.addSell_r(sdto);
		System.out.println(sdto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("sdto", sdto);
		mav.setViewName("Product/SellRetrieve");
		return mav;
	}
	
	@RequestMapping(value="/loginCheck/ResellRetrieve")
	public ModelAndView AddResell(ResellRDTO rdto, HttpSession session) {
		service.addResell_r(rdto);
		System.out.println(rdto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("rdto", rdto);
		mav.setViewName("Product/ResellRetrieve");
		return mav;
	}
	
	@RequestMapping("/SList")
	@ResponseBody
	public ModelAndView ResellList(SellRDTO sdto) {//sell_rno로 판매자 정보 가져오기
//		MemberDTO mdto = (MemberDTO) session.getAttribute("login");
//		System.out.println(mdto);
		List<SellRDTO> slist = (List<SellRDTO>) service.SellRList(sdto);
		System.out.println(slist);
		ModelAndView mav = new ModelAndView();
		mav.addObject("sdto", slist);
		mav.setViewName("Product/SList");
		//System.out.println(sdto);
		return mav;
	}


}
