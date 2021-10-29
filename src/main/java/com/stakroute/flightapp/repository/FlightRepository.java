package com.stakroute.flightapp.repository;


import com.stakroute.flightapp.model.Flight;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends MongoRepository<Flight,String> {

	List<Flight> findByArrival(String arrival);


}