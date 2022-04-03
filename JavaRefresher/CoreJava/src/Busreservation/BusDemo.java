package Busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();

		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,45));
		int userOpt=1;
		Scanner sc=new Scanner(System.in);
  
		for(Bus b:buses) {
			b.displayBusinfo();
		}
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to Exit");
			userOpt=sc.nextInt();
			if(userOpt==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("Your  Booking is Confiremed");
				}
				else {
					System.out.println("Sorry...Bus Fulled..");
				}
				
			}
			else if(userOpt==2) {
				System.out.println("Exited");
			}
			else if(userOpt !=1 && userOpt !=2) {
				main(args);
			}
		}
		

	}

}
