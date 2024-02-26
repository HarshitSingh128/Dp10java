package com.demo.prioritydemo;

import java.util.PriorityQueue;

public class Library {

	public static void main(String[] args) {
		PriorityQueue<Book> bp=new PriorityQueue<>(new PriceComparator());
		bp.add(new Book(1, "Secreat", 900));
		bp.add(new Book(2, "Social", 700));
		bp.add(new Book(3, "Math", 400));
		bp.add(new Book(4, "English",600));
		
		for(Book b:bp) {
			System.out.println(b);
		}
		

	}

}
