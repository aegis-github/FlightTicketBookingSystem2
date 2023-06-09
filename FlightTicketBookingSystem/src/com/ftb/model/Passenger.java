package com.ftb.model;

public class Passenger {
	
	private String id;
	private String name;
	private String email;
	private String age;
	private String gender;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Passenger(String id, String name, String email, String age, String gender)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.age=age;
		this.gender=gender;
	}
}
