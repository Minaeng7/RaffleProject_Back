package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ListDAO;
import com.dto.ResellRDTO;
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

	public List<SellRDTO> SellRList(SellRDTO sdto) {
		return dao.SellRList(sdto);
	}


	public void UpdateResell_r(ResellRDTO rdto) {
		dao.UpdateResell_R(rdto);
		
	}

	public void UpdateSell_r(SellRDTO rdto) {
		dao.UpdateSell_R(rdto);
		
	}
	public List<ResellRDTO> ResellRList(ResellRDTO rdto) {
		return dao.ResellRList(rdto);

	}

}
