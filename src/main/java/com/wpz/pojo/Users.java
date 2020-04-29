package com.wpz.pojo;

public class Users {
	
	private String fullname;
	
	private String password;
	
	private String username;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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

	@Override
	public String toString() {
		return "Users [fullname=" + fullname + ", password=" + password + ", username=" + username + "]";
	}
	

}
