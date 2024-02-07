package com.demo.containmentarray;

public class StudentConstructor2 {

	public static void main(String[] args) {
		Course ct[]=new Course[3];
		ct[0]=new Course(1,"java");
		ct[1]=new Course(2,".net");
		ct[2]=new Course(3,"python");
		Student stud[] = new Student[4];
		stud[0] = new Student(101, "Amit", new double[] { 67.5, 78.5, 89.3 },ct[0]);
	
		stud[1] = new Student(102, "Supriya", new double[] { 62.5, 75.5, 83.3 }, ct[1]);
		stud[2] = new Student(103, "Amit", new double[] { 62.5, 77.5, 87.3 }, ct[0]);
		
		
		stud[3]=new Student();
		stud[3].setId(104);
		stud[3].setSname("Meera");
		stud[3].setMarks(new double[] {89.6,45.3,90.3});
		stud[3].setCourse(ct[2]);

		for(Student s:stud) {
			System.out.println(s);
		}
		System.out.println("=========================");
		ct[0].setCname("Full stack");
		for(Student s:stud) {
			System.out.println(s);
		}

	}

}
