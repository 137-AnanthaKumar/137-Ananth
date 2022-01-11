import java.util.Scanner;
public class Mrthod_overriding {
	int a;
	int b;
	int c;
	int e;
	int f;
	int g;
	public void add(int a, int b, int c, int d)  {
		int add=a+b+c+d;
		System.out.println("YOUR ADDED :" + add);
		
	}
	public void add(int b, int d) {
		int add=b+d;
		System.out.println("YOUR MULTIBLE VALUE "+add);
	}
	public void add(int e, int f ,int g) {
		int add=e+f+g;
		System.out.println("your devition value : " + add);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a :");
		Integer a=sc.nextInt();
		System.out.println("enter value of b :");
		Integer b=sc.nextInt();
		System.out.println("enter value of c :");
		Integer c=sc.nextInt();
		System.out.println("enter value of d :");
		Integer d=sc.nextInt();
		System.out.println("enter value of e :");
		Integer e=sc.nextInt();
		System.out.println("enter value of f :");
		Integer f=sc.nextInt();
		Mrthod_overriding  Mo=new Mrthod_overriding();
		Mo.add(a,b,c,d);
		Mo.add(b,d);
		Mo.add(e, f, 10);
		

	}

}
