package com.revature.pojo;

public class Comment {

	private int commentId;
	private User user;
	private Battle battle;
	private int team;
	private int votes;

	public Comment(int commentId, User user, Battle battle, int team, int votes) {
		super();
		this.commentId = commentId;
		this.user = user;
		this.battle = battle;
		this.team = team;
		this.votes = votes;
	}

	public Comment() {
		super();
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Battle getBattle() {
		return battle;
	}

	public void setBattle(Battle battle) {
		this.battle = battle;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

}
