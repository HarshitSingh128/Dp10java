package com.dmo.testdemo;

import java.util.Collections;
import java.util.LinkedList;

class Employee{
private int empid;
private String empname;
private double empsalary;

Employee(){
}
Employee(int empid,String empname,double empsalary){
this.empid=empid;
this.empname=empname;
this.empsalary=empsalary;
}
public void setEmpid(int empid){
this.empid=empid;
}
public int getEmpid(){
return empid;
}
public void setEmpName(String empname){
this.empname=empname;
}
public String getEmpName(){
return empname;
}
public void setEmpSal(double empsalary){
this.empsalary=empsalary;
}
public double getEmpsal(){
return empsalary;
}
public String toString(){
return "Employee"+empid+" "+empname+" "+empsalary;
}
}
public class EmployeeLinkedList {
 
	public static void main(String[] args) {
		LinkedList<Employee> l1=new LinkedList<>();
		l1.add(new Employee(101,"Anita",15000));
		l1.add(new Employee(102,"Raju",15000));
		l1.add(new Employee(103,"Babita",15000));
		for(Employee e:l1){
		System.out.println(e);
		}
		System.out.println("-------------------");
		Collections.sort(l1,new EmployeesalaryComparator());
		for(Employee s:l1){
		System.out.println(s);
		}	
	}
	
	
}
