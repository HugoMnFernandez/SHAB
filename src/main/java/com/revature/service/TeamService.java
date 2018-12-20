package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.TeamDao;
import com.revature.pojo.Team;
import com.revature.pojo.Character;

@Service
public class TeamService {

	@Autowired
	TeamDao tDao;
	
	@Autowired
	CharacterService cServ;
	
	public Integer createTeam(Team t) {
		
		// Create all characters in the team if they don't exist
		for(Character c : t.getCharacters()) {
			cServ.createCharacter(c);
		}
		
		return tDao.makeTeam(t);
	}
	
	public Team getTeamById(int id) {
		return tDao.getTeamById(id);
	}
	
	public void deleteTeam(Team t) {
		tDao.removeTeam(t);
	}
	
}
