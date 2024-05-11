package java_basic;
import java.util.Scanner;
// create scanner class instance

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter two doubles");
double d1=sc.nextDouble();
double d2=sc.nextDouble();
System.out.println("div="+(d1/d2));
sc.close();

	}

}
