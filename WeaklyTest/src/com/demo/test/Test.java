package com.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
private String name;
private int marks;
			
public Student(String name,int marks){
this.name=name;
this.marks=marks;
}
public void setName(String name){  
this.name=name;
}
public String getName(){
return name;
}
public void setMarks(int marks){  
this.marks=marks;
}
public int getMarks(){
return marks;
}
}
public class Test {
	public static void main(String args[]){
	
		Map<Student,Integer> hm=new HashMap<>();
		hm.put(new Student("Ram",30),30);
		hm.put(new Student("Rahul",40),40);
		hm.put(new Student("Shyam",60),60);
		hm.put(new Student("laxmi",50),50);
				
		List<Student> passStudents=new ArrayList<>();
		List<Student> failedStudents=new ArrayList<>();
		for(Map.Entry<Student,Integer> entry:hm.entrySet()){
		Student s=entry.getKey();
		 int marks=entry.getValue();
		if(marks>35){
		passStudents.add(s);
		}
		else
		{
		failedStudents.add(s);
		}
		}
		System.out.println("Passing Students:");
		for(Student s:passStudents){
		System.out.println(s.getName());
		}
		System.out.println("Failed Students:");
		for(Student s:failedStudents){
		System.out.println(s.getName());
		}

		}
	
	
	
}
