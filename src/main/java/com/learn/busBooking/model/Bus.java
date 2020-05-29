package com.learn.busBooking.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "tickets" })
@Table
public class Bus {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	   
	    private String source;
	   
	    private String destination;
	  
	    @Temporal(TemporalType.DATE)
	    private Date departureDate;
	    
	    @Temporal(TemporalType.DATE)
	    private Date arrivalDate;
	   
	    @OneToMany(mappedBy = "bus", cascade = CascadeType.REMOVE)
	    private List<Ticket> tickets;
	    
	   
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

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

	

		public Date getDepartureDate() {
			return departureDate;
		}

		public void setDepartureDate(Date departureDate) {
			this.departureDate = departureDate;
		}

		public Date getArrivalDate() {
			return arrivalDate;
		}

		public void setArrivalDate(Date arrivalDate) {
			this.arrivalDate = arrivalDate;
		}

		public List<Ticket> getTickets() {
			return tickets;
		}

		public void setTickets(List<Ticket> tickets) {
			this.tickets = tickets;
		}


}
