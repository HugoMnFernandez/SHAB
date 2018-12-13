package com.revature.pojo;

public class Character {
	private int characterId;
	private int rank;
	private int win;
	private int losses;
	private double score;

	public Character() {
		super();
	}

	public Character(int characterId, int rank, int win, int losses, double score) {
		super();
		this.characterId = characterId;
		this.rank = rank;
		this.win = win;
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

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
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
