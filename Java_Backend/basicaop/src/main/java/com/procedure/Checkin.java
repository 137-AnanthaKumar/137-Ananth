package com.procedure;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class Checkin {
	@Before("execution(* com.marticus.auth.Authenticate.login(..))")
	public void checkIP()
	{
		
		System.out.println("IP is OK");
		
	}
	@After("execution(* com.marticus.auth.Authenticate.logout(..))")
	public void ipCheckPostLogin()
	{
		
		System.out.println("IP Check Post Login is OK");
		
	}
}
