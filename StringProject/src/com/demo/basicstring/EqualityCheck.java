package com.dmo.basicstring;

public class EqualityCheck {
//== refers to reference of object
	//equals refers to value return type of equals is boolean
	public static void main(String[] args) {
	 String s1="java";
	 String s2="java";
	 //compare reference to object
	 System.out.println(s1==s2);
	 System.out.println("===========================");
	 //compare content 
	 System.out.println(s1.equals(s2));
	 System.out.println("--------------------------------");
	 String s3=new String("java");
	 System.out.println(s1==s3);
	 System.out.println("--------------------------------");
	 System.out.println(s1.equals(s3));
	}

}
