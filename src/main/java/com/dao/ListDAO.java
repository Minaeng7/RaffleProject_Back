package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.ResellRDTO;
import com.dto.SListDTO;
import com.dto.SellRDTO;

@Repository
public class ListDAO {
	@Autowired
	SqlSessionTemplate template;

	public void addResell_r(ResellRDTO rdto) {
		template.insert("RaffleMapper.addResell_r", rdto);
	}

	public void addSell_r(SellRDTO sdto) {
		template.insert("RaffleMapper.addSell_r", sdto);
	}

	public List<SellRDTO> SellRList(SellRDTO sdto) {
		return template.selectList("RaffleMapper.SellRList", sdto);
	}

	public void UpdateResell_R(ResellRDTO rdto) {
		template.update("RaffleMapper.UpdateResell_r",rdto);
		
	}

	public void UpdateSell_R(SellRDTO rdto) {
		template.update("RaffleMapper.UpdateSell_r",rdto);
		
	}
	
}
