package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.RListDTO;
import com.service.RListService;

@Controller
public class AttendController {
	@Autowired
	RListService service;
	
	@RequestMapping("AttendingRaffle")
	public String AttendingRaffle() {
		return "AttendingRaffle";
	}
	@RequestMapping("Attend")
	public String Attend(RListDTO dto) {
		service.registinglist(dto);
		return null;
	}
}
