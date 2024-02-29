package com.demo.setdemo;


import java.util.Comparator;
import java.util.TreeSet;
 class PriceComparator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		if(o1.getCost()==o2.getCost())
			return o1.getIname().compareTo(o2.getIname());
		else
			return (int) (o2.getCost()-o1.getCost());
		
	}
  
 
 
 
 }
 
 
public class ItemTreeSet {

	public static void main(String[] args) {
		TreeSet<Item> i1=new TreeSet<Item>(  new PriceComparator ());
		i1.add(new Item(1, "Apple", 50));
		i1.add(new Item(3, "Banana", 40));
		i1.add(new Item(7, "Graphes", 50));
		i1.add(new Item(8, "Mango", 50));
		i1.add(new Item(6, "Lichi", 50));
		i1.add(new Item(1, "Apple", 50));
		
		for(Item i:i1) {
			System.out.println(i);
		}

	}

}



