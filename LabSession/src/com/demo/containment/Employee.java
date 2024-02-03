package com.demo.containment;

public class Employee {
	private int eid;
	private String empName;
	private double esal;
	private Department deptName;
	
	public Employee() {
		
	}
	public Employee(int eid ,String empName,double esal,Department deptName) {
		this.eid=eid;
		this.empName=empName;
		this.esal=esal;
		this.deptName=deptName;
	}
	public void seteid(int eid) {
		this.eid=eid;
	}
	public int geteid() {
		return eid;
	}
	public void setEmpname(String empName) {
		this.empName=empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEsal(double esal) {
		this.esal=esal;
	}
	public double getEsal() {
		return esal;
		
	}
	public void setDepartname(Department deptName) {
		this.deptName=deptName;
	}
	public Department getDEpartname() {
		return deptName;
	}
	public String toString() {
		return "Employee"+eid+" "+empName+" "+esal+" "+deptName; 
	}
}
	

	