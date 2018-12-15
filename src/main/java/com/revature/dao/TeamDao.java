package com.revature.dao;

import com.revature.pojo.Team;

public interface TeamDao {

	public Integer makeTeam(Team t);
	
	public Team getTeamById(int id);
	
	public void removeTeam(Team t);
}
