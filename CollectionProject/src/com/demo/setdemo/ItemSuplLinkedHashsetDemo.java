package com.demo.setdemo;

import java.util.LinkedHashSet;

public class ItemSuplLinkedHashsetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Item1> i1=new LinkedHashSet<Item1>();
		i1.add(new Item1(1, "Apple", 50, new Supplier(101, "Mukesh")));
		i1.add(new Item1(2, "Banana", 70, new Supplier(102, "Suraj")));
		i1.add(new Item1(3, "Graphes", 79, new Supplier(101, "Mukesh")));
		i1.add(new Item1(4, "Lichi", 89, new Supplier(107, "Adarsh")));
		i1.add(new Item1(1, "Apple", 50, new Supplier(101, "Mukesh")));
		
		
		for(Item1 i:i1 ) {
			System.out.println(i);
		}

	}

}
