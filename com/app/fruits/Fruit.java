package com.app.fruits;

public abstract class Fruit {
      

	public String name;
	public String color;
	public double weight;
	public boolean fresh;
	public static int count=0;
       public Fruit(String name,String color,double weight,boolean fresh){

   		this.name=name;
   		this.color=color;
   		this.weight=weight;
   		this.fresh=fresh;
   		count++;
   
       }
     
  public abstract String taste();


  public void getName()
	{
		System.out.println("Fruit Name: "+name);
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void getColor()
	{
		System.out.println("Fruit color: "+color);
	}
  public void setColor(String color)
  {
      this.color=color;	
  }
  public void getWeight()
  {
  	System.out.println("Fruit weight: "+weight);
  }
  public void setWeight(double weight)
  {
  	this.weight=weight;
  }
  
  public boolean getFresh()
  {
    return fresh;
  }
  public void setFresh(boolean f)
  {
  	fresh=f;
  }

	@Override
	  public String toString() {
   	   return "name -"+name+"color -"+color+"weight -"+weight;
      }
       
}

