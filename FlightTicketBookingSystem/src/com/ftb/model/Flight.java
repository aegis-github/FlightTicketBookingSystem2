package com.ftb.model;

public class Flight {
	
	private String flightNumber;
	private String flightName;
    private String capacity;
    private String status;
    
    public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName=flightName;
	}
	public String getFlightCapacity() {
		return capacity;
	}
	public void setFlightCapacity(String capacity) {
		this.capacity=capacity;
	}
	public String getFlightStatus() {
		return status;
	}
	public void setFlightStatus(String status) {
		this.status=status;
	}
	public Flight(String flightNumber, String flightName, String capacity, String status)
	{
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.capacity = capacity;
		this.status = status;
	}
}
