package com.demo.mapdemo.hashmapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingMap {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("India", 91);
		hm.put("UAE", 971);
		hm.put("USA", 1);
		hm.put("Germany", 49);
		hm.put("Uk", 24);
		
		//1st way
		System.out.println(hm);
		//all the keys
		System.out.println("-------------------------");
		Set<String> keys=hm.keySet();
		for(String k:keys) {
			System.out.println(k+" ->"+hm.get(k));
		}
		System.out.println("--------------------------");
		//all the values
		Collection<Integer> pins=hm.values();
		for(Integer i:pins) {
			System.out.println(i);
		}
		System.out.println("--------------------------");
		//using set and Entry
		Set<Entry<String,Integer>> entries=hm.entrySet();
		for(Entry<String,Integer> e:entries) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		//other way and most favorable way
		System.out.println("------------------------------");
		for(Map.Entry<String, Integer> e:hm.entrySet() ) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
	}

}
