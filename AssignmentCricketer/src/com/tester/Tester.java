package com.tester;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import com.app.cricketer.Cricketer;
import com.utils.CricketerValidations;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			boolean exit = false;

			Map<String, Cricketer> map = new HashMap<String, Cricketer>();

			while (!exit) {
				System.out.println(
						"Options :1. Add cricketer \n 2. Display cricketer \n 3.Search Cricter By name \n 4.Display all Cricketer Added in Collection"
								+ "5.Display All Cricketer in Sorted fron By Rating \n 0.Exit ");

				System.out.println("choose options");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter name,age,emailId,phoneNo,rating");
						Cricketer cricketer = CricketerValidations.validateInputs(sc.next(), sc.nextInt(), sc.next(),
								sc.next(), sc.nextInt(), map);
						map.put(cricketer.getEmailId(), cricketer);
						System.out.println("add succesfully");
						break;

					case 2:
						System.out.println("Display all details");
						for (Cricketer c : map.values())
							System.out.println(c);
						break;

					case 3:
						System.out.println("enter name");
						CricketerValidations.searchByName(sc.next(), map);
						break;

					case 4:
						System.out.println("Display Cricketer");
						for (Cricketer crick : map.values())
							System.out.println(crick);
						break;

					case 5:
						System.out.println("Sort By Rating");
						LinkedList<Cricketer> list=new LinkedList<>(map.values());
						Collections.sort(list, new Comparator<Cricketer>() {

							@Override
							public int compare(Cricketer o1, Cricketer o2) {
								System.out.println("in compare To");
								if(o1.getRating()>o2.getRating())
									return 1;
								if(o1.getRating()==o2.getRating())
									return 0;
								return -1;
							
							}
							 
						});
						System.out.println("Sort as per Rating");
						for(Cricketer c:list)
							System.out.println(c);
						break;
						
					case 0:
						break;
					}

				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}

			}

		}
	}

}
