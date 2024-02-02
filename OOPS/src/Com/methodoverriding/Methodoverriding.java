package Com.methodoverriding;
class Person{
	protected String name;
	void display(String name) {
		System.out.println("I am a person");
		System.out.println(name);
	}
}
class Employee extends Person{
	void display(String name) {
		System.out.println("I am a employee:");
		System.out.println("Organiozation:HCL ");
	}
}
class Trainee extends Person{
  void display(String name ) {
	  //super.display("akash");
	  System.out.println("I am an Trainee:");
	  System.out.println("Probation period:3 months");
  }
}

public class Methodoverriding {

	public static void main(String[] args) {
		Person p=new Person();
		p.display("akash");
		Employee e=new Employee();
		e.display("suret");
		Trainee t=new Trainee();
		t.display("harshit");
		//p.super("hd";)


	}

}
