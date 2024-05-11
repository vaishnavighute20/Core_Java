package java_basic;
import java.util.Scanner;


public class TestForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		
		int begin=sc.nextInt();
		int end=sc.nextInt();
		System.out.println("odd num in range");
		for(int i=begin;i<+end;i++) {
			if(isodd(i))
				System.out.print(i+" ");
			
		}sc.close();
		
	}

	private static boolean isodd(int number) {
		if(number%2!=0)
			return true;
		
		return false;
	}

}
