package com.demo.methodoverloading;
//Create a program to show how type promotion can create ambiguity in method overloadig

public class ambiquity {
	static void display(int n ,double j) {
		System.out.println("ans "+(n+j));
		System.out.println("type");
	}
	static void display(long n,float j) {
		System.out.println("Ams"+(n+j));
	}

	public static void main(String[] args) {
		ambiquity.display(4, 4.5);
		ambiquity.display(8l, 4);
		
		
	}

}
