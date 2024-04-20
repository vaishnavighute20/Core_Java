package mypkg;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // create object of product
		product p1;// p1 is reference
		p1=new product(1,"LGTV",85000);// p1 is reference to an object
		product p2=new product();
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	
		product p3;
		Scanner in=new Scanner(System.in);
		System.out.println("enter product id=");
		int id=in.nextInt();
		System.out.println("enter the name");
		String name=in.next();
		System.out.println("Enter the price:");
		double price=in.nextDouble();
		p3=new product(id,name,price);
		System.out.println(p3);
	
	}

}
