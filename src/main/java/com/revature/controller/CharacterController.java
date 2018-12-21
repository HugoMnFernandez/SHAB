package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.pojo.Character;
import com.revature.service.CharacterService;

@RestController
@RequestMapping("/character")
@CrossOrigin(origins="*")
public class CharacterController {
	
	@Autowired
	CharacterService cServ;
	
	
	@PostMapping(consumes = "application/json")
	public void makeCharacter(@RequestBody Character character) {
		cServ.createCharacter(character);
	}
	
	@GetMapping("/{id}")
	public Character getCharacterById(@PathVariable int id) {
		return cServ.getCharacterById(id);
	}
	
	@GetMapping("/ladder")
	public List<Character> getLadder(){
		return cServ.getLadder();
	}

}
