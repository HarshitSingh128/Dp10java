package Com.demo.constructor;
//poja class-plain old java object-default constructor,parametrised constructor,tostring method;
public class Student {
	private int studid;
	private String studname;
	private double studmarks;
	
	public Student(int studid,String studname,double studmarks) {
		this.studid=studid;
		this.studname=studname;
		this.studmarks=studmarks;
	}
	public void setstudid(int studid) {
		this.studid=studid;
	}
	public int getstudid() {
		return studid;
	}
	public void setstudname(String studname) {
		this.studname=studname;
	}
	public String getstudname() {
		return studname;
	}
	public void setstudmarks(double studmarks) {
		this.studmarks=studmarks;
	}
	public double getstudmarks() {
		return studmarks;
	}
	public String toString() {
		//return "hello";
		return "student id:"+studid  +   "student name :"+studname+  "student marks:"+studmarks;
	}

}
