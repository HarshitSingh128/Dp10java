package com.demo.treemapdemo;

import java.util.Map;
import java.util.TreeMap;

public class CustomOrderTreeMap {

	public static void main(String[] args) {
		TreeMap<Order,Customer> tmap=new TreeMap<>(new PriceComparator());
		
		tmap.put(new Order(102, "Burger", 500), new Customer(1, "Supriya", 789546874));
		tmap.put(new Order(101, "Fries", 100), new Customer(2, "Anita", 989546874));
		tmap.put(new Order(105, "juice", 2500), new Customer(3, "Pravin", 879546874));
		tmap.put(new Order(104, "Pizza", 800), new Customer(1, "Supriya", 789546874));
		tmap.put(new Order(103, "Browine", 520), new Customer(2, "Anita", 989546874));
		
		
		for(Map.Entry<Order, Customer> e:tmap.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------");
		}
		

	}

}
