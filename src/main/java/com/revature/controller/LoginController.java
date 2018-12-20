package com.revature.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.pojo.User;
import com.revature.service.AuthService;

@Controller
@RequestMapping(value="/login")
@CrossOrigin(origins="*")
public class LoginController {

	@Autowired
	private AuthService aServ;
	
	@GetMapping
	public String loginGet(HttpSession sess) {
		sess.invalidate();
		return "login";
	}
	
	@PostMapping
	@ResponseBody
	public User loginPost(@RequestBody User user, BindingResult bindingResult, HttpSession sess) {
		System.out.println(user);
		User authUser = aServ.validateUser(user.getUsername(), user.getPassword());
		
		System.out.println("Logging in");
		
		if(authUser != null) {
			sess.setAttribute("user", authUser);
			
		}
		
		return authUser;
	}
}
