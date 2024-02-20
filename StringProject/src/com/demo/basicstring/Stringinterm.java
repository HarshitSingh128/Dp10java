package com.demo.basicstring;

public class Stringinterm {

	public static void main(String[] args) {
		String s1 = "java";

		String s3 = new String("java");
		s3 = s3.intern();
		//Intern are basically used to memomry managemnet it directly refers to string constant pool not heap 
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

	}

}
