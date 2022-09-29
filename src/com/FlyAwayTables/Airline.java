package com.FlyAwayTables;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



public class Airline {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="airline_id")
	private long airlineid;
	
	@Column(name="airline")
	private String airline;
	
	@OneToMany(mappedBy="airline")
	private Set<Flights> flights;

	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airline(String airline, Set<Flights> flights) {
		super();
		this.airline = airline;
		this.flights = flights;
	}

	public long getAirlineid() {
		return airlineid;
	}

	public void setAirlineid(long airlineid) {
		this.airlineid = airlineid;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public Set<Flights> getFlights() {
		return flights;
	}

	public void setFlights(Set<Flights> flights) {
		this.flights = flights;
	}
	
	
}
