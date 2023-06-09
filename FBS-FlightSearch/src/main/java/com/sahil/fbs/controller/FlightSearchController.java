package com.sahil.fbs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sahil.fbs.model.Flight;
import com.sahil.fbs.repository.FlightSearchRepository;
import com.sahil.fbs.service.FlightSearchServiceImpl;

@RestController
public class FlightSearchController {

	
	@Autowired
	public FlightSearchServiceImpl service;
	
	@Autowired
	public FlightSearchRepository frepo;
	
	
	// For User to Find All Flights
	
	@GetMapping("/allFlights")
	public List<Flight> getAllFlights(){
		return service.getAllFlights();
	}
	
	// For user to Find Flights by departure and arrival location
		@GetMapping("/find/{departure_location}/{arrival_location}")
		public List<Flight> getFlightByData(@PathVariable("departure_location") String dep_loc,@PathVariable("arrival_location") String arr_loc){
			return service.getFlightByLocation(dep_loc, arr_loc);	
		}

	
	
	// Admin
	
	@PostMapping("/addFlight")
	public String addNewFlight(@RequestBody Flight flight) {
		return service.addFlight(flight);
	}
	
	@PutMapping("/updateFlight/{flight_number}")
	public String updateFlight(@RequestBody Flight flight, @PathVariable("flight_number") int flight_number ) {
		return service.updateFlight(flight, flight_number);
	}
	
	@DeleteMapping("/removeFlight/{flight_id}")
	public String removeFlight(@RequestBody Flight flight , @PathVariable("flight_id") int flight_id) {
		return service.deleteFlight(flight, flight_id);
	}
	
	
	
}
