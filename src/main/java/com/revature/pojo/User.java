package com.revature.pojo;

import java.util.Set;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import com.revature.pojo.Character;

@Entity
@Table(name="shabuser")
@Component
public class User {
	
	@Id
	@Column(name="userid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="isadmin")
	private Boolean isAdmin;

	@ManyToMany
	@JoinTable(name="shabuser_characters", joinColumns=@JoinColumn(name="userid"),
			inverseJoinColumns=@JoinColumn(name="characterid"))
	private Set<Character> followedCharacters; //The set of characters a user is following
	
	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", isAdmin=" + isAdmin
				+ ", followedCharacters=" + followedCharacters + "]";
	}

	public User(int userId, String username, String password, Boolean isAdmin) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

}
