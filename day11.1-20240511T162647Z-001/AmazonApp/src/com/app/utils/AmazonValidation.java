package com.app.utils;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import com.app.core.Amazon;
import com.app.core.Subcription;
import com.app.exception.AmazonException;

public class AmazonValidation 
{
	
	public static  String validateEmail(String emailid,List<Amazon> alist) throws AmazonException
	{
		for (Amazon a:alist)
			if(a.getEmailid().equals(emailid))
		{
			throw new AmazonException("duplicate email");
		}
		return emailid;
		
	}
	
	
	public static Amazon checkAllinputs(String name, String emailid, String password, String subcription, double amount,
			String creationdate, List<Amazon> alist)throws AmazonException
	//  change email and enum type to string
	{
		validateEmail(emailid, alist);

		// parsing to string
		LocalDate date= LocalDate.parse(creationdate);
		Subcription sub= Subcription.valueOf(subcription.toUpperCase());
		// while returning of date and enun take new reference
		return new Amazon(name, emailid, password, sub, amount, date);
		
	}
	
	public static void searchByName(String name, List<Amazon> Alist) 
	{
		for (Amazon A:Alist) {
			if(A.getName().equals(name))
			{
				System.out.println(A);
			}
		}
 		
	}
	
	public static void deleteByName(String name, List<Amazon> Alist) 
	{
 		
		for(Amazon A: Alist)
		{
				Iterator<Amazon> i =Alist.iterator();
				
				while(i.hasNext())
				{
					Amazon A1=i.next();
					if(A1.getName().equalsIgnoreCase(name))
					{
					
					i.remove();
					System.out.println("deleted");
					}
					
				}
			
		}
	}


	public static String modifyPassword(String emailid, String password, String newpassword, List<Amazon> Alist) throws AmazonException 
	{
		for (Amazon A:Alist)
		{
			if(A.getEmailid().equals(emailid))
			{
				if(A.getPassword().equalsIgnoreCase(password))
				{
	 				A.setPassword(newpassword);
			
				}
				
			}
		}
		return "password is updated";
		
	}
	

	

}

	

