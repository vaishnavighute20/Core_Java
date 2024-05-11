package java_basic;
import java.util.Scanner;

public class TestWhileAndSwitch {

	public static void main(String[] args) {

// create scanner class instance
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		int data=0;
		System.out.println( data);
		while(!exit) {
			System.out.println("enter month no from 1-12");
			switch(sc.nextInt()) {
			case 11:
			case 12:
			case 1:
			case 2:System.out.println("season winter");
			break;
			
			case 3:
			case 4:
			case 5:
			case 6:System.out.println("season summer");
			break;
			
			
			case 7:
			case  8:
			case 9:
			case 10:System.out.println("season mansoon");
			break;
			
			default :
				
				
				System.out.println("invalid month !!!!!    ,  Terminating the app!!!");
				exit =true;
				break;
			
			
			
			}
		}sc.close();
		
	}

}
