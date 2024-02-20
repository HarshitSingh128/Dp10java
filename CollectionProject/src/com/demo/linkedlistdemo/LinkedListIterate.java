package com.demo.linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class LinkedListIterate {

	public static void main(String[] args) {
		LinkedList<String> frt=new LinkedList<>();
		frt.add("Grapes");
		frt.add("Banana");
		frt.add("Mango");
		frt.add("Apple");
		//1st way
//		for(String s:frt) {
//			//System.out.println(s);
//		}
//		// 2nd way
//		System.out.println("----------------");
//		for(int i=0;i<frt.size();i++) {
//			//System.out.println(frt.get(i));
//		}
//		//3rd way
//		System.out.println("-----------------");
//		//Iterator<String> itr=frt.iterator();
////		while(itr.hasNext()) {
////			//System.out.println(itr.next());
////		}
//		//4th way
//		System.out.println("--------------------");
//		ListIterator<String> litr=frt.listIterator();
//		while(litr.hasNext()) {
//			//System.out.println(litr.next());
//		}
//		//5th way
//		System.out.println("--------------------");
//		ListIterator<String> lit=frt.listIterator(frt.size());
//		while(lit.hasPrevious()){
//			//System.out.println(lit.previous());
//		}
//		//6th way
		Iterator<String> it= frt.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
