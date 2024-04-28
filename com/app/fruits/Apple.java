package com.app.fruits;

	public class Apple extends Fruit {

		
		public Apple(String name,String color,double weight,boolean fresh)
		{
			super(name,color,weight,fresh);	
		}
	 
		@Override
		public String taste() {
			return "Sweet and sour" ;
		}
		 public void jam()
		 {
			 System.out.println("Fruit Name: "+name+" Making Jam!");
			 System.out.println("-----------------------------------");
		 }
		 
		 
	}
