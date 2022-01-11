package aspect;

import java.util.Scanner;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspact {
	@Before("execution(* procedure.Proceed.Checkin(..))")
	public void checkID()
	{
		
		System.out.println("--------------------");
		System.out.println("We want Your Id proof");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your ID Type ");
		String Type_of_ID=sc.nextLine();
		System.out.println("Enter Your ID  No");
		Integer Id_No=sc.nextInt();
		System.out.println("Your Id type:"+ Type_of_ID+ " ** Your Id no "+ Id_No);
		System.out.println("we are checking your Id proof");
		System.out.println("--------------------");
		
	}
	@Before("execution(* procedure.Proceed.Checkin(..))")
	public void checkVACC() {
		System.out.println("-----------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your   Vacc no");
		Integer Vacc_No=sc.nextInt();
		System.out.println("Your Vacc no:"+ Vacc_No);
        System.out.println("we are validating your vaccination certification");
		System.out.println("-----------------------");
	}
	@Before("execution(* procedure.Proceed.Checkout(..))")
	public void Roomsts() {
		System.out.println("-----------------------");
		System.out.println("we are serching room availability status..please stil wait....");
		System.out.println("-----------------------");
	}
}
