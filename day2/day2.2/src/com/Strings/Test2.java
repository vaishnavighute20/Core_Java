package com.Strings;
//     ==  VS   equals
public class Test2 {

	public static void main(String[] args) {
	//	int data =100;
		String s1=new String("hello");
		String s2=new String("hello");
		String s3=new String("Hello");
		String s4="hello";
		
		// == implies reference equality 
       // .equals   check content
	  //	.equalsIgnoreCase()  check contents ignores case
		
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s3));//true    ignore case
	
		System.out.println(s1==s4);//false
	}
	

}
