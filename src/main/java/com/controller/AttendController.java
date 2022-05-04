package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.RListDTO;
import com.dto.ResellRDTO;
import com.dto.SListDTO;
import com.dto.SellRDTO;
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
	@RequestMapping("/loginCheck/UpdateMyAttendingR")
	public String UpdateAttendingR() {
		return "UpdateAttendingR";
	}
	@RequestMapping("/loginCheck/UpdateMyAttendingS")
	public String UpdateAttendingS() {
		return "UpdateAttendingS";
	}
	
	@RequestMapping("/loginCheck/UpdateMyAttendingRR")
	public String UpdateMyAttendingRR(RListDTO rdto, HttpSession session) {
		Rservice.UpdateMyAttendingR(rdto);
		return "redirect:Mypage";
	}
	@RequestMapping("/loginCheck/UpdateMyAttendingSS")
	public String UpdateMyAttendingSS(SListDTO rdto, HttpSession session) {
		Sservice.UpdateMyAttendingS(rdto);
		return "redirect:Mypage";
	}
	@RequestMapping("/loginCheck/RAttendingRaffle")
	public String RAttendingRaffle() {
		System.out.println("RAttendingRaffle 호출");
		return "redirect:../RAttendingRaffle";
	}
}
