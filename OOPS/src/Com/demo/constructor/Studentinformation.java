package Com.demo.constructor;

class StudentInfo {
	int rollno, sub1, sub2, sub3, sub4, sub5;
	String name, grade;
	double percentage;
	double total;

	StudentInfo() {

	}

	StudentInfo(String name,int rollno, int sub1, int sub2, int sub3, int sub4, int sub5) {
		this.name=name;
		this.rollno = rollno;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		//this.total = total;
	}
	
	public void calpercentage() {
		total=sub1 + sub2 + sub3 + sub4 + sub5;
		percentage = (total * 100) / 500;

	}

	public void calgrade() {
		//System.out.println(percentage);
		if (percentage >=90) {
			grade="A";
			//System.out.println("Grade A");
		} else if (percentage<90&& percentage>80) {
			grade="B";
			//System.out.println("Grade B");

		} else if (percentage<80 && percentage>60) {
			grade="C";
			//System.out.println("Grade C");

		} else if (percentage<60) {
			grade="D";
			//System.out.println("Grade D");
		}
	}
	public void compairgrade(StudentInfo s1 ) {
		if(this.percentage>s1.percentage)
			System.out.println(this.name +"  is having greater percetage than "+s1.name );
		else 
			System.out.println(s1.name +"  is having greater percetage than  "+this.name );
		
		
	}

	public void displayinfo() {
		System.out.println("Nmae:"+name );
		System.out.println("Rollno:" + rollno);
		System.out.println("sub1:" + sub1);
		System.out.println("sub2:" + sub2);
		System.out.println("sub3:" + sub3);
		System.out.println("sub4:" + sub4);
		System.out.println("sub5:" + sub5);
		System.out.println("Totalmarks:" + total);
		System.out.println("Percentage:" + percentage);
		System.out.println("Grade="+grade);
		
	}

}

public class Studentinformation {

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo("Ramesh",12, 56, 54, 78, 85, 87 );
         StudentInfo s2=new StudentInfo("Rupesh",11,25,52,54,78,87);
		s1.calpercentage();
		s1.calgrade();
		s1.displayinfo();
		s2.calpercentage();
		s2.calgrade();
		s2.displayinfo();
		s2.compairgrade(s1);
	
		
	}

}
