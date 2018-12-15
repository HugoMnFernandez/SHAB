package com.revature.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="shabteam")
@Component
public class Team {

	@Id
	@Column(name="teamid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teamId;
	
	@ManyToMany
	@JoinTable(name="team_characters", joinColumns = @JoinColumn(name="teamid"),
				inverseJoinColumns = @JoinColumn(name="characterid"))
	private List<Character> characters;

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", characters=" + characters + "]";
	}

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, List<Character> characters) {
		super();
		this.teamId = teamId;
		this.characters = characters;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public List<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}
	
}
