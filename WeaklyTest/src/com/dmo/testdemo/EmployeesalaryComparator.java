package com.dmo.testdemo;

import java.util.Comparator;

public class EmployeesalaryComparator implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2){
		if(e1.getEmpsal()==e2.getEmpsal())
		return e1.getEmpName().compareTo(e2.getEmpName());
		else
		return (int)(e1.getEmpsal()-e2.getEmpsal());
		}

	
		
}
