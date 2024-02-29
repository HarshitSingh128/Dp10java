package com.basicarraylist;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
//		12.	WAP to test an ArrayList is empty or not
//		13.	WAP to empty ArrayList
//		20.	WAP to check if collection is empty

		ArrayList<Integer> atr = new ArrayList<>();
		System.out.println(atr.isEmpty());
		atr.add(null);
		System.out.println("--------------");
		System.out.println(atr.isEmpty());
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(45);
		a1.add(56);
		a1.add(78);
		a1.add(98);

		// 15. WAP to search the specified collection in this collection
		System.out.println("------------------");
		System.out.println(a1.indexOf(78));
		// 16. WAP to retrieve an element (at a specified index) from a given ArrayList
		a1.remove(2);
		a1.retainAll(a1);
		System.out.println("--------------------------");
		System.out.println(a1);
		// 17. WAP to insert an element into the ArrayList at the first position
		a1.add(1, 7);
		System.out.println("---------------------");
		System.out.println(a1);
		// 23. WAP to replace the second element of an ArrayList with the specified
		// element
		a1.set(2, 15);
		System.out.println("-------------");
		System.out.println(a1);
		// 18. WAP to add 1 to 50 numbers in ArrayList and print only even numbers
		// (using iterator)
		ArrayList<Integer> a4 = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			a4.add(i);
		}
		Iterator<Integer> itr = a4.iterator();
		// System.out.println(a4);
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		// 19. WAP to match two collections
		System.out.println("--------------");
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(45);
		a2.add(7);
		a2.add(15);
		a2.add(98);

		System.out.println(a2.equals(a1));
		System.out.println("--------------");
		// 21. WAP to convert collection into array
//		Integer s1[] = new Integer[4];
//         a2.toArray(s1);
//		System.out.println(a2);
		// 22. WAP of swap two elements in an ArrayList
		System.out.println("Before swap" + a2);
		// Collections.swap(a2, 1, 2);
		System.out.println("After swap" + a2);

		for (int i = 0; i < a2.size(); i++) {
			Integer temp = a2.get(1);
			a2.set(1, 15);
			a2.set(2, temp);

		}
		System.out.println(a2);

	}

}
