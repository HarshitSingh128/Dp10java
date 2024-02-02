package practiceonly;

class Person {
	public Object Employee() {
		System.out.println("In object class");

		return null;
	}

}

class Student extends Person {
	public String Employee() {
		System.out.println("In String class ");
		return null;
	}
}

public class CovarientTest {

	public static void main(String[] args) {
		Person p1 = new Person();

		p1.Employee();
		Student s1 = new Student();
		s1.Employee();

	}

}
