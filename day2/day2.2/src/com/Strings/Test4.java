package com.Strings;
//Stringbuilder mutable
import java.util.Date;
public class Test4 {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder("hello");
		System.out.println(sb1.length()+" "+sb1.capacity());//5,21
		StringBuilder sb2=sb1.append("123.456");
		System.out.println(sb1);//hello123.456
		System.out.println(sb2);//hello123.456
		System.out.println(sb1==sb2);//true
	    sb1.append(true).
	    append(8888).
		append(45.67F).
		append(new Date());
	    System.out.println(sb1);//hello123.456true888845.67Sun Apr 28 16:10:36 IST 2024
        sb1.insert(0,new char[] {'a','b','c','d'},0,3);//abchello123.456true888845.67Sun Apr 28 16:14:31 IST 2024
         // insert it will insert before
        System.out.println(sb1.length()+" "+sb1.capacity());//56 90
	
	    //delete chars
        sb1.delete(0, sb1.length());
        System.out.println("after delete"+sb1);//after delete   no length
        System.out.println(sb1.length() + " " + sb1.capacity());//0 90          capacity remain as it as it is previous
		sb1.trimToSize();//this method is called to resize the StringBuilder
		System.out.println(sb1.length() + " " + sb1.capacity());//0 0
		
	
	}

}
