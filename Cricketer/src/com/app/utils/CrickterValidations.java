package com.app.utils;

import java.util.List;

import com.app.core.Cricketer;
import com.app.exception.cricketerException;

public class CrickterValidations {
	public static int validateAge(int age)throws cricketerException{
	    if (age<20) {
	    	
	    	throw new cricketerException("age is not valid");
	    }
		
		return age;
		
	}

	
	public static String validateEmail(String emailid,String phoneNo,List<Cricketer> clist) throws cricketerException{
	      for (Cricketer c:clist)
		if(c.getEmailid().equals(emailid))
		{
			if(c.getPhoneno().equals(phoneNo))
			{
				throw new cricketerException("Duplicate emailid and phoneNo");

			}
			
		}
		
		return emailid;
		
	}
	
	public static int validateRating(int rating) throws cricketerException{
		
		if (rating >5)
			
		  throw new cricketerException("Rate should be less than 5");
		return rating;
		
	}
}
