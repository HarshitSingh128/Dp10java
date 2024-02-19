package com.demo.arrraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArrayList {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1, "shreyash", 70.5));
		slist.add(new Student(1, "Rahul", 70.5));
		slist.add(new Student(2, "Onkar", 85.5));
		slist.add(new Student(3, "Pravin", 70.5));
		slist.add(new Student(4, "Pradnya", 80.5));
		slist.add(new Student(5, "Harshit", 50.5));
		
		
		Collections.sort(slist);
		
		for(Student s:slist) {
			System.out.println(s);
		}
		
	
	}

}
