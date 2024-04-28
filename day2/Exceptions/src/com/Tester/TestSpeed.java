package com.Tester;
import java.util.Scanner;
import static utils. VehicleValidationRules.validateSpeed;
public class TestSpeed {

	public static void main(String[] args) {
	
try (Scanner sc=new Scanner(System.in)){
	System.out.println("enter speed");
	validateSpeed(sc.nextInt());
	System.out.println("End of try");
}
catch(Exception e)
{
	System.out.println(e.getMessage());
	e.printStackTrace();
	 
}

System.out.println("main over");

	}

}
