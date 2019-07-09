package com.imut.bean;

public class Users {
	private String userName;
	private String passeord;
	public Users() {
		super();
	}
	public Users(String userName, String passeord) {
		super();
		this.userName = userName;
		this.passeord = passeord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPasseord() {
		return passeord;
	}
	public void setPasseord(String passeord) {
		this.passeord = passeord;
	}
	
}
