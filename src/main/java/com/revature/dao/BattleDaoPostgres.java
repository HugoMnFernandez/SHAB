package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.revature.pojo.Battle;
import com.revature.util.SessionUtil;

@Component
public class BattleDaoPostgres implements BattleDao {

	Session sess = SessionUtil.getSession();
	
	public Integer makeBattle(Battle b) {
		sess = SessionUtil.getSession();
		Transaction trans = sess.beginTransaction();
		Integer newId = (Integer) sess.save(b) ;
		trans.commit();
		sess.close();
		sess = SessionUtil.getSession();
		return newId;
	}

	public Battle getBattleById(int id) {
		return sess.get(Battle.class, id);
	}

	public void removeBattle(Battle b) {
		sess = SessionUtil.getSession();
		Transaction trans = sess.beginTransaction();
		sess.delete(b);
		trans.commit();
		sess.close();
		sess = SessionUtil.getSession();
	}

	public List<Battle> getAllBattles(){
		sess = SessionUtil.getSession();
		Query<Battle> query = sess.createQuery("from Battle");
		return query.getResultList();
		
	}

	public void updateBattle(Battle b) {
		sess = SessionUtil.getSession();
		Transaction trans = sess.beginTransaction();
		sess.update(b);
		trans.commit();
		sess.close();
		sess = SessionUtil.getSession();
	}
	
	
	


}
