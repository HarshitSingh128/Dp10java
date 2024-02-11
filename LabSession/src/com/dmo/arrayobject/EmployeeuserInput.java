package com.dmo.arrayobject;

import java.util.Scanner;

public class EmployeeuserInput {
	static Scanner sc = new Scanner(System.in);

	public static void displayallstudent(Employee e) {
		System.out.println("Enter employee id:");
		e.setEid(sc.nextInt());
		System.out.println("Enter employee name:");
		e.setEname(sc.next());
		System.out.println("Enter employee salary:");
		e.setSalary(sc.nextDouble());

		e.setDepartment(new Department());
		System.out.println("Enter Department id:");
		e.getDepartment().setDeptid(sc.nextInt());
		System.out.println("Enter Department name:");
		e.getDepartment().setDeptname(sc.next());
		System.out.println("Enter Department Location:");
		e.getDepartment().setDeptloc(sc.next());

	}

	public static void sortsalary(Employee e[]) {
		Employee temp = new Employee();
		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i].getSalary() < e[j].getSalary()) {
					temp = e[i];
					e[i] = e[j];
					e[j] = temp;

				}
			}

		}
	}

	public static void maxsalary(Employee e[]) {
		double maxsalary = e[0].getSalary();
          for (int i = 0; i < e.length; i++) {
			if (e[i].getSalary() > maxsalary) {
				maxsalary = e[i].getSalary();

			}

		}
		System.out.println("Max salary is :" + maxsalary);
	}

	public static void displayInfo(Employee e[]) {
		for (Employee z : e) {
			System.out.println(z);
		}

	}

	public static void main(String[] args) {
		Employee[] e1 = new Employee[3];
		for (int i = 0; i < e1.length; i++) {
			e1[i] = new Employee();
			displayallstudent(e1[i]);
		}
		displayInfo(e1);
		System.out.println("++++++++++++++++++++++++++++");

		sortsalary(e1);
		displayInfo(e1);
		System.out.println("===================================================");
		maxsalary(e1);

	}

}
