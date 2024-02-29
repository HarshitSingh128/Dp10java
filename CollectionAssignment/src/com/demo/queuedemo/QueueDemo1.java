package com.demo.queuedemo;

import java.util.PriorityQueue;

public class QueueDemo1 {
//	4.	Use 2 different method calls to add elements to a queue.

	public static void main(String[] args) {
		PriorityQueue<Integer> i1 = new PriorityQueue<Integer>();
		i1.add(21);
		i1.add(45);
		i1.add(67);

		System.out.println(i1);
		i1.offer(56);
		i1.offer(89);
		System.out.println(i1);
//		5.	WAP to check if a queue has values	
		System.out.println(i1.isEmpty());
		// 1. WAP to check the top element in a queue
		System.out.println(i1.peek());
		// 2. WAP to remove an element from a queue
		i1.remove();
		System.out.println(i1);
		// 3. Use 2 different method calls to remove elements from a queue
		i1.remove();
		i1.poll();
		System.out.println(i1);
		// 4. WAP to attempt to remove non-existing elements from a queue
		System.out.println(i1.remove(48));
		// 5. Use 2 different method calls to remove non-existing elements from a queue
		i1.remove(48);
		// i1.poll(48);we cannot remove using poll method for removing non-existing
		// element

	}

}
