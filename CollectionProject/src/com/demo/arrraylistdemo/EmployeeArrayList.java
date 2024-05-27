package com.demo.arrraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> elist=new ArrayList<>();
		elist.add(new Employee(107, "Anita", 15000));
		elist.add(new Employee(102, "Amruta", 25000));
		elist.add(new Employee(103, "Pradnya", 18000));
		elist.add(new Employee(104, "Rushikesh", 30000));
		elist.add(new Employee(105, "Mandar", 27000));
		elist.add(new Employee(106, "Supriya", 29000));
		elist.add(new Employee(101, "Harshit", 14000));
		
		for(Employee s:elist) {
			System.out.println(s);
		}
		System.out.println("-----------------");
		Collections.sort(elist, new EmployeeSalaryComparator());
		//Collections.sort(elist, Collections.reverseOrder(new EmployeeSalaryComparator()));//it is basically doing decreasing order of sorting
		//Collections.sort(elist, new EmployeeIdComparator());
		//Collections.sort(elist, new EmployeenameComparator());
		for(Employee s:elist) {
			System.out.println(s);
		}
	}

}
