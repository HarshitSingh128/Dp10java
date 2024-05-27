
package com.demo.basicdemo;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your age:");
			int age=sc.nextInt();
			if(age>=18) {
				System.out.println("vote");
			}
			else {
				System.out.println("Canot vote ");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			sc.close();
			System.out.println("In finally block:");
		}
		System.out.println("Vote Ends:");

	}

}
