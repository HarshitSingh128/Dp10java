package com.dmo.arrayobject;
//Task
//1>>
//Create a class Department id, name, location
//Create a class Employee having id,name and salary
//and containment dept
//--> Create 2 anonymous object and one object from
//getter,setter
//----> Create object using user input
//---> Sort the employee on the basis of salary
//--->Find the employee having max salary

public class Department {
	private int deptid;
	private String deptname;
	private String deptloc;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptid, String deptname, String deptloc) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
		this.deptloc = deptloc;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptloc() {
		return deptloc;
	}
	public void setDeptloc(String deptloc) {
		this.deptloc = deptloc;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", deptloc=" + deptloc + "]";
	}

	
}
