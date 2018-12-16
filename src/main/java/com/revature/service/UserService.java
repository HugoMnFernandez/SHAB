package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.UserDao;
import com.revature.pojo.User;

@Service
public class UserService {

	@Autowired
	UserDao uDao;
	
	public Integer createUser(User u) {
		return uDao.makeUser(u);
	}
	
	public User getUserById(int id) {
		return uDao.getUserById(id);
	}
	
	public User getUserByUsername(String username) {
		return uDao.getUserByUsername(username);
	}
	
	public void deleteUser(User u) {
		uDao.removeUser(u);
	}

	public List<User> getAllUsers() {
		return uDao.getAllUsers();
	}
	
}
