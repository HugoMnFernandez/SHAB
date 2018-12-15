package com.revature.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.pojo.Team;
import com.revature.util.SessionUtil;

@Component
public class TeamDaoPostgres implements TeamDao{

	Session sess = SessionUtil.getSession();
	
	public Integer makeTeam(Team t) {
		Transaction trans = sess.beginTransaction();
		Integer newId = (Integer) sess.save(t) ;
		trans.commit();
		 
		 return newId;
	}

	public Team getTeamById(int id) {
		return sess.get(Team.class, id);
	}

	public void removeTeam(Team t) {
		Transaction trans = sess.beginTransaction();
		sess.delete(t);
		trans.commit();
	}

}
