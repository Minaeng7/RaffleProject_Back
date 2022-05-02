package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.RListDTO;
import com.dto.SListDTO;
import com.service.RListService;
import com.service.SListService;

@Controller
public class AttendController {
	@Autowired
	RListService Rservice;
	
	SListService Sservice;
	
	
	@RequestMapping("/AttendingRaffle")
	public String AttendingRaffle() {
		return "AttendingRaffle";
	}
	@RequestMapping("/RAttend")
	public String RAttend(RListDTO dto) {
		Rservice.registinglist(dto);
		return null;
	}
	@RequestMapping("/SAttend")
	public String SAttend(SListDTO dto) {
		Sservice.registinglist(dto);
		return null;
	}
}
