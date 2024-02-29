package com.basicarraylist;

import java.util.ArrayList;

public class Arraytest {
//1. WAP to add elements to arraylist without using generics (no <>)  and print content of it where Integer is used. In second arraylist String is used.
	//2.	WAP add elements to arraylist without using generics, 0th location keep Integer, 1st location String now print each element and display contents.
	static void arary() {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add("Mukesh");
		a1.add(10.5);
		System.out.println(a1);

		ArrayList<String> a2 = new ArrayList<>();
		a2.add("Piyush");
		a2.add("Pradnya");
		a2.add("Harshit");
		System.out.println("------------------");
		System.out.println(a2);

		ArrayList<Integer> a3 = new ArrayList<>();
		System.out.println("---------------------------");
		a3.add(12);
		a3.add(45);
		a3.add(78);
		System.out.println(a3);

	}

	public static void main(String[] args) {
		arary();

	}

}
