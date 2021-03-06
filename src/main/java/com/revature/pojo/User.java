package com.revature.pojo;

import javax.persistence.*;

@Entity
@Table(name="shabuser")
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

	public User() {
		super();
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
