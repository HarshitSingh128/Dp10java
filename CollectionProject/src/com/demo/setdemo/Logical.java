package com.demo.setdemo;

import java.util.HashSet;

public class Logical {

	public static void main(String[] args) {
		HashSet<Item> i1=new HashSet<Item>();
		i1.add(new Item(1, "Apple", 50));
		i1.add(new Item(3, "Banana", 40));
		i1.add(new Item(7, "Graphes", 70));
		i1.add(new Item(8, "Mango", 60));
		i1.add(new Item(6, "Lichi", 59));
		i1.add(new Item(1, "Apple", 50));
		
//		for(Item i:i1) {
//			System.out.println(i);
//		}
//here apple is not repeated because of hashCode and equal method override in Item class	
		//if we don't override equal and hashCode method then apple is repeated 
		HashSet<Item> b1=new HashSet<Item>();
		b1.addAll(i1);
		for(Item i:b1) {
			System.out.println(i);
		}

	}

}
