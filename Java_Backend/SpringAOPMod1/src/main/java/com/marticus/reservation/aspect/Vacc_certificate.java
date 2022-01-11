package com.marticus.reservation.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Vacc_certificate {
	@Before("execution(* com.marticus.Reservaation.authorno(..))")
	public void procedure() {
		System.out.println("Above author is yours");
	}
	
	@After("execution(* com.marticus.Reservaation.authorno(..)")
	public void procedure1() {
		System.out.println("below author is yours");
	}
	
    
}
