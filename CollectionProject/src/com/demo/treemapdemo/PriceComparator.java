package com.demo.treemapdemo;

import java.util.Comparator;

public class PriceComparator implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		return (int) (o1.getCost()-o2.getCost());
	}
	

}
