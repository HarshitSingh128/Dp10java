package Com.demo.constructor;

class salary {
	private String name, department;
	private int id;
	private double salary, netsalary, pf, hra, da;

	salary() {
		// double salary=15000;

	}

	salary(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;

	}

	public void calsalary() {
		pf = 0.1 * salary;
		hra = 1.5 * salary;
		da = .2 * salary;
		netsalary = salary - (pf + hra + da);

	}

	public void Displaysalary() {
		System.out.println("Employee id:" + id);
		System.out.println("Employee name:" + name);
		System.out.println("Employee dapartment:" + department);
		System.out.println("Employee salary=" + salary);
		System.out.println("PF=" + pf);
		System.out.println("hra=" + hra);
		System.out.println("da=" + da);
		System.out.println("Netsalary=" +netsalary);
	}

	public String toString() {
		return "Employeeid" + id + "Employeename" + name + "Employeesalary " + salary;
	}

}

public class Salarycalculation {

	public static void main(String[] args) {
		salary s1 = new salary(101, "Ramesh", "Production", 15000);
		salary s2 = new salary(102, "Rupesh", "Quality", 180000);

		s1.calsalary();
		s1.Displaysalary();
		s2.calsalary();
		s2.Displaysalary();

	}

}
