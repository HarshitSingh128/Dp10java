package com.demo.basicdemo2;

import java.util.Scanner;

public class Agetestusingthrow {
	static void agetest() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter age:");
		int age =sc.nextInt();
		try {
		if(age<0) {
			throw new RuntimeException(" Age cannot be zero");
		}
		else {
			if(age>=18) {
				System.out.println("vote ");
			}
			else {
				System.out.println("canot vote ");
			}
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest code");
		
	}

	public static void main(String[] args) {
		agetest();
		

	}

}
