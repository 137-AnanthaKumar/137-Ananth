package com.marticus.reservation.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect

public class Checkid {
	@Before("execution(* com.marticus.Reservation.checkin(..))")
	public void procedure(JoinPoint joinPoint) {
		System.out.println("If you complete your register. You can check in");
	}
	
	@After("execution(*  com.marticus.Reservation.checkout(..))")
	public void procedure1(JoinPoint joinPoint) {
		System.out.println("If you complete your register. You can check out (after)");
	}
	


}
	