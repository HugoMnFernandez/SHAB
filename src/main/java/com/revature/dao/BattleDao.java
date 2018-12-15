package com.revature.dao;

import com.revature.pojo.Battle;

public interface BattleDao {

	public Integer makeBattle(Battle b);
	
	public Battle getBattleById(int id);
	
	public void removeBattle(Battle b);
}
