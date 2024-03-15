package com.demo.arrraylistdemo;

public class Student implements Comparable<Student> {
	private int studid;
	private String studname;
	private double studmarks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studid, String studname, double studmarks) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.studmarks = studmarks;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public double getStudmarks() {
		return studmarks;
	}

	public void setStudmarks(double studmarks) {
		this.studmarks = studmarks;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studname=" + studname + ", studmarks=" + studmarks + "]";
	}

	@Override
	public int compareTo(Student s) {
		//we have to implements Comparable if we want compare the given value but in case of String it is not mandatory to implements Comparable  
		// on the basis of id at particular time one only compareTo operation is perform
//		if(this.studid==s.studid)
//			return 0;
//		else if(this.studid<s.studid)//decreasing order
//			return -1;
//		else 
//			return -1;

//		//*****************************on the basis of marks will be compare 
//		if(this.studmarks==s.studmarks) 
//			return 0;
//		else if(this.studmarks<s.studmarks)
//			return -1;
//		else 
//			return 1;
		// *****************************
		// return this.studname.compareTo(s.studname);//sort lexographically because we are using compareTo method 
		if (this.studmarks == s.studmarks)
			return this.studname.compareTo(s.studname);
		else if (this.studmarks < s.studmarks)
			return -1;
		else
			return 1;

	}

}
