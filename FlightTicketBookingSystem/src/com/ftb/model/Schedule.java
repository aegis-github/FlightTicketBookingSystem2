package com.ftb.model;

public class Schedule {
	
	private String departureDate;
    private String arrivalDate;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;
    private String arrivalTime;

    public String getDepartureDate() {
		return departureDate;
    }
    public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
    }
    public String getArrivalDate() {
		return arrivalDate;
    }
    public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
    }
    public String getDepartureAirport() {
		return departureAirport;
    }
    public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
    }
    public String getDestinationAirport() {
		return destinationAirport;
    }
    public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
    }
    public String getDepartureTime() {
		return departureTime;
    }
    public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
    }
    public String getArrivalTime() {
		return arrivalTime;
    }
    public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
    }
    public Schedule(String departureDate, String arrivalDate, String departureAirport, String destinationAirport, String departureTime, String arrivalTime)
	{
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureAirport = departureAirport;
		this.destinationAirport = destinationAirport;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
}
