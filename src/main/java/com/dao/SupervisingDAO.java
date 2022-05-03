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

	public List<ResellRDTO> selectMyAttendedRaffleR(String memberno) {
		List<ResellRDTO> list = new ArrayList<>();
		list= session.selectList("MemberMapper.selectMyAttendedRaffleR", memberno);
		return list;
	}

	public List<ResellRDTO> selectMyRaffleR(String memberno) {
		List <ResellRDTO> list = new ArrayList<>();
		list = session.selectList("RaffleMapper.selectMyRaffleR", memberno);
		return list;
	}
	public List<SellRDTO> selectMyAttendedRaffleS(String memberno) {
		List<SellRDTO> list = new ArrayList<>();
		list= session.selectList("MemberMapper.selectMyAttendedRaffleS", memberno);
		return list;
	}

	public List<SellRDTO> selectMyRaffleS(String memberno) {
		List <SellRDTO> list = new ArrayList<>();
		list = session.selectList("RaffleMapper.selectMyRaffleS", memberno);
		return list;
	}
	
}
