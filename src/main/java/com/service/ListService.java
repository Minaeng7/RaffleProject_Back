package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ListDAO;
import com.dto.ResellRDTO;
import com.dto.Resell_rDTO;
import com.dto.SellRDTO;

@Service
public class ListService {
	@Autowired
	ListDAO dao;
	
	public void addResell_r(ResellRDTO rdto) {
		dao.addResell_r(rdto);
	}

	public void addSell_r(SellRDTO sdto) {
		dao.addSell_r(sdto);
	}

}
