package com.demo.containmentdemo2;

import java.util.Arrays;

public class Supplier {
	private int sid;
	private String sname;
	private long sphonenub;
	private Item items[];
	public Supplier() {
		super();
	
	}
	public Supplier(int sid, String sname, long sphonenub, Item[] items) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sphonenub = sphonenub;
		this.items = items;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long getSphonenub() {
		return sphonenub;
	}
	public void setSphonenub(long sphonenub) {
		this.sphonenub = sphonenub;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", sname=" + sname + ", sphonenub=" + sphonenub + ", items="
				+ Arrays.toString(items) + "]";
	}
	

}
