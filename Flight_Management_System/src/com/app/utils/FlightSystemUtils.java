package com.app.utils;
import static com.app.utils.FlightValidations.*;

import java.util.Iterator;
import java.util.List;

import com.app.core.Flight;
import com.app.exception.FlightException;

public class FlightSystemUtils {
	public static Flight SearchBySource(String source,List<Flight>flist) throws FlightException
	{
		for (Flight flight:flist) 
		{
			
			if(flight.getSource().equals(source))
			{			
				flight.getFlight_name();
				flight.getFlight_date();
				flight.getArrival_time();
				return flight;
			}
		}
		
		throw new FlightException("No such source exists");

		
	}

// update destination
	public static String modifyDesination(String Source, String destination, List<Flight> flist) throws FlightException 
	{
		for (Flight f:flist)
		{
			if(f.getSource().equals(Source))
			{
 				f.setDestination(destination);
				
			}
		}
		return "no such source found";
		
	}
	
	// remove flight
	public static void deleteByFlightno(String flightno, List<Flight> flist) 
	{
 		
		for(Flight f: flist)
		{
				Iterator<Flight> i =flist.iterator();
				
				while(i.hasNext())
				{
					Flight c1=i.next();
					if(c1.getFlightno().equalsIgnoreCase(flightno))
					{
					
					i.remove();
					System.out.println("deleted");
					}
					
				}
			
		}
	}


}



	

