package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.User;
import com.revature.service.UserService;

@RestController("/user")
@CrossOrigin(origins="*")
public class UserController {

	@Autowired
	UserService uServ;
	
	@GetMapping
	public List<User> getAllUsers(){
		return uServ.getAllUsers();
	}
	
	@PostMapping(consumes = "application/json")
	public void makeUser(@RequestBody User user) {
		System.out.println(user);
		uServ.createUser(user);
	}
	
	@GetMapping("/user/{username}")
	public User getUserByUsername(@PathVariable String username) {
		return uServ.getUserByUsername(username);
	}
}
