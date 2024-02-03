package com.demo.interfacedemo;
//Create an interface to pay any amount . It can be used by employee or celebrity to pay the tax a
//and by a student to pay the fees
//Use the concept of functional interface here
interface Tax{
	double tax(double tax); 
      }
class Employee1 implements Tax{
	double tax=20;
	double Tax;
	

	@Override
	public double tax(double income) {
		System.out.println("You are an Employee you have to pay 20% tax");
		return  Tax=income-tax;
	}
	
}
class Celebrity implements Tax{
	double tax=0.4;

	@Override
	public double tax(double income) {
		System.out.println("You are Celebrity you have to 40% tax");
		
		return income*tax;
	}
	
}
class Student1 implements Tax{

	@Override
	public double tax(double fees) {
		System.out.println("You are Student You have to pay your fees ");
		return fees;
	
	}
	
}

public class TaxDemo {
	

	public static void main(String[] args) {
		Tax t;
		t=new Employee1();
		t.tax(20000);
		double Tax;
		//System.out.println("Your tax amount is :"+Tax);
		
		

	}

}
