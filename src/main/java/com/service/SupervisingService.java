package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SupervisingDAO;
import com.dto.ResellRDTO;
import com.dto.SellRDTO;

@Service
public class SupervisingService {

	@Autowired
	SupervisingDAO dao;

	public List<ResellRDTO> selectMyAttendedRaffleR(String memberno) {
		List<ResellRDTO> list = new ArrayList<>();
		list = dao.selectMyAttendedRaffleR(memberno);
		return list;
	}

	public List<ResellRDTO> selectMyRaffleR(String memberno) {
		List<ResellRDTO> list = new ArrayList<>();
		list = dao.selectMyRaffleR(memberno);
		return list;
	}

	public List<SellRDTO> selectMyAttendedRaffleS(String memberno) {
		List<SellRDTO> list = new ArrayList<>();
		list = dao.selectMyAttendedRaffleS(memberno);
		return list;
	}

	public List<SellRDTO> selectMyRaffleS(String memberno) {
		List<SellRDTO> list = new ArrayList<>();
		list = dao.selectMyRaffleS(memberno);
		return list;
	}
}
