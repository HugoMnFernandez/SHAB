package com.revature.dao;

import java.util.List;

import com.revature.pojo.Character;

public interface CharacterDao {

	public void makeCharacter(Character c);
	
	public Character getCharacterById(int id);
	
	public void removeCharacter(Character c);
	
	public List<Character> getAllCharacter();
}
