package com.demo.setdemo;

import java.util.Objects;

public class Item1 {
	private int id;
	private String iname;
	private double icost;
	private Supplier s;
	public Item1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item1(int id, String iname, double icost, Supplier s) {
		super();
		this.id = id;
		this.iname = iname;
		this.icost = icost;
		this.s = s;
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
	public double getIcost() {
		return icost;
	}
	public void setIcost(double icost) {
		this.icost = icost;
	}
	public Supplier getS() {
		return s;
	}
	public void setS(Supplier s) {
		this.s = s;
	}
	@Override
	public int hashCode() {
		return Objects.hash(icost, id, iname, s);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item1 other = (Item1) obj;
		return Double.doubleToLongBits(icost) == Double.doubleToLongBits(other.icost) && id == other.id
				&& Objects.equals(iname, other.iname) && Objects.equals(s, other.s);
	}
	@Override
	public String toString() {
		return "Item1 [id=" + id + ", iname=" + iname + ", icost=" + icost + ", s=" + s + "]";
	}
	

}
