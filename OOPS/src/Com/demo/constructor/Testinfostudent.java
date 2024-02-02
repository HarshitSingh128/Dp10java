package Com.demo.constructor;
class Studentdetails{
	private int id;
	private String sname;
	private float marks;
	
	Studentdetails(){
		//this(101,"pooja");
		System.out.println("Default constructor");
		//marks=40f;
		//System.out.println(id);
		//System.out.println(sname);
		//System.out.println(marks);
		
	}
	Studentdetails(int id,String sname){
		//this();
		System.out.println("Parametrised const");
		this.id=id;
		this.sname=sname;
		System.out.println(this.id );
		System.out.println(this.sname);
		System.out.println(this.marks);
	}
	Studentdetails(int id,String sname,float marks){
		System.out.println("Pra constructor 1");
		this.id=id;
		this.sname=sname;
		this.marks=marks;
		
	}
	Studentdetails(int id ,float marks,String sname){
		System.out.println("para constructor 2");
		this.id=id;
		this.sname=sname;
		this.marks=marks;
	}
	public void setmarks(float marks) {
		this.marks=marks;
	}
	public float getmarks() {
		return this.marks;
	}
	public String toString() {
		return "Student:"+id+" "+sname+" "+marks;
	}
}

public class Testinfostudent {

	public static void main(String[] args) {
		Studentdetails s1=new Studentdetails();
		System.out.println(s1);
		Studentdetails s2=new Studentdetails(101,"Sumit");
		System.out.println(s2);
		Studentdetails s3=new Studentdetails(102,"arjun",4.5f);
		System.out.println(s3);
		Studentdetails s4=new Studentdetails(103,5.4f,"khushboo");
		System.out.println(s4);
		s1.setmarks(4.5f);
		System.out.println(s1.getmarks());
		
		
		
	}

}
