package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.revature.pojo.Character;
import com.revature.util.SessionUtil;

@Component
public class CharacterDaoPostgres implements CharacterDao {

	Session sess = SessionUtil.getSession();
	
	public void makeCharacter(Character c) {
		Transaction trans = sess.beginTransaction();
		sess.save(c);
		trans.commit();
	}

	public Character getCharacterById(int id) {
		System.out.println(sess);
		return sess.get(Character.class, id);
	}

	public void removeCharacter(Character c) {
		Transaction trans = sess.beginTransaction();
		sess.delete(c);
		trans.commit();
		
	}

	public List<Character> getAllCharacter() {
		Query<Character> query = sess.createQuery("from Character where score>0");
		return query.getResultList();
	}

}
