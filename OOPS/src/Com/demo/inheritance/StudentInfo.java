package Com.demo.inheritance;
class Student{
	private int id;
	private String ename;
	private String euni;
	Student(){
		
	}
	Student(int id,String ename,String euni){
		this.id=id;
		this.ename=ename;
		this.euni=euni;
	}
	public void setid(int id ) {
		this.id=id;
		
	}
	public int getid() {
		return id;
	}
	public void setename(String ename) {
		this.ename=ename;
	}
	public String getename() {
		return ename;

		}
	public void seteuni(String euni) {
		this.euni=euni;
		
	}
	public String geteuni() {
		return euni;
	}
	public String toString() {
		return "Student:"+id+" "+ename+" "+euni;
	}
}
class Schoolstudent extends Student{
	 String schname,schooltype;
	 private String stream;
	 
	 Schoolstudent(){
		 
	 }
	 Schoolstudent(int id,String ename,String euni,String schname,String schooltype, String stream){
		 super(id,ename,euni);
		 this.schname=schname;
		 this.schooltype=schooltype;
		 this.stream=stream;
	 }
	 public void setstream(String stream) {
		 this.stream=stream;
	 }
	 public String getstream() {
		 return stream;
	 }
	 public String toString() {
		 return "Student:"+getid()+" "+getename()+" "+geteuni()+" "+schname+" "+schooltype+" "+getstream();
	 }
	
	
}
class Collegestud extends Student{
	private String CollegeType;
	

Collegestud(){
	
}
Collegestud(int id,String ename,String euni,String CollegeType){
	super(id,ename,euni);
	this.CollegeType=CollegeType;
}
public void setColgType(String CollegeType) {
	this.CollegeType=CollegeType;
}
public String getColgType() {
	return CollegeType;
}
public String toString() {
	return "Student:"+getid()+" "+getename()+" "+geteuni()+" "+getColgType();
}
	
}

public class StudentInfo {
	public static void main(String[] args) {
		Student s1=new Student(101,"Pankaj","Goverment");
		System.out.println(s1);
		Schoolstudent s2=new Schoolstudent(102,"Rahul","Private","HSPS","Goverment","Science");
		System.out.println(s2);
		Collegestud c1=new Collegestud(104,"Ramesh","Goverment","Goverment");
		System.out.println(c1);
	}

}
