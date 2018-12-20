package com.revature.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="shabbattle")
@Component
public class Battle {
	
	@Id
	@Column(name="battleid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int battleId;
	
	@Column(name="location")
	private String location;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="result")
	private int result;
	
	@Column(name="team1votes")
	private int team1Votes;
	
	@Column(name="team2votes")
	private int team2Votes;
	
	@ManyToOne
	@JoinColumn(name="team1id")
	private Team team1;
	
	@ManyToOne
	@JoinColumn(name="team2id")
	private Team team2;
	
	@OneToMany(mappedBy="battle")
	private List<Comment> comments;

	@Override
	public String toString() {
		return "Battle [battleId=" + battleId + ", location=" + location + ", startDate=" + startDate + ", endDate="
				+ endDate + ", Result=" + result + ", team1Votes=" + team1Votes + ", team2Votes=" + team2Votes
				+ ", team1=" + team1 + ", team2=" + team2 + "]";
	}

	public Battle() {
		super();
	}

	public Battle(int battleId, String location, Date startDate, Date endDate, int result, int team1Votes,
			int team2Votes, Team team1, Team team2) {
		super();
		this.battleId = battleId;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.result = result;
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
		return result;
	}

	public void setResult(int result) {
		this.result = result;
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

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

}
