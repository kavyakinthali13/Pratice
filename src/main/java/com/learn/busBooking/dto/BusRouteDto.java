package com.learn.busBooking.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class BusRouteDto {
	
	public String source;
	public String destination;
	@Temporal(TemporalType.DATE)
	public Date depatureDate;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDepatureDate() {
		return depatureDate;
	}
	public void setDepatureDate(Date depatureDate) {
		this.depatureDate = depatureDate;
	}

	

}
