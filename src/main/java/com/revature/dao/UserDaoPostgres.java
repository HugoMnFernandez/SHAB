package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.revature.pojo.User;
import com.revature.util.SessionUtil;

@Component
public class UserDaoPostgres implements UserDao {

	Session sess = SessionUtil.getSession();
	
	public Integer makeUser(User u) {
		Transaction trans = sess.beginTransaction();
		Integer newId = (Integer) sess.save(u) ;
		trans.commit();
		 
		 return newId;
	}

	public User getUserById(int id) {
		return sess.get(User.class, id);
	}

	public void removeUser(User u) {
		Transaction trans = sess.beginTransaction();
		sess.delete(u);
		trans.commit();
	}

	public User getUserByUsername(String username) {
		try {
			Query<User> query = sess.createQuery("from User AS u WHERE u.username = :username");
			query.setParameter("username", username);
			User user = query.getSingleResult();
			return user;
		} catch(Exception e) {
			// return null if no user is found and an exception is thrown
			return null;
		}
	}

	public List<User> getAllUsers() {
		Query<User> query = sess.createQuery("from User");
		return query.getResultList();
	}

}
