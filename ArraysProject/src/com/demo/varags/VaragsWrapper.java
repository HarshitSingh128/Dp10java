package com.demo.varags;

public class VaragsWrapper {
	static void show(Object ...s) {
		System.out.println("In object method");
		for(Object st:s) {
			System.out.println(st);
			
		}
	}
	static void display(Number ...s) {
		System.out.println("In number");
		for(Number c:s) {
			System.out.println(c);
		}
	}
	static void displayMe(Double ...ch) {
		System.out.println("In double");
		for(Double c:ch) {
			System.out.println(c);
		}
	}
 static void show(Integer ...s) {
	 System.out.println("In wrapper int");
	 for(Integer st:s) {
		 System.out.println(st);
	 }
 }
	public static void main(String[] args) {
		show('a','b','v');
		System.out.println("=================");
		display(5,6,4,6);
		System.out.println("=================");
		show(5);
		show('p');
		show(4.5f);
	

	}

}
