package com.sahil.fbs.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="flights")
public class Flight {
	@Id
	private int id;
	private String departure_location;
	private String arrival_location;
	private String airline;
	private int flight_number;
	private String departure_time;
	private String arrival_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeparture_location() {
		return departure_location;
	}
	public void setDeparture_location(String departure_location) {
		this.departure_location = departure_location;
	}
	public String getArrival_location() {
		return arrival_location;
	}
	public void setArrival_location(String arrival_location) {
		this.arrival_location = arrival_location;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public int getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(int flight_number) {
		this.flight_number = flight_number;
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
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(int id, String departure_location, String arrival_location, String airline, int flight_number,
			String departure_time, String arrival_time) {
		super();
		this.id = id;
		this.departure_location = departure_location;
		this.arrival_location = arrival_location;
		this.airline = airline;
		this.flight_number = flight_number;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
	}
	public Flight(int id2, String departureLocation, String arrivalLocation) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
