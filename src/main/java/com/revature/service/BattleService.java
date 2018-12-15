package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.BattleDao;
import com.revature.pojo.Battle;

@Service
public class BattleService {

	@Autowired
	BattleDao bDao;
	
	public Integer createBattle(Battle b) {
		return bDao.makeBattle(b);
	}
	
	public Battle getBattleById(int id) {
		return bDao.getBattleById(id);
	}
	
	public void deleteBattle(Battle b) {
		bDao.removeBattle(b);
	}
}
