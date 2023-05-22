package com.ftb.service;

import com.ftb.model.Passenger;

public class PassengerService {
	
private static String EMPLOYEE_ID = "100";
	
	public Passenger createPassenger(String id, String name, String email, String age, String gender)
	{
		Passenger passenger = new Passenger(id,name,email,age,gender);
		return passenger;
	}
	public Passenger createPassenger(String name, String email, String age, String gender) {
		
		EMPLOYEE_ID = String.valueOf(Integer.parseInt(EMPLOYEE_ID)+1);
		Passenger passenger = new Passenger(EMPLOYEE_ID,name,email,age,gender);
		
		return passenger;
	}
}
