package com.demo.basicstring;

public class CompareMethod {

	public static void main(String[] args) {
	// compare lexicographically
		//compares the unicode of characters
		
		//if two string content are exactly same 0
		
		String s1="AbNa";
		String s2="Bbha";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		
		String s3="Rahul";
		String s4="rahul";
		System.out.println(s3.compareTo(s4));
		System.out.println(s4.compareTo(s3));

	}

}
