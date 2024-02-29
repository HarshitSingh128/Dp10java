package com.demo.queuedemo;

import java.util.PriorityQueue;

public class QueueDemo {
	static void priorityd() {
		// 2. WAP to create a Queue with some colors (String) &amp; using generics
		PriorityQueue<String> p2 = new PriorityQueue<>();
		p2.add("Red");
		p2.add("Yellow");
		p2.add("Pink");
		p2.add("Black");

		System.out.println(p2);
	}

	public static void main(String[] args) {
		// 1. WAP to create a Queue with Integer objects without using generics
		PriorityQueue p1 = new PriorityQueue();
		p1.add(2);
		p1.add(5);
		p1.add(6);
		p1.add(4);

		System.out.println(p1);
		System.out.println("-------------------");
		priorityd();

	}

}
