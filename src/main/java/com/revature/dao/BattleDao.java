package com.revature.dao;

import java.util.List;

import com.revature.pojo.Battle;

public interface BattleDao {

	public Integer makeBattle(Battle b);
	
	public Battle getBattleById(int id);
	
	public void removeBattle(Battle b);
	
	public List<Battle> getAllBattles();
	
	public void updateBattle(Battle b);
}
