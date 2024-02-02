package Com.demo.oops;

class EmployeeT {
	int eid = 101;
	String ename = "pooja";
	double esal = 56000;

	public void setDetails() {
		eid = 102;
		ename = "supriya";
		esal = 45000;
		// System.out.println("Employee id :"+eid);
	}

	public void showDetails() {
		System.out.println("Employee id:" + eid);
		System.out.println("Employee name :" + ename);
		System.out.println("Employee sal:" + esal);
		System.out.println("*******");
	}

}

public class Employee {

	public static void main(String[] args) {
		EmployeeT e1 = new EmployeeT();
		EmployeeT e2 = new EmployeeT();
		EmployeeT e3 = new EmployeeT();

		e1.showDetails();
		e2.showDetails();
		e3.setDetails();
		e3.showDetails();

	}

}
