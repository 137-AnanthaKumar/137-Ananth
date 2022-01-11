//Constructor()
class Employee{
	private String name;
	private int id;
	Employee(){
		name="ak";
		id=1999;
	}
	Employee(String name1, int id1){
		name=name1;
		id=id1;
		
		
	}
	public void empinfo() {
		System.out.println("emp name :"+name);
		System.out.println("emp id : " +id); 
	}
}
public class Constructor {
	

	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee emp1=new Employee("kumar",2000);
		emp1.empinfo();
		emp.empinfo();
		
	}

}
