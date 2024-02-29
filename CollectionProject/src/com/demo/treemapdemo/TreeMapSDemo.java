package com.demo.treemapdemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapSDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
//		tm.put(11, "Mandar");
//		tm.put(2, "Amruta");
//		tm.put(34, "Rushikesh");
		
		tm.put(11, "Alex");
		tm.put(78, null);
		tm.put(56, "John");
		tm.put(98, "Chris");
		tm.put(59, "Tim");
		
		System.out.println(tm);
		System.out.println("----------");
		//iterate//1st way
		for(Map.Entry<Integer, String> e:tm.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		System.out.println("---------------------");
		//2nd way
		Set<Integer> keys=tm.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext()) {
			int key=itr.next();
			System.out.println(key+"->"+tm.get(key));
		}
		System.out.println("----------------");
		//3rd way
		Set<Entry<Integer, String>> entries=tm.entrySet();
		for(Entry<Integer,String> e:entries) {
			System.out.println(e.getKey()+ "->"+e.getValue());
		}
		System.out.println("----------------------");
		//4th way
		NavigableMap<Integer,String> ns=tm.descendingMap();
		for(Map.Entry<Integer, String>e:ns.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		System.out.println("------------");
		//5th way
		NavigableSet<Integer> ns1=tm.navigableKeySet();
		for(Integer i:ns1) {
			System.out.println(i+":"+tm.get(i));
		}
		System.out.println("-----------------");
		
		

	}

}
