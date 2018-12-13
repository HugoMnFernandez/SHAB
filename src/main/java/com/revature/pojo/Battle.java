package com.revature.pojo;

import java.util.Date;
import java.util.List;

public class Battle {
	private int battleId;
	private String location;
	private Date startDate;
	private Date endDate;
	private int Result;
	private int team1Votes;
	private int team2Votes;
	private List<Character> team1;
	private List<Character> team2;

	public Battle() {
		super();
	}

	public Battle(int battleId, String location, Date startDate, Date endDate, int result, int team1Votes,
			int team2Votes, List<Character> team1, List<Character> team2) {
		super();
		this.battleId = battleId;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		Result = result;
		this.team1Votes = team1Votes;
		this.team2Votes = team2Votes;
		this.team1 = team1;
		this.team2 = team2;
	}

	public int getBattleId() {
		return battleId;
	}

	public void setBattleId(int battleId) {
		this.battleId = battleId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getResult() {
		return Result;
	}

	public void setResult(int result) {
		Result = result;
	}

	public int getTeam1Votes() {
		return team1Votes;
	}

	public void setTeam1Votes(int team1Votes) {
		this.team1Votes = team1Votes;
	}

	public int getTeam2Votes() {
		return team2Votes;
	}

	public void setTeam2Votes(int team2Votes) {
		this.team2Votes = team2Votes;
	}

	public List<Character> getTeam1() {
		return team1;
	}

	public void setTeam1(List<Character> team1) {
		this.team1 = team1;
	}

	public List<Character> getTeam2() {
		return team2;
	}

	public void setTeam2(List<Character> team2) {
		this.team2 = team2;
	}

}
