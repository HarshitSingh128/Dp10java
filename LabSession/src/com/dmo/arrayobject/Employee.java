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

public class Employee {
	private int eid;
	private String ename;
	private double salary;
	private Department department;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double salary, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", department=" + department + "]";
	}
	

}
