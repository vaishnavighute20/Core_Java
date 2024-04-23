package com.staticdemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("max",78);
		Student s2=new Student("john",90);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("there are total"+Student.getCounter()+"students ");

	}

}
