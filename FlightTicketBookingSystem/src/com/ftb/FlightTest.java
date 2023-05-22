import java.util.*;

import com.ems.exception.InvalidFlightSearchException;
import com.ftb.model.Flight;
import com.ftb.service.FlightSearch;

public class FlightTest
{
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		FlightSearch f1 = new FlightSearch();
		String prompt="";
		do {
			System.out.println("Enter Flight Name : ");
			String flightName = in.nextLine();
			System.out.println("Enter Flight Capacity : ");
			String capacity = in.nextLine();
			System.out.println("Enter Flight Status : ");
			String status = in.nextLine();
			f1.createflight(flightName, capacity, status);
			
			System.out.println("Do you want to continue : (y/n)");
			prompt = in.nextLine();
		}while(prompt.equalsIgnoreCase("y"));
		
		do {
			try {
				System.out.println("Enter Flight Id to search : ");
				Flight ft = f1.getFlight(in.nextLine());
				System.out.println(ft);
			}catch(InvalidFlightSearchException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("Do you want to continue : (y/n)");
			prompt = in.nextLine();
		}while(prompt.equalsIgnoreCase("y"));
	}

}
