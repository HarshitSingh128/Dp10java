package com.demo.treemapdemo;

public class Order{// implements Comparable<Customer> {
	private int orderid;
	private String orderDetails;
	private double cost;
	public Order() {
		super();
	
	}
	public Order(int orderid, String orderDetails, double cost) {
		super();
		this.orderid = orderid;
		this.orderDetails = orderDetails;
		this.cost = cost;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", orderDetails=" + orderDetails + ", cost=" + cost + "]";
	}
//	@Override
//	public int compareTo(String string) {
//		return this.compareTo(string.getCname());
//	}
	

}
