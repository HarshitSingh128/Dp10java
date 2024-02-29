package com.demo.setdemo;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Java");
		hs.add("C++");
		hs.add("Spring");
		hs.add(".NET");

		System.out.println(hs);

		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Java");
		hs1.add("C++");
		hs1.add("SQL");
		hs1.add("HTML");

		System.out.println(hs1);
		// mathematical Operation
		// union
		// hs.addAll(hs1);
		// System.out.println(hs);

		// difference
		//hs.removeAll(hs1);
		// System.out.println(hs);
		// intersection
		hs.retainAll(hs1);
		System.out.println(hs);
		

	}

}
