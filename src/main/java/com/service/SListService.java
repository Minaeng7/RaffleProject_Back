package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SListDAO;
import com.dto.RListDTO;
import com.dto.SListDTO;

@Service
public class SListService {

	@Autowired
	SListDAO dao;

	public void registinglist(SListDTO dto) {
		dao.registinglist(dto);
		
	}

	public List<SListDTO> shuffle(String raffleno) {
		List<SListDTO> list = dao.shuffle(raffleno);
		return list;
	}
}
