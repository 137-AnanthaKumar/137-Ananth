//method overloading
package com.corejava.example;

public class LoginMessage {
	public void  userLogin(String username,String password)     {
		System.out.println("Username :"+username);         
		System.out.println("Password :"+password);     
		}          
	
	public int   userLogin(int mobile,String password)     {
		System.out.println("Username :"+mobile);         
		System.out.println("Password :"+password);         
		return mobile;    
		}     
	
	public void  userLogin(String username,String password,String cap)     {
		System.out.println("Username :"+username);         
		System.out.println("Password :"+password);         
		System.out.println("Cap :"+cap);     
		}     
	
	public static void main(String[] args) {
		LoginMessage  mylogin=new LoginMessage();              
		mylogin.userLogin("Ramesh", "Ramesh123");           
		int t=   mylogin.userLogin(97779098,"Ravi123");              
		mylogin.userLogin("Raj","Raj123", "abc");     
	
	} 
	}
