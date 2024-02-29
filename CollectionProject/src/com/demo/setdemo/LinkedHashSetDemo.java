package com.demo.setdemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

//it maintains insertion order
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Red");
		lhs.add("Blue");
		lhs.add("Green");
		System.out.println(lhs.add("Blue"));
		lhs.add(null);
		lhs.add("Purple");
		
		System.out.println(lhs);
		
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
