package Com.containment;

import java.util.Scanner;

public class Mycollegeuserinput {
	Scanner sc=new Scanner(System.in);
	public void enterDetails(Student s) {
		System.out.println("Enter student id:");
		s.setSid(sc.nextInt());
		System.out.println("Enter student name:");
		s.setSname(sc.next());;
		System.out.println("Enter student marks");
		s.setMarks(sc.nextDouble());
//		
//		Course c=new Course();
//		System.out.println("Enter course id:");
//		c.setcid(sc.nextInt());
//		System.out.println("Enter Course name:");
//		c.setCname(sc.next());
//		System.out.println("Enter Course fees:");
//		c.setFees(sc.nextDouble());
//		
		s.setCourse(new Course());
		System.out.println("Enter course id:");
		s.getCourse().setcid(sc.nextInt());
		System.out.println("Enter Course name:");
		s.getCourse().setCname(sc.next());
		System.out.println("Enter Course fees:");
		s.getCourse().setFees(sc.nextDouble());
		
		
	}

	public static void main(String[] args) {
		Mycollegeuserinput college1=new Mycollegeuserinput();
		Student s1=new Student();
		college1.enterDetails(s1);
		System.out.println(s1);
		Student s2=new Student();
		college1.enterDetails(s2);
		System.out.println(s1);
		System.out.println("Course:"+s1.getCourse().hashCode());
		System.out.println(s2);
		System.out.println("Course:"+s2.getCourse().hashCode());
		
		
		
		
	}

}
