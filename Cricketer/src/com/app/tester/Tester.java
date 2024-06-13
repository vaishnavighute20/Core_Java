package com.app.tester;
import static com.app.utils.CricketerUtils.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Cricketer;
import com.app.exception.cricketerException;
import com.app.utils.CrickterValidations;

public class Tester {
      
	public static void main(String[] args) {
         List<Cricketer>clist=new ArrayList<Cricketer>();       
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			while(!exit) {
				System.out.println(" Options:"
						+ "1. add cricketer  "
						+ "2. Display all Data   "
						+ "3. update rating"
						+ "4.  search  by name"
						+ "5. delete by emailid"
						+ "6. sort by rating");
				
				System.out.println("choose options");
				try {
					
					switch (sc.nextInt()) {
					case 1://add cricketer 
						System.out.println("enter  name, age, emailid, phoneno, rating");
					 Cricketer addData = allValidations(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt(),clist);
						clist.add(addData);
						System.out.println(" cricketer added");
						break;
					
						
                    case 2://2. Display all Data 
						
                    	for(Cricketer c:clist)
                    	{
    						System.out.println(c);
                    	}
						break;
							
                    case 3:	//update  rating 
                    	
                    	    System.out.println("enter email and rating ");
                  //  	    System.out.println(modifyRating(sc.next(), sc.nextInt(), clist));
                    	    String msg=modifyRating(sc.next(), sc.nextInt(), clist);
                    	    System.out.println(msg);
                    	     
 						break;
						
						
                    case 4:// search by name
                    	
                    	searchByName(sc.next(),clist);
                    	
						break;
						
                    case 5:// delete by emailid
                    	deleteByName(sc.next(),clist);
                    
						break;
						
						
						
                    case 6:// sort by rating
                    	Collections.sort(clist, new sortByRating());
                    	   for (Cricketer c:clist)
                    	   {
                    		   System.out.println("name:"+c.getName()+"rating "+c.getRating());
                    	   }
                    	System.out.println(" ");
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
