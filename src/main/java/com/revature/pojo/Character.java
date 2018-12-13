package com.revature.pojo;

import javax.persistence.*;

@Entity
@Table(name="shabcharacter")
public class Character {
	
	@Id
	@Column(name="characterid")
	private int characterId;
	
	@Column(name="rank")
	private int rank;
	
	@Column(name="wins")
	private int wins;
	
	@Column(name="losses")
	private int losses;
	
	@Column(name="score")
	private double score;

	public Character() {
		super();
	}

	public Character(int characterId, int rank, int wins, int losses, double score) {
		super();
		this.characterId = characterId;
		this.rank = rank;
		this.wins = wins;
		this.losses = losses;
		this.score = score;
	}

	public int getCharacterId() {
		return characterId;
	}

	public void setCharacterId(int characterId) {
		this.characterId = characterId;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

}
