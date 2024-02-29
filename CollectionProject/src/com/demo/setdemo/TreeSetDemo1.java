package com.demo.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(15);
		ts.add(89);
		ts.add(78);
		ts.add(69);
		ts.add(23);
		
		System.out.println(ts);
		
		System.out.println("First:"+ts.first());
		System.out.println("Last:"+ts.last());
		
		System.out.println(ts.headSet(89));//it gives before element of 89 and exclude 89
		System.out.println(ts.tailSet(69));//it gives after element of 69 and include 69
		SortedSet<Integer> s1=ts.subSet(15, 69);
		
		//NAvigable Set
		System.out.println("Lowe:"+ts.lower(89));
		System.out.println("Floor" +ts.floor(23));
		
		System.out.println("Higher:"+ts.higher(15));
		System.out.println("Celling:"+ts.ceiling(78));
		System.out.println(ts.headSet(89, false));
	}

}
