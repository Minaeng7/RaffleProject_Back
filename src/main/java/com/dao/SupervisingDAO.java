package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.ResellRDTO;
import com.dto.SellRDTO;

@Repository
public class SupervisingDAO {

	@Autowired
	SqlSessionTemplate session;

	public List<ResellRDTO> selectMyAttendedRaffleR(int memberno) {
		List<ResellRDTO> list = new ArrayList<>();
		list= session.selectList("RaffleMapper.selectMyAttendedRaffleR", memberno);
		return list;
	}

	public List<ResellRDTO> selectMyRaffleR(int memberno) {
		List <ResellRDTO> list = new ArrayList<>();
		list = session.selectList("RaffleMapper.selectMyRaffleR", memberno);
		return list;
	}
	public List<SellRDTO> selectMyAttendedRaffleS(int memberno) {
		List<SellRDTO> list = new ArrayList<>();
		list= session.selectList("RaffleMapper.selectMyAttendedRaffleS", memberno);
		return list;
	}

	public List<SellRDTO> selectMyRaffleS(int memberno) {
		List <SellRDTO> list = new ArrayList<>();
		list = session.selectList("RaffleMapper.selectMyRaffleS", memberno);
		return list;
	}
	
}
