package com.learn.busBooking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.learn.busBooking.model.Bus;

@Repository
public interface BusSearchRepository extends JpaRepository<Bus, Long> {

	List<Bus> findBySourceAndDestination(String source, String destination);

	

	List<Bus> findBusBySourceAndDestinationAndDepartureDate(String source, String destination, Date date);

	
	
	
}
