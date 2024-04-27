package com.app.fruits;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {

  public static void main(String[] args)
  {
	  System.out.println("-----Fruit Basket----------");
	  System.out.println("1. Add Mango");
	  System.out.println("2. Add Apple");
	  System.out.println("3. Add Orange");
	  System.out.println("4. Add fruit name");
	  System.out.println("5. Display name,color,weight,taste of all fresh fruits in the basket");
	  
	  System.out.println("6. Mark a fruit in a basket,as a stale");
	  System.out.println("7. Mark all sour fruits as a stale");
	  System.out.println("8. Display specific functionality of fruit");
	 
	  int ch = 0;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		int m = 0;
		Fruit[] f = new Fruit[3];
	//	while (ch !=-1) 
		do{
			System.out.println("===============================");
			System.out.println("Enter your choice");
			ch = sc.nextInt();
          
			switch (ch) {
			case 1:
				f[i] = new Mango("Mango", "Yellow", 90, true);
				i++;
				System.out.println("Mango Added");
				break;
			case 2:
				f[i] = new Apple("Apple", "Red", 10, true);
				i++;
				System.out.println("Apple Added");
				break;
			case 3:
				
				f[i] = new Orange("Orange", "Orange", 20, true);
				System.out.println("Orange Added");
				break;
			case 4:
				System.out.println("===========All Fruit name============");
				for (int j = 0; j <= i; j++) {
					f[j].getName();
					
				}
				break;
			case 5:
				System.out.println("===========All Fruit Information=======");
				for (int k = 0; k <= i; k++) {
					String s = f[k].toString();
					System.out.println(s);
					s = f[k].taste();
					System.out.println(s); //upcasting
					System.out.println("======================================");
				}
				break;
			case 6:
				System.out.println("Enter index value ");
				m = sc.nextInt();
				f[m].setFresh(false);
				System.out.println("===Updated==");
				break;
			case 7:
				for (int q = 0; q <= i; q++) {
					if (f[q].taste().equals("sour")) {
						if (f[q].getFresh() == true) {
							f[q].setFresh(false);
						}
					}
				}
				System.out.println("===Updated==");
				break;
			case 8:
				System.out.println("=========Specific functionality of Fruits========= ");
				for (int p = 0; p <= i; p++) {
					if (f[p] instanceof Mango) {
						((Mango) f[p]).pulp();
					} else if (f[p] instanceof Apple) {
						((Apple) f[p]).jam();
					} else if (f[p] instanceof Orange) {
						((Orange) f[p]).juice();
					}
				}
			default:
				
				return;
			}
			
			
		}while(ch!=0);

  }

}
