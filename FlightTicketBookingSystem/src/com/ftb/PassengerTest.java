import java.util.Scanner;

import com.ftb.model.Passenger;
import com.ftb.service.*;

public class PassengerTest {
	
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	String prompt;
	do {
	System.out.println("Please Enter Passenger Id : ");
	String id = in.nextLine();
	System.out.println("Please Enter Passenger Name : ");
	String name = in.nextLine();
	System.out.println("Please Entet Passenger Email : ");
	String email = in.nextLine();
	System.out.println("Please Entet Passenger Age : ");
	String age = in.nextLine();
	System.out.println("Please Entet Passenger Gender : ");
	String gender = in.nextLine();
	
	PassengerService service = new PassengerService();
	Passenger passenger1 = null;
	
	passenger1 = service.createPassenger(id,name,email,age,gender);
	System.out.println("Welcome : "+passenger1.getName());
	
	passenger1 = service.createPassenger(id,name,email,age,gender);
	System.out.println("Do you want to continue : (y/n)");
	prompt = in.nextLine();
	}while(prompt.equalsIgnoreCase("y"));
	}

}
