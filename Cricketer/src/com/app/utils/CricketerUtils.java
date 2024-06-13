package com.app.utils;
import static com.app.utils.CrickterValidations.*;

import java.util.Iterator;
import java.util.List;

import com.app.core.Cricketer;
import com.app.exception.cricketerException;

public class CricketerUtils {
	public static Cricketer allValidations(String name, int age, String emailid, String phoneno, int rating,List<Cricketer>clist )throws cricketerException
	{
		String Email_id=validateEmail(emailid,phoneno,clist);
		int Age=validateAge(age);
		int rate=validateRating(rating);
		
		return new Cricketer(name,age,emailid,phoneno,rating);
		
	}
	
	public static String modifyRating(String emailid, int  rating, List<Cricketer> clist) throws cricketerException 
	{
		for (Cricketer c:clist)
		{
			if(c.getEmailid().equals(emailid))
			{
				int validateRating = validateRating(rating);
				c.setRating(validateRating);
				
			}
		}
		return "Rating is updated";
		
	}
	
	public static void searchByName(String name, List<Cricketer> clist) 
	{
		for (Cricketer c:clist) {
			if(c.getName().equals(name))
			{
				System.out.println(c);
			}
		}
 		
	}

	public static void deleteByName(String name, List<Cricketer> clist) 
	{
 		
		for(Cricketer c: clist)
		{
				Iterator<Cricketer> i =clist.iterator();
				
				while(i.hasNext())
				{
					Cricketer c1=i.next();
					if(c1.getName().equalsIgnoreCase(name))
					{
					
					i.remove();
					System.out.println("deleted");
					}
					
				}
			
		}
	}


}
