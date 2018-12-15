package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoPostgres;
import com.revature.pojo.User;

@Service
public class UserService {

	@Autowired
	UserDao uDao = new UserDaoPostgres();
	
	public Integer createUser(User u) {
		return uDao.makeUser(u);
	}
	
	public User getUserById(int id) {
		return uDao.getUserById(id);
	}
	
	public void deleteUser(User u) {
		uDao.removeUser(u);
	}
	
}
