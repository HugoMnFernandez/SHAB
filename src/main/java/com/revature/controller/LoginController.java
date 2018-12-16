package com.revature.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.revature.pojo.User;
import com.revature.service.AuthService;

@Controller
@RequestMapping(value="/login")
public class LoginController {

	@Autowired
	private AuthService aServ;
	
	@GetMapping
	public String loginGet(HttpSession sess) {
		sess.invalidate();
		return "login";
	}
	
	@PostMapping
	public String loginPost(@Valid User user, BindingResult bindingResult, HttpSession sess) {
		User authUser = aServ.validateUser(user.getUsername(), user.getPassword());
		
		if(bindingResult.hasErrors()) {
			return "login";
		}
		
		if(authUser != null) {
			sess.setAttribute("user", authUser);
			
			return "home";
		}
		
		return "login";
	}
}
