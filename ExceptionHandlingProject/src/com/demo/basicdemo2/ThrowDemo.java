package com.demo.basicdemo2;

import java.util.Scanner;



public class ThrowDemo {
	static void entermarks() {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter name:");
		String name=sc.next();
		System.out.println("Enter marks :");
		double marks=sc.nextDouble();
		//explicitly we are throwing an exception
		//we need to create instance of exception
		try {
		if(marks<0 || marks>100) {
			throw new RuntimeException("Invalid Marks: marks should be in between 0 to 100:");
		}
		else {
			if(marks>=33) {
				System.out.println(name+" has cleared the exam");
			}
			else {
				System.out.println(name+" has failed");
			}
		}
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		System.out.println("Rest Code ");
		
	}

	public static void main(String[] args) {
		entermarks();
	
	}

}
