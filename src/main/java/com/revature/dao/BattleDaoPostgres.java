package com.revature.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.pojo.Battle;
import com.revature.util.SessionUtil;

@Component
public class BattleDaoPostgres implements BattleDao {

	Session sess = SessionUtil.getSession();
	
	public Integer makeBattle(Battle b) {
		return (Integer) sess.save(b);
	}

	public Battle getBattleById(int id) {
		return sess.get(Battle.class, id);
	}

	public void removeBattle(Battle b) {
		Transaction trans = sess.beginTransaction();
		sess.delete(b);
		trans.commit();
	}

}
