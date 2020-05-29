package com.learn.busBooking.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.busBooking.controller.exception.BusNotFoundException;
import com.learn.busBooking.dto.BusRouteDto;
import com.learn.busBooking.model.Bus;
import com.learn.busBooking.repository.BusSearchRepository;

@Service
public class BusSearchService {
	@Autowired
	BusSearchRepository busSearchRepository;

	
	  public List<Bus> findBySourceAndDestinationAndDepatureDate(BusRouteDto busRouteDto) {
	  
	  List<Bus> buses =  busSearchRepository.findBusBySourceAndDestinationAndDepartureDate(busRouteDto.getSource(), busRouteDto.getDestination(),busRouteDto.getDepatureDate());
	   if(buses.isEmpty()) {
		   throw new BusNotFoundException();
	   } else 
	   {
		   return buses;
	   }
	 }
	 

	public List<Bus> findBySourceAndDestination(String source, String destination) {
		// TODO Auto-generated method stub
		return busSearchRepository.findBySourceAndDestination(source, destination);
	}


	

}
