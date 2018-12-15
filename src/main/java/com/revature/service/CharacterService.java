package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.CharacterDao;
import com.revature.dao.CharacterDaoPostgres;
import com.revature.pojo.Character;

@Service
public class CharacterService {

	@Autowired
	CharacterDao cDao;
	
	public void createCharacter(Character c) {
		cDao.makeCharacter(c);
	}
	
	public Character getCharacterById(int id) {
		return cDao.getCharacterById(id);
	}
	
	public void deleteCharacter(Character c) {
		cDao.removeCharacter(c);
	}
	
	
}
