package com.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.SListDTO;

@Repository
public class SListDAO {

	@Autowired
	SqlSessionTemplate session;

	public void registinglist(SListDTO dto) {
		session.insert("ListMapper.Sregistringlist", dto);
		
	}
}
