package com.utils;

import java.util.Map;

import com.app.cricketer.Cricketer;
import com.app.customexception.CricketerException;

public class CricketerValidations {
	public static void checkForDuplicate(String email,Map<String,Cricketer>cricketer)throws CricketerException
	{
		if (cricketer.containsKey(email))
			throw new CricketerException("Invalid Email");
	}

	public static Cricketer validateInputs(String name, int age, String emailId, String phoneNo, int rating,Map<String, Cricketer> cricket )  throws CricketerException{
		
		checkForDuplicate(emailId, cricket);
		return new Cricketer(name,age,emailId,phoneNo,rating);
	}
	
    public static void searchByName(String name,Map<String, Cricketer> nm) throws CricketerException  {
    	Cricketer cric =null;
		for(Cricketer c:nm.values())
			if(c.getName().equals(name))			
			cric=c; // set .cricketer variable
			
		if(cric==null)
			throw new CricketerException("invalid name");
		System.out.println(cric);
    	
    }
     public static int modifyCricketerRating(String email,int newRating ,Map<String, Cricketer>rating) throws CricketerException{
    	Cricketer cricketer=rating.get(email);
    	if (rating==null)
    		throw new CricketerException("invalid email");
    	cricketer.setRating(newRating);
    	return cricketer.getRating();
    }
    
    
    
	
}
