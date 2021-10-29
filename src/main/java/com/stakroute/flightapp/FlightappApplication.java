package com.stakroute.flightapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FlightappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightappApplication.class, args);
	}

	@GetMapping("/")
	public String indexpage() {
		return "Welcome to Springboot";
	}
}
