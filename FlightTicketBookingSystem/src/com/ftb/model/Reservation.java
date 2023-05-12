package com.ftb.model;

public class Reservation {
	
	private String name;
	private String reservationNumber;
	private String noOfPassengers;
	private String flightNumber;
	private String departuredate;
	private String reservedSeats;
	private String classtype;
	private String departureplace;
	private String destination;
	private String price;
	
	public String getName() {
			return name;
	}
	public void setName(String name) {
			this.name = name;
	}
	public String getReservationNumber() {
		return reservationNumber;
	}
	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
	public String getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(String noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDeparturedate() {
		return departuredate;
	}
	public void setDeparturedate(String departuredate) {
		this.departuredate = departuredate;
	}
	public String getReservedSeats() {
		return reservedSeats;
	}
	public void setReservedSeats(String reservedSeats) {
		this.reservedSeats = reservedSeats;
	}
	public String getClasstype() {
		return classtype;
	}
	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}
	public String getDepartureplace() {
		return departureplace;
	}
	public void setDepartureplace(String departureplace) {
		this.departureplace = departureplace;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Reservation(String name, String reservationNumber, String noOfPassengers, String flightNumber, String departuredate, String reservedSeats, String classtype, String departureplace, String destination, String price)
	{
		this.name = name;
		this.reservationNumber = reservationNumber;
		this.noOfPassengers = noOfPassengers;
		this.flightNumber = flightNumber;
		this.departuredate = departuredate;
		this.reservedSeats = reservedSeats;
		this.classtype = classtype;
		this.departureplace = departureplace;
		this.destination = destination;
		this.price = price;
	}
}
