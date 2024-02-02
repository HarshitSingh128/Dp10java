package Com.covarient;
class Student {
	public Object Details() {
		System.out.println("Hello  i am an Superclass");
		return null;
	}
}
class Stud extends Student{
	public String Details() {
		System.out.println("Hello i am an subclass");
		return null;
	}
}

public class PersonInfo {

	public static void main(String[] args) {
		Stud e1=new Stud ();
		e1.Details();
		Student a1=new Student();
		a1.Details();
		

	}

}
