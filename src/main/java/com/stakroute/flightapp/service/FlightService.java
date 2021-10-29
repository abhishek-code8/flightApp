package com.stakroute.flightapp.service;


import com.stakroute.flightapp.model.Flight;
import com.stakroute.flightapp.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return (List<Flight>) flightRepository.findAll();
    }

    public Flight getFlightById(String flightid) {
        return flightRepository.findById(flightid).get();
    }



    public boolean addFlight(Flight flight) {
        Flight newflight = flightRepository.save(flight);
        if(newflight.getFlightid().equals(flight.getFlightid())){
            return true;
        }
        else
            return false;

    }

	public List<Flight> getFlightsByArrival(String arrival) {
		List<Flight> flight = flightRepository.findByArrival(arrival);
		return flight;
	}
}
