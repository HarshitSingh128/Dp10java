package com.demo.exceptionbasic;

import java.io.IOException;
import java.util.Scanner;

public class PropagateDemo {
	
	static void agetest()throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name" );
		String name=sc.next();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		try {
		if(age<=18) {
			throw new IOException("Age is not below than 18");
		}
		if(age>18) {
			System.out.println("vote ");
		}
		else {
			System.out.println("Canot vote");
		}
		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		finally {
		System.out.println("Rest code ");
		}
	}

	public static void main(String[] args) {
		 try {
			agetest();
		} catch (IOException e) {
			
		System.out.println(e);
		}
	

	}

}
