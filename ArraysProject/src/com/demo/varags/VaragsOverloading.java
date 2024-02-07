package com.demo.varags;

public class VaragsOverloading {
	static void display(int ...a1) {
		System.out.println("In int");
		for(int x:a1) {
			System.out.println(x);
		}
	}
	static void display(double ...d1) {
		System.out.println("In double");
		for(double x:d1) {
			System.out.println(x);
		}
	}
	static void display(int x,char...ch) {
		System.out.println("In char & int method");
		System.out.println(x);
		for(char c:ch) {
			System.out.println(c);
			
		}
	}

	public static void main(String[] args) {
		display(5,6,6,7);
		System.out.println("++++++++++++++++++++");
		display(4.5,4.6,4.7);
		System.out.println("============================");
		display(5,'a','b','c');
		display('c');
		

	}

}
