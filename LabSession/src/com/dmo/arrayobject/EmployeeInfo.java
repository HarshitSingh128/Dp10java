package com.dmo.arrayobject;

public class EmployeeInfo {
 static void displayInfo(Employee et[]) {
	 for(Employee z:et) {
		 System.out.println(z);
		 
	 }
 }
	public static void main(String[] args) {
		
		Employee e1[]=new Employee[3];
		e1[0]=new Employee(101,"piyush",50000,new Department(102,"quality","gujrat"));
		e1[1]=new Employee(102,"pratyush",4000,new Department(103,"Production","chennai"));
        
		e1[2]=new Employee();
		e1[2].setEid(103);
		e1[2].setEname("sutar");
		e1[2].setSalary(78000);
		e1[2].setDepartment(new Department(104,"Testing","Mumbai"));
		 displayInfo(e1);


	}

}
