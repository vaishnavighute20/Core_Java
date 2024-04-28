package com.Strings;

public class Test3 {

	public static void main(String[] args) {
	String s1=("hello");
	String s2=new String(s1);
	String s3="hello";
	String s4="HELLO";
	System.out.println(s1==s2);//false
	System.out.println(s1==s3);//true
	System.out.println(s1==s4);//false
	System.out.println(s1.equals(s2));//true
	System.out.println(s1.equals(s3));//true
	System.out.println(s1.equals(s4));//false
	
	System.out.println(s1.equalsIgnoreCase(s4));//true
	
	s1=s2=s3=s4=null;
	
	String s5="hello";
	System.out.println(s1);//null
	System.out.println(s5);//hello
	System.out.println("length "+s5.length());//5
//	System.out.println("length "+s1.length());//   because we define it as null so exception
	StringBuilder s6=new StringBuilder("hello");
	System.out.println("length "+s6.capacity());//21    capacity=5+16    16 is default capacity
	System.out.println("length "+s6.length());//5
	}

}
