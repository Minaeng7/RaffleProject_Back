package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.RListDTO;
import com.dto.SListDTO;

@Repository
public class SListDAO {

	@Autowired
	SqlSessionTemplate session;

	public void registinglist(SListDTO dto) {
		session.insert("ListMapper.Sregistringlist", dto);
		
	}

	public List<SListDTO> shuffle(String raffleno) {
		List<SListDTO> list = session.selectList("ListMapper.SShuffle",raffleno);
		return list;
	}
}
