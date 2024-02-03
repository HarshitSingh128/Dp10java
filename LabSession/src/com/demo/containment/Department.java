package com.demo.containment;

public class Department {
	private int deptid;
	private String deptName;
	
	public Department(){
		
	}
	public Department(int deptid,String deptName) {
		this.deptid=deptid;
		this.deptName=deptName;
	}
	public void setDeprtID(int deptid) {
		this.deptid=deptid;
	}
	public int getDepartId() {
		return deptid;
	}
	public void setDepartName(String deptName) {
		this.deptName=deptName;
	}
	public String getDepartNmae() {
		return deptName;
	}
	public String toString() {
		return "Departname:"+deptid+" "+deptName;
		
	}

}
