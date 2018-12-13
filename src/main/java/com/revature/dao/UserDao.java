package com.revature.dao;

import com.revature.pojo.User;

public interface UserDao {

	public Integer makeUser(User u);
	
	public User getUserById(int id);
	
	public void removeUser(User u);
}
