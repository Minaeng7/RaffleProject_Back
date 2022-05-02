package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.ResellRDTO;

@Repository
public class SupervisingDAO {

	@Autowired
	SqlSessionTemplate session;

	public List<ResellRDTO> selectMyAttendedRaffle(String memberno) {
		List<ResellRDTO> list = new ArrayList<>();
		list= session.selectList("MemberMapper.selectMyAttendedRaffle", memberno);
		return list;
	}

	public List<ResellRDTO> selectMyRaffle(String memberno) {
		List <ResellRDTO> list = new ArrayList<>();
		list = session.selectList("RaffleMapper.selectMyRaffle", memberno);
		return list;
	}
	
}
