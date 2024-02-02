package Com.demo.oops;

public class Course {
	int courseid;
	String coursename;
	int coursefee;
	public void setdata(int cid ,String courname,int courfee) {
		courseid=cid;;
		coursename=courname;
		coursefee=+courfee;
		
		
	}
	public void showdata() {
		System.out.println("Courseid:"+courseid);
		System.out.println("Coursename:"+coursename);
		System.out.println("coursefee="+coursefee);
		
	}

}
