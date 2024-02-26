package com.demo.mapdemo.hashmapdemo;

public class Student {
	private int studid;
	private String studName;
	private String course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studid, String studName, String course) {
		super();
		this.studid = studid;
		this.studName = studName;
		this.course = course;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studName=" + studName + ", course=" + course + "]";
	}
	

}
