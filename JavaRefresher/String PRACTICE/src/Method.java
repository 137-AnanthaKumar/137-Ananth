//METHOD------BLOCK OF CODE THAT PERFORM A SPECIFIC TASK
import java.util.Scanner;
public class Method {
	int num1;      ///INSTANCE VAREIABLE TO ACCESS DIFFERENT METHODS
	int num2;
	Method(){//CONSTRUCTOR
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR FIRST MARK: ");
	num1=sc.nextInt();
	System.out.println("ENTER YOUR SECOND MARK:");
    num2=sc.nextInt();
	}
	
	public int addnum() {
		
		int Total=num1+num2;
		System.out.println("SUM OF TWO MARK IS :" + Total);
		return Total;

	}
	public int mulnum() {
		int Tota=num1*num2;
		System.out.println("MULTIPLICATION OF TWO MARK IS :" + Tota);
		return Tota;
	}

	public static void main(String[] args) {
		Method M1=new Method();
		M1.addnum();
		M1.mulnum();// TODO Auto-generated method stub

	}

}
