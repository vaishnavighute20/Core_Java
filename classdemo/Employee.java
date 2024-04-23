package com.classdemo;

public class Employee {
	
	//non static data member
	private int empid;
	private String name;
	private double salary;
	
	// static data member
	private static String organizationName="IACSD";
	
	// default constructor
	public Employee() {
		empid=0;
		name="NA";
		salary=0.0;
		
	}
	
	// parameterized constructor
	//when the parameter name and data member name is same the shadowing effect is observed
	//(the precedence is given to parameter name
	
	public Employee(int empid,String name,double salary) {
		
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		
	}
	//override toString() of Object class to return the string representation 
		//of a current object
		//toString is a non-static method that can access static and non-static memeber
		@Override
		public String toString()
		{
			return "Empid-"+empid+"Name-"+name+"Salary-"+salary+"OrganizationName-"+organizationName;
			
		}

		//getter for empid- gets the value of empid of current object
		//from memory and return to the client code
		
		public int getEmpid()
		{
			return this.empid;
		}
		
		//getter for name- gets the value of name of current object
		//from memory and return to the client code
		public String getName()
		{
		return this.name;
		}
		//getter for salary- gets the value of salary of current object
		//from memory and return to the client code
		public double getSalary()
		{
			return this.salary;
		}
		//setter for empid- it receives the empid value from client code and 
		//assign to current object
		
		public void setEmpid(int empid)
		{
			this.empid=empid;
		
		}
	
		//setter for name- it receives the name value from client code and 
		//assign to current object
		
		public void setName(String name)
		{
			this.name=name;
		}

		
		//setter for salary- it receives the salary value from client code and 
		//assign to current object
		public void setSalary(double salarys)
		{
	      this.salary=salarys;
		}
	
	// STATIC METHODS CAN ACCESS ONLY STATIC MEMBERS
		
	
	
		public static void updateOrganizationName(String newOrganizationName) {
	
		organizationName=newOrganizationName;
	}
		
}
		
		
		
		
				










