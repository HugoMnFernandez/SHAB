package com.revature.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.BattleDao;
import com.revature.pojo.Battle;
import com.revature.pojo.Comment;

@Service
public class BattleService {

	@Autowired
	BattleDao bDao;
	
	@Autowired 
	TeamService tServ;
	
	@Autowired
	CommentService cServ;
	
	public Integer createBattle(Battle b) {
		
		//Create the teams first
		tServ.createTeam(b.getTeam1());
		tServ.createTeam(b.getTeam2());
		
		return bDao.makeBattle(b);
	}
	
	public Battle getBattleById(int id) {
		return bDao.getBattleById(id);
	}
	
	public void deleteBattle(Battle b) {
		bDao.removeBattle(b);
	}
	
	public List<Battle> getAllActiveBattles() {
		List<Battle> activeBattles = new ArrayList<Battle>();
		Date today = new Date();
		for(Battle b: bDao.getAllBattles()) {
			if(b.getEndDate().after(today)) {
				activeBattles.add(b);
			}
		}
		
		return activeBattles;
		
	}
	
	public void updateBattle(Battle b) {
		Comment newComment = b.getComments().get(b.getComments().size() - 1);
		newComment.setBattle(b);
		cServ.createComment(newComment);
		bDao.updateBattle(b);
	}
	
}
