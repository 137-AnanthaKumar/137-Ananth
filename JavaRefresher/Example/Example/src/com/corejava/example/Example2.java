//constructor example
package com.corejava.example;


public class Example2 // extends Myclass 
{            
	int eno; //0 100       
	String ename; //null Ravi       
	double sal;// 0.0 //5500          
	
	public   Example2() {         
		System.out.println("Default Constructor");         
		}                       
  
	
	public   Example2(int eno,String ename,double sal) {                    
		eno=eno;            
		ename=ename;            
		sal=sal;                  
		}         
	public void display() {         
		System.out.println("employee no :"+eno);        
		System.out.println("Emploiye NBame :"+ename);        
		System.out.println("Employee Sal :"+sal);     
		}    
	
	public static void main(String[] args) {                  
		new Example2();     
		Example2 emp2=    new Example2(100,"Ravi",5500);       
		emp2.display();              
} 
} 