package java_basic;
import java.util.Scanner;

public class TestIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cretae Scanner class instance to wrap std i/p stream
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two ints");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1<num2)
			System.out.println(num1+" <"+num2);
		else if(num1>num2)
			System.out.println(num1+" >"+num2);
		else
			System.out.println(num1+"="+num2);
		
	sc.close();
	}
}
