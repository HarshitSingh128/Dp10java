package com.basicarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperation {

	public static void main(String[] args) {
		int count=0;
		// 3. WAP to use add operation of ArrayList
		//11.	WAP to know how many elements in ArrayList
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(12);
		a1.add(45);
		a1.add(78);
		a1.add(89);

		System.out.println(a1);
		// 4. WAP to print all elements of ArrayList using iterator
		Iterator<Integer> itr = a1.iterator();
		while (itr.hasNext()) {
			count++;
			System.out.println(itr.next());
		
		}
		System.out.println("Element is arrayList is:"+count);
		System.out.println("-------------------");
		// 5. WAP to iterate through all elements in an ArrayList using for loop
		for (int i = 0; i < a1.size(); i++) {
			
		
			System.out.println(a1.get(i));
		
		}
		System.out.println("--------------------");
		// 6. WAP to iterate through all elements in an ArrayList using for each
		for (Object a : a1) {
			System.out.println(a);
		}
		// 7. WAP to create a new ArrayList, add some colors (string) and print the
		// collection.
		ArrayList<String> a3=new ArrayList<>();
		a3.add("Piyush");
		a3.add("Arjum");
		a3.add("Shyam");
		a3.add("Ram");
		System.out.println(a3);
		
		ArrayList<String> a4=new ArrayList<>();
		a4.add("Harshit");
		a4.add("Mukesh");
			
	  a3.addAll(a4);
	 System.out.println(a3);
		//8.	WAP to remove element from ArrayList
		a3.remove(2);
		System.out.println(a3);
		//9.	WAP to remove all elements from ArrayList
		System.out.println(a3.removeAll(a4));
		System.out.println(a3);
		//10.	WAP to retain all elements from ArrayList
		System.out.println(a3.retainAll(a4));
		System.out.println(a3);

	}

}
