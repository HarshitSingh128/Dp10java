package com.demo.constructorAssignment;
//1. Create a class Account with member Variable: long accountNo, String customerName.
//Make them public.
//2. In main, create a new object of the Account class and print the member variables value.
//Note – Default constructor is provided by Java to facilitate the creation of a new object.
//Here variables are assigned default values
//3. Create default constructor assign new value to all variables. Write SOP I am in default
//constructor
//4. In main, create another object of the Account class and print the member variables
//value. Note – Since you have defined a (default) constructor, Java does not provide
//another one.
//5. Define a constructor which takes all arguments and assigns those values to the member
//variables. SOP I am in parameterized constructor
//6. In main, to create another object of the Account class using the constructor with all
//arguments and print the member variable values.
//7. In main method, create 2 Account objects with different account numbers and names.


 class Account {
	long accounNo;
	String customerName;
	Account(){
		 accounNo=415786;
		 customerName="Pooja";
		 System.out.println("Default constructor");
	}
	
	Account(long accounNo,String customerName){
		this.accounNo=accounNo;
		this.customerName=customerName;
		System.out.println("I am in parametrised constrctor");
		
	}
	public void displaydata() {
		System.out.println("AccountNumber:"+accounNo);
		System.out.println("CustomerName:"+customerName);
		
	}
	public String toString() {
		return "Account"+accounNo+" "+customerName;
		
	}
	

}
    public class TestAccount{
    	public static void main(String[] args) {
    		Account a1=new Account();
    		a1.displaydata();
    		Account a2=new Account(1454746,"Sunil");
    		System.out.println(a2);
    		
    		
			
		}
    	
    }
