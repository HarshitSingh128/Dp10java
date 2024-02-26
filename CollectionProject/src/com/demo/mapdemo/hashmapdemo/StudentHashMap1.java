package com.demo.mapdemo.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,Student> hm=new HashMap<>();
		hm.put(1, new Student(101, "Harshit", "java"));
		hm.put(2, new Student(102, "Mandar", "Python"));
		hm.put(3, new Student(103, "Supriya", "java"));
		hm.put(4, new Student(104, "Pradnya", "java"));
		hm.put(5, new Student(105, "Onkar", "Python"));
		//hm.put(6, new Student(105, "Onkar", "Python"));
		
		for(Map.Entry<Integer, Student> h:hm.entrySet()) {
			System.out.println(h.getKey()+"->"+h.getValue());
		}

	}

}
