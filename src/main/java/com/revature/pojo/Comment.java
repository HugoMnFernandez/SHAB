package com.revature.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Table(name="shabcomment")
@Component
public class Comment {

	@Id
	@Column(name="commentid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int commentId;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="battleid")
	private Battle battle;
	
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", user=" + user + ", battle=" + battle + ", team=" + team
				+ ", votes=" + votes + "]";
	}

	@ManyToOne
	@JoinColumn(name="teamid")
	private Team team;
	
	@Column(name="votes")
	private int votes;

	public Comment(int commentId, User user, Battle battle, Team team, int votes) {
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

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

}
