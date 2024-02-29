package com.demo.setdemo;

public class Supplier {
	private int sid;
	private String sname;
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Supplier(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
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
	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", sname=" + sname + "]";
	}
	

}
