package com.demo.setdemo;

import java.util.HashSet;

public class ItemHashSet {
	public static void main(String[] args) {
		HashSet<Item> i1=new HashSet<Item>();
		i1.add(new Item(1, "Apple", 50));
		i1.add(new Item(3, "Banana", 40));
		i1.add(new Item(7, "Graphes", 70));
		i1.add(new Item(8, "Mango", 60));
		i1.add(new Item(6, "Lichi", 59));
		i1.add(new Item(1, "Apple", 50));
		
		for(Item i:i1) {
			System.out.println(i);
		}
	}

}
