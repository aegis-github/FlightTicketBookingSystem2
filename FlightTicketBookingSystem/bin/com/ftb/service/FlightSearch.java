package com.ftb.service;

import java.util.*;

import com.ems.exception.InvalidFlightSearchException;
//import com.ems.model.Employee;
import com.ftb.model.Flight;

public class FlightSearch {
	
	private static String FLIGHT_ID;
	
	static {
		FLIGHT_ID = "100";
		System.out.println(FLIGHT_ID);
	}
	
	public void InvalidEmployeeException(String msg) {
	}
	
	public Flight createflight(String flightNumber, String flightName, String capacity, String status)
	{
		Flight flight = new Flight(flightNumber, flightName, capacity, status);
		return flight;
	}
	
	List<Flight> flightList = new ArrayList<>();
	
	public boolean createflight(String flightName, String capacity, String status)
	{
		FLIGHT_ID = String.valueOf(Integer.parseInt(FLIGHT_ID)+1);
		Flight flight = new Flight(FLIGHT_ID, flightName, capacity, status);
		flightList.add(flight);
		return true;
	}
	
	public Flight createflight(Flight flight)
	{
		return flight;
	}
	
	public Flight getFlight(String flightNumber) throws InvalidFlightSearchException
	{
		for(Flight ft : flightList)
		{
			if(ft.getFlightNumber().equalsIgnoreCase(flightNumber))
			return ft;
		}
		throw new InvalidFlightSearchException("Invlid Flight-Number");
	}
}
