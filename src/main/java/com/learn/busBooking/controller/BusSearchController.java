package com.learn.busBooking.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.busBooking.dto.BusRouteDto;
import com.learn.busBooking.model.Bus;
import com.learn.busBooking.service.BusSearchService;

@RestController
public class BusSearchController {
	
	@Autowired
	BusSearchService busSearchService;

	@GetMapping("/bus/{source}/{destination}")
	public ResponseEntity<List<Bus>> viewBuses(@PathVariable String source,@PathVariable String destination ) {
         List<Bus> buses = busSearchService.findBySourceAndDestination(source,destination);		
         return new ResponseEntity<List<Bus>>(buses,HttpStatus.OK);
	}
	
	  @PostMapping("/searchbus")
	  public ResponseEntity<List<Bus>> viewBuses(@RequestBody BusRouteDto busRouteDto) {
		  List<Bus> buses = busSearchService.findBySourceAndDestinationAndDepatureDate(busRouteDto); 
		  return new ResponseEntity<List<Bus>>(buses,HttpStatus.OK);
		  }
}
