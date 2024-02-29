package com.demo.linkedhashmapdemo;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

//it maintains insertion order
public class Linkedhashmapdemo {

	public static void main(String[] args) {
		LinkedHashMap<String,Double> lhm=new LinkedHashMap<>(16,0.75f,true);
		lhm.put("Rushikesh", 95.9);
		lhm.put(null, 0.0);
		lhm.put("Amruta", 78.5);
		lhm.put("Pradnya", 85.0);
		lhm.put("Pooja", 88.0);
		lhm.put("Mandar", 84.1);
		lhm.put("Gunjan", 81.2);
		
		for(Entry<String,Double> e:lhm.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}
		System.out.println("--------------------------");
		System.out.println("Marks of pooja:"+lhm.get("Pooja"));
		
		System.out.println("-----------------");
		for(Entry<String,Double> e:lhm.entrySet()) {
			System.out.println(e.getKey()+"->"+e.getValue());
		}

	}

}
