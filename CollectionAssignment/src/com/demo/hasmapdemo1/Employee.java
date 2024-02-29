package com.demo.hasmapdemo1;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Department d;
	public Employee() {
		super();
		
	}
	public Employee(int id, String name, double salary, Department d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d = d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	@Override
	public int hashCode() {
		return Objects.hash(d, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(d, other.d) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", d=" + d + "]";
	}
	
	
	
	
	

}
