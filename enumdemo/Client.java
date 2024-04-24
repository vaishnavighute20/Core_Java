package com.enumdemo;

public class Client {

	public static void main(String[] args) {
		
		// creatr an object user of type Amezonuser
       //parameterized constructor has 3 parameter int, string, enum
		AmezonUser user=new AmezonUser(1,"King",MembershipType.PRIME);

	System.out.println(user);
	
	
	
	//compare the user object's memebershiptype whther it is prime or not
	if(user.getMembershiptype()==MembershipType.PRIME)
	{
		System.out.println("discount applied");
	}
	
	}
}
