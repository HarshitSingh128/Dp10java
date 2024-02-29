package com.basicarraylist;

import java.util.ArrayList;

public class Employeearraylist {

	public static void main(String[] args) {
		ArrayList<Employee> e1=new ArrayList<>();
		e1.add(new Employee(101, "Rupesh", 10000));
		e1.add(new Employee(102, "Mithilesh", 15000));
		e1.add(new Employee(103, "Suraj", 21000));
		e1.add(new Employee(104, "Ram", 41000));
		for(Employee s:e1) {
			System.out.println(s);
		}
		
	}

}
