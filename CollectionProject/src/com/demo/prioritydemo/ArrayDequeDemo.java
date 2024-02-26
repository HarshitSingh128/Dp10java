package com.demo.prioritydemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		//def cap=16
		//increase by power of 2
		//maintains the insertion order
	ArrayDeque<Book> adq=new ArrayDeque<>();
	adq.add(new Book(1, "Secreat", 900));
	adq.add(new Book(2, "Social", 700));
	adq.add(new Book(3, "Math", 400));
	adq.add(new Book(4, "English",600));
	//adq.add(null) null is not allowed in arrayDeque
	for(Book b:adq) {
		System.out.println(b);
	}
	System.out.println("------------------");
	System.out.println(adq.removeLast());
	System.out.println("------------------");
	System.out.println(adq.removeFirst());
	System.out.println("-----------------");
	
	for(Book b:adq) {
		System.out.println(b);
	}
	}

}
