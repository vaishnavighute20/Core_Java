package com.classdemo;

public class Client {

	public static void main(String[] args) {
	
	Employee e1=new Employee(1,"king",78000);
	Employee e2=new Employee(2,"Ernst",89000);
	System.out.println(e1.toString());
	System.out.println(e2.toString());
	
	
	Employee.updateOrganizationName("New IACSD");
	System.out.println("AFter update-------");
	System.out.println(e1.toString());
	System.out.println(e2.toString());
	
	
	/*	Employee emp; // refernce to Employee type
	emp=new Employee();
	
	String details=emp.toString();
	System.out.println("Display through toString- "+details);
	
	emp.setEmpid(1);
	emp.setName("King");
	emp.setSalary(78000);
	
	System.out.println("empid-"+emp.getEmpid());
	System.out.println("name-"+emp.getName());
	System.out.println("salary-"+emp.getSalary());
	*/
	
	
}
}