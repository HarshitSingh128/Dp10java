package com.demo.LinkedlistDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	//1.	WAP to append the specified element to the end of a linked list.
	//2.	WAP to iterate through all elements in a linked list.

	public static void main(String[] args) {
		LinkedList<String> comp=new LinkedList<>();
		comp.add("RED");
		comp.add("Pink");
		comp.add("Black");
		comp.add("Yellow");
		comp.add("Purple");
		
		System.out.println(comp);
		//1st way
		System.out.println("-------------------------");
		for(String s:comp) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		Iterator<String> itr=comp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------");
		//4.	WAP to iterate a linked list in reverse order.
		ListIterator<String> litr=comp.listIterator(comp.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		System.out.println("------------");
		//3.	WAP to iterate through all elements in a linked list starting at the specified position.
		for(int i=2;i<comp.size();i++) {
			System.out.println(comp.get(i));
			
		}
		System.out.println("-------------------");
		//5.	WAP to insert the specified element at the specified position in the linked list.
		//9.	WAP to insert some elements at the specified position into a linked list.
		comp.set(2, "White");
		for(String s:comp) {
			System.out.println(s);
		}
		System.out.println("-------------------");
		
	//6.	WAP to insert elements into the linked list at the first and last position.
		//7.	WAP to insert the specified element at the front of a linked list.
		//comp.push("Genpact");
		
		comp.addFirst("Capegimini");
		System.out.println(comp);
		comp.addLast("TCS");
		System.out.println(comp);
		

	}

}
