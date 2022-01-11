package com.marticus;

import org.springframework.stereotype.Component;

@Component("akila")
public class Second {

	public void sayHello()
	{
		
		System.out.println("Hello from Injected bean!!!");
		
	}
	public String aki() {
		String aki="5 years";
		System.out.println("amazing"+aki);
		return aki;
	}
	
}
