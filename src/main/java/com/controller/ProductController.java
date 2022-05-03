package com.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.ResellRDTO;
import com.dto.SellRDTO;
import com.service.ListService;

@Controller
public class ProductController {
	@Autowired
	ListService service;
	
	@RequestMapping(value="/loginCheck/AddProduct")
	public String AddProduct(@RequestParam Map<String, String> map, HttpSession session) {//model (메세지 전달하려고 사용), session(로그인 정보 저장)
		return "redirect:../AddProduct";
	}
	
	//resell상품등록
	@RequestMapping("/ResellRetrieve")
	public String AddResell(ResellRDTO rdto, HttpSession session) {
		service.addResell_r(rdto);
		System.out.println(rdto);
		session.setAttribute("rdto", rdto);
		return "ResellRetrieve";
	}
		
	//sell상품등록
	@RequestMapping("/SellRetrieve")
	public String AddSell(SellRDTO sdto, HttpSession session) {
		service.addSell_r(sdto);
		System.out.println(sdto);
		session.setAttribute("sdto", sdto);
		return "SellRetrieve";
	}
	
	
}
