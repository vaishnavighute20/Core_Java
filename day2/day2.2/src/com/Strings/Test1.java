package com.Strings;
// immutability of strings
public class Test1 {

	public static void main(String[] args) {
		
       String s1=new String("hello");
    		   s1.concat("students");
    		   System.out.println(s1);//hello    because string is immutable
    		   
    		   s1+=" hi there!!!!!!!!";
    		   System.out.println(s1);//hello hi there!!!!!!!!
    		   
               System.out.println(s1.toUpperCase());//HELLO HI THERE!!!!!!!!
               
               System.out.println(s1);//hello hi there!!!!!!!!
               
               String s2=s1.substring(0,5);
               System.out.println(s1);//hello hi there!!!!!!!!
               
               System.out.println(s1);//hello    0,5 so 5 char
               
               s2=s1.replace('h', 'f');
           	System.out.println(s1);//orig      hello hi there!!!!!!!!
    		System.out.println(s2);//replaced     fello fi tfere!!!!!!!!

	}

}
