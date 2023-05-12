package com.ftb.model;

public class Airport {
	
	private String airportID;  
    private String city;
    private String country;

    public String getAirportId() {
		return airportID;
	}
	public void setAirportId(String airportID) {
		this.airportID = airportID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public Airport(String airportID, String city, String country)
	{
		this.airportID = airportID;
		this.city = city;
		this.country = country;
	}
}
