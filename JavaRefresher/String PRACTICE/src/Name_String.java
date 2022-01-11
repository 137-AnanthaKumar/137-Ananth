import java.util.Scanner;


public class Name_String {

	public static void main(String[] args) {
		boolean flag=true;
		do {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter your name: ");
		    String name=sc.nextLine();
			System.out.println(name.length());
			//while (true){
			Scanner input=new Scanner(System.in);
			System.out.println("If you want check again click YES OR NO");
			String ans=input.nextLine();
		
			if (ans.equalsIgnoreCase("NO")){
			flag=false;}
			
				
		}while(flag);
			System.out.println("ended");
		}
	
	}
		



