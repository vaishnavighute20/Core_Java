package mypkg;
import java.util.Scanner;

public class class2 {

	public static void main(String[] args) {
		
    int num1, num2,result;
    Scanner in=new Scanner(System.in);
    System.out.println("enter num1 = ");
    num1=in.nextInt();
    System.out.println("Enter num2 = ");
    num2=in.nextInt();
    result=num1+num2;
    System.out.println("the result is "+result);
	}

}
