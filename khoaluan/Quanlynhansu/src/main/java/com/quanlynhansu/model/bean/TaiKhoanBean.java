package com.quanlynhansu.model.bean;

public class TaiKhoanBean {
	private String Username;
	private String Password;
	public TaiKhoanBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaiKhoanBean(String username, String password) {
		super();
		this.Username = username;
		this.Password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		this.Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
	
	
}
