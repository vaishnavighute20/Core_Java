package com.app.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.app.entities.Pen;

public class PenValidations {
	
	 List<Pen> penList= new ArrayList<>();
	 
	 public void addPen(Pen p) {
		 penList.add(p);
		 System.out.println("add successfully");
	 }
	 
	 public void update(int id, int stock) 
	 {
		 for(Pen i:penList)
		 {
			 if(i.getId()==id) 
			 {
				 i.setStock(stock);
				 System.out.println("stocke updated");
				 
			 }
			 else
			 {
				 System.out.println("stock not updated");
			 }
		 }
		 
	 }
	
	 
	 public void setUnSoldedDiscount() {
		 
		LocalDate currentDate=LocalDate.now();
		for (Pen p:penList) {
			int month =Period.between(p.getStockupdatedate(), currentDate).getMonths();
		  if(month>=3) {
			  p.setDiscount(20.0);
			  System.out.println("discount updated for unsold");
		  }
		  else {
			  
				System.out.println("Discount Failed for unsold pens !!!!!");

		  }
		}
	 }
	
     public void removeUnsoldedPens() {
    	 
    	 LocalDate currentDate=LocalDate.now();
    	 Iterator<Pen> i=penList.iterator();
    	 while(i.hasNext()) {
    		 Pen p=i.next();
    		 if(Period.between(p.getStocklistingDate(), currentDate).getMonths()>=9  ) {
    			 
    			 i.remove();
    		 }
    		 }
    	 
    	 System.out.println("Removed pens that were never sold in the last 9 months!");
     }
     
     public void displayPenData() {
    	 
    	 if(penList.isEmpty())
 		{
 			System.out.println("Empty Data !!!!");
 		}
 		
 		else
 		{
 			for(Pen p: penList)
 			{
 				System.out.println(p);
 			}
 		}
    	 
     }
}












