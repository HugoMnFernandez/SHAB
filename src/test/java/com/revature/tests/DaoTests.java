package com.revature.tests;

import static org.junit.Assert.assertTrue;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.dao.BattleDao;
import com.revature.dao.CharacterDao;
import com.revature.dao.CommentDao;
import com.revature.dao.TeamDao;
import com.revature.dao.UserDao;
import com.revature.pojo.Battle;
import com.revature.pojo.Character;
import com.revature.pojo.Team;
import com.revature.pojo.User;

//@RunWith(SpringJUnit4ClassRunner.class)
public class DaoTests {
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");	
	
	@Test
	public void testUserService() {
		
		UserDao uDao = (UserDao) ac.getBean("userDaoPostgres");
		Integer newId = (Integer) uDao.makeUser(new User(1,"test","test", false));
		User u = uDao.getUserById(newId);
		assertTrue("test".equals(u.getUsername()));
		uDao.removeUser(u);
		u = uDao.getUserById(newId);
		assertTrue(u == null);
	}
	
	@Test
	public void testCharacterService() {
		CharacterDao charDao = (CharacterDao) ac.getBean("characterDaoPostgres");
		charDao.makeCharacter(new Character(50, 4, 2, 7, 20.7));
		Character c = charDao.getCharacterById(50);
		assertTrue(c.getRank() == 4);
		charDao.removeCharacter(c);
		c = charDao.getCharacterById(50);
		assertTrue(c == null);
	}
	
	@Test
	public void testTeamDao() {
		TeamDao tDao = (TeamDao) ac.getBean("teamDaoPostgres");
		CharacterDao charDao = (CharacterDao) ac.getBean("characterDaoPostgres");
		List<Character> charList = new ArrayList<Character>();
		charList.add(charDao.getCharacterById(10));
		charList.add(charDao.getCharacterById(12));
		int newId = tDao.makeTeam(new Team(1, charList));
		Team t = tDao.getTeamById(newId);
		System.out.println(t);
		assertTrue(t.getCharacters().size() == 2);
	}
	
	@Test
	public void testBattleDao() {
		BattleDao bDao = (BattleDao) ac.getBean("battleDaoPostgres");
		Team team1 = new Team();
		Team team2 = new Team();
		Integer newId = bDao.makeBattle(new Battle(1,"Asgard",Date.valueOf("2018-12-14"), Date.valueOf("2018-12-17"), 0, 0, 0, team1, team2));
		Battle b = bDao.getBattleById(newId);
		System.out.println(b);
		assertTrue("Asgard".equals(b.getLocation()));
	}
	
	@Test
	public void testCommentsDao() {
		CommentDao cDao = (CommentDao) ac.getBean("commentDaoPostgres");
		
		
	}
	
}
