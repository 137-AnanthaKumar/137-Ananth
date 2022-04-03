package Example1;

public class MainClassA {

	public static void main(String[] args) {
		
		ClassAA obj=new ClassAA();
		int c=obj.addition(67, 6);
		int d=obj.sub(20, 6);
		
		boolean f=obj.re(c, d);
		if(f) {
		String result=obj.sentence(4, 6, "HELLO ANANTH ");
		System.out.println("String Result "+result );
		
		}
		else {
			System.out.println("FAiled to Load");
		}
		
		
		System.out.println("======================");
	


		

	}

}
