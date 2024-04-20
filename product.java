package mypkg;

public class product {

	//to achieve encapsulation data-private and methods-public
     private int pid;
     private String pname;
     private double price;
     
     // paramiterless constructor
     public product()
     {
    	 pid=0;
    	 pname="na";
    	 price=0.0;
    			 
     }
     
     public product(int id, String name,double pr) 
     {
    	pid=id;
 		pname=name;
 		price=pr;
     }
     
     //methods
//      public void printDetails()
//      {
//    	  System.out.println("pid="+pid+"name="+pname+"price="+price);
     // all are mandatory
//      }
     
     public String toString()
     {
    	 return "pid-"+pid+" name-"+pname+" price-"+price; 
    	 // we can take as required data member
     }
     
     
    	 
}
