package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SupervisingDAO;
import com.dto.ResellRDTO;

@Service
public class SupervisingService {

	@Autowired
	SupervisingDAO dao;

	public List<ResellRDTO> selectMyAttendedRaffle(String memberno) {
		List<ResellRDTO> list = new ArrayList<>();
		list = dao.selectMyAttendedRaffle(memberno);
		return list;
	}
}
