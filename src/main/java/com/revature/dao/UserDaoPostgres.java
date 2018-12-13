package com.revature.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.pojo.User;
import com.revature.util.SessionUtil;

public class UserDaoPostgres implements UserDao {

	Session sess = SessionUtil.getSession();
	
	public Integer makeUser(User u) {
		return (Integer) sess.save(u);
	}

	public User getUserById(int id) {
		return sess.get(User.class, id);
	}

	public void removeUser(User u) {
		Transaction trans = sess.beginTransaction();
		sess.delete(u);
		trans.commit();
	}

}
