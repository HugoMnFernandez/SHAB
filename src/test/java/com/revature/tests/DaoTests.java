package com.revature.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.revature.dao.CharacterDao;
import com.revature.dao.CharacterDaoPostgres;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoPostgres;
import com.revature.pojo.Character;
import com.revature.pojo.User;

public class DaoTests {

	@Test
	public void testUserDao() {
		UserDao uDao = new UserDaoPostgres();
		Integer newId = (Integer) uDao.makeUser(new User(1,"test","test", false));
		User u = uDao.getUserById(newId);
		assertTrue("test".equals(u.getUsername()));
		uDao.removeUser(u);
		u = uDao.getUserById(newId);
		assertTrue(u == null);
	}
	
	@Test
	public void testCharacterDao() {
		CharacterDao cDao = new CharacterDaoPostgres();
		cDao.makeCharacter(new Character(12, 4, 2, 7, 20.7));
		Character c = cDao.getCharacterById(12);
		assertTrue(c.getRank() == 4);
		cDao.removeCharacter(c);
		c = cDao.getCharacterById(12);
		assertTrue(c == null);
	}
	
//	@Test
//	public void testBattleDao() {
//		UserDao uDao = new UserDaoPostgres();
//		Integer newId = (Integer) uDao.makeUser(new User(1,"test","test", false));
//		User u = uDao.getUserById(newId);
//		assertTrue("test".equals(u.getUsername()));
//		uDao.removeUser(u);
//		u = uDao.getUserById(newId);
//		assertTrue(u == null);
//	}
//	
//	@Test
//	public void testCommentsDao() {
//		UserDao uDao = new UserDaoPostgres();
//		Integer newId = (Integer) uDao.makeUser(new User(1,"test","test", false));
//		User u = uDao.getUserById(newId);
//		assertTrue("test".equals(u.getUsername()));
//		uDao.removeUser(u);
//		u = uDao.getUserById(newId);
//		assertTrue(u == null);
//	}
	
}
