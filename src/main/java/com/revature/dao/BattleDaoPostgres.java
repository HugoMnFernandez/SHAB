package com.revature.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.revature.pojo.Battle;
import com.revature.pojo.User;
import com.revature.util.SessionUtil;

@Component
public class BattleDaoPostgres implements BattleDao {

	Session sess = SessionUtil.getSession();
	
	public Integer makeBattle(Battle b) {
		Transaction trans = sess.beginTransaction();
		Integer newId = (Integer) sess.save(b) ;
		trans.commit();
		
		return newId;
	}

	public Battle getBattleById(int id) {
		return sess.get(Battle.class, id);
	}

	public void removeBattle(Battle b) {
		Transaction trans = sess.beginTransaction();
		sess.delete(b);
		trans.commit();
	}

	public List<Battle> getAllBattles(){
		Query<Battle> query = sess.createQuery("from Battle");
		return query.getResultList();
	}
	
	
	


}
