package com.app.cricketer;

public class Cricketer {

	private String name;
	private int age;
	private String emailId;
	private String phoneNo;
	private  int rating;
	
	public Cricketer() {
		// TODO Auto-generated constructor stub
	}

	public Cricketer(String name, int age, String emailId, String phoneNo, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", emailId=" + emailId + ", phoneNo=" + phoneNo
				+ ", rating=" + rating + "]";
	}
	
	
	
}