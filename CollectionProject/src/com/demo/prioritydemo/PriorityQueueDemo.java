package com.demo.prioritydemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		//System.out.println(pq.remove());//it gives exception and our program will be stopped
		//in this priorityqueue you have to implements comparator/comparable if u want print our data in this class any operations perform on comparison
		System.out.println(pq.poll());//it gives null our program will not be stopped
		pq.add(90);
		pq.add(78);
		//pq.add(null);
		pq.add(78);
		pq.add(56);
		pq.add(98);
		pq.add(59);
		
		System.out.println(pq);
		
		pq.offer(71);
		System.out.println(pq);
		System.out.println(pq.remove());//remove first element
		System.out.println(pq);
		System.out.println(pq.poll());//remove first element
		System.out.println(pq);
		System.out.println(pq.peek());//it print first element in queue
		System.out.println(pq.element());//it print first element in queue
	
	}

}
