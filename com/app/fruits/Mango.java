package com.app.fruits;

public class Mango extends Fruit {

	 Mango(String name, String color, double weight,boolean fresh){
		 super(name,color,weight,fresh);
	 }
	 
	 @Override
	public String taste() {
		return "Sweet";
	}
	 
	 public void pulp() {
		 System.out.println("color of the "+name+" is "+color+"creating pulp");
		 System.out.println("------------------------------------------------");
	 }
}
