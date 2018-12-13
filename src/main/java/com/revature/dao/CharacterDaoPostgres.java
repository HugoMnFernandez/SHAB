package com.revature.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.pojo.Character;
import com.revature.util.SessionUtil;

public class CharacterDaoPostgres implements CharacterDao {

	Session sess = SessionUtil.getSession();
	
	public void makeCharacter(Character c) {
		Transaction trans = sess.beginTransaction();
		sess.save(c);
		trans.commit();
	}

	public Character getCharacterById(int id) {
		return sess.get(Character.class, id);
	}

	public void removeCharacter(Character c) {
		Transaction trans = sess.beginTransaction();
		sess.delete(c);
		trans.commit();
		
	}

}
