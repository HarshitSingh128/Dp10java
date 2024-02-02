package Com.containment;

public class Course {
	private int cid;
	private String cname;
	private double fees;
	public Course() {
	}
	public Course(int cid,String cname,double fees) {
		this.cid=cid;
		this.cname=cname;
		this.fees=fees;
	}
	public void setcid(int cid) {
		this.cid=cid;
	}
	public int getcid() {
		return cid;
	}
	public void setCname(String cname ) {
		this.cname=cname;
	}
	public String getCname() {
		return cname;
	}
	public void setFees(double fees) {
		this.fees=fees;
	}
	public double getFees() {
		return fees;
	}
	public String toString() {
		return "Course:"+cid+  " "+cname+  "Fees: "+fees;
		
	}
		
	
	}


