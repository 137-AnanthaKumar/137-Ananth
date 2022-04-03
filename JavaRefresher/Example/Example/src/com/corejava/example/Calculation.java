//Encapsulation
package com.corejava.example;

public class Calculation {

	int a=10;
	int b=20;
	int c;
	public void addition() {
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Calculation cal= new Calculation();
		cal.addition();
	}
}
