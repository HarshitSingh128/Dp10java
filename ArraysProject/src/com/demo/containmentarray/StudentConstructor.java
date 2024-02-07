package com.demo.containmentarray;

public class StudentConstructor {

	public static void main(String[] args) {
		Student stud[] = new Student[4];
		stud[0] = new Student(101, "Amit", new double[] { 67.5, 78.5, 89.3 }, new Course(1, "java"));
//		double m3[]= {91,30,50};// donot follow thir it is nor preferable
//		stud[2]=new Student(103,"Manit",m3,new Course(1,"java"));
		stud[1] = new Student(102, "Supriya", new double[] { 62.5, 75.5, 83.3 }, new Course(2, ".net"));
		stud[2] = new Student(103, "Amit", new double[] { 62.5, 77.5, 87.3 }, new Course(3, "computer"));
// double m[]={67.5,78.5};
		// double m[]=new double[] {67.5,90.4};

		stud[3]=new Student();
		stud[3].setId(104);
		stud[3].setSname("Meera");
		stud[3].setMarks(new double [] {89.6,45.3,90.3});
		stud[3].setCourse(new Course(2,".net"));
		
		for (Student s : stud) {
			System.out.println(s);
		}
		
		
		stud[0].getCourse().setCname("FullStack");
		System.out.println("-------------------");
		for(Student s:stud) {
			System.out.println(s);
		}
	}

}
