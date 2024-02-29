package com.demo.mapdemo.hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentHashMap1 {
	static void creteMapNames(HashMap<Integer, Student> sm) {
		// String :coursename
		// ArrayList<String>:student names
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		ArrayList<String> names;
		for (Map.Entry<Integer, Student> e : sm.entrySet()) {
			String course = e.getValue().getCourse();
			if (hm.containsKey(course)) {
				names = hm.get(course);
				// names.add(e.getValue().getStudName());
				// hm.put(course, names);
			} else {
				names = new ArrayList<>();
				// names.add(e.getValue().getStudName());
				// hm.put(course, names);
			}

			names.add(e.getValue().getStudName());
			hm.put(course, names);

		}
		for (Map.Entry<String, ArrayList<String>> e : hm.entrySet()) {
			System.out.println("Course:" + e.getKey());
			for (String s : e.getValue()) {
				System.out.println(s);
			}
			System.out.println("-----------------");
		}
	}

	public static void main(String[] args) {
		HashMap<Integer, Student> hm = new HashMap<>();
		hm.put(1, new Student(101, "Harshit", "java"));
		hm.put(2, new Student(102, "Mandar", "Python"));
		hm.put(3, new Student(103, "Supriya", "java"));
		hm.put(4, new Student(104, "Pradnya", "java"));
		hm.put(5, new Student(105, "Onkar", "Python"));
		hm.put(6, new Student(105, "Rahul", "Python"));
		System.out.println(hm.put(6, new Student(105, "Supriya", "Python")));
		System.out.println(hm.putIfAbsent(6, new Student(105, "Akshata", "Python")));// it return old value.

		for (Map.Entry<Integer, Student> h : hm.entrySet()) {
			System.out.println(h.getKey() + "->" + h.getValue());
		}
		System.out.println("--------------------");
		creteMapNames(hm);

	}

}
