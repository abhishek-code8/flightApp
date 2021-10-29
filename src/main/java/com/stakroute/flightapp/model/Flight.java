package com.stakroute.flightapp.model;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Flight {
	
	@Id
	private String flightid;
	private String flightName;
	private String destination;
	private	String arrival;

	public Flight(){

	}


	public String getFlightid() {
		return flightid;
	}

	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}

	public String getFlightname() {
		return flightName;
	}

	public void setFlightname(String flightname) {
		this.flightName = flightname;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}



}
