package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marticus.Reservation;
import com.marticus.Reservationimpl;
import com.marticus.checks.Checks;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring_checks.xml");
		//Reservation rese=(Reservation)appContext.getBean("reservecall");
		
	//	rese.passenger();
		
		Checks ck=(Checks)appContext.getBean("Chek");
		ck.checkin();

	}

}
