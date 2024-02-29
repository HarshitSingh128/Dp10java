package com.demo.hasmapdemo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Task1:
//Create an arraylist of Employee having id,name,salary and containment of Department . 
//From that arraylist 
//>create a Map having Department as key and number of employee as value
//> Create a Map having Department as key and arraylist of employees as value

public class Employeedepttest {
	static void createHashMap(ArrayList<Employee> emp) {
		HashMap<Department,Integer> hm=new HashMap<Department,Integer>();
		Iterator<Employee> itr=emp.iterator();
		while(itr.hasNext()) {
			Department dept=itr.next().getD();
			if(hm.containsKey(dept)) {
				hm.put(dept, hm.get(dept)+1);
			}
			else
			{
				hm.put(dept, 1);
			}
		}
		for(Map.Entry<Department, Integer> e:hm.entrySet()) {
			System.out.println(e.getKey()+" ->"+e.getValue());
		}
		
	}

	public static void main(String[] args) {
		ArrayList<Employee> a1=new ArrayList<>();
		a1.add(new Employee(101, "Suraj", 15000, new Department(2, "Quality")));
		a1.add(new Employee(102, "Tanmay", 25000, new Department(3, "Production")));
		a1.add(new Employee(103, "Raju", 35000, new Department(3, "Production")));
		a1.add(new Employee(104, "Raj", 75000, new Department(4, "It")));
		a1.add(new Employee(105, "Tani", 25000, new Department(2, "Quality")));
		
		for(Employee e:a1) {
			System.out.println(e);
		}
		 System.out.println("--------------------");
		createHashMap(a1);
	}

}
