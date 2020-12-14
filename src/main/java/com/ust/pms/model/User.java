package com.ust.pms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int userid;
	private String username;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserid() {
		return userid;
	}

	public User(int userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}



	public void setUserid(int userid) {
		this.userid = userid;
	}





	public String getPassword() {
		return password;
	}











	public void setPassword(String password) {
		this.password = password;
	}











	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	
	
}
