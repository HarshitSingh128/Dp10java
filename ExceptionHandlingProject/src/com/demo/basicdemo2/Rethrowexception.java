package com.demo.basicdemo2;

public class Rethrowexception {
	static void method1() {
		try {
			String s = null;
			System.out.println(s.length());
			
		} catch (NullPointerException ex) {
			System.out.println("In method1 catch block");
			
			throw ex;
		}
	}

	public static void main(String[] args) {
		method1();
		try {
			method1();

		} catch (Exception e) {
			System.out.println("In main block");
			System.out.println(e);
		}

	}
}
