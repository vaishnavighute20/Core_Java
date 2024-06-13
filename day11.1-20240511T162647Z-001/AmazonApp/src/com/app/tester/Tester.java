package com.app.tester;

import static com.app.utils.AmazonValidation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Amazon;
import com.app.core.Subcription;
import com.app.utils.AmazonValidation;


public class Tester {

	public static void main(String[] args) 
	{
		List<Amazon>Alist=new ArrayList<>();
		
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			while(!exit) {
				System.out.println(" Options:"
						+ "1. add user  "
						+ "2.  search ny name  "
						+ "3. retrive/ display all"
						+ "4. delete by name"
						+ "5. sort by amount"
						+ "6. update passord  ");
				
				System.out.println("choose options");
				try {
					
					switch (sc.nextInt()) {
 						
					case 1://add user 
						System.out.println(" name,  emailid, password,  subcription,  amount, creationdate ");
					 Amazon addData = checkAllinputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),sc.next(),Alist);
						Alist.add(addData);
						System.out.println(" user added added");
						break;
						
					 
						
                    case 2://  search ny name 
						
                      searchByName(sc.next(),Alist);
                    	
						break;
							
                    case 3:	//retrive/ display all
                    	
                    	for(Amazon A:Alist)
                    	{
    			       System.out.println(A);
                    	}
		      
						break;
						
						
                    case 4://delete by name
                    	
                    	deleteByName(sc.next(),Alist);
                        
						break;
						
                    case 5://sort by amount
                    	Collections.sort(Alist, new sortByAmount());
                 	   for (Amazon A:Alist)
                 	   {
                 		   System.out.println("name:"+A.getName()+"Amount "+A.getAmount());
                 	   }
                 	    System.out.println(" ");
				
                    	
 						break;
						
						
						
                    case 6://update password
                    	
                    	       System.out.println("enter email and password and new password ");
                         	   
                           	    
                           	    AmazonValidation.modifyPassword(sc.next(),sc.next(),sc.next(),Alist);
                           	     
        						break;
					default:
						break;
					}
					
				}catch(Exception e) {
					sc.nextLine();
					 System.out.println(e);
					
				}
				
			}
		}

	}

}
