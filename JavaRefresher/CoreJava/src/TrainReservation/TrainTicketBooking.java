package TrainReservation;

import java.util.ArrayList;
import java.util.Scanner;

import Busreservation.Bus;

public class TrainTicketBooking {

	public static void main(String[] args) {
		ArrayList<Train> train=new ArrayList<Train>();
		ArrayList<Booking> booking=new ArrayList<Booking>();
        train.add(new Train(12662, "Pothigai", "ac", "nonAc", 200));
		train.add(new Train(16011, "kollem", "ac", "nonAc", 200));
		Scanner sc=new Scanner(System.in);
		
	    int userInput=1;
	    while(userInput==1) {
	    	System.out.println("Enter Your Choise 1 to view Availabilty , 2 to book , 3 to existingPassenger");
	        userInput=sc.nextInt();
	    	if(userInput==1) {
	    		for(Train t:train) {
	    			
	    			t.displayBusinfo(train);
	    			userInput=1;
	    			
	    	      
	    		}
	    	}
	    	//Booking
	    	else if(userInput==2) {
	    		Booking book=new Booking();
	    		Train tr=new Train();
	    		tr.train(train);
	    		
	    		
	    		booking.add(book);
	    		userInput=1;
	    	}
	    	else if(userInput==3) {
	    		 for(Booking b:booking) {
		    			
		    			b.displayBusinfo(booking);
		    			userInput=2;
		    			}
                  
	    	}
	    }
		

	}

}
