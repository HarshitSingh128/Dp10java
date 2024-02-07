package com.demo.containmentarray;

import java.util.Arrays;

public class Student {
	private int id;
	private String sname;
	private double marks[];
	private Course course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String sname, double[] marks, Course course) {
		super();
		this.id = id;
		this.sname = sname;
		this.marks = marks;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", marks=" + Arrays.toString(marks) + ", course=" + course
				+ "]";
	}
	
	

}
