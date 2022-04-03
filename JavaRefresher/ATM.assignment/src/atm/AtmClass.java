package atm;
import java.util.Scanner;
import transaction.Transaction;
////note :  SAVED ACCOUT NO: 3441000012,3441000013--------------------
public class AtmClass {
	public static void main(String[] args) {
		System.out.println("-----------------------------------");
	int i=0;
	do {
		Transaction transaction=new Transaction();
	
		Scanner sc=new Scanner(System.in);
		System.out.println("WITHDRAW MONEY :: ENTER : 1"+"\nMONEY DEPOSIT  :: ENTER : 2");
		Integer responce=sc.nextInt();
		if(responce==1) {
			System.out.println("-----------------------------------");
			System.out.println("PROCESSING WITHDRAW MONEY PLEASE WAIT.....");
			
			transaction.withdrawStart(); 
		   }
		else if(responce==2) {
			System.out.println("-----------------------------------");
			System.out.println("PROCESSING MONEY DEPOSIT PLEASE WAIT.....");
			transaction.depositStart();
	    
	     }
		 else {
	    	 System.out.println("ENTER A VALID KEY");
	    	 System.out.println(""
	    	 		+ "-------TRY AGAIN------");
	    	 }
		  i++;
	
	}
	while(i<4);
	System.out.println("PLESE TAKE YOUR CARD AND RE-INSERT");
	}
////note :  SAVED ACCOUT NO: 3441000012,3441000013--------------------
////note :  SAVED ACCOUT NO: 3441000012,3441000013--------------------
////note :  SAVED ACCOUT NO: 3441000012,3441000013--------------------

}


