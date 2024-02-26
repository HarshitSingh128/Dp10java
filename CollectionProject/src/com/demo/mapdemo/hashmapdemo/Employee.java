package com.demo.mapdemo.hashmapdemo;

import java.util.Objects;

public class Employee {
	private int empid;
	private String empname;
	private double empsalary;
	public Employee() {
		super();
	}
	public Employee(int empid, String empname, double empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
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
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empid,empname,empsalary);
		
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Employee emp=(Employee)obj;
		if(this.empid!=emp.empid)
			return false;
		if(!this.empname.equals(emp.empname))
			return false;
		if(this.empsalary!=emp.empsalary)
			return false;
	
	return true;
	}
}
