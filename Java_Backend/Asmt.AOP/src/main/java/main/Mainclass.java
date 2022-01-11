package main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marticus.Reservation;
import com.marticus.ReservationImpl;
import procedure.Proceed;

public class Mainclass {
	
	public static void main(String[] args)  {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");
	    ReservationImpl res=(ReservationImpl) appContext.getBean("reserimpl");
	  
	        res.Name();
	        res.Age();
	        Proceed pro=(Proceed) appContext.getBean("proceed");
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Checkin or Checkout ");
	    String we=sc.nextLine();
	    
	    if(we.equals("Checkin")) {    
	    System.out.println("*************");
        pro.Checkin();
        
	    }
	    
	    else if(we.equals("Checkout")) {
        System.out.println("*************");
        pro.Checkout();
	    }
       
         
	}

}
