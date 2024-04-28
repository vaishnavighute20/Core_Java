package com.date_time;
import java.util.Date;
public class Test1 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);//Sun Apr 28 14:01:45 IST 2024 current date  
		Date d2=new Date(1000);
		System.out.println(d2);//Thu Jan 01 05:30:01 IST 1970// default date
		System.out.println(d1.before(d2));//false
		System.out.println(d1.after(d2));//true
		System.out.println(d1.compareTo(d2));//1
	}

}
