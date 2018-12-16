package com.revature.driver;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.dao.BattleDao;
import com.revature.dao.CharacterDao;
import com.revature.dao.CommentDao;
import com.revature.dao.TeamDao;
import com.revature.dao.UserDao;
import com.revature.pojo.Battle;
import com.revature.pojo.Character;
import com.revature.pojo.Comment;
import com.revature.pojo.Team;

public class Main {

	//Main method for testing
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("/Shab/src/main/webapp/WEB-INF/beans.xml");
		
		//Create Daos for testing
		TeamDao tDao = (TeamDao) ac.getBean("teamDaoPostgres");
		CharacterDao charDao = (CharacterDao) ac.getBean("characterDaoPostgres");
		CommentDao cDao = (CommentDao) ac.getBean("commentDaoPostgres");
		UserDao uDao = (UserDao) ac.getBean("userDaoPostgres");
		BattleDao bDao = (BattleDao) ac.getBean("battleDaoPostgres");
		
//		//Create a new team from characters in the database
//		List<Character> charList = new ArrayList<Character>();
//		charList.add(charDao.getCharacterById(10));
//		charList.add(charDao.getCharacterById(12));
//		int newId = (Integer) tDao.makeTeam(new Team(1, charList));
//		
//		Team t = tDao.getTeamById(newId);
//		System.out.println(t);
//		
//		//Make a new battle from teams
//		Integer battleId = bDao.makeBattle(new Battle(1,"Space",Date.valueOf("2018-12-17"), Date.valueOf("2018-12-27"), 0, 0, 0, tDao.getTeamById(6), tDao.getTeamById(5)));
//			
//		//Add comments to the battle
//		cDao.makeComment(new Comment(1, uDao.getUserById(1), bDao.getBattleById(battleId), tDao.getTeamById(6), 30));
//		cDao.makeComment(new Comment(1, uDao.getUserById(2), bDao.getBattleById(battleId), tDao.getTeamById(5), 21));
//		
//		//Print out comments for the battle
//		List<Comment> comments = cDao.getCommentsByBattle(bDao.getBattleById(battleId));
//		
//		System.out.println("The comments for battle " + battleId + " are " +  comments);

	}

}
