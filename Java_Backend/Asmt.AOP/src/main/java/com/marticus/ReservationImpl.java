package com.marticus;

import java.util.Scanner;

public class ReservationImpl implements Reservation {

	public String name;
	public int age;

	public String Name() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("hi "+ name );
		return name;
	}

	public int Age() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age");
	    Integer age=sc.nextInt();
	    System.out.println("your age: "+ age);
		return age;
	}

}
