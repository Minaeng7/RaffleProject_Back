package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.MemberDTO;
import com.dto.RListDTO;
import com.dto.SListDTO;
import com.service.RListService;
import com.service.SListService;

@Controller
public class AttendController {
	@Autowired
	RListService Rservice;
	@Autowired
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
	
	@RequestMapping("UpdateMyAttendingRR")
	public String UpdateMyAttendingRR(RListDTO rdto, HttpSession session) {
		Rservice.UpdateMyAttendingR(rdto);
		return "redirect:Mypage";
	}
	@RequestMapping("UpdateMyAttendingSS")
	public String UpdateMyAttendingSS(SListDTO rdto, HttpSession session) {
		Sservice.UpdateMyAttendingS(rdto);
		return "redirect:Mypage";
	}

	@RequestMapping("/loginCheck/DeleteMyAttendingR")
	public String DeleteMyAttendingR(HttpSession session) {
		return "MyRaffle/DeleteAttendingR";
	}
	@RequestMapping("/loginCheck/DeleteMyAttendingS")
	public String DeleteMyAttendingS(HttpSession session) {
		return "MyRaffle/DeleteAttendingS";
	}
	@RequestMapping("DeleteMyAttendingRR")// Raffleno도 같이 넘겨주도록 향후 수정
	public String DeleteMyAttendingRR(HttpSession session) {
			MemberDTO dto = (MemberDTO)session.getAttribute("login");
			int memberno = dto.getMemberno();
			Rservice.DeleteMyAttendingR(memberno);
			return "redirect:Mypage";
	}
	@RequestMapping("DeleteMyAttendingSS")// Raffleno도 같이 넘겨주도록 향후 수정
	public String DeleteMyAttendingSS(HttpSession session) {
			MemberDTO dto = (MemberDTO)session.getAttribute("login");
			int memberno = dto.getMemberno();
			Sservice.DeleteMyAttendingS(memberno);
			return "redirect:Mypage";
	}
	@RequestMapping("/loginCheck/RAttendingRaffle")
	public String RAttendingRaffle() {
		System.out.println("RAttendingRaffle 호출");
		return "redirect:../RAttendingRaffle";
	}
}
