package com.app.core;

import java.time.LocalDate;
import java.util.Objects;

public class Flight
{
	//data members
	private String flightno;
	private String flight_name;
	private String departure_time;
	private String arrival_time;
	private String source;
	private LocalDate flight_date;
	private String destination;
	private int no_of_seats;
	private int fare;
	private boolean status;
	private FlightType flight_type;
	
	
	
	public Flight(String flightno, String flight_name, String departure_time, String arrival_time, String source,
			LocalDate flight_date, String destination, int no_of_seats, int fare, boolean status,
			FlightType flight_type) {
		super();
		this.flightno = flightno;
		this.flight_name = flight_name;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.source = source;
		this.flight_date = flight_date;
		this.destination = destination;
		this.no_of_seats = no_of_seats;
		this.fare = fare;
		this.status = status;
		this.flight_type = flight_type;
	}



	public String getFlightno() {
		return flightno;
	}



	public void setFlightno(String flightno) {
		this.flightno = flightno;
	}



	public String getFlight_name() {
		return flight_name;
	}



	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}



	public String getDeparture_time() {
		return departure_time;
	}



	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}



	public String getArrival_time() {
		return arrival_time;
	}



	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public LocalDate getFlight_date() {
		return flight_date;
	}



	public void setFlight_date(LocalDate flight_date) {
		this.flight_date = flight_date;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public int getNo_of_seats() {
		return no_of_seats;
	}



	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}



	public int getFare() {
		return fare;
	}



	public void setFare(int fare) {
		this.fare = fare;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public FlightType getFlight_type() {
		return flight_type;
	}



	public void setFlight_type(FlightType flight_type) {
		this.flight_type = flight_type;
	}



	@Override
	public String toString() {
		return "Flight [flightno=" + flightno + ", flight_name=" + flight_name + ", departure_time=" + departure_time
				+ ", arrival_time=" + arrival_time + ", source=" + source + ", flight_date=" + flight_date
				+ ", destination=" + destination + ", no_of_seats=" + no_of_seats + ", fare=" + fare + ", status="
				+ status + ", flight_type=" + flight_type + "]";
	}


 


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Flight)
		{
			Flight f=(Flight)obj;
			return this.flightno.equals(flightno);
		}
		return  false;
	}


	
	
	
	
	
}
