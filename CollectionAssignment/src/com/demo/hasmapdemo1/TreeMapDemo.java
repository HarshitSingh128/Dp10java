package com.demo.hasmapdemo1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
//	1.	WAP to create a Treemap which contains Integers
//	2.	WAP to create a Treemap which contains Strings

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(11, "Alex");
		tm.put(78, null);
		tm.put(56, "John");
		tm.put(98, "Chris");
		tm.put(59, "Tim");
		
		System.out.println(tm);
		System.out.println("----------");
		//iterate//1st way
		//5.	WAP to get all keys from the given a TreeMap
		for(Map.Entry<Integer, String> e:tm.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		System.out.println("---------------------");
		//3.	WAP to search a key in a TreeMap
		System.out.println(tm.containsKey(11));
		//4.	WAP to search a value in a TreeMap
		System.out.println(tm.containsValue("Alex"));
	

	}

}
