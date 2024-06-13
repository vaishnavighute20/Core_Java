package com.app.core;

import java.util.Objects;

public class Cricketer {
	private String name;
	private int age;
	private String emailid;
	private String phoneno;
	private int rating;
	
	// param const 
	public Cricketer(String name, int age, String emailid, String phoneno, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.emailid = emailid;
		this.phoneno = phoneno;
		this.rating = rating;
	}

	// generate getter and setter
	public Cricketer(String emailid) {
		super();
		this.emailid = emailid;
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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	// toString 
	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", emailid=" + emailid + ", phoneno=" + phoneno
				+ ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, emailid, name, phoneno, rating);
	}

	
	
	@Override
	public boolean equals(Object obj) {
		 
		if(obj instanceof Cricketer)
		{
			Cricketer c=(Cricketer)obj;
			return this.emailid.equals(emailid);
		}
		return false;
	}
	
	 
	
	
	

}
