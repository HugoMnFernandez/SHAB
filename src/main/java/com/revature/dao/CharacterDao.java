package com.revature.dao;

import com.revature.pojo.Character;

public interface CharacterDao {

	public void makeCharacter(Character c);
	
	public Character getCharacterById(int id);
	
	public void removeCharacter(Character c);
}
