package com.Banking.App;
//JAVA BEAN

public class UserAccount 
{
	private int id;
	private String name;
	private String pwd;
	private long mob;

	public UserAccount(int id, String name, String pwd, long mob) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.mob = mob;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

}
