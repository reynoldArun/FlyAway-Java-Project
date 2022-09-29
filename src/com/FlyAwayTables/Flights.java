package com.FlyAwayTables;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="flights")
public class Flights {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="flight_no")
	private long flightNo;
	
	@Column(name="flight_name")
	private String flightName;
	
	@Column(name="source")
	private String source;
	
    @Column(name="destination")
	private String destination;
	
    @Column(name="date_of_departure")
	private Date dateOfDeparture;
	
	@Column(name="date_of_arrival")
	private Date dateOfArrival;
	
	@ManyToOne()
	@JoinColumn(name="airline_id", nullable=false)
	private Airline airline;
	
	@ManyToMany(mappedBy = "flights")
	Set <Person> persons;

	public Flights() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flights(String flightName, String source, String destination, Date dateOfDeparture, Date dateOfArrival,
			Airline airline, Set<Person> persons) {
		super();
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.dateOfDeparture = dateOfDeparture;
		this.dateOfArrival = dateOfArrival;
		this.airline = airline;
		this.persons = persons;
	}

	public long getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(long flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
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

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Date getDateOfArrival() {
		return dateOfArrival;
	}

	public void setDateOfArrival(Date dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}
	
	
	
}
