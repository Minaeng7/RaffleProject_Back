package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.RListDTO;

@Repository
public class RListDAO {

	@Autowired
	SqlSessionTemplate session;

	public void registinglist(RListDTO dto) {
		session.insert("ListMapper.Rregistringlist", dto);
		
	}

	public List<RListDTO> shuffle(int resell_rno) {
		List<RListDTO> list = session.selectList("ListMapper.RShuffle",resell_rno);
		return list;
	}
}
