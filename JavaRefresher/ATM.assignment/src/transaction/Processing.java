package transaction;

import java.util.ArrayList;
import java.util.Scanner;

import bankdata.Bankdata;

public class Processing {
	Scanner sc=new Scanner(System.in);
	 ArrayList account1=new ArrayList();
	 ArrayList account2=new ArrayList();
			 int currentbalance=10000;
			 int Availbalance;
//	public Processing(){
//		
//	    account1.add(1,currentbalance);
	public  void WithdrawProceed(Long acc_no,int withdrewmoney) {
		//int Availbalance;
		if(withdrewmoney>0 && withdrewmoney<currentbalance && withdrewmoney%100==0) {
			Availbalance=currentbalance+withdrewmoney;
			System.out.println("YOUR WITHDRAW IS SUCESSFULL :"+ "Your Available Balance "+Availbalance );
			
			
        	}
		else if(withdrewmoney>currentbalance) {
			System.out.println("TRANSACTION FAILED ! INSUFFICIANT BALANCE FOR THIS WITHDRAWAL");
		}
		else if( withdrewmoney%100!=0 ){
			
			System.out.println("INVALID AMOUNT. WE CAN ONLY PROVIDE 100,200,500,2000 NOTES ONLY ");
			//return a;
		}
		else if(withdrewmoney>currentbalance ) {
		    System.out.println("-------------------------------------");
			System.out.println("INSUFFICIANT BALANCE");
		}
		else if(withdrewmoney<0) {
			  System.out.println("INVALID AMOUNT");
		}
		
		
		
	}
	
	
	
	public void depositPROCEED() {
		//int depositamount;
		 System.out.println("ENTER HERE-- How many 100 RS You are Inserted ");
	       Integer hun=sc.nextInt();
	       System.out.println("ENTER HERE-- How many 200 RS You are Inserted");
	       Integer two=sc.nextInt();
	       System.out.println("ENTER HERE-- How many 500 RS You are Inserted");
	       Integer five=sc.nextInt();
	       System.out.println("ENTER HERE-- How many 2000 RS You are Inserted");
	       Integer twot=sc.nextInt();
	       int depositamount=((100*hun)+(200*two)+(five*500)+(twot*2000));
		   if(depositamount<50000) {  
			  Availbalance=currentbalance+depositamount;
			  System.out.println("----------------");
			  System.out.println("YOUR DEPOSIT AMOUNT :"+depositamount);
			  System.out.println("MONEY DEPOSIT SUCESSFULLY..... YOUR AVAIL BALANCE : "+Availbalance);
		      System.out.println("-------------------------------------");
		  }
	       else if(depositamount>50000 ){
    	  
		  System.out.println("YOU INSERTED "+ depositamount +"YOU CAN DEPOSIT MAX 500000");
		  System.out.println("PLEASE RETAKE YOUR MONEY");
		 
			 }
	
	}
	
}
