package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.UserDao;
import com.revature.pojo.User;

@Service
public class AuthService {

	@Autowired
	UserDao uDao;
	
	public User validateUser(String username, String password) {
		
		User u = uDao.getUserByUsername(username);
		
		if(u != null && password.equals(u.getPassword())){
			return u;
		}
		
		return null;
	}
}
