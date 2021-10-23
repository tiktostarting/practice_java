package com.lawencon.constant;

public enum User {
	PELANGGAN("pelanggan", "123456"), PEDAGANG("pedagang", "123456");
	
	private String userName;
	private String password;
	
	User(String userName, String password){
		this.userName = userName;
		this.password = password;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getPassword() {
		return this.password;
	}
}
