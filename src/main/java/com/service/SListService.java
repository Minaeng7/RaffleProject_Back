package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SListDAO;
import com.dto.SListDTO;

@Service
public class SListService {

	@Autowired
	SListDAO dao;

	public void registinglist(SListDTO dto) {
		dao.registinglist(dto);
		
	}
}
