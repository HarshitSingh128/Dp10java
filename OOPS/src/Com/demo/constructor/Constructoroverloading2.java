package Com.demo.constructor;

class Employeecheck {
	private int eid;
	private String ename;
	private double esal;

	Employeecheck() {
		this(101,"pooja");
		System.out.println("Default constructor");
	}

	Employeecheck(int eid, String ename) {
		// System.out.println("Parameterrised cont");
		this.eid = eid;
		this.ename = ename;
		System.out.println(eid);
		System.out.println(ename);

	}

	Employeecheck(int eid, String ename, double esal) {
		// System.out.println("P2");
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;

	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public double getEsal() {
		return esal;
	}

	public String toString() {
		return "Employee" + eid + "  " + ename + " " + esal;

	}

}

public class Constructoroverloading2 {

	public static void main(String[] args) {
		Employeecheck e1 = new Employeecheck();
		//Employee e2 = new Employee(101, "pooja");
		//Employee e3 = new Employee(102, "vikas", 500);
		System.out.println(e1);
		//System.out.println(e2);
		//System.out.println(e3);
		//e1.setEsal(5000);
       //  System.out.println(e1.getEsal());
	}

}
