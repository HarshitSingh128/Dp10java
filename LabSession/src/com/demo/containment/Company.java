package com.demo.containment;

public class Company {

	public static void main(String[] args) {
		Department d1=new Department(2,"It industry");
		System.out.println(d1);
	Employee e1=new Employee(101,"Ramesh",50000,new Department(1,"Quality"));
	System.out.println(e1);
	System.out.println(e1.hashCode());
	Employee e2=new Employee();
	e2.seteid(103);
	e2.setEmpname("Rupesh");
    e2.setEsal(60000);
    e2.setDepartname(new Department(2,"Production"));
    System.out.println(e2);
    System.out.println(e2.hashCode());
	}

}
