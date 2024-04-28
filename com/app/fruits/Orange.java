package com.app.fruits;

public class Orange extends Fruit{
Orange(String name, String color, double weight, boolean fresh){
	super(name,color,weight,fresh);
	
}
@Override
public String taste()
{
return "sour";
}


public void juice() {
	
	System.out.println("name:"+name+"weight:"+weight+"extracting juice");
	
	System.out.println("---------------------------------------");
}

}
