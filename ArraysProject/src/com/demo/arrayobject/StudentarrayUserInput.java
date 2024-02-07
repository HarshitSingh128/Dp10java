package com.demo.arrayobject;

import java.util.Scanner;

public class StudentarrayUserInput {
	static Scanner sc = new Scanner(System.in);

	static void enterStudentDetails(Student s) {
		System.out.println("Enter Student Id:");

		s.setId(sc.nextInt());

		System.out.println("Enter Student name:");
		s.setNmae(sc.next());

		System.out.println("Enter Student marks:");
		s.setMarks(sc.nextDouble());
	}

	static void displayAllStudent(Student st[]) {
		for (Student s : st) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		Student[] stud = new Student[3];
		for (int i = 0; i < stud.length; i++) {
			stud[i] = new Student();
			enterStudentDetails(stud[i]);
		}
//// hardcore getter setter
//		stud[0].setId(101);
//		stud[0].setNmae("Rushikesh");
//		stud[0].setMarks(98);
//
//		stud[1].setId(102);
//		stud[1].setNmae("Onkar");
//		stud[1].setMarks(98);
//
//		stud[2].setId(103);
//		stud[2].setNmae("Shreaysh");
//		stud[2].setMarks(98);

//		for (int i = 0; i < stud.length; i++) {
//			System.out.println("Enter Student Id:");
//			int id = sc.nextInt();
//			stud[i].setId(id);
//
//			stud[i].setId(sc.nextInt());
//
//			System.out.println("Enter Student name:");
//			stud[i].setNmae(sc.next());
//
//			System.out.println("Enter Student marks:");
//			stud[i].setMarks(sc.nextDouble());
		
		System.out.println("----------------------");
		displayAllStudent(stud);
	}

}
