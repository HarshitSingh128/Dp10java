package com.demo.queuedemo;

import java.util.Comparator;
import java.util.PriorityQueue;
//3.	WAP to create a Queue with user defined class objects &amp; using generics
//9.	WAP to create a Queue using generics and add user defined class objects which implements comparable interface. 
//      Observe order when removing from queue
class Student implements Comparable<Student>{
	private int id;
	private String sname;
	private int sage;
	public Student() {
		super();
		
	}
	public Student(int id, String sname, int sage) {
		super();
		this.id = id;
		this.sname = sname;
		this.sage = sage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", sage=" + sage + "]";
	}
	@Override
	public int compareTo(Student s) {
		if(this.id==s.id)
	return 0;
		else if(this.id<s.id)//decreasing order
			return -1;
		else 
			return -1;

	}
//	

}
class StudentIdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getId()-o1.getId();
	}
	
}
public class StudentInfo{
	public static void main(String[] args) {
		//8.	WAP to create a Queue using generics and add user defined class objects in reverse order usingcomparator. 
		//Observe order when removing from queue.
		
		PriorityQueue<Student> s1=new PriorityQueue<Student>(new StudentIdComparator());
		//PriorityQueue<Student> s1=new PriorityQueue<Student>();
		s1.add(new Student(101, "Khushboo", 23));
		s1.add(new Student(103, "Anya", 24));
		s1.add(new Student(104, "Tanya", 27));
		s1.add(new Student(105, "Kareli", 25));
		
		for(Student s:s1) {
			System.out.println(s);
		}
		System.out.println("--------------------");
//		9.	WAP to create a Queue using generics and add user defined class objects which implements comparable interface.
		//Observe order when removing from queue.
		System.out.println("First element of Queue:"+s1.poll());
		
		System.out.println("-----------------------------");
		for(Student s:s1) {
			System.out.println(s);
		}
		
	}
}
