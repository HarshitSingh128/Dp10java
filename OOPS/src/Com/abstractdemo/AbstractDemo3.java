package Com.abstractdemo;

abstract class Person {
	abstract void Details();

}

class Student extends Person {

	@Override
	void Details() {
		System.out.println("Hello I am a student ");
		System.out.println("I am an Enginear");

	}
}

	class Employee extends Person {

		@Override
		void Details() {
			System.out.println("Hello I am an Employee ");

		}

	}

	class FamilyMan extends Person {

		@Override
		void Details() {
			int age = 30;
			System.out.println("Hello I am a FamilyMan");
			System.out.println("I am " + age + "years old");

		}

	}



public class AbstractDemo3 {

	public static void main(String[] args) {
		Person p;
		p=new Student();
		p.Details();
		p=new  Employee();
		p.Details();
		p=new FamilyMan();
		p.Details();
		

	}

}
