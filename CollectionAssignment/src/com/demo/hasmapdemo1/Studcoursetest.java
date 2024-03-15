package com.demo.hasmapdemo1;

import java.util.HashMap;
import java.util.Map;

public class Studcoursetest {
//	10.	WAP to create a map which stores an arraylist as a value
//	11.	WAP to iterate the elements in the arraylist stored in the above Map.

	static void createhashmap() {
		
	}
	//9.	WAP to create a map using Custom class as key and any other Custom class as value
	public static void main(String[] args) {
		HashMap<Student,Course> hm=new HashMap<Student,Course>();
		hm.put(new Student(1, "AKash", 21),new Course(101, "Java", 150000));
		hm.put(new Student(2, "Suraj", 23),new Course(101, "Java", 150000));
		hm.put(new Student(3, "Kamlesh", 21),new Course(107, ".Net", 200000));
		hm.put(new Student(7, "Sonu", 21),new Course(108, "Python", 15000));
		
		for(Map.Entry<Student, Course> s:hm.entrySet()) {
			System.out.println(s.getKey()+" ->"+s.getValue());
		}

	}

}
