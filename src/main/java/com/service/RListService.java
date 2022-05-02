package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RListDAO;
import com.dto.RListDTO;

@Service
public class RListService {

	@Autowired
	RListDAO dao;

	public void registinglist(RListDTO dto) {
		dao.registinglist(dto);
		
	}
}
