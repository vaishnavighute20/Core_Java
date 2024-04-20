package mypkg;
import java.util.Scanner;// to take input from user 
public class forloopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // factorial 
		int num, fact=1;
		Scanner in=new Scanner(System.in);
		System.out.println("enter a num");
		num=in.nextInt();
		for(int count=num;count>=1;count--)
		{ 
			fact=fact*count;
			System.out.println("the factorial of num = "+num+ " is " +fact);
		}
	}

}
