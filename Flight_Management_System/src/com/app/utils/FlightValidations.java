package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.core.Flight;
import com.app.core.FlightType;
import com.app.exception.FlightException;

public class FlightValidations {
	// private String flight_no;
//	private String flight_name;
//	private String departure_time;
//	private String arrival_time;
//	private String source;
//	private LocalDate flight_date;
//	private String destination;
//	private int no_of_seats;
//	private int fare;
//	private boolean status;
//	private FlightType flight_type;

	// method to validate inputs
	
	public static Flight validateAllInputs(String flightno, String flight_name, String departure_time, String arrival_time, String source,
	String flight_date, String destination, int no_of_seats, int fare, boolean status,
			String flight_type ,List<Flight>flist) throws FlightException{
				
		// to check enum value present  
		ftypePresent(flight_type);
		
		//flight no validation
		fNoValidation(flightno);
		
		//to validate date
		fdateValidation(flight_date);
		
		// to parse date
		LocalDate date=LocalDate.parse(flight_date);
		
		// to parse enum
				
		FlightType ftype1=validateFtype(flight_type);	
 
		
		
		
		return new Flight(flightno,flight_name,departure_time,arrival_time,source,date,destination,no_of_seats,fare,status,ftype1);
		
	}
	
	
	

	  private static FlightType validateFtype(String ftype) {
 			FlightType data = FlightType.valueOf(ftype.toUpperCase());
			return data;
		}





	//to check date
	private static void fdateValidation(String flight_date)throws FlightException {
 		
		if(LocalDate.parse(flight_date).isBefore(LocalDate.now())) {
			
			throw new FlightException("date is not valid");
		}
	}
	
    //to check flight no of 6
	private static void fNoValidation(String flightno)throws FlightException {
 		if (flightno.length()!=6)
 			throw new FlightException("not a valid flight no");
	}

	//to check enum present or not
	private static FlightType ftypePresent(String flight_type) throws FlightException{
 		for (FlightType f:FlightType.values()) {
 			if(f.name().equalsIgnoreCase(flight_type)) {
 				return f;

 			}
 		}
		throw new FlightException("not a valid enum");
	}
	
}
