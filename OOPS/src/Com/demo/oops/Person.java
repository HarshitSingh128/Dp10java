package Com.demo.oops;

public class Person {
	int personid;
	String personname;
	int personage;

	public void setData(int personid, String personname, int personage) {
		this.personid = personid;
		this.personname = personname;
		this.personage = personage;

	}

	public void display() {
		System.out.println("Person id :" + personid);
		System.out.println("Person name:" + personname);
		System.out.println("Person age :" + personage);

	}

}
