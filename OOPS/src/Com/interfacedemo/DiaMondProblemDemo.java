package Com.interfacedemo;
interface Student{
	void show();
	default void display() {
		System.out.println("I am a student");
	}
}
interface Teacher{
	void show();
	default void display() {
		System.out.println("I am a teacher");
	}
}

public class DiaMondProblemDemo implements Student,Teacher {
	public void show() {
		System.out.println("School name:Hertage School");
	}
//complusory overrude default method causing ambiquity
	public void display() {
		System.out.println("I am in School");
		Student.super.display();
		Teacher.super.display();
	}
	public static void main(String[] args) {
		Student s;
		s=new DiaMondProblemDemo();
		s.show();
		s.display();
		
		Teacher t;
		t=new DiaMondProblemDemo();
		t.show();
		t.display();
		
		
	

	}

	

}
