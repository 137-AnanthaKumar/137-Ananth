package smallshop;
import java.util.Scanner;
public class main {
	  public int num_page;
	  
	public static void main(String[] args) {
		int i=0;
		int result=0;
        do {  
		Scanner sc=new Scanner(System.in);
           System.out.println("What to you want? PrintOut or Xerox or ColorPrint");
           String st=sc.nextLine();
           System.out.println("No of Page:");
    	   Integer num_page=sc.nextInt();
    	
           if(st.equals("PrintOut")) {
        	  
    
        	   
        	   Printout ob=new Printout();
        	   result=ob.Prize1(num_page);
        	   System.out.println("totalCost " +ob.Prize1(num_page));
        	  
        	   
           }
           else if(st.equals("Xerox")) {
        	   Printout ob=new Printout();
        	   result=ob.Prize2(num_page);
        	   System.out.println("totalCost " +result);
        	   
           }
           else if(st.equals("ColorPrint")) {
        	   Printout ob=new Printout();
        	   result=ob.Prize3(num_page);
        	   System.out.println("totalCost " +result);
        	   
	}
           else {
        	   System.out.println("Input Error");
        	 
           } 
           i++;
           
           
           
           if(result !=0 ) {
        	   DbHelper dbHelper=new DbHelper();
        	   dbHelper.insertData(st,num_page, result);
           }
           }
         while(i<6);
           
          
           

}}

