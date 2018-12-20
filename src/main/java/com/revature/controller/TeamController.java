package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.Team;
import com.revature.service.TeamService;

@RestController
@RequestMapping("/team")
@CrossOrigin(origins="*")
public class TeamController {
	
	@Autowired
	TeamService tServ;
	
	@PostMapping(consumes = "application/json")
	public void makeUser(@RequestBody Team team) {
		tServ.createTeam(team);
	}
	
	@GetMapping("/{id}")
	public Team getUserById(@PathVariable int id) {
		return tServ.getTeamById(id);
	}

}
