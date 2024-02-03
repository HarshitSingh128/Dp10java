//1. create class Student
//2. create 2 objects of Student using new keyword
//3) Write a program for class and object : (main method inside class)
//4) Write a program for class and object : (main outside class)
//5) Write a program for class and object : (initialization through reference)
//Note : Initializing object simply means storing data into object
//6) Write a program to demonstrate anonymous object.
//7) Write a program to create multiple objects of one type only.
//e.g. Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two objects
//11. From scanner In loop (for 2 iterations) read Student
//data create new object each time assign values and print
///student values in console.
//12) Write a program to copy values of one object into another by assigning the values of
//one object into another.

package com.assignment.classobject;

import java.util.Scanner;

public class Student {
	int id = 101;
	String name = "priya";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		s1.id = 101;
		s1.name = "harshit";
		System.out.println(s1.id);
		System.out.println(s1.name);
		new Student();// anonymous object.
		Student s3 = new Student(), s4 = new Student();
		System.out.println(s3.id);
		System.out.println(s3.name);
		int i;
		for (i = 1; i <= 2; i++) {
			System.out.println("Enter id:");
			s1.id = sc.nextInt();
			System.out.println("Enter name=");
			s1.name = sc.next();
			System.out.println("id :" + s1.id + "name:" + s1.name);
		}

	}

}
