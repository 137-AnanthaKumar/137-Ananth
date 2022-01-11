package bankdata;

import java.util.ArrayList;
import java.util.Scanner;

import transaction.Processing;

public class Bankdata {
	
	static int balance=10000;
	Scanner sc=new Scanner(System.in);
	
	
	 
	 Processing proceed=new Processing();
	 
	public void Withdraw(Long account_no, int withdrawamount ) {
		final long AccountNum_1=3441000012L;
		final long AccountNum_2=3441000013L;
		ArrayList AccountNumbers=new ArrayList();
	    AccountNumbers.add(AccountNum_1);
	    AccountNumbers.add(AccountNum_2);  
	    int withdrewmoney=withdrawamount;
	    long acc_no=account_no;
	     if(AccountNumbers.contains(account_no)){
	   	     proceed.WithdrawProceed(acc_no,withdrewmoney);
	   	      }
	     else {
	    	 System.out.println("-----------------------------------");
	    	 System.out.println("PLEASE RE-CHECK YOUR ACCOUNT NUMBER");
	     }
	}
	public void Deposit(Long account_no) {
		final long AccountNum_1=3441000012L;
		final long AccountNum_2=3441000013L;
		ArrayList AccountNumbers=new ArrayList();
	    AccountNumbers.add(AccountNum_1);
	    AccountNumbers.add(AccountNum_2);  
	   // int depositmoney=depositamount;
	    long acc_no=account_no;
	    if(AccountNumbers.contains(account_no)) {
	    	 System.out.println("PROCEESING YOUR REQUEST....");
	         proceed.depositPROCEED();
	    	 
	    }
	    else {
	    	 System.out.println("-----------------------------------");
	    	 System.out.println("PLEASE RE-CHECK YOUR ACCOUNT NUMBER");
	    	 System.out.println("------TRY AGAIN-------");
	     }
	}
	
}
//if(a==1) {
//	  System.out.println("PLEASE ENTER DEPOSIT AMOUNT");
//	  Integer depositAmount=sc.nextInt();
//}
//else if(a==2) {
//	 
//}