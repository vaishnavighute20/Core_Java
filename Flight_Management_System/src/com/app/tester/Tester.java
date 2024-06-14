package com.app.tester;

import static com.app.utils.FlightSystemUtils.*;
import static com.app.utils.FlightValidations.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Flight;
import com.app.core.FlightType;

public class Tester {

	public static void main(String[] args) {
		List<Flight> flist = new ArrayList<>();
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			while (!exit) {
				System.out.println("---------------------welcome--------------------");
				System.out.println("options" + "1. add new flight" + "2. display all flight"
						+ "3.display daya according to city" + "4.sort flight as per date" + "5.update destination"
						+ "remove flight based on flightno");

				System.out.println("Enter the choice");

				int choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:// add new flight
						System.out.println("flightno, flight_name, departure_time, arrival_time,  source,\r\n"
								+ "			 flight_date, destination,  no_of_seats, fare, status,\r\n"
								+ "			flight_type");

						/*
						 * String flightno, String flight_name, String departure_time, String
						 * arrival_time, String source, String flight_date, String destination, int
						 * no_of_seats, int fare, boolean status, String flight_type ,List<Flight>flist
						 */

						Flight f = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextInt(), sc.nextInt(), true, sc.next(), flist);
						flist.add(f);

						break;

					case 2: // display all flight

						for (Flight f1 : flist) {
							System.out.println(f1);
						}

						break;

					case 3: // display daya according to city

						System.out.println("enter source to search");
						Flight fl = SearchBySource(sc.next(), flist);
						System.out.println(fl);
						break;

					case 4:// sort flight as per date
						flist.sort(Comparator.comparing(Flight::getFlight_date));
						for (Flight flight : flist) {
							System.out.println(flight);
						}
						break;

					case 5:// update destination
						System.out.println("enter source and destination");
						modifyDesination(sc.next(), sc.next(), flist);
						System.out.println("destination is updated");

						break;

					case 6:// remove flight based on flightno
						System.out.println("enter fligh no");
						deleteByFlightno(sc.next(), flist);
						System.out.println("deleted destination");

						break;

					case 7: // for exit
						exit = true;
						System.out.println("Exiting");

						break;

					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
			}
		}
	}
}
