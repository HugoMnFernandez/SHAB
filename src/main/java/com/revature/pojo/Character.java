package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="shabcharacter")
@Component
public class Character implements Comparable<Character> {
	
	@Id
	@Column(name="characterid")
	private int characterId;
	
	@Column(name="rank")
	private int rank;
	
	@Column(name="wins")
	private int wins;
	
	@Column(name="losses")
	private int losses;
	

	@Override
	public String toString() {
		return "Character [characterId=" + characterId + ", rank=" + rank + ", wins=" + wins + ", losses=" + losses + ", score=" + score + "]";
	}

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


	public int compareTo(Character o) {
		if(this.score>o.score) {
			return -1;
		}else if(this.score == o.score) {
			return 0;
		}else {
			return 1;
		}
	}

}
