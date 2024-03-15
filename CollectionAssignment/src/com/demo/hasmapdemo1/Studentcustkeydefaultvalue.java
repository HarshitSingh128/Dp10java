package com.demo.hasmapdemo1;

import java.util.HashMap;
import java.util.Map;

public class Studentcustkeydefaultvalue {
	//8.	WAP to create a map using Custom class as key and any other JDK provided object as value
	public static void main(String[] args) {
		HashMap<Student,String> hm=new HashMap<Student,String>();
		hm.put(new Student(101, "Suraj", 21), "JAva");
		hm.put(new Student(102, "Samrath", 23), "JAva");
		hm.put(new Student(103, "Tanmay", 22), "Python");
		hm.put(new Student(104, "Sukesh", 21), ".Net");
		
		for(Map.Entry<Student, String> e:hm.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
			
		}
		
	}

}
