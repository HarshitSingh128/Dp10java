package com.demo.mapdemo.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class EmpDeptMap {

	public static void main(String[] args) {
	HashMap<Employee,Department> emap=new HashMap<>();
	emap.put(new Employee(101, "Amit", 14000), new Department(1, "IT"));
	emap.put(new Employee(102, "Nitu", 24000), new Department(2, "salse"));
	emap.put(new Employee(103, "Meena", 34000), new Department(1, "IT"));
	emap.put(new Employee(101, "Amit", 14000), new Department(2, "Production"));
	
	for(Map.Entry<Employee, Department> h:emap.entrySet()) {
		System.out.println(h.getKey()+"->"+h.getValue());
	}
	
	}

}
