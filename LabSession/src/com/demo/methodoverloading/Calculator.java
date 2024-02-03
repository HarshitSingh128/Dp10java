package com.demo.methodoverloading;
//You have to build a loan calculator.
//If a single rate of interest is provided then it is a housing loan 
//and loan is principal amount * (100 + rate) 
//If two values are provided then it is a commercial loan 
//and loan is principal amount * (value 1 + value 2 +100)

import java.util.Scanner;

class CalculatorTest{
	private double principalAmount;
   private double loanAmount;
   public CalculatorTest() {
	   
   }
   public CalculatorTest(double principalAmount) {
	   this.principalAmount=principalAmount;
   }
  
   public String loanAmount(double rate) {
	   loanAmount=principalAmount*(100+rate);
	   return "Housing loan:"+loanAmount;
	   
   }
   public String loanAmount(double rate1,double rate2) {
	   loanAmount=principalAmount*(100+rate1+rate2);
	   return "Commercial loan:"+loanAmount;
   }
	
}
public class Calculator {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		CalculatorTest c1=new CalculatorTest(10000);
	     System.out.println(c1.loanAmount(0.08));
		System.out.println(c1.loanAmount(0.08,0.05));
	}
	

}
