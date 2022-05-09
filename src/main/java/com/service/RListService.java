package com.service;

import java.util.List;

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

	public List<RListDTO> shuffle(int resell_rno) {
		List<RListDTO> list = dao.shuffle(resell_rno);
		return list;
	}

	public void UpdateMyAttendingR(RListDTO rdto) {
		dao.UpdateMyAttendingR(rdto);
		
	}

	public void DeleteMyAttendingR(int memberno) {
		dao.DeleteMyAttendingR(memberno);
		
	}

}
