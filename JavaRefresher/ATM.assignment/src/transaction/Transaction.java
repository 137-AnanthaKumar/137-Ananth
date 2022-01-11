package transaction;

import java.util.Scanner;

import bankdata.Bankdata;

public class Transaction {
	//static int depositamount;
	
	
    Scanner sc=new Scanner(System.in);
	public void withdrawStart() {
	   
	   System.out.println("-------------------------------------");
	   System.out.println("PLEASE ENTER YOUR 10 DIGIT ACCOUNT NUMBER");
	   Long account_no=sc.nextLong();
	   System.out.println("PLEASE ENTER WITHDRAW AMOUNT");
       Integer withdrawamount=sc.nextInt();
       if(account_no!=null && withdrawamount!=null) {
         Bankdata bankdata=new Bankdata();
	     bankdata.Withdraw(account_no,withdrawamount);
	   
       }
       else {
    	   System.out.println("MAKE SURE YOUR INPUT");
       }
//	
//	   if(a==1) {
//		   System.out.println("PLEASE ENTER WITHDRAW AMOUNT");
//		   Integer withDrawAmount=sc.nextInt();
//		   
//		   
//	   }
//	   else if(a==2) {
//		   System.out.println("PLEASE RE-CHECK YOUR ACCOUNT NUMBER");
//	   }
	   
	}
	public void depositStart() {
		   System.out.println("-------------------------------------");
		   System.out.println("PLEASE ENTER YOUR 10 DIGIT ACCOUNT NUMBER");
		   Long account_no=sc.nextLong();
		 
	      System.out.println("-----------------------------------");
	       if(account_no!=null ) {
	    	   //System.out.println("YOUR DEPOSIT AMOUNT "+depositamount);
	    	   Bankdata bankdata=new Bankdata();
	  		   bankdata.Deposit(account_no);
	         } 
	       
	     
		 
	}
	
	
}
