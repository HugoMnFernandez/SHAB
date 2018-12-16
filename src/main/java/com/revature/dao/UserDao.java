package com.revature.dao;

import java.util.List;

import com.revature.pojo.User;

public interface UserDao {

	public Integer makeUser(User u);
	
	public User getUserById(int id);
	
	public void removeUser(User u);

	public User getUserByUsername(String username);

	public List<User> getAllUsers();
}
