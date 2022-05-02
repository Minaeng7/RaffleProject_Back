package com.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.RListDTO;

@Repository
public class RListDAO {

	@Autowired
	SqlSessionTemplate session;

	public void registinglist(RListDTO dto) {
		session.insert("ListMapper.registringlist", dto);
		
	}
}