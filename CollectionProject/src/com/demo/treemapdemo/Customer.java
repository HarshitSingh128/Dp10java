package com.demo.treemapdemo;

public class Customer {
	private int cid;
	private String cname;
	private long mobileNo;
	
	public Customer() {
		super();
	
	}
	public Customer(int cid, String cname, long mobileNo) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobileNo = mobileNo;
		
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
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mobileNo=" + mobileNo+" ]";
	}

}
