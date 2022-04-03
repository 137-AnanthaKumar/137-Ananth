package Example1;

public class ClassAA extends ClassA {
	
	public int addition(int a,int b, int c) {
		result=a+b+c;		
		return result;
	}
	
	public String sentence(int a,int b,String c) {
		ClassA obj=new ClassA();
		int result=obj.addition(a, b);
		int m=addition(2,result,6);
		System.out.println(m);
	
		String val="Addition of TWO NuMBERS "+result+" done";
		return val;
		
		
	}

}
