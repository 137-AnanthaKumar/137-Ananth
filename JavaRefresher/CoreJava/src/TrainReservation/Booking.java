package TrainReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
	
	private String passengerName;
	private int passengerAge;
	private String from;
	private String to;
	Scanner sc=new Scanner(System.in);
	public Booking(String passengerName, int passengerAge, String from, String to) {
		
		

		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.from = from;
		this.to = to;
	}
	
	
	
	public Booking() {
		System.out.println("Enter Your Name :");
		passengerName=sc.nextLine();
		System.out.println("Enter Your Age :");
		passengerAge=sc.nextInt();
		System.out.println("Enter From :");
		from=sc.nextLine();
	}



	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}



	public void displayBusinfo(ArrayList<Booking> booking) {
		System.out.println("PASSENGER NAME :"+passengerName+" PASSENGER AGE "+passengerAge);
		
	}
	
	

}
