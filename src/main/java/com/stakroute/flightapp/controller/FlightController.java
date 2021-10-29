package com.stakroute.flightapp.controller;


import com.stakroute.flightapp.model.Flight;
import com.stakroute.flightapp.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;


    @GetMapping
    public ResponseEntity<?> getAllFlights(){
        List<Flight> flightlist = flightService.getAllFlights();

        return new ResponseEntity<>(flightlist,HttpStatus.OK);
    }

    @GetMapping("/{flightid}")
    public ResponseEntity<?> getFlightinfo(@PathVariable String flightid){
        Flight flight = flightService.getFlightById(flightid);

        return new ResponseEntity<>(flight,HttpStatus.OK);
    }
    @GetMapping("/arrival/{arrival}")
    public ResponseEntity<?> getFlightByArrival(@PathVariable String arrival){
    	List<Flight>flight = flightService.getFlightsByArrival(arrival);
    	return new ResponseEntity<List<Flight>>(flight,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addFlight(@RequestBody Flight flight){
        boolean status = flightService.addFlight(flight);
        if(status) {
            return new ResponseEntity<>(flight, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>("Flight not added", HttpStatus.CONFLICT);
        }
    }
}
