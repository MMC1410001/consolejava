package com.cdac.pojo;

public class User {

	private String name;
	private String password;
	private String email;
	private String mobile;
	private String gender;
	private String country;
	
	public User(String name, String password,String email, String mobile, String gender, String country) 
	{
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobile= mobile;
		this.gender= gender;
		this.country= country;
	}

	public User() {
		
	}

	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = gender;
	}
	
}
