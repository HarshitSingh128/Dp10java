package com.demo.setdemo;


import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String>  ts=new TreeSet<String>();
		ts.add("Red");
		ts.add("Pink");
		//ts.add(null);
		ts.add("Black");
		ts.add("Yellow");
		
		System.out.println(ts);
		
		System.out.println("----------------------");
		//1st way
		Iterator<String> itr=ts.iterator();
 		while(itr.hasNext()) {
 			System.out.println(itr.next());
 		}
 		System.out.println("-----------------");
 		//2nd way
 		for(String s:ts) {
 			System.out.println(s);
 		}
 		System.out.println("-------------");
 		//3rd way
 		Iterator<String> itr1=ts.descendingIterator();
 		 while(itr1.hasNext()) {
 			 System.out.println(itr1.next());
 		 }
 		 System.out.println("-------------");
 		//4th way
 		 NavigableSet<String> nm=ts.descendingSet();
 		 for(String s:nm) {
 			 System.out.println(s);
 		 }
 		 System.out.println("----------");
 		 //it is used synchronisable form and it is tread safe
 		 Set<String> syc=Collections.synchronizedSet(ts);
 		 System.out.println(syc);

	}

}
