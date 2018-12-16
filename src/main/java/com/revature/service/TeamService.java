package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.TeamDao;
import com.revature.pojo.Team;

@Service
public class TeamService {

	@Autowired
	TeamDao tDao;
	
	public Integer createTeam(Team t) {
		return tDao.makeTeam(t);
	}
	
	public Team getTeamById(int id) {
		return tDao.getTeamById(id);
	}
	
	public void deleteTeam(Team t) {
		tDao.removeTeam(t);
	}
}
