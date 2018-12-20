package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.Battle;
import com.revature.service.BattleService;

@RestController("/battle")
@CrossOrigin(origins="*")
public class BattleController {

	@Autowired
	BattleService bServ;
	

	
	@PostMapping(consumes = "application/json")
	public void makeBattle(@RequestBody Battle battle) {
		bServ.createBattle(battle);
	}
	
	@GetMapping("/battle/{battleId}")
	public Battle getBattleById(@PathVariable int battleId) {
		return bServ.getBattleById(battleId);
	}
	
	
	@GetMapping
	public List<Battle> getAllActiveBattles(){
		return bServ.getAllActiveBattles();
	}
	
}
