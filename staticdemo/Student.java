package com.staticdemo;

public class Student {
	// non static class member
	private int id;
	private String name;
	private float marks;
	
	// static counter is used to keep track of number of objects
	private static int counter=0;
	
	public Student(String name,float marks) {
		//increatment the counter as soon as object is created
		counter++;
		this.id=counter+99;
		this.name=name;
		this.marks=marks;
		
	}
	
    @Override
    public String toString() {
    	return "ID-"+id+"Name-"+name+"Marks-"+marks;
    	
}
    
    // static method to get the number of students
    public static int getCounter() {
    	return counter;
    }
}