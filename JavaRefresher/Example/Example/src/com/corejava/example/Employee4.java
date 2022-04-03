//this and super keyword in constructor
package com.corejava.example;

class Myclass  { 
	public Myclass() {
		
	}               
	public Myclass(int eno) {
		System.out.println("My class Emp No :"+eno);        
		}                 
	} 

public class Employee4 // extends Myclass 
{            
	int eno; //0 100       
	String ename; //null Ravi       
	double sal;// 0.0 //5500          
	
	public   Employee4() {         
		System.out.println("Default Construcotrfffff");         
		}                       
	                  //   100      Ravi           5500     
	
	public   Employee4(int eno,String ename,double sal) {         
//		super(eno);            
		this.eno=eno;            
		this.ename=ename;            
		this.sal=sal;                  
		}         
	public void display() {         
		System.out.println("employee no :"+eno);        
		System.out.println("Emploiye NBame :"+ename);        
		System.out.println("Employee Sal :"+sal);     
		}    
	
	public static void main(String[] args) {                  
		new Employee4();     
		Employee4 emp2=    new Employee4(100,"Ravi",5500);       
		emp2.display();              
} 
} 