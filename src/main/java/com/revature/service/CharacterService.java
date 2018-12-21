package com.revature.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.CharacterDao;
import com.revature.pojo.Character;

@Service
public class CharacterService {

	@Autowired
	CharacterDao cDao;
	
	public void createCharacter(Character c) {
		if(cDao.getCharacterById(c.getCharacterId()) == null) {
			cDao.makeCharacter(c);
		}
	}
	
	public Character getCharacterById(int id) {
		return cDao.getCharacterById(id);
	}
	
	public void deleteCharacter(Character c) {
		cDao.removeCharacter(c);
	}
	
	public List<Character> getLadder(){
		List<Character> ladder;
		ladder = cDao.getAllCharacter();
		Collections.sort(ladder);
		System.out.println("************In ladder, returning " + ladder.size()+" character in ladder");
		return ladder;
	}
	
	
}
