package com.demo.arrraylistdemo;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
//		if (e1.getId() == e2.getId())
//			return 0;
//		else if (e1.getId() > e2.getId())
//			return 1;
//		else
//			return -1;
		
		//2nd logic for sorting
		return e1.getId()-e2.getId();

	}

}
