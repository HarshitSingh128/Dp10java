package Com.containment;

public class MyColleage {

	public static void main(String[] args) {
		Student s1 = new Student(101, "Ramesh", 78, new Course(1, "java", 45000));
		System.out.println(s1);
		System.out.println(s1.getCourse().hashCode());
		System.out.println("***********************");
		Student s2 = new Student();
		s2.setSid(102);
		s2.setSname("Pravin");
		s2.setMarks(90);
		s2.setCourse(new Course(1, "java", 50000));
		System.out.println(s2);
		System.out.println(s2.getCourse().hashCode());
		System.out.println("--------------------------------");
		Course c1 = new Course(101, "java", 45000);
		System.out.println(c1);
		Course c2 = new Course(102, "net", 50000);
		Course c3 = new Course(103, "python", 70000);
		System.out.println("********************");
		Student stud1 = new Student(1, "mandar", 95, c1);
		Student stud2 = new Student(2, "shivani", 84, c2);
		Student stud3 = new Student(4, "Ramesh", 87, c1);
		Student stud4 = new Student(5, "Amit", 95, c3);
		Student stud5 = new Student(6, "Manya", 95, c1);
		System.out.println(stud1);
		System.out.println(stud2);
		System.out.println(stud3);
		System.out.println(stud4);
		System.out.println(stud5);
		System.out.println("****************");
		System.out.println(stud1.getCourse().hashCode());
        System.out.println(stud5.getCourse().hashCode());
		System.out.println("******************************");
		System.out.println(stud1.getCourse().getFees());
		System.out.println(stud3.getCourse().getFees());
		c1.setFees(500000);
		stud1.getCourse().setFees(5000000);
		System.out.println(stud1.getCourse().getFees());

		System.out.println(stud3.getCourse().getFees());

	}

}
