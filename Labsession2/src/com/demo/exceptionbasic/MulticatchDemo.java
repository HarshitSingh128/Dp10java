package com.demo.exceptionbasic;

import java.util.Scanner;

public class MulticatchDemo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	try {
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter a number:");
			arr[i]=sc.nextInt();
		}
		System.out.println("--------------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("ans:"+(100/arr[i]));
		}
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e+" Index should be less than 3");
	}
	catch(ArithmeticException  e) {
		System.out.println("We cannot divide with zero"+e);
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		sc.close();
		System.out.println("In finally block");
	}
	System.out.println("In rest code");
	
	}

}
