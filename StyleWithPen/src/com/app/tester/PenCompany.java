package com.app.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.entities.Pen;
import com.app.utils.PenValidations;

public class PenCompany {
	/*
	1. Add new Pen
	2. Update stock of Pen
	3.Set discount of 20% for all the pens which are not at all sold in last 3 months
	4. Remove Pens which are never sold once listed in 9 months
	*/

	public static void main(String[] args) {
		PenValidations validation=new PenValidations();
		//   reference of PenValidations class is created for calling method in that class

		try (Scanner sc = new Scanner(System.in)){
			boolean exit=false;
			
			while(!exit) {
				System.out.println("options : "
						 + "1. Add new pen"
						 +   "2. update stock of pen   "
						 +   "3. set discount 20% which are not sold in last 3 monts"
						 +   "4. remove pen which are not sold last 9 months "
						 +   "5. display all pen"
						 +   "6. exit");
				System.out.println("choose options");
				try {
					 switch(sc.nextInt())
					 {
					 case 1:  
						 System.out.println("id,  brand,  color, inkcolor,  material,  stock,  stockupdatedate,\r\n"
						 		+ "		stocklistingDate,  price, discount");
							/*
							 * int id, String brand, String color, String inkcolor, String material, int
							 * stock, LocalDate stockupdatedate, LocalDate stocklistingDate, double price,
							 * double discount
							 */
						 // add proper sequence given in constructor
						 Pen pen=new Pen(sc.nextInt(), sc.next(),sc.next() ,sc.next(),  sc.next(), 
								 sc.nextInt(), LocalDate.parse(sc.next()),LocalDate.parse(sc.next()),
								 sc.nextDouble() , sc.nextDouble());
						        
						 validation.addPen(pen);// validation is a reference
								System.out.println("Data added Successfully...! ");
                           break; 
					  
					 case 2:
						 
						 System.out.println("Enter the id and stock");
					     validation.update(sc.nextInt(), sc.nextInt());
						 break;
						  
					 case 3:
						  validation.setUnSoldedDiscount();
						  break;
						  
					 case 4:
						 validation.removeUnsoldedPens();
						 
						  break;
						  
					 case 5:
						 validation.displayPenData();
						  break;
						  
						  
					 }
					
				}catch(Exception e)
				{
					System.out.println(e);
					
				}
				
			}
		}
		
 
	}

}
