package Busreservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {

	
	 String passengerName;
	 int busNo;
	 Date date;

	public Booking()  {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter name of passenger : ");
		passengerName=sc.nextLine();
		System.out.println("ENter Bus No : ");
		busNo=sc.nextInt();
		System.out.println("ENter date dd-mm-yyyy : ");
		String dateInput=sc.next();
	    SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");  
	    
	    try {
			date= formatter.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}


		this.passengerName = passengerName;
		this.busNo = busNo;
		this.date = date;
	}

	


	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int csapacity=0;
		for(Bus bus:buses) {
			
			if(bus.getBusno()==busNo) {
				csapacity=bus.getCapacity();
			}
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.busNo==busNo &&b.date.equals(date)) {
				booked++;
			}
		}
		return booked<csapacity?true:false;
		
	}
}
