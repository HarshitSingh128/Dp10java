package com.demo.setdemo;

import java.util.Objects;

public class Item {
private int id;
private String iname;
private double cost;
public Item() {
	super();
	// TODO Auto-generated constructor stub
}
public Item(int id, String iname, double cost) {
	super();
	this.id = id;
	this.iname = iname;
	this.cost = cost;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
@Override
public int hashCode() {
	return Objects.hash(cost, id, iname);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Item other = (Item) obj;
	return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && id == other.id
			&& Objects.equals(iname, other.iname);
}
@Override
public String toString() {
	return "Item [id=" + id + ", iname=" + iname + ", cost=" + cost + "]";
}

}
