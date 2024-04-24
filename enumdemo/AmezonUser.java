package com.enumdemo;

public class AmezonUser {
	
	private int userId;
	private String name;
	private MembershipType usertype;// enum variable as field class
	public AmezonUser( int userId,String name,MembershipType usertype) {
		
		this.userId=userId;
		this.name=name;
		this.usertype=usertype;
	}
	
	
	@Override
	public String toString() {
		return "user id- "+this.userId+ "Name-"+this.name+"Type-"+this.usertype;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

// getter method of enum variable return enum type
	public MembershipType getMembershiptype() {
		return usertype;
	}

// setter method of enum variable returns enum type
	public void setMembershipTypetype(MembershipType usertype) {
		this.usertype = usertype;
	}
		
}
