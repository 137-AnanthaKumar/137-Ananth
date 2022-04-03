package CoreCode;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=1;
		do{
			int i ;
			System.out.println("Enter ");
			i=sc.nextInt();
			int j=0;
			while(i>j) {
				int h = new Random().nextInt(900000) + 100000;
				System.out.println(h);
				
				j++;
			}
			k++;
			
		}
		while(5>k);
		
		
		
	}

}
