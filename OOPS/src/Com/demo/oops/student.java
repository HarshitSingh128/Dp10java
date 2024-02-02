package Com.demo.oops;
//state -what object have-variable
//rollno name
//behavior-what object-method
//displayInfo()

public class student {
	//instance variable-inside class and outside method
	int rollno=101;
	String name="pooja";
	public void setDetails() {
		rollno=103;
		name="reena";
	}
	public void displayInfo() {
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
	}

	public static void main(String[] args) {
		student s1=new student();
		student s2=new student();
		student s3=new student();
		//System.out.println(s1.name);
		//System.out.println(s1.rollno);
		s1.displayInfo();
		s2.displayInfo();
		s3.setDetails();
		s3.displayInfo();
		
		

	}

}
