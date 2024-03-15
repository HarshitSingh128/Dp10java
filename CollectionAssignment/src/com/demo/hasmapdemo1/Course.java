package com.demo.hasmapdemo1;

public class Course {
	private int cid;
	private String cname;
	private double cfees;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cname, double cfees) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfees = cfees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getCfees() {
		return cfees;
	}
	public void setCfees(double cfees) {
		this.cfees = cfees;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + "]";
	}
	

}
