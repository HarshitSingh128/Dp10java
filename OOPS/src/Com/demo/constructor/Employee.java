package Com.demo.constructor;
//in one class we can have only one default constructor

//default constructor invoked when we call object
//one class can have both constructor default and parameter
// we can have multiple parameterized constructor with different parameter

public class Employee {
	private int eid;
	private String ename;
	private double esal;

	public Employee() {
		System.out.println("default constructor");
	}

	public Employee(int eid) {
		this.eid=eid;
		System.out.println("parameterized  const");
		
	}
    public Employee(int eid ,String ename,double esal ) {
    	this.eid=eid;
    	this.ename=ename;
    	this.esal=esal;
    	System.out.println("p2");
    }
    public String toString() {
    	return "Employee id "+eid +"Employee name "+ename +"Employee salary"+esal;
    	
    }
}
