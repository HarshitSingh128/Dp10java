package com.basicarraylist;
//1.	WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. Sysout and see both variable memory space is printed. 
//This is because toString is not overriden but if you would have done this for Integer then beautiful output would have been printed.
public class Employee {
	private int empid;
	private String empname;
	private double esal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, double esal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.esal = esal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", esal=" + esal + "]";
	}
	
	

}
